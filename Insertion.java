
public class Insertion extends SortBase {

	public Insertion() {
		initArray();
		printArray();
		algorithm();
		printArray();
	}

	public void algorithm() {
		for(int i = 1; i < toSort.length; i++) {
			int key = toSort[i];
			int k = i - 1;
			while(k >= 0 && toSort[k] > key) {
				toSort[k + 1] = toSort[k];
				System.out.print(toSort[k] + ":" + toSort[i] + ",");
				k--;
			}
			toSort[k + 1] = key;
			System.out.println("");
		}
	}

	public static void main(String args[]) {
		new Insertion();
	}
}
