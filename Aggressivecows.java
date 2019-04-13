package assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressivecows {
	
	public static void main(String[] args) {
		System.out.println("Enter the no of stalls");
		int n = scn.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the no of cows");
		int c = scn.nextInt();
		Takeinput(a,n);
		search(a,c);

	}
	
	static Scanner scn = new Scanner(System.in);

	public static void Takeinput(int[] arr, int size) {
	
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
	}

	public static void search(int arr[], int c) {
		Arrays.sort(arr);
		
		int low = arr[0];
		int high = arr[arr.length - 1] - arr[0];
		int mid = 0;
		int max = 1;
		while (low <=high) {
			mid = (low + high) / 2;
			if (possible(arr, mid, c)) {
				if (max < mid) {
					max = mid;
				}
				low = mid+1;
			}

			else {
				high = mid - 1;
			}
		}
		System.out.println(max);
	}

	public static boolean possible(int arr[], int mid, int c) {
		int cows = 1;
		int val = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if ((arr[i] - val) >= mid) {
				cows++;
				val = arr[i];

			}

			if (c == cows)
				return true;
		}

		return false;

	}
}