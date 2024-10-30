package Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Amnesia extends StatusMove {
    public Amnesia(){
        super(Type.PSYCHIC,0.0,100);
    }
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_DEFENSE,2);
    }
    protected String describe() {
        return "использует амнезию";
    }
}
