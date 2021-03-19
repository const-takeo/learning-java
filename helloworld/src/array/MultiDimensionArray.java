package array;

import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][] arrMulti = new int[][] { { 1, 2, 3 }, { 4, 5, 6, 7 } };
        // 2
        System.out.println(arrMulti.length);
        // 3
        System.out.println(arrMulti[0].length);

        for (int i = 0; i < arrMulti.length; i++) {
            for (int j = 0; j < arrMulti[i].length; j++) {
                System.out.println(arrMulti[i][j]);
            }
        }

        char[][] alphabets = new char[13][2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < alphabets.length; i++) {
            for (int j = 0; j < alphabets[i].length; j++) {
                char ch = scanner.next().charAt(0);
                alphabets[i][j] = ch;
            }
        }
        scanner.close();
        System.out.println("xxxxxxxxxxxx");
        for (int i = 0; i < alphabets.length; i++) {
            for (int j = 0; j < alphabets[i].length; j++) {
                System.out.println(alphabets[i][j]);
            }
        }
    }
}
