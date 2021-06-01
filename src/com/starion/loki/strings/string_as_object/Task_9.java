package com.starion.loki.strings.string_as_object;

/*Count the number of lowercase and uppercase letters in the entered line. Consider only English
    letters.*/

import java.util.Scanner;

public class Task_9 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the string, please.");
    String string = scanner.nextLine();

    countCases(string);
  }

  private static void countCases(String string) {
    int countLowercase = 0;
    int countUppercase = 0;

    for (int index = 0; index < string.length(); index++) {
      if ((int) 'A' <= string.codePointAt(index) && string.codePointAt(index) <= (int) 'Z') {
        countUppercase++;
      }
      if ((int) 'a' <= string.codePointAt(index) && string.codePointAt(index) <= (int) 'z') {
        countLowercase++;
      }
    }

    System.out.println(
        "The number of lowercase letters in the entered line is " + countLowercase + "\n"
            + "The number of uppercase letters in the entered line is " + countUppercase);
  }
}
