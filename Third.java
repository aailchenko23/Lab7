package Lab7;
import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Введіть число: ");
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                if (number > max) {
                    max = number;
                }
            } else {
                System.out.println("Ви ввели недопустиме значення. Спробуйте ще раз.");
                scanner.nextLine();
                i--; // Повторний ввід для даного числа
            }
        }

        System.out.println("Найбільше число: " + max);
    }
}
