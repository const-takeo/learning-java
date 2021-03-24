package exception;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        try {
            for (int i = 0; i <= arr.length + 1; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            // return;
        } finally {
            System.out.println("finally");
        }
        System.out.println("end");
    }
}
