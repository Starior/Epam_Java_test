package com.starion.loki.basics.cycles;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {

  public static void main(String[] args) {
    System.out.print("Введите число: ");
    try {
      int num = new Scanner(System.in).nextInt();
      if (num < 1) {
        System.out.print("Неверный формат числа");
      } else {
        int sum = 0;
          for (int i = 1; num >= i; i++) {
              sum += i;
          }

        System.out.println("Сумма чисел от 1 до " + num + " равна " + sum);
      }
    } catch (InputMismatchException e) {
      System.out.println("Неверно введено число");
    }

  }
}
