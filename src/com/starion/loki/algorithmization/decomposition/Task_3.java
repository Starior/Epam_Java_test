package com.starion.loki.algorithmization.decomposition;

/*Calculate the area of a regular hexagon with side 'a' using the triangle area method.*/

public class Task_3 {

  public static void main(String[] args) {
    double a = 5;

    System.out.println(regularHexagonArea(a));
  }

  private static double regularHexagonArea(double a) {
    return triangleArea(a) * 6;
  }

  private static double triangleArea(double a) {
    return (Math.sqrt(3) / 4) * Math.pow(a, 2);
  }
}
