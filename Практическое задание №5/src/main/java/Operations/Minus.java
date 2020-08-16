package Operations;

import Chisla.Chislo;

public class Minus implements Operation {
    @Override
    public Double operation(Chislo one, Chislo two) {
        return (one.getChislo() - two.getChislo());
    }
}
