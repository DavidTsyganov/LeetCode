package ITAcademLesson5.GuessNumber;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        final int answer = inputNumber();
        final int random = randomNumber();
        printNumber(random);
        findNumber(answer, random);
    }

    private static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Попробуйте угадать число: ");
        int answer = scanner.nextInt();
        return answer;
    }

    private static int randomNumber() {
        int random = (int) (Math.random() * 101);
        return random;
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
                a = inputNumber();
            }
        }
    }
}
