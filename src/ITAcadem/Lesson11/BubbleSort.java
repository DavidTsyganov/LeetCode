package ITAcadem.Lesson11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        final int[] array = getArray(getInput());
        printResults("Исходный массив: ", Arrays.toString(array));
        printResults("Массив с перестановкой: ", Arrays.toString(sortElements(array)));

    }

    private static int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        System.out.println("Введите максимально возможное значение в массиве: ");
        int a = scanner.nextInt();
        return new int[] {n, a};
    }

    private static int[] getArray(int[] nums) {
        Random random = new Random();
        int[] array = new int[nums[0]];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(nums[1] + 1);
        }
        return array;
    }
    private static int[] sortElements(int[] array) {
        boolean check = true;
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - k; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    check = true;
                }
                else {
                    check = false;
                }
            }

            if (check == false) {
                break;
            }
            else {
                k++;
            }
        }
        return array;
    }

    private static void printResults(String a, String args) {
        System.out.println(a + args);
    }
}
