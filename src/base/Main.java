package base;

import arrayscodes.ArrayPrograms;

public class Main {

	public static void main(String[] args) {
	
		
		int[] a1= {1,2,3,4,5,1,3,4,3,1,2};
		char []a2= {'1','2','2','3','3','3','4','4','4','4','5'};
		ArrayPrograms ap=new ArrayPrograms();
		int []copiedArray=ap.copyIntArray(a1);
		
		for(int i:copiedArray)
		{
			System.out.println(i+" ");
		}
		
		System.out.println("****************");
		
		ap.getFrequencyOfElementInArray(a2);
		
		
		System.out.println("****************");
		char[] a3= {'1','2','3','4','5'};
//		ap.rotateTheArray(a3);
		
		System.out.println("*******************");
		
	}

}
