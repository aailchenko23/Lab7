package Lab7;
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Введіть " + i + "слово: ");
            String word = scanner.next();
            String firstLetter = word.substring(0, 1);
            System.out.println("Перша літера: " + firstLetter);
        }
    }
}
