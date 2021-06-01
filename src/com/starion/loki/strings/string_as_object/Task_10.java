package com.starion.loki.strings.string_as_object;

/*Line X consists of several sentences, each ending with a dot, exclamation mark, or question
    mark. Determine the number of sentences in line X.*/

import java.util.Scanner;

public class Task_10 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the string, please.");
    String string = scanner.nextLine();

    counterSentences(string);
  }

  private static void counterSentences(String string) {
    int countSentences = 0;

    for (int index = 0; index < string.length(); index++) {
      if (string.charAt(index) == '.' || string.charAt(index) == '?'
          || string.charAt(index) == '!') {
        countSentences++;
      }
    }
    System.out.println(
        "the number of sentences in line X is " + countSentences);
  }
}
