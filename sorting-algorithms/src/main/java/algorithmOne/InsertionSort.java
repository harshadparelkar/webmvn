package algorithmOne;

/**
 * This sorting method assumes that all the elements on left of position [i] are sorted,
 * hence whenever any element found which is smaller than [i] to the right only then the
 * swapping of element starts and that is only for the those elements which are on left
 * of [i] to bring that element to its proper position.
 * 
 * @author harshad
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		
		int[] array = {2,9,4,2,8,1,0,6,7,10,3};
		printArray(array);
		printArray(insertionSort(array));

	}

	
	public static int[] insertionSort(int... array){
		
		int tmp = 0;
		
		for (int i = 1; i < array.length; i++) {

				for (int j = i; j > 0 ; j--) {
					if( array[j] < array[j-1]) { 
					tmp = array[j-1];
					array[j-1] = array[j];
					array[j] = tmp;
				}
			}
		}
		
		return array;
	}
	
	
	public static void printArray(int... array){
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i]+", ");
		}
		System.out.println();
	}
}
