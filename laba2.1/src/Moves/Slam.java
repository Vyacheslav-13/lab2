package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Slam extends PhysicalMove {
    public Slam(){
        super(Type.NORMAL,80,75);
    }
    protected String describe() {
        return "использует Слэм";
    }
}
