package ru.appline.controller;


import net.minidev.json.JSONObject;
import org.json.JSONException;
import org.springframework.web.bind.annotation.*;
import ru.appline.logic.Kompas;
import ru.appline.logic.Pet;
import ru.appline.logic.PetModel;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class Controller {
    private static final PetModel petModel = PetModel.getInstance();
    private static final AtomicInteger newId = new AtomicInteger(1);
    private static Kompas kompas = Kompas.getInstance();

    @PostMapping(value = "/createPet", consumes = "application/json")
    public String createPet(@RequestBody Pet pet){
        petModel.add(pet, newId.getAndIncrement());
        return "your pet was created successfully";
    }

    @GetMapping(value = "/getAll", produces = "application/json")
    public Map<Integer, Pet> getAll(){
        return petModel.getAll();
    }

    @GetMapping(value = "/getPet", consumes = "application/json", produces = "application/json")
    public Pet getPet(@RequestBody Map<String, Integer> id){
        return petModel.getFromList(id.get("id"));
    }

    @DeleteMapping(value = "/deletePet", consumes = "application/json")
    public String deletePet(@RequestBody Map<String, Integer> id){
        petModel.getAll().remove(id.get("id"));
        return "your pet was deleted successfully";
    }

    @PutMapping(value = "/putPet", consumes = "application/json", produces = "application/json")
    public Map<Integer, Pet> putPet(@RequestBody Map<String, String> pet){
        petModel.getAll().remove(pet.get("id"));
        petModel.add(new Pet(pet.get("name"), pet.get("type"), Integer.parseInt(pet.get("age"))), Integer.parseInt(pet.get("id")));
        return petModel.getAll();
    }

    @PostMapping(value = "/createKompas", consumes = "application/json", produces = "application/json")
    public Map<String, String> createKompas(@RequestBody Map<String, String> newKompas){
        for (Map.Entry<String, String> entry: newKompas.entrySet()) {
            kompas.add(entry.getKey(), entry.getValue());
        }
        return kompas.getAll();
    }

    @GetMapping(value = "/getSide", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    JSONObject getSide(@RequestBody Map<String, Integer> degree) throws JSONException {
        for (Map.Entry<String, String> entry : kompas.getAll().entrySet()) {
            int[] array = kompas.getRange(entry.getKey());
            if (array[0] < array[1]) {
                if (degree.get("Degree") >= array[0] && degree.get("Degree") <= array[1]) {
                    return (new JSONObject().appendField("Side", entry.getKey()));
                }
            } else {
                array[1] += 359;
                if (degree.get("Degree") >= array[0] && degree.get("Degree") <= array[1]) {
                    return (new JSONObject().appendField("Side", entry.getKey()));
                }
            }
        }
        return (new JSONObject().appendField("error", "something error"));
    }
}
