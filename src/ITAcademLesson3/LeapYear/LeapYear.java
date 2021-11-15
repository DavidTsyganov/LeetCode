package ITAcademLesson3.LeapYear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();

        if (((year % 4) == 0 ) && ((year % 100) != 0)) {
            System.out.println("Данный год является високосным");
        }
        else if (((year % 4) == 0 ) && ((year % 100) == 0) && ((year % 400) == 0)) {
            System.out.println("Данный год является високосным");
        }
        else {
            System.out.println("Данный год не является високосным");
        }
    }
}
