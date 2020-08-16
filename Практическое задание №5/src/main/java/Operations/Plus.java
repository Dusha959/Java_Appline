package Operations;

import Chisla.Chislo;
import org.w3c.dom.ls.LSOutput;

public class Plus implements Operation {
    @Override
    public Double operation(Chislo one, Chislo two) {
        return (one.getChislo() + two.getChislo());
    }
}
