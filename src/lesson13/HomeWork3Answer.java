package lesson13;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class HomeWork3Answer {

  public static void main(String[] args) {
    var visitorToVisitsCount = getAnswer(args);

    System.out.println("Наши посетители:");
    printVisitorsByDescendingFrequency(visitorToVisitsCount);

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

  public static void printVisitorsByDescendingFrequency(Map<String, Integer> visitorsToVisitsCount) {
    Comparator<Map.Entry<String, Integer>> comparing = Map.Entry.comparingByValue();
    var sortedEntries = new TreeSet<>(comparing.thenComparing(Map.Entry::getKey));
    sortedEntries.addAll(visitorsToVisitsCount.entrySet());
    System.out.println(sortedEntries);
  }
}
