package ex4;

public class Ex4 {

	public static void main(String[] args) {
		int[] tableau = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int maxSomme = Integer.MIN_VALUE;
		int sommeActuelle = 0;
		int debut = 0, fin = 0, tempDebut = 0;

		for (int i = 0; i < tableau.length; i++) {
			sommeActuelle += tableau[i];

			if (sommeActuelle > maxSomme) {
				maxSomme = sommeActuelle;
				debut = tempDebut;
				fin = i;
			}

			if (sommeActuelle < 0) {
				sommeActuelle = 0;
				tempDebut = i + 1;
			}
		}

		System.out.println("Somme maximale: " + maxSomme);
		System.out.println("Indices: de " + debut + " à " + fin);
	}

}
