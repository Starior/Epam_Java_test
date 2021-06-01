package com.starion.loki.strings.string_as_object;

/*Use the copy function and the concatenation operation to form the word “total”
    from the parts of the word “atoll”.*/

public class Task_4 {

  public static void main(String[] args) {
    String word = "atoll";

    word = atollToTotal(word);
    System.out.println(word);
  }

  private static String atollToTotal(String word) {
    char[] arrayWord = word.toCharArray();
    String newWord = "";
    newWord = newWord.concat(String.copyValueOf(arrayWord, 1, 2))
        .concat(String.copyValueOf(arrayWord, 1, 1))
        .concat(String.copyValueOf(arrayWord, 0, 1))
        .concat(String.copyValueOf(arrayWord, 3, 1));
    return newWord;
  }
}
