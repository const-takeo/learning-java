package array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers = new int[] { 0, 1, 2 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (int i : numbers) {
            System.out.println(i);
        }

        // char
        char[] alphabets = new char[26];
        char ch = 'A'; // ASCII- 65
        for (int i = 0; i < alphabets.length; i++, ch++) {
            alphabets[i] = ch;
            System.out.println(alphabets[i]);
        }
    }
}
