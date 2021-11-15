package Leetcode.TwoSum;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предполагаемую сумму");
        int target = scanner.nextInt();

        System.out.println("Введите размер массива");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        int[] ans = new int[2];
        int sum = 0;


        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < nums.length; i++) {
            boolean needBreak = false;
            for (int j = 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    ans[0] = nums[i];
                    ans[1] = nums[j];
                    needBreak = true;
                    break;
                }
            }
            if (needBreak) {
                break;
            }
        }
        System.out.println("Исходный массив: " + Arrays.toString(nums));
        System.out.println("Предполагаемая сумма:" + target);
        System.out.println("Ответ: " + Arrays.toString(ans));
    }
}
