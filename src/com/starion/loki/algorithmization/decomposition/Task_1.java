package com.starion.loki.algorithmization.decomposition;

/*
Write a method(s) for finding the greatest common divisor and
    the least common multiple of two natural numbers:
            LCM(A,B)=((A*B)/GCD(A,B))
*/

public class Task_1 {

  public static void main(String[] args) {
    int a = 16;
    int b = 20;
    System.out.println(gcd(a, b));
    System.out.println(lcm(a, b));
  }

  public static int gcd(int a, int b) {
    return (b == 0) ? a : gcd(b, a % b);
  }

  public static int lcm(int a, int b) {
    return a * b / gcd(a, b);
  }
}
