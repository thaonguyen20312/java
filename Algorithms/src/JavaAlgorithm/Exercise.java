package JavaAlgorithm;

import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element:");
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Enter number:");
			nums[i] = sc.nextInt();
		}
		System.out.println("Enter target result:");
		int target = sc.nextInt();
		int[] result = twoSum(nums, target);
		if (result != null) {
			System.out.println("[" + result[0] + "," + result[1] + "]");
		} else {
			System.out.println("Something went wrong!");
		}
	}

	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; i <= nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}
}
