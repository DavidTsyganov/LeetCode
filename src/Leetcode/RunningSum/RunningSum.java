package Leetcode.RunningSum;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        final int[] nums = readInputs();
        final int[] result = countSum(nums);
        printInput(nums);
        printResult(result);
    }

    private static int[] readInputs() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве");
        int n = scanner.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < input.length; ++i) {
            input[i] = (int) (Math.random() * 100);
        }
        return input;
    }

    private static int[] countSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0;

        for (int j = 0; j < runningSum.length; ++j) {
            sum += nums[j];
            runningSum[j] = sum;
        }
        return runningSum;
    }

    private static void printInput(int[] input) {
        System.out.println("Исходный массив: " + Arrays.toString(input));
    }

    private static void printResult(int[] result) {
        System.out.println("Итоговый массив: " + Arrays.toString(result));
    }
}
