import ru.ifmo.se.pokemon.*;
import Pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Druddigon("Электрик", 1);
        Pokemon p2 = new Bidoof("Электрос", 1);
        Pokemon p3 = new Bibarel("Феромоза", 1);
        Pokemon p4 = new Deino("Тинамо", 1);
        Pokemon p5 = new Zweilous("Янма", 1);
        Pokemon p6 = new Hydreigon("Янмега", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}