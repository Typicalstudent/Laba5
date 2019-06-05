package reverse;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        ReverseNumber reverse = new ReverseNumber();
        reverse.reverseRecurs(number);
        System.out.println("Recursive result: " + reverse.getResult());
        reverse.resetResult();
        reverse.reverseNoRecurs(number);
        System.out.println("No recursive result: " + reverse.getResult());
    }
}
