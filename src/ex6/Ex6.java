package ex6;

public class Ex6 {

	public static void main(String[] args) {
		int[][] matrice = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };

		for (int i = 0; i < matrice.length; i++) {
			int somme = 0;
			for (int j = 0; j < matrice[i].length; j++) {
				somme += matrice[i][j];
			}
			System.out.println("Somme de la ligne " + (i + 1) + " : " + somme);
		}
	}

}
