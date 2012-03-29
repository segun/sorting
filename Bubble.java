public class Bubble extends SortBase {
	public Bubble() {
		initArray();
		printArray();
		algorithm();
		printArray();
	}

	public void algorithm() {
		sortList(toSort.length);
	}
	
	public void sortList(int n) {
		System.out.println(n);
		boolean swapped = true;
		while(swapped) {
			swapped = false;
			for(int i = 1; i < n; i++) {
				if (toSort[i] < toSort[i - 1]) {
					swap(i, i - 1);
					swapped = true;
				}
			}
			printArray();
			n = n -1;
		}
	}

	public static void main(String args[]) {
		new Bubble();
	}
}
