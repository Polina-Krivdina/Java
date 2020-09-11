package lesson15;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.util.Collections.emptyList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramTask {
  public static void main(String[] args) throws IOException, URISyntaxException {
    System.out.println("Твой ответ:");
    System.out.println(new AnagramTask().findAnagrams(readFile()));
  }

  private static String readFile() throws URISyntaxException, IOException {
    Path path = Paths.get(AnagramTask.class.getClassLoader().getResource("lesson15/input.txt").toURI());

    Stream<String> lines = Files.lines(path);
    String data = lines.collect(Collectors.joining("\n"));
    lines.close();

    return data;
  }

  private List<List<String>> findAnagrams(String text) {
    // Тут пишем код
    return emptyList();
  }
}
