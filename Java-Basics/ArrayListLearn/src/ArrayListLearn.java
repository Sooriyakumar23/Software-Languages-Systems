import java.util.ArrayList;

public class ArrayListLearn {
    public static void main(String args[]) {

        ArrayList<String> superHeros = new ArrayList<String>();
        System.out.println(superHeros);

        superHeros.add("Captain America");
        System.out.println(superHeros);

        superHeros.add("Spider Man");
        System.out.println(superHeros);

        superHeros.add("Hawkeye");
        System.out.println(superHeros);

        superHeros.add(2, "Iron Man");
        System.out.println(superHeros);

        superHeros.add("Natasha");
        System.out.println(superHeros);

        superHeros.remove(3);
        System.out.println(superHeros);

        System.out.println(superHeros.get(0));
        System.out.println(superHeros.get(1));
        System.out.println(superHeros.get(2));
        System.out.println(superHeros.get(3));
        System.out.println(superHeros);
    }
}
