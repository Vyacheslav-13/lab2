package Pokemons;

import Moves.DoubleHit;
import Moves.DragonRush;
import Moves.Slam;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zweilous extends Pokemon {
    public Zweilous (String name, int level) {
        super(name, level);
        super.setType(Type.DARK,Type.DRAGON);
        super.setStats(72, 85, 70, 65, 70, 58);
        super.setMove(new Move[]{new DragonRush(),new Slam(),new DoubleHit()});
    }
}
