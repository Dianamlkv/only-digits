package by.itacademy.malkova;

import java.util.Scanner;

public class OnlyDigits {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String testedString = scanner.nextLine();

        boolean isOnlyDigits = true;
        for (int i = 0; i < testedString.length(); i++) {
            if (!Character.isDigit(testedString.charAt(i))) {
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
