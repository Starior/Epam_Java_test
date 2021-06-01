package com.starion.loki.strings.string_as_object;

/*Check if the given word is a palindrome.*/

public class Task_3 {

  public static void main(String[] args) {
    String word = "Wenevrvenew";

    if (checkIsPalindrome(word)) {
      System.out.println("The given word is a palindrome");
    } else {
      System.out.println("The given word is not a palindrome");
    }
  }

  private static boolean checkIsPalindrome(String word) {
    for (int index = 0; index < (word.length() - 1) / 2; index++) {
      if (word.charAt(index) == word.charAt(word.length() - 1 - index)) {
        return true;
      }
    }
    return false;
  }
}
