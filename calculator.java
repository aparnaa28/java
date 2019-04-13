package lecture3;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int ans;
		char ch;
		while (true) {
			// System.out.println("Enter a character");
			ch = scn.next().charAt(0);

			if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
				// System.out.println("Enter N1");
				int n1 = scn.nextInt();
				// System.out.println("Enter N2");
				int n2 = scn.nextInt();
				if (ch == '+') {
					ans = n1 + n2;
					System.out.println(ans);
				} else if (ch == '-') {
					ans = n1 - n2;
					System.out.println(ans);
				} else if (ch == '*') {
					ans = n1 * n2;
					System.out.println(ans);
				} else if (ch == '/') {
					if (n2 == 0) {
						break;
					} else {
						ans = n1 / n2;
						System.out.println(ans);
					}
				} else if (ch == '%') {
					ans = n1 % n2;
					System.out.println(ans);
				}

			} else if (ch == 'x' || ch == 'X') {
				break;
			} else
				System.out.println("Invalid operation. Try again.");

		}

	}

}
