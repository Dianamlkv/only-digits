package by.itacademy.malkova;

import java.util.Scanner;

public class OnlyDigits {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String text = scanner.nextLine();

        boolean isOnlyDigits = true;
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                isOnlyDigits = false;
                break;
            }
        }

        if (isOnlyDigits) {
            System.out.println("Contains only digits");
        } else {
            System.out.println("Contains not only digits");
        }
    }
}
