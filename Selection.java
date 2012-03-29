

public class Selection extends SortBase {

	public Selection() {
		initArray();
		printArray();
		algorithm();
		printArray();
	}

	public void algorithm() {
		sortList(0);
	}

	private void sortList(int startIndex) {
		int minIndex = findMinimum(startIndex);
		if(minIndex != startIndex) {
			//swap
			int temp = toSort[minIndex];
			toSort[minIndex] = toSort[startIndex];
			toSort[startIndex] = temp;
		}
		startIndex++;
		if(startIndex < toSort.length) {
			//recursively call sortList
			sortList(startIndex);
		}
	}

	public int findMinimum(int startIndex) {
		int min = toSort[startIndex];
		int minIndex = startIndex;

		for(int i = (startIndex + 1); i < toSort.length; i++) {
			if(min > toSort[i]) {
				min = toSort[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	public static void main(String args[]) {
		new Selection();
	}
}
