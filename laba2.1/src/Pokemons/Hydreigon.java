package Pokemons;

import Moves.DoubleHit;
import Moves.DragonRush;
import Moves.ScaryFace;
import Moves.Slam;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Hydreigon extends Pokemon {
    public Hydreigon (String name, int level) {
        super(name, level);
        super.setType(Type.DARK,Type.DRAGON);
        super.setStats(92, 105, 90, 125, 90, 98);
        super.setMove(new Move[]{new DragonRush(),new Slam(),new DoubleHit(),new ScaryFace()});
    }
}
