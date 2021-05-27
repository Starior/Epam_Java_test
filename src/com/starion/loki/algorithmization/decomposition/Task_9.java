package com.starion.loki.algorithmization.decomposition;

/*The numbers X, Y, Z, T are given - the lengths of the sides of the quadrangle. Write a method(s)
    for calculating its area if there is a right angle between sides of length X and Y.*/

public class Task_9 {

  public static void main(String[] args) {
    int x = 13;
    int y = 7;
    int z = 22;
    int t = 4;

    if (x < y + z + t && y < x + z + t && z < y + x + t && t < y + z + x) {
      calculateArea(x, y, z, t);
    } else {
      System.out.println("There is no quadrangle with such sides.");
    }
  }

  public static double calculateSemiperimeter(int x, int y, int z, int t) {
    return (double) (x + y + z + t) / 2;
  }

  public static void calculateArea(int x, int y, int z, int t) {
    double p = calculateSemiperimeter(x, y, z, t);
    System.out.println("Square of a quadrangle with sides " + x + ", " + y + ", " + z + ", " + t
        + " is " + Math.sqrt((p - x) * (p - y) * (p - z) * (p - t)));
  }
}
