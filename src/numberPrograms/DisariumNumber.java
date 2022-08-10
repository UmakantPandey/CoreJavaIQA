package numberPrograms;

import com.sun.org.apache.bcel.internal.classfile.ConstantCP;

public class DisariumNumber {

	public static void main(String[] args) {

		int actualnumber=175, copynumber,rem,numlength,sum;
		copynumber=actualnumber;
		sum=0;
		numlength=DisariumNumber.calculateLength(copynumber);
		
		while(copynumber>0)
		{
			rem=copynumber%10;
			sum=sum+ numberPower(rem,numlength);
			numlength--;
			copynumber=copynumber/10;
			
		}
		
		if(actualnumber==sum)
		{System.out.println(actualnumber+" : Number is Disarium number");

	}else {
		System.out.println(actualnumber+" : Number is not Disarium number");
		}
	}
	
	public static int calculateLength(int n){  
	    int length = 0;  
	    while(n != 0){  
	        length = length + 1;  
	        n = n/10;  
	    }  
	    return length;  
	}  
	public static int numberPower(int num, int exponent)
	{
		int powersum=1;
		for(int i=1;i<=exponent;i++)
		{
			powersum*=num;
		}
		
		return powersum;
	}

}
