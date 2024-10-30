package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Druddigon extends Pokemon {
    public Druddigon(String name, int level){
        super(name,level);
        super.setType(Type.DRAGON);
        super.setStats(77,120,90,60,90,48);
        super.setMove(new Move[]{new NightSlash(),new Confide(),new ThunderFang(),new RockTomb()});
    }
}
