package array;

import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][] multiArr = new int[][]{{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                System.out.println(multiArr[i][j]);
            }
        }
        // 多次元配列の長さは行を基準とする。
        System.out.println(multiArr.length);
        // 0行の列の長さの出力
        System.out.println(multiArr[0].length);

        char[][] alphabets = new char[13][2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < alphabets.length; i++) {
            for (int j = 0; j < alphabets[i].length; j++) {
                //charAt() -> 指定した位置の文字を文字列から取ってくる。 最後はlength - 1
                char c = scanner.nextLine().charAt(0);
                alphabets[i][j] = c;
            }
        }
        scanner.close();
        System.out.println("-----------------------");
        for (int i = 0; i < alphabets.length; i++) {
            for (int j = 0; j < alphabets[i].length; j++) {
                System.out.println(alphabets[i][j]);
            }
        }
    }
}
