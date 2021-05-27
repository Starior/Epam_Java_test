package com.starion.loki.algorithmization.decomposition;

/*The sum of its digits was subtracted from the given number. The sum of its digits was again
    subtracted from the result, etc. How many such actions must be performed to get zero? To solve
    the task, use decomposition.*/

public class Task_17 {

  public static void main(String[] args) {
    int number = 21;

    countingIteration(number);
  }

  public static void countingIteration(int number) {
    int count = 0;
    for (int i = number; i > 0; i -= summingDigits(i)) {
      count++;
    }
    System.out.println("The amount of subtracting is " + count);
  }

  public static int summingDigits(int i) {
    int k = 0;
    for (int j = i; j > 0; j /= 10) {
      k += j % 10;
    }
    return k;
  }
}
