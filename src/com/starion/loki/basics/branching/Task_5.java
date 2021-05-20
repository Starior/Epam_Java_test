package com.starion.loki.basics.branching;

public class Task_5 {

  public static void main(String[] args) {
    double x = 3.23;
    double f;

    if (x <= 3) {
      f = Math.pow(x, 2) - 3 * x + 9;
      System.out.println(f);
    }
    if (x > 3) {
      f = 1 / (Math.pow(x, 3) + 6);
      System.out.println(f);
    }
  }
}
