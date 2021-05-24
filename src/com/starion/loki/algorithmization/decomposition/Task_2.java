package com.starion.loki.algorithmization.decomposition;

/*Write a method(s) for finding the greatest common divisor of four natural numbers.*/

public class Task_2 {

  public static void main(String[] args) {
    int a = 8;
    int b = 14;
    int c = 16;
    int d = 24;

    System.out.println(gcdFourNumbers(a, b, c, d));
  }

  public static int gcdFourNumbers(int a, int b, int c, int d) {
    return gcd(gcd(gcd(a, b), c), d);
  }

  public static int gcd(int a, int b) {
    return (b == 0) ? a : gcd(b, a % b);
  }
}
