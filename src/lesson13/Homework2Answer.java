package lesson13;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Homework2Answer {

  public static void main(String[] args) {
    var visitorToVisitsCount = getAnswer(args);

    System.out.println("Наши посетители:");
    System.out.println(visitorToVisitsCount);

  }

  public static Map<String, Integer> getAnswer(String[] visitors) {
    if (visitors.length == 0) {
      return Collections.emptyMap();
    }

    var visitorToVisitsCount = new TreeMap<String, Integer>();
    for (String visitor : visitors) {
      Integer visitsSoFar = visitorToVisitsCount.getOrDefault(visitor, 0);
      visitorToVisitsCount.put(visitor, visitsSoFar + 1);
    }

    return visitorToVisitsCount;

  }
}
