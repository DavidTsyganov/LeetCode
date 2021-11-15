package ITAcademLesson3.MaxMin.TernarnyOperator;
import java.util.Scanner;

public class MaxMinTernaryOperator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();

        int minNumber = (a <= b) ? a : b;
        int maxNumber = (a >= b) ? a : b;

        System.out.println("Максимальное число: " + maxNumber);
        System.out.println("Минимальное число: " + minNumber);
    }
}
