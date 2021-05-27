package com.starion.loki.algorithmization.decomposition;

/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
Для решения задачи использовать декомпозицию.*/

/*A natural number with n digits in it is called the Armstrong number if the sum of its digits
    raised to the power n is equal to the number itself. Find all Armstrong numbers from 1 to k. To
    solve the task, use decomposition.*/

/*Ошибка описания числа Армстронга?*/
public class Task_14 {

  public static void main(String[] args) {
    int k = 66345;

    for (int i = 1; i <= k; i++) {
      if (Math.pow(sumNumbers(i), countingLength(i)) == i) {
        System.out.println("The number " + i + " is the Armstrong number.");
      }
    }
  }

  public static int sumNumbers(int k) {
    int sum = 0;
    for (int j = countingLength(k) - 1; j >= 0; j--) {
      sum = sum + k % 10;
      k = (k - k % 10) / 10;
    }
    return sum;
  }

  public static int countingLength(int n) {
    int i = 10;
    int countNumbers = 1;
    while (n != n % i) {
      i *= 10;
      countNumbers++;
    }
    return countNumbers;
  }
}
