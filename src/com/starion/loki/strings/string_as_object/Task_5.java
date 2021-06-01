package com.starion.loki.strings.string_as_object;

/*Count how many times the letter "a" occurs among the characters of a given string.*/

public class Task_5 {

  public static void main(String[] args) {
    String string = "Whenever any one asks me if she will understand this or that word I always "
        + "reply: Never mind whether she understands each separate word of a sentence or not.";

    countingLetterA(string);
  }

  private static void countingLetterA(String string) {
    int countA = 0;
    for (int index = 0; index < string.length(); index++) {
      if (string.charAt(index) == 'a') {
        countA++;
      }
    }
    System.out.println(
        "Among the characters of a given string, the letter \"a\" occurs " + countA + " times");
  }

}
