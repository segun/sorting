import java.util.Random;
import java.util.Arrays;

public abstract class SortBase {
	protected int[] toSort;
	//protected int[] toSort = {4,3,2,1};
	protected final static int SORT_LENGTH = 10;

	protected void swap(int i, int k) {
		int temp = toSort[i];
		toSort[i] = toSort[k];
		toSort[k] = temp;
	}

	protected void initArray() {
		toSort = new int[SORT_LENGTH];

		Random r = new Random(System.currentTimeMillis());

		for(int i = 0; i < toSort.length; i++) {
			toSort[i] = Math.abs(r.nextInt() % SORT_LENGTH);
		}
	}

	protected void printArray() {
		for(int i = 0; i < toSort.length; i++) {
			System.out.print(toSort[i] + ", ");
		}
		System.out.println("");
	}

	protected void printArray2(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("");
	}

	public abstract void algorithm();
}
