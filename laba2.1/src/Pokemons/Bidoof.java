package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bidoof extends Pokemon {
    public Bidoof(String name, int level){
        super(name,level);
        super.setType(Type.NORMAL);
        super.setStats(59,45,40,35,40,31);
        super.setMove(new Move[]{new IceBeam(),new Amnesia(),new ThunderWave()});
    }
}
