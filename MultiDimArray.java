package dailytasks;

public class MultiDimArray {

	public static void main(String[] args) {

		int a[][] = { { 32, 54, 24 }, { 2, 64, 38 }, { 35, 18, 1080 } };
		System.out.println("Array : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		int maxval = a[0][0];
		int minval = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > maxval) {
					maxval = a[i][j];
				} else if (a[i][j] < minval) {
					minval = a[i][j];
				}

			}

		}
		System.out.println("Maximum Number : " + maxval);
		System.out.println("Minimum Number : " + minval);

	}
}
