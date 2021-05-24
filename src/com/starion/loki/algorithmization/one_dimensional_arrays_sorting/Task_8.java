package com.starion.loki.algorithmization.one_dimensional_arrays_sorting;

/*Fractions p1/q1,p2/q 2,...,pn/qn,(pi,qi-natural)are given.
    Write a program that brings these fractions to a common denominator
    and orders them in ascending order.*/

import java.util.Arrays;

public class Task_8 {

  public static int gcd(int a, int b) {
    return (b == 0) ? a : gcd(b, a % b);
  }

  public static void main(String[] args) {
    int n = 4;
    int[] numerator = new int[n];
    int[] denominator = new int[n];
    for (int i = 0; i < n; i++) {
      numerator[i] = (int) (Math.random() * 10 + 1);
      denominator[i] = (int) (Math.random() * 10 + 1);
      System.out.print(numerator[i] + "/" + denominator[i] + " ");
    }
    int[] denominatorOut = Arrays.copyOf(denominator, denominator.length);
    int[] numeratorOut = Arrays.copyOf(numerator, numerator.length);

    int res = 1;
    for (int i = 0; i < denominator.length; i++) {
      for (int j = i + 1; j < denominator.length; j++) {
        int temp = gcd(denominator[i], denominator[j]);
        denominator[j] /= temp;
      }
    }
    for (int k : denominator) {
      res = res * k;
    }
    System.out.println();

    for (int i = 0; i < numeratorOut.length; i++) {
      numeratorOut[i] = numeratorOut[i] * (res / denominatorOut[i]);
    }

    int temp;
    for (int i = 0; i < numeratorOut.length; i++) {
      for (int j = i + 1; j < numeratorOut.length; j++) {
        if (numeratorOut[i] > numeratorOut[j]) {
          temp = numeratorOut[i];
          numeratorOut[i] = numeratorOut[j];
          numeratorOut[j] = temp;
        }
      }
    }

    for (int i = 0; i < denominator.length; i++) {
      System.out.print(numeratorOut[i] + "/" + res + " ");
    }
  }
}
