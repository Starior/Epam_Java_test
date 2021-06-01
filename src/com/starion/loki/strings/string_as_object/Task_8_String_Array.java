package com.starion.loki.strings.string_as_object;

/*A string of words is entered, separated by spaces. Find the longest word and display it on the
    screen. The case when there may be several longest words, do not process.*/

import java.util.Scanner;

public class Task_8_String_Array {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the string, please.");
    String string = scanner.nextLine();

    System.out.println("The longest word is \"" + findLongestWord(string) + "\"");
  }

  private static String findLongestWord(String string) {
    String[] words = string.split(" ");
    String longestWord = "";
    int WordLength = 0;
    for (String word : words) {
      if (word.length() > WordLength) {
        longestWord = word;
        WordLength = word.length();
      }
    }
    return longestWord;
  }
}
