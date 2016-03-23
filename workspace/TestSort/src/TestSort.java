import java.util.Arrays;

public class TestSort {

	public static void main(String[] args) {
		int[] array = {34, 2, 45, -6, 42, 88, 442, -18, -20, 0};
		
		System.out.println("Before: " + Arrays.toString(array));
		
		insertionSort(array);
		
		System.out.println("After: " + Arrays.toString(array));

	}
	
	public static void swap(int[] array, int p1, int p2){
		int temp = array[p1];
		array[p1] = array[p2];
		array[p2] = temp;
	}
	
	public static void bubbleSort(int[] array){
		boolean sorting = true;
		while(sorting){
			sorting = false;
			for(int i = 0; i < array.length - 1; i++){
				if(array[i] > array[i+1]){
					sorting = true;
					swap(array, i, i+1);
				}
			}
		}
	}
	
	public static void insertionSort(int[] array){
		for(int i = 1; i < array.length; i++){
			int j = i;
			while(j > 0 && array[j-1] > array[j]){
				swap(array, j, j-1);
				j--;
			}
		}
	}

}
