package com.starion.loki.strings.string_as_array;

/*Find the amount of digits in the string.*/

public class Task_3 {

  public static void main(String[] args) {

    String string = "The cupola modeled on the Festhalle Frankfurt was made of reinforced concrete,"
        + " and with an inner diameter of 69 m (226 ft) and height of 42 m (138 ft) it was "
        + "the largest building of its kind at the time of construction.";

    findDigits(string);

  }

  private static void findDigits(String string) {
    int count = 0;
    for (int y = 0; y < string.length(); y++) {
      if (Character.isDigit(string.charAt(y))) {
        count++;
      }
    }
    System.out.println("the amount of digits in the string is " + count);
  }
}
