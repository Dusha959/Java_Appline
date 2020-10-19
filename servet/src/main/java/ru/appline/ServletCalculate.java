package ru.appline;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/calculate")
public class ServletCalculate extends HttpServlet {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        StringBuffer jb = new StringBuffer();
        String line;

        try{
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null) {
                jb.append(line);
            }
        } catch (Exception e){
            System.out.println("Error");
        }

        JsonObject jobj = gson.fromJson(String.valueOf(jb), JsonObject.class);

        request.setCharacterEncoding("UTF-8");

        double one = jobj.get("a").getAsDouble();
        double two = jobj.get("b").getAsDouble();
        String operation = jobj.get("math").getAsString();
        double result;

        response.setContentType("application/json;charset=utf-8");
        PrintWriter pw = response.getWriter();

        if (operation.equals("+")) {
            result = one + two;
            pw.print(gson.toJson("result: " + result));
        } else if (operation.equals("-")) {
            result = one -  two;
            pw.print(gson.toJson("result: " + result));
        } else if (operation.equals("*")) {
            result = one * two;
            pw.print(gson.toJson("result: " + result));
        } else if (operation.equals("/")) {
            if (two == 0) {
                pw.print(gson.toJson("Error, you can not divided by zero"));
            } else {
                result = one / two;
                pw.print(gson.toJson("result: " + result));
            }
        } else {
            pw.print(gson.toJson("Error operation"));
        }
    }
}
