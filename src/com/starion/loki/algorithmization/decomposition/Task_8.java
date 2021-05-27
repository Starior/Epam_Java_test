package com.starion.loki.algorithmization.decomposition;

/*An array D is given. Determine the following sums:
    D [l] + D [2] + D [3]; D [3] + D [4] + D [5]; D [4] + D [5] + D [6].
    Explanation. Create a method(s) to calculate the sum of three consecutive
    array elements with numbers from k to m.*/

public class Task_8 {

  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int firstElementIndex = 7;
    int secondElementIndex = 9;

    sum(array, firstElementIndex, secondElementIndex);
  }

  private static void sum(int[] array, int firstElementIndex, int secondElementIndex) {
    if (secondElementIndex <= array.length && secondElementIndex - firstElementIndex == 2) {
      int a = firstElementIndex - 1, b = secondElementIndex - 1;
      int sum = 0;
      for (int i = a; i <= b; i++) {
        sum += array[i];
      }
      System.out.println(
          "Sum from " + firstElementIndex + "element to " + secondElementIndex + "element = "
              + sum);
    } else {
      System.out.println("Invalid input");
    }
  }
}
