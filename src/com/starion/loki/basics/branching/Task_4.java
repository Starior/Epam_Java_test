package com.starion.loki.basics.branching;

public class Task_4 {
    public static void main(String[] args) {

        int a = 32;
        int b = 12;

        int x = 11;
        int y = 40;
        int z = 31;

        if((x<a||y<a||z<a)&&(x<b||y<b||z<b))
            System.out.println("Кирпич пройдёт");
        else
            System.out.println("Кирпич не пройдёт");

    }
}
