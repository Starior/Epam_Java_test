package com.starion.loki.basics.cycles;
/*Two numbers are given. Determine the numbers included in the recording of both the first and second numbers*/

import java.util.Arrays;

public class Task_8 {

  public static void main(String[] args) {
    int a = 21342087;
    int b = 872230;
    int[] arrayOfNumbers = new int[0];
    int count = 0;
    for (int i = 0; i <= Integer.toString(a).length() - 1; i++) {
      for (int j = 0; j <= Integer.toString(b).length() - 1; j++) {
        if (Integer.toString(a).charAt(i) == Integer.toString(b).charAt(j)) {
          arrayOfNumbers = increaseLengthOfArrayWithCopy(arrayOfNumbers);
          arrayOfNumbers[count] = Character.getNumericValue(Integer.toString(a).charAt(i));
          count++;
        }
      }
    }
    arrayOfNumbers = deleteTheDuplicatesInArray(arrayOfNumbers);
    System.out.println(Arrays.toString(arrayOfNumbers));
  }

  public static int[] increaseLengthOfArrayWithCopy(int[] arrayOfNumbers) {
    int[] NewArrayOfNumbers = new int[arrayOfNumbers.length + 1];
    for (int i = 0; i < NewArrayOfNumbers.length - 1; i++) {
      NewArrayOfNumbers[i] = arrayOfNumbers[i];
    }
    return NewArrayOfNumbers;
  }

  public static int[] deleteTheDuplicatesInArray(int[] arrayOfNumbers) {
    int[] NewArrayOfNumbers = new int[0];
    int count = 0;
    for (int i = 0; i < arrayOfNumbers.length; i++) {
      if (checkForDuplicate(NewArrayOfNumbers, arrayOfNumbers[i])) {
        NewArrayOfNumbers = increaseLengthOfArrayWithCopy(NewArrayOfNumbers);
        NewArrayOfNumbers[count] = arrayOfNumbers[i];
        count++;
      }
    }
    return NewArrayOfNumbers;
  }

  public static boolean checkForDuplicate(int[] NewArrayOfNumbers, int number) {
    boolean check = true;
    for (int i = 0; i < NewArrayOfNumbers.length; i++) {
      if (NewArrayOfNumbers[i] == number) {
        check = false;
      }
    }
    return check;
  }
}
