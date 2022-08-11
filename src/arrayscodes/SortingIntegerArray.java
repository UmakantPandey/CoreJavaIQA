package arrayscodes;

public class SortingIntegerArray {
	
	
	public int[] sortingInAscendingOrder(int[] intarray)
	{
		
		for(int i=0;i<intarray.length-1;i++)
		{
			for(int j=i+1;j<intarray.length;j++)
			{
				if(intarray[i]>intarray[j])
				{
					intarray[i]=intarray[i]+intarray[j];
					intarray[j]=intarray[i]-intarray[j];
					intarray[i]=intarray[i]-intarray[j];
				}
			}
		}
		return intarray;
	}
	
	public int[] sortingInDecendingOrder(int[] intarray)
	{
		
		for(int i=0;i<intarray.length-1;i++)
		{
			for(int j=i+1;j<intarray.length;j++)
			{
				if(intarray[i]<intarray[j])
				{
					intarray[i]=intarray[i]+intarray[j];
					intarray[j]=intarray[i]-intarray[j];
					intarray[i]=intarray[i]-intarray[j];
				}
			}
		}
		return intarray;
	}
	

}
