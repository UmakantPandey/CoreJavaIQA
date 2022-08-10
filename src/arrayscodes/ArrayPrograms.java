package arrayscodes;

public class ArrayPrograms {
	
//	public void rotateTheArray(char[] array) {
//		if (array.length == 0) {
//			System.out.println("Array is empty");
//		} else {
//			
//			if(array.length/2!=0)
//			{
//				int n,first;
//				n=array.length/2+1;
//				
//				first=array[0];
//				for(int i=0;i<array.length-1;i++)
//				{
//					
//					array[i]=array[i+1];
//					
//				}
//				array[array.length-1]=(char) first;
//				
//				
//				
//			}
//			for(char c:array)
//			{
//				System.out.print(c+" , ");
//			}
//			
//			
//			
//		}
//
//	}

	public int[] copyIntArray(int[] input) {
		return input;
	}

	public void getFrequencyOfElementInArray(char arr[]) {
		int count;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[i] != '*') {
					count++;
					arr[j] = '*';
				}
			}
			if (arr[i] != '*') {
				System.out.println(arr[i] + " | " + count);
			}

		}

	}

	

}
