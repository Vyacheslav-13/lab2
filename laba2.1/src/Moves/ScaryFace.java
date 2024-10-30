package Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class ScaryFace extends StatusMove {
    public ScaryFace(){
        super(Type.NORMAL,0.0,100);
    }
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -2);
    }
    protected String describe() {
        return "использует Страшное Лицо";
    }
}
