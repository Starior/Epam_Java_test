package com.starion.loki.strings.string_as_array;

/*Replace all occurrences of 'word' in the string with 'letter'.*/

public class Task_2 {

  public static void main(String[] args) {

    String string = "Whenever any one asks me if she will understand this or that word I always "
        + "reply: Never mind whether she understands each separate word of a sentence or not.";

    String newString = string.replaceAll("word", "letter");
    System.out.println(newString);
  }

}
