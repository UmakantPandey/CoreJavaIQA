package arrayscodes;

public class LargestIntegerInIntArray {
	
	public int findLargestNumberInArray(int[] intArray)
	{
		int max=0;
		for(int i=0;i<intArray.length;i++)
		{
//			if(max==intArray[i] && max <intArray[i])
			if(max<intArray[i])
			{
				max=intArray[i];
			}
		}
		
		
		
		
		
		
		return max;
	}

}
