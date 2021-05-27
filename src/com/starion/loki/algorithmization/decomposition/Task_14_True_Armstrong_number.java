package com.starion.loki.algorithmization.decomposition;

/*A natural number with n digits in it is called the Armstrong number if the sum of its digits
    each(!)
    raised to the power n is equal to the number itself. Find all Armstrong numbers
    from 1 to k. To solve the task, use decomposition.*/

public class Task_14_True_Armstrong_number {

  public static void main(String[] args) {
    int k = 66345;
    findArmstrongNumber(k);
  }

  private static void findArmstrongNumber(int k) {
    System.out.println("Armstrong numbers from 1 to " + k + ":");
    for (int i = 1; i <= k; i++) {
      if (sumNumbersInPow(i) == i) {
        System.out.println(i);
      }
    }
  }

  private static int sumNumbersInPow(int k) {
    int sum = 0;
    int length = countingLength(k);
    for (int j = k; j > 0; j /= 10) {
      sum = sum + (int) Math.pow((j % 10), length);
    }
    return sum;
  }

  private static int countingLength(int n) {
    int i = 10;
    int countNumbers = 1;
    while (n != n % i) {
      i *= 10;
      countNumbers++;
    }
    return countNumbers;
  }
}
