package ITAcademLesson3.PositiveNumber;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println("Данное число - положительное");
        } else if (a == 0) {
            System.out.println("Это 0");
        } else {
            System.out.println("Данное число - отрицательное");
        }
    }
}
