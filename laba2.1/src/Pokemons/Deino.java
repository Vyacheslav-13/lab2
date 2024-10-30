package Pokemons;

import Moves.DragonRush;
import Moves.Slam;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Deino extends Pokemon {
    public Deino(String name, int level) {
        super(name, level);
        super.setType(Type.DARK,Type.DRAGON);
        super.setStats(52, 65, 50, 45, 50, 38);
        super.setMove(new Move[]{new DragonRush(),new Slam()});
    }
}