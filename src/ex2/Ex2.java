package ex2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		int[] t = { 1, 4, 6, 2, 3, 5, 7 };

		Scanner sc = new Scanner(System.in);
		System.out.println("entrer le nombre que vous voulez:");
		int a = sc.nextInt();

		for (int i = 0; i < t.length; i++) {
			for (int j = i + 1; j < t.length; j++) {
				if (t[i] + t[j] == a) {
					System.out.println("(" + t[i] + ", " + t[j] + ")");
				}
			}
		}
	}

}
