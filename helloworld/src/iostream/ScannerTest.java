package iostream;

import java.io.Console;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int num = scanner.nextInt();
        System.out.println(name);
        System.out.println(num);

        // console
        // Console console = System.console();

        // String name = console.readLine();
        // System.out.println(name);

        
    }
}
