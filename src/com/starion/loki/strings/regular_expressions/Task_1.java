package com.starion.loki.strings.regular_expressions;

/*Create an application that parses the text (the text is stored in a line) and allows you to
    perform three different operations with the text: sort paragraphs by the number of sentences;
    sort words by length in each sentence; sort lexemes in a sentence in descending order of the
    number of occurrences of a given symbol, and in case of equality, alphabetically.*/

import static java.util.Comparator.comparingInt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1 {

  public static void main(String[] args) {
    String text =
        """
            As they sailed westward day after day, the warmth of the southern spring lay on the waters, and the sky was clear. Yet it seemed to Arren that there was a dullness in the light, as if it fell aslant through glass. The sea was lukewarm when he swam, bringing little refreshment. Their salt food had no savor. There was no freshness or brightness in anything, unless it were at night, when the stars burned with a greater radiance than he had ever seen in them. He would lie and watch them till he slept. Sleeping, he would dream: always the dream of the moors or the pit or a valley hemmed round by cliffs or a long road going downward under a low sky; always the dim light, and the horror in him, and the hopeless effort to escape.
            He never spoke of this to Sparrowhawk. He did not speak of anything important to him, nothing but the small daily incidents of their sailing; and Sparrowhawk, who had always had to be drawn out, was now habitually silent.
            Arren saw now what a fool he had been to entrust himself body and soul to this restless and secretive man, who let impulse move him and made no effort to control his life, nor even to save it. For now the fey mood was on him; and that, Arren thought, was because he dared not face his own failure– the failure of wizardry as a great power among men.
            It was clear now that to those who knew the secrets, there were not many secrets to that art magic from which Sparrowhawk and all the generations of sorcerers and wizards, had made much fame and power. There was not much more to it than the use of wind and weather, the knowledge of healing herbs, and a skillful show of such illusions as mists and lights and shape-changes, which could awe the ignorant, but which were mere tricks. Reality was not changed. There was nothing in magery that gave a man true power over men; nor was it any use against death. The mages lived no longer than ordinary men. All their secret words could not put off for one hour the coming of their death.
            aaaa aa  aaaaaa a a dsaf  fasf dsfs sdgf sdf.""";

    while (true) {
      Scanner innerScanner = new Scanner(System.in);
      System.out.println(
          """
              Enter the code of operation, please.
              1 - sort paragraphs by the number of sentences
              2 - sort words by length in each sentence
              3 - sort lexemes in a sentence in descending order of the number of occurrences of a given character, and in case of equality, alphabetically.
              0 - Exit""");

      int variant = innerScanner.nextInt();

      switch (variant) {
        case 0 -> System.exit(0);
        case 1 -> sortParagraphs(text);
        case 2 -> sortWords(text);
        case 3 -> startThirdPoint(text);
      }
    }
  }

  private static void sortParagraphs(String text) {
    String[] paragraphs = text.split("\\n");
    HashMap<String, Integer> map = new HashMap<>();

    for (String paragraph : paragraphs) {
      int countSentences = 0;
      for (int index = 0; index < paragraph.length(); index++) {
        if (paragraph.charAt(index) == '.'
            || paragraph.charAt(index) == '?'
            || paragraph.charAt(index) == '!') {
          countSentences++;
        }
      }
      map.put(paragraph, countSentences);
    }

    map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
  }

  private static void sortWords(String text) {
    String[] sentences = text.split("[.!?]");
    ArrayList<String> words = new ArrayList<>();

    Comparator<String> comparator = comparingInt(String::length);
    for (String sentence : sentences) {
      sentence = sentence.trim();

      Collections.addAll(words, sentence.split("\\W+"));
      words.sort(comparator);
      System.out.println(words);
      words.clear();
    }
  }

  private static void startThirdPoint(String text) {

    Scanner innerScanner = new Scanner(System.in);
    System.out.println(
        "Enter the symbol (if you enter more than one character, the first one will be taken)");
    char symbol = innerScanner.next().charAt(0);
    sortLiteral(text, symbol);
  }

  private static void sortLiteral(String text, char symbol) {

    //Checking for the presence of a symbol in the text
    if (text.indexOf(symbol) != -1) {

      //Splitting text into sentences
      String[] sentences = text.split("([.!?]+)");

      //Processing each sentence
      for (String s : sentences) {

        //Splitting sentence into String array - words
        String[] words = s.toLowerCase().trim().split("\\W+");

        //Creating two new collections, and filling them
        ArrayList<String> wordsWithoutSymbol = new ArrayList<>();
        ArrayList<String> wordsWithSymbol = new ArrayList<>();
        for (String word : words) {
          if (word.indexOf(symbol) == -1) {
            wordsWithoutSymbol.add(word);
          } else {
            wordsWithSymbol.add(word);
          }
        }

        //sorting alphabetically
        Collections.sort(wordsWithoutSymbol);
        Collections.sort(wordsWithSymbol);

        //sorting words with symbol by number of occurrences of a given symbol
        for (int k = 0; k < wordsWithSymbol.size(); k++) {
          for (int j = 0; j < wordsWithSymbol.size() - 1; j++) {
            if (countLiteral(wordsWithSymbol.get(j), symbol) < countLiteral(
                wordsWithSymbol.get(j + 1), symbol)) {
              Collections.swap(wordsWithSymbol, wordsWithSymbol.indexOf(wordsWithSymbol.get(j)),
                  wordsWithSymbol.indexOf(wordsWithSymbol.get(j + 1)));
            }
          }
        }

        //creating new collection and adding to it both previous collections
        ArrayList<String> newSentence = new ArrayList<>();
        newSentence.addAll(wordsWithSymbol);
        newSentence.addAll(wordsWithoutSymbol);
        System.out.println(newSentence);
      }
    } else {
      System.out.println("This symbol is missing in the text");
    }
  }

  private static int countLiteral(String word, char symbol) {
    int count = 0;
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == symbol) {
        count++;
      }
    }
    return count;
  }
}
