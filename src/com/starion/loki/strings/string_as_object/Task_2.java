package com.starion.loki.strings.string_as_object;

/*In the line insert after each 'a' character 'b'.*/

public class Task_2 {

  public static void main(String[] args) {
    String string = "Whenever any one asks me if she will understand this or that word I always "
        + "reply: Never mind whether she understands each separate word of a sentence or not.";

    String newString = string.replaceAll("a", "ab");
    System.out.println(newString);
  }

}
