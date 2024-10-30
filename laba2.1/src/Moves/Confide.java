package Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Confide extends StatusMove {
    public Confide(){
        super(Type.NORMAL,0.0,100);
    }
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -1);

    }
    protected String describe() {
        return "использует атаку доверия";
    }
}
