package Lab7;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перший рядок: ");
        String firstString = scanner.nextLine();

        System.out.print("Введіть другий рядок: ");
        String secondString = scanner.nextLine();

        int firstStringLength = firstString.length();
        int secondStringLength = secondString.length();

        if (firstStringLength > secondStringLength) {
            System.out.println("Перший рядок має більшу кількість символів.");
        } else if (firstStringLength < secondStringLength) {
            System.out.println("Другий рядок має більшу кількість символів.");
        } else {
            System.out.println("Обидва рядки мають однакову кількість символів.");
        }
    }
}
