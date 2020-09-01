package lesson12;

import java.util.Comparator;

/**
 * PersonAgeComparator.
 *
 * @author Aleksandr_Dvortsov
 */
public class PersonAgeComparator implements Comparator<QueueDemo.Person> {
    @Override
    public int compare(QueueDemo.Person p1, QueueDemo.Person p2) {
        if (p1.getAge() == p2.getAge()) {
            return 0;
        }
        return p1.getAge() < p2.getAge() ? 1 : -1;
    }
}
