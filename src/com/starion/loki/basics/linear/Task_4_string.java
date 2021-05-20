package com.starion.loki.basics.linear;

public class Task_4_string {

  public static void main(String[] args) {
    double num = 424.982;

    // intermediate string
    // String stringNum =  String.join(".",Double.toString(num).substring(4), Double.toString(num).substring(0, 3));

    double numNew = Double.parseDouble(
        String.join(".", Double.toString(num).substring(4), Double.toString(num).substring(0, 3)));

    System.out.println(numNew);
  }
}
