package com.starion.loki.basics.linear;

public class Task_5 {

  public static void main(String[] args) {
    int t = 3601;
    int hours = 0;
    byte minutes = 0;
    byte secunds = 0;

    if (t > 3600) {
      hours = t / 3600;
      t = t % 3600;
      if (hours > 99) {
        System.out.println("Слишком большое число для вывода в формате ННч ММмин SSc");
        return;
      }

    }
    if (t > 60) {
      minutes = (byte) (t / 60);
      t = t % 60;

    }
    if (t < 60) {
      secunds = (byte) t;
    }

    System.out.printf("%02dч %02dмин %02dс", hours, minutes, secunds);

  }
}
