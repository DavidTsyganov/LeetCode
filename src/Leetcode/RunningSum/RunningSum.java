package Leetcode.RunningSum;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        int[] runningSum = new int[n];
        int sum = 0;

        for (int i = 0; i < nums.length; ++i) {
            nums[i] = (int) (Math.random() * 100);
        }

        for (int j = 0; j < runningSum.length; ++j) {
            sum += nums[j];
            runningSum[j] = sum;
        }

        System.out.println("Исходный массив: " + Arrays.toString(nums));
        System.out.println("Итоговый массив: " + Arrays.toString(runningSum));
    }
}
