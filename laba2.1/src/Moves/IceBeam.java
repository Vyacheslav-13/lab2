package Moves;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class IceBeam extends SpecialMove {
    public IceBeam(){
        super(Type.ICE,90,100);
    }

    protected void applyOppEffects(Pokemon p){
        if(Math.random() < 0.1){
            Effect.freeze(p);
        }
    }
    protected String describe() {
        return "использует Ледяной Луч";
    }
}
