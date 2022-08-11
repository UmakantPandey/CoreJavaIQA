package stringcodes;

public class PunctuationChar {
	
	public int toGetPunctuationNumber(String input)
	{
		int count=0;
		
//		char[] chararr=input.toCharArray();
		
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i) == '!' || input.charAt(i) == ',' || input.charAt(i) == ';' || input.charAt(i) == '.' ||        input.charAt(i) == '?' || input.charAt(i) == '-' ||  
					input.charAt(i) == '\'' || input.charAt(i) == '\"' || input.charAt(i) == ':')
			{
				count++;
			}
		}
		
		
		return count;
	}

}
