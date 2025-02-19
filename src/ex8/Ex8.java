package ex8;

public class Ex8 {

	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };

	private static boolean estValide(int x, int y, int[][] labyrinthe, boolean[][] visite) {
		return x >= 0 && x < labyrinthe.length && y >= 0 && y < labyrinthe[0].length && labyrinthe[x][y] == 0
				&& !visite[x][y];
	}

	private static boolean dfs(int x, int y, int[][] labyrinthe, boolean[][] visite) {

		if (x == labyrinthe.length - 1 && y == labyrinthe[0].length - 1) {
			System.out.println("(" + x + ", " + y + ")");
			return true;
		}

		visite[x][y] = true;
		System.out.println("(" + x + ", " + y + ")");

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (estValide(nx, ny, labyrinthe, visite)) {
				if (dfs(nx, ny, labyrinthe, visite)) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {

		int[][] labyrinthe = { { 0, 1, 0, 0, 0 }, { 0, 1, 0, 1, 0 }, { 0, 0, 0, 1, 0 }, { 1, 1, 0, 1, 0 },
				{ 0, 0, 0, 0, 0 } };

		boolean[][] visite = new boolean[labyrinthe.length][labyrinthe[0].length];

		if (!dfs(0, 0, labyrinthe, visite)) {
			System.out.println("Il n'y a pas de solution.");
		}
	}
}
