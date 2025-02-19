package ex5;

public class Ex5 {

	public static boolean estPermutation(int[][] matrice) {
		int n = matrice.length;
		boolean[] present = new boolean[n * n + 1];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int valeur = matrice[i][j];
				if (valeur < 1 || valeur > n * n || present[valeur]) {
					return false;
				}
				present[valeur] = true;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] matrice = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(estPermutation(matrice) ? "La matrice est une permutation valide"
				: "La matrice n'est pas une permutation valide");
	}

}
