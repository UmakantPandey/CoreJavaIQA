package numberPrograms;

import java.util.Scanner;

public class SumOfNumberWithoutModuleOperator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number to get its sum of digit : ");
		String numberinstring=scanner.nextLine();
		char[] charArr=numberinstring.toCharArray();
		
		int sum=0;
		for(int i =0 ;i<charArr.length;i++)
		{
			sum=sum+((int)charArr[i]);
			sum=sum-48;
		}
		
		System.out.println("Sum of "+numberinstring+ " is :"+ sum);
	}

}
