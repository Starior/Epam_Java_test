package com.starion.loki.algorithmization.decomposition;

/*On the plane,n points are given by their coordinates.
    Write a method(methods)that determine which of the pairs of points is the greatest distance.
    Indication.Enter the coordinates of the points into the array.*/

import java.util.Arrays;

public class Task_4 {

  public static void main(String[] args) {
    int n = 4;
    int[][] array = new int[n][2];
    for (int i = 0; i < array.length; i++) {
      array[i][0] = (int) (Math.random() * 21) - 10;
      array[i][1] = (int) (Math.random() * 21) - 10;
    }
    System.out.println("Array of the points: " + Arrays.deepToString(array));
    maxDistanceBetweenTwoPointsInArray(array);
  }

  public static double distanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
    double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    return d;
  }

  public static void maxDistanceBetweenTwoPointsInArray(int[][] array) {
    double max = 0;
    int indexOne = -1;
    int indexTwo = -1;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (max < distanceBetweenTwoPoints(array[i][0], array[i][1], array[j][0], array[j][1])
            && j != i) {
          max = distanceBetweenTwoPoints(array[i][0], array[i][1], array[j][0], array[j][1]);
          indexOne = i;
          indexTwo = j;
        }
      }
    }
    System.out.println("Longest distance: " + max
        + "\n" + "First point: " + array[indexOne][0] + ", " + array[indexOne][1]
        + "\n" + "Second point: " + array[indexTwo][0] + ", " + array[indexTwo][1]);
  }
}
