package ex3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int[] tableau = { 3, 1, 2, 4, 7, 6, 5 };

		int gauche = 0, droite = tableau.length - 1;
		while (gauche < droite) {
			while (gauche < droite && tableau[gauche] % 2 == 0) {
				gauche++;
			}
			while (gauche < droite && tableau[droite] % 2 != 0) {
				droite--;
			}
			if (gauche < droite) {
				int temp = tableau[gauche];
				tableau[gauche] = tableau[droite];
				tableau[droite] = temp;
				gauche++;
				droite--;
			}
		}

		for (int num : tableau) {
			System.out.print(num + " ");
		}
	}

}
