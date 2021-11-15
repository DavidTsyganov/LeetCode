package Leetcode.FizzBuzz;

import java.util.Arrays;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();

        String[] answer = new String[n];

        for (int i = 0; i < answer.length; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                answer[i] = "Andrei1";
            }
            else if ((i + 1) % 3 == 0 && (i + 1) % 5 != 0) {
                answer[i] = "Fizz";
            }
            else if ((i + 1) % 5 == 0 && (i + 1) % 3 != 0) {
                answer[i] = "Buzz";
            }
            else {
                answer[i] = String.valueOf(i + 1);
            }
        }
        System.out.println("Итоговый массив: " + Arrays.toString(answer));

    }
}
