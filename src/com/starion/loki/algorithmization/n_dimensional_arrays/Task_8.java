package com.starion.loki.algorithmization.n_dimensional_arrays;

/*In a numerical matrix,swap any two columns,that is,put all the elements of one column in
    the corresponding positions of the other,and move the elements of the second to the first.
    Column numbers are entered by the user from the keyboard.*/

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.random;

public class Task_8 {

  public static void main(String[] args) {
    int[][] nums;
    int n = 10;
    nums = new int[n][n];
    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 0; j <= nums.length - 1; j++) {
        nums[i][j] = (int) (random() * 21) - 10;
        System.out.printf("%5.3s", nums[i][j]);
      }
      System.out.println();
    }

    System.out.println();
    try {
      System.out.print("Enter the number of the first column: ");
      int num = new Scanner(System.in).nextInt() - 1;
      if (num < 0 || num >= n) {
        System.out.print("Invalid number format. You must enter a number from 1 to " + n);
        return;
      }
      System.out.print("Enter the number of the second column: ");
      int num2 = new Scanner(System.in).nextInt() - 1;
      if (num2 < 0 || num2 >= n) {
        System.out.print("Invalid number format. You must enter a number from 1 to " + n);
        return;
      }

      for (int i = 0; i <= nums.length - 1; i++) {
        for (int j = 0; j <= nums.length - 1; j++) {
          if (j == num && num < num2) {
            int temp = nums[i][num];
            nums[i][num] = nums[i][num2];
            nums[i][num2] = temp;
          } else if (j == num2 && num > num2) {
            int temp = nums[i][num];
            nums[i][num] = nums[i][num2];
            nums[i][num2] = temp;
          }
          System.out.printf("%5.3s", nums[i][j]);
        }
        System.out.println();
      }

    } catch (InputMismatchException e) {
      System.out.println("Invalid number format. You must enter a number from 1 to " + n);
    }

  }
}
