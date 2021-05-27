package com.starion.loki.algorithmization.decomposition;

/*Write a method(s) that determines which of the given two numbers has more digits.*/

public class Task_11 {

  public static void main(String[] args) {
    int a = 234520;
    int b = 234345652;
    comparisonLength(a, b);
  }

  public static void comparisonLength(int a, int b) {
    if (countingLengthArray(a) > countingLengthArray(b)) {
      System.out.println("Number " + a + " has more digits than number " + b);
    } else if (countingLengthArray(a) < countingLengthArray(b)) {
      System.out.println("Number " + b + " has more digits than number " + a);
    } else {
      System.out.println("The numbers " + a + " and " + b + " have the same number of digits");
    }
  }

  public static int countingLengthArray(int n) {
    int i = 10;
    int countNumbers = 1;
    while (n != n % i) {
      i *= 10;
      countNumbers++;
    }
    return countNumbers;
  }
}
