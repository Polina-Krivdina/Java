package lesson12;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * QueueDemo.
 *
 * @author Aleksandr_Dvortsov
 */
public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> pq = new PriorityQueue<>();
        pq.add("aaa");
        pq.add("caa");
        pq.add("baa");
        pq.add("daa");
        pq.add("faa");

        System.out.println(pq.peek());
        System.out.println(pq.size());

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        System.out.println(pq.size());


        Queue<Person> persons = new PriorityQueue<>();
        persons.add(new Person("Sasha", 29));
        persons.add(new Person("Masha", 22));
        persons.add(new Person("Glasha", 19));
        persons.add(new Person("Pasha", 5));

        while (!persons.isEmpty()) {
            System.out.println(persons.poll());
        }


    }

    static class Person implements Comparable<Person> {

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public int compareTo(Person person) {

            if (this.getAge() == person.getAge()) {
                return 0;
            }

            return this.getAge() > person.getAge() ? 1 : -1;
        }
    }
}
