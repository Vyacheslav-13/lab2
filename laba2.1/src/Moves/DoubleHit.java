package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class DoubleHit extends PhysicalMove {
    public DoubleHit(){
    super(Type.NORMAL,80,100);
    }
    protected void applyOppDamage(Pokemon def, double damager){
        super.applyOppDamage(def,damager);
        super.applyOppDamage(def,damager);
    }
    protected String describe() {
        return "использует Двойной удар";
    }
}


