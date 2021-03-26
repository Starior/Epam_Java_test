package com.starion.loki.basics.cycles;

import java.util.HashSet;

public class Task_8_HashSet {
    public static void main(String[] args) {
        int a = 21342087;
        int b = 872230;
        HashSet<Character> numbs = new HashSet<>();
        for (int i = 0; i <= Integer.toString(a).length() - 1; i++) {
            //System.out.println("   i " + i);
            for (int j = 0; j <= Integer.toString(b).length() - 1; j++) {
                //System.out.println("      j " +j);
                if (Integer.toString(a).charAt(i) == Integer.toString(b).charAt(j)) {
                    //System.out.println(Integer.toString(a).charAt(i));
                    numbs.add(Integer.toString(a).charAt(i));
                }
            }
        }
        System.out.println(numbs);
    }
}
