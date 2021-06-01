package com.starion.loki.strings.string_as_object;

/*A string is entered. It is required to remove duplicate characters and all spaces from it.
    For example, if "abc cdedef" was entered, then "abcdef" should be output.*/

import java.util.Scanner;

public class Task_7 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the string, please.");
    String string = scanner.nextLine();
    String newString = editString(string);

    System.out.println(newString);
  }

  private static String editString(String string) {
    string = string.replaceAll(" ", "");
    StringBuilder stringBuilder = new StringBuilder(string);
    for (int i = 0; i < stringBuilder.length() - 1; i++) {

      while (stringBuilder.indexOf(String.valueOf(stringBuilder.charAt(i)), i + 1) != -1) {
        stringBuilder.deleteCharAt(stringBuilder.indexOf(String.valueOf(stringBuilder.charAt(i))));
      }
    }
    return stringBuilder.toString();
  }
}
