package Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class DragonRush extends PhysicalMove {
    public DragonRush(){
        super(Type.DRAGON,100,75);
    }
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.2) {
            Effect.flinch(p);
        }
    }
    protected String describe() {
        return "использует Драконий рывок";
    }
}

