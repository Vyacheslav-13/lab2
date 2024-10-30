package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class NightSlash extends PhysicalMove {
    public NightSlash() {
        super(Type.DARK, 70.0, 100.0);
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (att.getStat(Stat.SPEED) / 256.0 > Math.random()) {
            System.out.println("Critical hit!");
            return 2.0;
        } else {
            return 1.0;
        }
    }

    protected String describe() {
        return "использует Лезвие Ночи";
    }
}
