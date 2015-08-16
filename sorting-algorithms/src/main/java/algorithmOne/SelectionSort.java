package algorithmOne;


public class SelectionSort {

	public static void main(String[] args) {
		
		int[] intArray = {2, 6, 3, 9, 2, 4, 5};
		printArray(intArray);
		
		System.out.println("sorting....");
		
		printArray(selectionSort(intArray));
		
	}

	
	public static int[] selectionSort(int... intArray) {
		
		int tmpVar = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			
			
			for (int j = i + 1; j < intArray.length; j++) {
				
				//compare if left element is higher than right, if yes then swap it.
				if( intArray[i] > intArray[j] ){
					tmpVar = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = tmpVar;
				}
			}
		}
		
		return intArray;
	}
	
	public static void printArray(int... array){
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + ", ");
		}
		System.out.println();
	}
}


