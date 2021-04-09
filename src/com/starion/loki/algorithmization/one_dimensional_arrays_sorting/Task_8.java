package com.starion.loki.algorithmization.one_dimensional_arrays_sorting;

import java.util.Arrays;

public class Task_8 {
    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        int n = 4;
        int[] numerator = new int[n];
        int[] denominator = new int[n];
        for (int i = 0; i < n; i++) {
            numerator[i] = (int) (Math.random() * 10 + 1);
            denominator[i] = (int) (Math.random() * 10 + 1);
            System.out.print(numerator[i] + "/" + denominator[i] + " ");
        }
        int[] denominatorOut = Arrays.copyOf(denominator, denominator.length);
        int[] numeratorOut = Arrays.copyOf(numerator, numerator.length);

        int res = 1;
        for (int i = 0; i < denominator.length; i++) {
            for (int j = i + 1; j < denominator.length; j++) {
                int temp = gcd(denominator[i], denominator[j]);
                denominator[j] /= temp;
            }
        }
        for (int i = 0; i < denominator.length; i++)
            res = res * denominator[i];
        System.out.println();

        for (int i = 0; i < numeratorOut.length; i++) {
            numeratorOut[i]=numeratorOut[i] * (res / denominatorOut[i]);
        }

        int temp = 0;
        for (int i = 0; i < numeratorOut.length; i++) {
            for (int j = i + 1; j < numeratorOut.length; j++) {
                if (numeratorOut[i] > numeratorOut[j]) {
                    temp = numeratorOut[i];
                    numeratorOut[i] = numeratorOut[j];
                    numeratorOut[j] = temp;
                }
            }
        }

        for (int i = 0; i < denominator.length; i++) {
            System.out.print(numeratorOut[i] + "/" + res + " ");
        }
        /*int pn = 5;
        int element;

        int[] numerator = new int[pn];
        int[] denominator = new int[pn];

        for (int i = 0; i < pn; i++) {
            numerator[i] = 1 + (int) (Math.random() * 10);
            denominator[i] = 1 + (int) (Math.random() * 10);
            System.out.print(numerator[i] + "/" + denominator[i] + " ");
        }
        element = nok(denominator[0], denominator[1]);
        if (pn > 2) {
            for (int i = 2; i < pn; i++) {
                element = nok(element, denominator[i]);
            }
        }

        for (int i = 0; i < pn; i++) {
            numerator[i] = element / denominator[i] * numerator[i];
            denominator[i] = element;
        }

        for (int i = 0; i < pn; i++) {
            for (int j = 0; j < pn - 1; j++) {
                if (numerator[j] > numerator[j + 1]) {
                    int value = numerator[j];
                    numerator[j] = numerator[j + 1];
                    numerator[j + 1] = value;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < pn; i++) {

            System.out.print(numerator[i] + "/" + denominator[i] + " ");
        }*/
    }

    /*private static int nod(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    private static int nok(int a, int b) {
        return a / nod(a, b) * b;
    }*/

}
