package lesson12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ArrayListDemo.
 *
 * @author Aleksandr_Dvortsov
 */
public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list1.add("1-" + i);
        }

        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list2.add("2-" + i);
        }

        list1.addAll(list2);


        Iterator<String> iterator = list1.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

        }


        list1.clear();
        ((ArrayList<String>) list1).trimToSize();

    }
}
