package ex7;

public class Ex7 {

	public static void main(String[] args) {
		int[][] matrice = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };

		int maxSomme = Integer.MIN_VALUE;
		int ligneMax = -1;

		for (int i = 0; i < matrice.length; i++) {
			int somme = 0;
			for (int j = 0; j < matrice[i].length; j++) {
				somme += matrice[i][j];
			}
			if (somme > maxSomme) {
				maxSomme = somme;
				ligneMax = i;
			}
		}

		System.out.println(
				"La ligne avec la somme maximale est la ligne " + (ligneMax + 1) + " avec une somme de " + maxSomme);
	}

}
