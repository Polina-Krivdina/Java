package lesson14;

import java.util.Optional;

public class OptionalDemo {
  public static void main(String[] args) {
    String name = "Лев";

    Optional<String> nameOptional = Optional.ofNullable(name);
    System.out.println("контейнер пуст? " + nameOptional.isEmpty());

    nameOptional.ifPresent(myName -> System.out.println("Контейнер не пуст, содержимое = " + myName));

    System.out.println("Данные из optional = " + nameOptional.orElseGet(() -> "без имени"));

    nameOptional
      .filter(myName -> myName.equals("Лев"))
      .map(String::length)
      .ifPresent(length -> System.out.println("Привет, Лев! Имя содержит " + length + " буквы"));

  }
}
