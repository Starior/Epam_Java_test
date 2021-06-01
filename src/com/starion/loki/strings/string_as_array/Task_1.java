package com.starion.loki.strings.string_as_array;

/*An array of camelCase variable names is given.Convert titles to snake_case.*/

import java.util.Arrays;

public class Task_1 {

  public static void main(String[] args) {

    String[] stringArray = {"firstVariable", "secondVariableThree", "thirdVariableOnePack",
        "fourthMostBigVariable" };

    convertToSnakeCase(stringArray);
  }

  private static void convertToSnakeCase(String[] stringArray) {
    for (int i = 0; i < stringArray.length; i++) {
      for (int y = 0; y < stringArray[i].length(); y++) {
        while (Character.isUpperCase(stringArray[i].charAt(y))) {
          String temp =
              stringArray[i].substring(0, y) + "_" + stringArray[i].substring(y, y + 1)
                  .toLowerCase() + stringArray[i].substring(y + 1);
          stringArray[i] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(stringArray));
  }
}
