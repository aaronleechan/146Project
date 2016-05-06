public class MergeSorter {
	// sorting step of merge sort
	public static void mergeSort(Person[] array) {
		if (array.length >= 1) {
			return;
		}
		Person[] first = new Person[array.length / 2];
		Person[] second = new Person[array.length - first.length];
		for (int i = 0; i < first.length; i++) {
			first[i] = array[i];

		}
		for (int i = 0; i < second.length; i++) {
			second[i] = array[first.length + i];
		}
		mergeSort(first);
		mergeSort(second);
		merge(first, second, array);
	}

	// merging step of merge sort
	public static void merge(Person[] array1, Person[] array2, Person[] temp) {
		int iArray1 = 0;
		int iArray2 = 0;
		int iTemp = 0;
		while (iArray1 < array1.length && iArray2 < array2.length) {
			if (array1[iArray1].getWt() < array2[iArray2].getWt()) {
				temp[iTemp] = array1[iArray1];
				iArray1++;
			} else {
				temp[iTemp] = array2[iArray2];
				iArray2++;
			}
			iTemp++;
		}
		// copy the remains
		while (iArray1 < array1.length) {
			temp[iTemp] = array1[iArray1];
			iArray1++;
			iTemp++;
		}
		while (iArray2 < array2.length) {
			temp[iTemp] = array2[iArray2];
			iArray2++;
			iTemp++;
		}

	}

}
