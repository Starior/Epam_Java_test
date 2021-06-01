package com.starion.loki.strings.string_as_array;

/*Find the amount of numbers in the string.*/

public class Task_4 {

  public static void main(String[] args) {

    String string = "The cupola modeled on the Festhalle Frankfurt was made of reinforced concrete,"
        + " and with an inner diameter of 69 m (226 ft) and height of 42 m (138 ft) it was "
        + "the largest building of its kind at the time of construction.688";

    findNumbers(string);

  }

  private static void findNumbers(String string) {
    int count = 0;
    for (int y = 0; y < string.length() - 1; y++) {
      boolean digitPlusOne = Character.isDigit(string.charAt(y + 1));
      if ((Character.isDigit(string.charAt(y)) && !digitPlusOne) || (digitPlusOne
          && y + 1 == string.length() - 1)) {
        count++;
      }
    }
    System.out.println("The amount of digits in the string is " + count);
  }
}
