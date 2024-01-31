import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("В какую систему перевести: ");
            System.out.println("1) Кельвины");
            System.out.println("2) Фаренгейты");
            System.out.println("3) Выход");
            int choice = scanner.nextInt();

            if (choice == 3) {
                break;
            }

            System.out.println("Введите температуру в градусах цельсия: ");
            float celsius = scanner.nextFloat();

            System.out.println(convert(celsius, choice));
        }
    }

    public static float convert(float celcius, int choice) {
        if (choice == 1) {
            return (float) (celcius + 273.15);
        } else if (choice == 2) {
            return (celcius * 9 / 5) + 32;
        } else {
            return -1;
        }
    }
}
