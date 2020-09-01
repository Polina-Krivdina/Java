package lesson12;

import java.util.ArrayDeque;

/**
 * ArrayDequeDemo.
 *
 * @author Aleksandr_Dvortsov
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> countries = new ArrayDeque<>();

        countries.add("Germany");
        countries.addFirst("France");
        countries.push("GB");
        countries.addLast("Spain");
        countries.add("Russia");

        System.out.println(countries);

        String first = countries.getFirst();
        System.out.println(first);
        System.out.println(countries.size());

        String last = countries.getLast();
        System.out.println(last);

        String pop = countries.pop();
        System.out.println(pop);
        System.out.println(countries.size());


    }

}
