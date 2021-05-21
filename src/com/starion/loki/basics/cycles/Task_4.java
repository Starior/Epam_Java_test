package com.starion.loki.basics.cycles;

import java.math.BigInteger;

public class Task_4 {

  public static void main(String[] args) {
    BigInteger sum = BigInteger.valueOf(1);

      for (int i = 1; i <= 200; i++) {
          sum = sum.multiply(BigInteger.valueOf((long) i * i));
      }
    System.out.println(sum);

  }
}
