package stream;

import java.util.Arrays;

public class InArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        // stream生成
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
