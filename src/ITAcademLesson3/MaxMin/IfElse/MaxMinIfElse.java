package ITAcademLesson3.MaxMin.IfElse;
import java.util.Scanner;

public class MaxMinIfElse {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе целое число:");
        int b = scanner.nextInt();

        int minNumber = 0;
        int maxNumber = 0;

        if (a < b) {
            minNumber = a;
            maxNumber = b;
        }
        else if (b < a) {
            minNumber = b;
            maxNumber = a;
        }
        else {
            System.out.println("Эти два числа равны");
        }
        System.out.println("Минимальное число: " + minNumber);
        System.out.println("Максимальное число: " + maxNumber);

    }
}
