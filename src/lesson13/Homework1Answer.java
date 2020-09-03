package lesson13;

import java.util.Arrays;
import java.util.TreeSet;

public class Homework1Answer {
  public static void main(String[] args) {
    var uniqueVisitors = new TreeSet<>(Arrays.asList(args));
    System.out.println("Уникальные посетители:");
    System.out.println(uniqueVisitors);
  }
}
