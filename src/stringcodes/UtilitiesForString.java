package stringcodes;

import java.util.Arrays;

public class UtilitiesForString {
	
	
		
	public boolean isAnagram(String input1,String input2) {
		char[] i1=input1.toCharArray();
		char[] i2=input2.toCharArray();
		
		if(i1.length!=i2.length)
		{
			return false;
		}
		else {
			char[] sortedCharArr1=UtilitiesForString.toSortCharArr(i1);
			char[] sortedCharArr2=UtilitiesForString.toSortCharArr(i2);
			
			String str1=Arrays.toString(sortedCharArr1);
			String str2=Arrays.toString(sortedCharArr2);
			
			if(!str1.equalsIgnoreCase(str2))
			{
				return false;
			}else {
				return true;
			}
			
			
		}
		
				
	}
	
	public static char[] toSortCharArr(char[] charArray)
	{
		for(int i=0;i<charArray.length;i++)
		{
			for(int j=i+1;j<charArray.length;j++)
			{
				char temp='$';
				if(charArray[i]>charArray[j])
				{
					temp=charArray[j];
					charArray[j]=charArray[i];
					charArray[i]=temp;
				}
			}
		}
		
		return charArray;
	}
	

}
