package arrayscodes;

public class IntArrToCharArr {

	public static void main(String[] args) {
		int[] intarr= {1,2,3,4,5};
		
		char[] chararr=new char[intarr.length];
		
		
		for(int i=0;i<intarr.length;i++)
		{
			chararr[i]=(char) intarr[i];
		}
		
		for(char c:chararr)
		{
			System.out.print(Character.forDigit(c, c)+c+ " ");
		}
		System.out.println();
		System.out.println(chararr.getClass().getName());
		System.out.println(intarr.getClass().getName());

	}

}
