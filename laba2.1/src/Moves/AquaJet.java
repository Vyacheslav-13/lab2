package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class AquaJet extends PhysicalMove {
    public AquaJet(){
        super(Type.WATER,40,100);
    }
    protected String describe() {
        return "использует Аква Джет";
    }
}
