package com.starion.loki.algorithmization.decomposition;

/*Write a program that determines the sum of n-digit numbers containing only odd digits.
    Also determine how many even digits are in the found amount.
    To solve the task, use decomposition.*/

public class Task_16 {

  public static void main(String[] args) {
    int n = 4;
    System.out.println("Sum " + n + "-digit numbers containing only odd digits: "
        + sumNumbersNotContainEvenDigits(n));
    System.out.println("The amount of even digits in the found sum: " + countingEvenDigits(
        sumNumbersNotContainEvenDigits(n)));
  }

  private static int sumNumbersNotContainEvenDigits(int n) {
    int sumNumbersNotContainEvenDigits = 0;
    for (int i = calculateMinNumber(n); i < calculateMaxNumber(n); i++) {
      if (isNumberNotContainEvenDigits(i)) {
        sumNumbersNotContainEvenDigits += i;
      }
    }
    return sumNumbersNotContainEvenDigits;
  }

  private static int countingEvenDigits(int sum) {
    int countEvenDigits = 0;
    for (int j = sum; j > 0; j /= 10) {
      if ((j % 10) % 2 == 0) {
        countEvenDigits++;
      }
    }
    return countEvenDigits;
  }

  private static boolean isNumberNotContainEvenDigits(int i) {
    int k = 0;
    for (int j = i; j > 0; j /= 10) {
      if ((j % 10) % 2 != 0) {
        k++;
      }
    }
    return k == countingLengthArray(i);
  }

  private static int calculateMaxNumber(int n) {
    return (int) (Math.pow(10, n) - 1);
  }

  private static int calculateMinNumber(int n) {
    return (int) (Math.pow(10, (n - 1)));
  }

  private static int countingLengthArray(int n) {
    int i = 10;
    int countNumbers = 1;
    while (n != n % i) {
      i *= 10;
      countNumbers++;
    }
    return countNumbers;
  }
}
