package numberPrograms;





public class PronicNumber {

	public static void main(String[] args) {
		
//		Scanner sc= new Scanner("System.in");
//		System.out.println("A number is said to be pronic number if it is a product of two consecutive numbers.");
//		System.out.println("Enter a number to check whether is it pronic or not?");
//		int userinput=sc.nextInt();
		int userinput=72;
		
		for(int i=2;i<(userinput/2)+1;i++)
		{
			if((userinput%i)==0 && (userinput%(i+1))==0)
			{
				System.out.println(userinput+" : Numer is Pronic");
			}
		}
		

	}

}
