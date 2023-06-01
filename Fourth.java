package Lab7;
import java.util.Scanner;
public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше ім'я: ");
        String firstName = scanner.nextLine();

        System.out.print("Введіть друге ім'я: ");
        String secondName = scanner.nextLine();

        if (firstName.equalsIgnoreCase(secondName)) { //для порівняння двох імен без урахування регістру
            System.out.println("Імена ідентичні.");
        } else {
            System.out.println("Імена не є ідентичними.");
        }
    }
}
