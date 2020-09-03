package lesson13;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapAnswer {
  public static void main(String[] args) {
    var visitorToVisitsCount = getAnswer(args);

    System.out.println("Наши посетители:");
    System.out.println(visitorToVisitsCount);

  }

  public static Map<String, Integer> getAnswer(String[] visitors) {
    if (visitors.length == 0) {
      return Collections.emptyMap();
    }

    var visitorToVisitsCount = new HashMap<String, Integer>();
    for (String visitor : visitors) {
      Integer visitsSoFar = visitorToVisitsCount.getOrDefault(visitor, 0);
      visitorToVisitsCount.put(visitor, visitsSoFar + 1);
    }

    return visitorToVisitsCount;
  }
}
