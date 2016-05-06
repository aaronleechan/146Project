
public class HeapSorter {
	// returns the left child
	private static int leftChild(int i) {
		return 2 * i + 1;
	}
	// percolates down
		private static void percDown(Person[] array, int i, int n) {
			int child;
			Person temp;
			for (temp = array[i]; leftChild(i) < n; i = child) {
				child = leftChild(i);
				if (child != n - 1
						&& array[child].getHrt() < array[child + 1].getHrt())
					child++;
				if (temp.getHrt() < array[child].getHrt())
					array[i] = array[child];
				else {
					break;
				}
				array[i] = temp;
			}
		}

		// heapsort
		public static void heapsort(Person[] array) {
			for (int i = array.length / 2; i >= 0; i--) {
				percDown(array, i, array.length);
			}
			for (int i = array.length - 1; i > 0; i--) {
				swapReference(array, 0, i);
				percDown(array, 0, i);
			}
		}

		// swap two nodes
		public static void swapReference(Person[] array, int i, int n) {
			Person temp = array[i];
			array[i] = array[n];
			array[n] = temp;
		}

}
