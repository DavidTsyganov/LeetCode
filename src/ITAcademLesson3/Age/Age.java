package ITAcademLesson3.Age;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст, если вам от 1 до 112 лет");
        int age = scanner.nextInt();


        if (age < 1) {
            System.out.println("Вы слишком малы");
        } else if (age > 112) {
            System.out.println("Вы слишком стары");
        }

        if (age <= 100 && age >= 1) {
            int year = age % 10;
            if (year == 1) {
                System.out.println("Вам " + age + "год");
            } else if (year >= 2 && year <= 4) {
                System.out.println("Вам " + age + "года");
            } else if (year >= 5) {
                System.out.println("Вам " + age + "лет");
            } else if (year == 0) {
                System.out.println("Вам " + age + "лет");
            }
        }
    }
}

