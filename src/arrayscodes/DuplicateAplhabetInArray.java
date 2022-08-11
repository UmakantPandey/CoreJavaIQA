package arrayscodes;

public class DuplicateAplhabetInArray {

	public void findDuplicateAlphabetInArray(char[] inputArray)
	{
		
		for(int i=0;i<inputArray.length;i++)
		{
			int count=1;
			for(int j=i+1;j<inputArray.length;j++) {
				if(inputArray[i]==inputArray[j] && inputArray[j]!='*')
				{
					count++;
					inputArray[j]='*';
				}
			}
			if(count>1 && inputArray[i]!='*')
			{
				System.out.println("'"+inputArray[i] +"' commes : "+count);
			}
			
		}
		
		
		
	}
	
	
}
