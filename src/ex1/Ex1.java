package ex1;

public class Ex1 {

	public static int unique(int[] arr) {
		int result = 0;

		for (int num : arr) {
			result ^= num;
		}

		return result;
	}

	public static void main(String[] args) {

		int[] t = { 1, 2, 3, 2, 1 };

		int uniqueElement = unique(t);
		System.out.println("L'élément unique est: " + uniqueElement);

	}

}
