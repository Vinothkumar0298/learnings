package algoritham;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] value = { 1, 15, -22, 35, 55, -19 };

		for (int i = value.length - 1; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				if (value[j] > value[i]) {

					swap(value, j, i);

				}
			}

		}

		for (int a : value) {
			System.out.println(a);
		}
	}

	private static void swap(int[] value, int i, int j) {
		// TODO Auto-generated method stub

		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;

	}

}
