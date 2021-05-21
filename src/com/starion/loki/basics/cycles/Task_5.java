package com.starion.loki.basics.cycles;

public class Task_5 {

  public static void main(String[] args) {

    double e = 0.000000000001;
    double sum = 0;

    for (int n = 1; ; n++) {
      double a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
        if (Math.abs(a) < e) {
            break;
        }
      sum += a;
    }
    System.out.print(sum);
  }
}
