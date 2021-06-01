package com.starion.loki.strings.string_as_array;

/*Remove all extra spaces in the line, that is, replace series of consecutive spaces with single
    spaces. Remove trailing spaces in the line.*/

public class Task_5 {

  public static void main(String[] args) {
    String string = " She inhaled     deeply and exhaled   slowly, trying  to relax. ";

    String newString = trim(string);
    System.out.println(newString);
  }

  private static String trim(String string) {
    String newString = string.trim();

    for (int y = 0; y < newString.length() - 1; y++) {
      while (newString.charAt(y) == ' ' && newString.charAt(y + 1) == ' ') {
        newString = newString.substring(0, y) + newString.substring(y + 1);
      }
    }
    return newString;
  }
}
