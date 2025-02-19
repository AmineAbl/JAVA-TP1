package ex10;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Ex10 {
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };

	private static boolean estDansLesLimites(int x, int y, int n, int m) {
		return x >= 0 && x < n && y >= 0 && y < m;
	}

	public static int[][] genererLabyrinthe(int n, int m) {
		int[][] labyrinthe = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				labyrinthe[i][j] = 0;
			}
		}

		List<int[]> chemins = new ArrayList<>();

		labyrinthe[1][1] = 1;
		chemins.add(new int[] { 1, 1 });

		while (!chemins.isEmpty()) {
			Random rand = new Random();
			int index = rand.nextInt(chemins.size());
			int[] chemin = chemins.get(index);
			chemins.remove(index);

			for (int i = 0; i < 4; i++) {
				int nx = chemin[0] + dx[i] * 2;
				int ny = chemin[1] + dy[i] * 2;

				if (estDansLesLimites(nx, ny, n, m) && labyrinthe[nx][ny] == 0) {
					labyrinthe[nx][ny] = 1;

					int mx = (chemin[0] + nx) / 2;
					int my = (chemin[1] + ny) / 2;
					labyrinthe[mx][my] = 1;

					chemins.add(new int[] { nx, ny });
				}
			}
		}

		return labyrinthe;
	}

	public static void afficherLabyrinthe(int[][] labyrinthe) {
		for (int i = 0; i < labyrinthe.length; i++) {
			for (int j = 0; j < labyrinthe[i].length; j++) {
				if (labyrinthe[i][j] == 0) {
					System.out.print("■");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 21;
		int m = 21;

		int[][] labyrinthe = genererLabyrinthe(n, m);
		afficherLabyrinthe(labyrinthe);
	}
}
