package com.starion.loki.strings.string_as_object;

/*Get a new one from the given string by repeating each character twice.*/

public class Task_6 {

  public static void main(String[] args) {
    String string = "Whenever any one asks me if she will understand this or that word I always "
        + "reply: Never mind whether she understands each separate word of a sentence or not.";
    String newString = createNewString(string);

    System.out.println(newString);
  }

  private static String createNewString(String string) {
    StringBuilder stringBuilder = new StringBuilder(string);
    for (int index = 0; index < stringBuilder.length(); index += 2) {
      stringBuilder.insert(index, stringBuilder.charAt(index));
    }
    return stringBuilder.toString();
  }

}
