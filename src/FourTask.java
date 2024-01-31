import java.util.Scanner;

public class FourTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите часы: ");
            int hours = scanner.nextInt();

            System.out.println("Введите минуты");
            int minutes = scanner.nextInt();

            double angle = calculateAngle(hours, minutes);
            System.out.println("Угол между часовой и минутной стрелками: " + angle + " градусов");
        }
    }

    public static double calculateAngle(int hours, int minutes) {
        if (hours < 0 || hours > 24 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Неверные значения");
        }

        double angleHour = (hours % 12 + minutes / 60.0) * 30;
        double angleMinute = minutes * 6;

        double angle = Math.abs(angleHour - angleMinute);

        if (angle > 180) {
            angle = 360 - angle;
        }

        return angle;
    }
}
