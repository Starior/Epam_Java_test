package com.starion.loki.basics.linear;

public class Task_4_number {

  public static void main(String[] args) {
    double num = 424.982;

//    int first = (int) num;
//    double firstDb = (double) first / 1000;
//    double second = (int)(num % 1 * 1000);
//    double numNew = second + firstDb;

    double numNew = (int) (num % 1 * 1000) + (((double) ((int) num)) / 1000);

    System.out.println(numNew);
  }
}
