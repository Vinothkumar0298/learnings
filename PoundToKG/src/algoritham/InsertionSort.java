package algoritham;

public class InsertionSort {

	public static void main(String[] args) {
		int[] value = { 1, 15, -22, 35, 55, -19 };
		int[] value1 = { 1, 15, 60, 35, 55, -19 };

		// int gap = value.length / 2;

		for (int i = 1; i < value.length; i++) {

			int newElement = value[i];
			int j;
			for (j = i; j > 0 && value[j - 1] > newElement; j--) {

				// while() {

				value[j] = value[j - 1];

				// }
				// System.out.println(j);

			}
			//
			value[j] = newElement;
			// value[j] = newElement;
		}

		for (int a : value) {

			System.out.println(a);
		}

	}

	private static void swap(int[] value, int larger, int j) {
		// TODO Auto-generated method stub

		int temp = value[larger];
		value[larger] = value[j];
		value[j] = temp;

	}

}
