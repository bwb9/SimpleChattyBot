package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int reminder3 = scanner.nextInt();
        int reminder5 = scanner.nextInt();
        int reminder7 = scanner.nextInt();

        System.out.printf("Your age is %d; that's a good time to start programming!",
                           (reminder3 * 70 + reminder5 * 21 + reminder7 * 15) % 105);
    }
}
