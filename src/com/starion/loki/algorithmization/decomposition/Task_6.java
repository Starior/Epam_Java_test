package com.starion.loki.algorithmization.decomposition;

/*Write a method (s) that checks whether the given three numbers are coprime.*/

public class Task_6 {

  public static void main(String[] args) {
    int a = 8;
    int b = 16;
    int c = 18;
    coprimeIntegersCheck(a, b, c);
  }

  public static void coprimeIntegersCheck(int a, int b, int c) {
    if (gcd(gcd(a, c), b) == 1) {
      System.out.println("The numbers: " + a + ", " + b + ", " + c
          + " coprime (in aggregate) numbers.\nPairwise reciprocity has not been tested");
    } else {
      System.out.println("The numbers: " + a + ", " + b + ", " + c
          + " not coprime (in aggregate) numbers.\nPairwise reciprocity has not been tested");
    }
  }

  public static int gcd(int a, int b) {
    return (b == 0) ? a : gcd(b, a % b);
  }
}
