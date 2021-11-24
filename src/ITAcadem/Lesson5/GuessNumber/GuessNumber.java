package ITAcademLesson5.GuessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        final int answer = readInputNumber();
        final int random = getRandomNumber();
        printNumber(random);
        findNumber(answer, random);
    }

    private static int readInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Попробуйте угадать число: ");
        int answer = scanner.nextInt();
        return answer;
    }

    private static int getRandomNumber() {
        Random random = new Random();
        int number = random.nextInt(101);
        return number;
    }

    private static void printNumber(int a) {
        System.out.println("Загаданное число: " + a);
    }

    private static void findNumber(int a, int b) {
        boolean check = false;

        while (check == false) {
            if (a == b) {
                System.out.println("Поздравляю! Вы угадали!");
                check = true;
            }
            else {
                if (a < b) {
                    System.out.println("Введенное вами число меньше загаданного.");
                }
                else {
                    System.out.println("Введенное вами число больше загаданного.");
                }
                a = readInputNumber();
            }
        }
    }
}
