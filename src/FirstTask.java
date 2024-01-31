import java.util.Arrays;

public class FirstTask {
    public static void main(String[] args) {
        int size = 3;

        float[] arr = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (float) Math.random();
        }

        float min = arr[0];
        float max = arr[0];
        float sum = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }

            sum += arr[i];
        }

        float average = sum / size;

        System.out.println(Arrays.toString(arr));
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Среднее значение " + average);
    }
}