package com.starion.loki.strings.string_as_object;

/*A text(string) is given. Find the largest number of consecutive spaces in it.*/

public class Task_1 {

  public static void main(String[] args) {
    String text = "S t   nrx.    ";

    findLargestSpace(text);
  }

  private static void findLargestSpace(String text) {
    String newString = text;
    int maxNumber = 0;
    for (int y = 0; y < newString.length() - 1; y++) {
      int count = 1;
      while (newString.charAt(y) == ' ' && newString.charAt(y + 1) == ' '
          && y + 1 != newString.length() - 1) {
        newString = newString.substring(0, y) + newString.substring(y + 1);
        count++;
      }
      if (y + 1 == newString.length() - 1 && newString.charAt(y) == ' '
          && newString.charAt(y + 1) == ' ') {
        count++;
      }
      if (maxNumber < count) {
        maxNumber = count;
      }
    }
    System.out.println("The largest number of consecutive spaces is " + maxNumber);
  }
}


