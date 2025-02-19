package ex9;

import java.util.*;

public class Ex9 {

	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };

	private static boolean estValide(int x, int y, int[][] labyrinthe, boolean[][] visite) {
		return x >= 0 && x < labyrinthe.length && y >= 0 && y < labyrinthe[0].length && labyrinthe[x][y] == 0
				&& !visite[x][y];
	}

	public static int bfs(int[][] labyrinthe) {
		int n = labyrinthe.length;
		int m = labyrinthe[0].length;

		boolean[][] visite = new boolean[n][m];

		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] { 0, 0, 0 });

		visite[0][0] = true;

		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			int x = current[0];
			int y = current[1];
			int distance = current[2];

			if (x == n - 1 && y == m - 1) {
				return distance;
			}

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (estValide(nx, ny, labyrinthe, visite)) {
					visite[nx][ny] = true;
					queue.offer(new int[] { nx, ny, distance + 1 });
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int[][] labyrinthe = { { 0, 1, 0, 0, 0 }, { 0, 1, 0, 1, 0 }, { 0, 0, 0, 1, 0 }, { 1, 1, 0, 1, 0 },
				{ 0, 0, 0, 0, 0 } };

		int result = bfs(labyrinthe);

		if (result == -1) {
			System.out.println("Il n'y a pas de solution.");
		} else {
			System.out.println("Le nombre minimum d'étapes pour atteindre la sortie est : " + result);
		}
	}
}
