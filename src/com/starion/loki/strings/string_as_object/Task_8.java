package com.starion.loki.strings.string_as_object;

/*A string of words is entered, separated by spaces. Find the longest word and display it on the
    screen. The case when there may be several longest words, do not process.*/

import java.util.Scanner;

public class Task_8 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the string, please.");
    String string = scanner.nextLine();

    System.out.println("The longest word is \"" + findLongestWord(string) + "\"");
  }

  private static String findLongestWord(String string) {
    int endIndex = 0;
    int maxCountSymbols = 0;
    int countSymbols = 0;

    for (int index = 0; index < string.length(); index++) {
      if (string.charAt(index) != ' ') {
        countSymbols++;
      } else {
        if (countSymbols > maxCountSymbols) {
          endIndex = index;
          maxCountSymbols = countSymbols;
        }
        countSymbols = 0;
      }
      if (index == string.length() - 1) {
        if (countSymbols > maxCountSymbols) {
          endIndex = index + 1;
          maxCountSymbols = countSymbols;
        }
        countSymbols = 0;
      }
    }

    return string.substring(endIndex - maxCountSymbols, endIndex);
  }
}
