package algoritham;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] value = { 1, 15, -22, 35, 55, -19 };

		for (int i = value.length-1; i > 0; i--) {

			int larger = 0;
			int j;
			for (j = 0; j < i; j++) {

				if (value[j] > larger) {

					larger = j;
				}
			}

			swap(value, larger, i);
		}
		
		for(int a: value) {
			System.out.println(a);
		}
	}
	

	private static void swap(int[] value, int j, int i) {
		
		if(i==j) {
			return;
		}
		int temp = value[j];
		value[j] = value[i];
		value[i] = temp;

	}

}
