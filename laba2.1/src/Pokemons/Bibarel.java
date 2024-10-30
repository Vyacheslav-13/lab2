package Pokemons;

import Moves.Amnesia;
import Moves.AquaJet;
import Moves.IceBeam;
import Moves.ThunderWave;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bibarel extends Pokemon {
    public Bibarel (String name, int level){
        super(name,level);
        super.setType(Type.NORMAL,Type.WATER);
        super.setStats(79,85,60,55,60,71);
        super.setMove(new Move[]{new IceBeam(),new Amnesia(),new ThunderWave(),new AquaJet()});
    }
}
