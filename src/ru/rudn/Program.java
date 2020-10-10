package ru.rudn;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    static Scanner scanner;
    public static void main(String[] args) {
        //scanner = new Scanner(System.in);
        //countSum(enterArray(scanner.nextInt(),scanner.nextInt()));
        double y = 6.67676;
        DecimalFormat decimalFormat = new DecimalFormat(".###");

        System.out.println(decimalFormat.format(y));

        //System.out.println(9);
        //System.out.printf("%.2f",5.6767);

        // Math.ceil() // в большую сторону
        // Math.round() // математически
        // Math.floor() // округл в меньшую сторону

    }

    static int[][] enterArray(int x, int y) {
        int[][] h = new int[x][y];
        for(int i=0;i<h.length;i++) {
            for(int j=0;j<h[i].length;j++) {
                h[i][j] = scanner.nextInt();
            }
        }
        return h;
    }

    static void countSum(int[][] h) {
        int sum = 0;
        for(int i=0;i<h.length;i++) {
            for(int j=0;j<h[i].length;j++) {
                sum += h[i][j];
            }
        }
        System.out.print(sum);
    }

}
