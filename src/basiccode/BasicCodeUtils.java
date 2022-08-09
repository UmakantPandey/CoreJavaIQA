package basiccode;

public class BasicCodeUtils {
	
	public int findAreaOfRectangle(int lenght,int width)
	{
		return lenght*width;
	}
	
	public float findAreaOfRectangle(float lenght,float width)
	{
		return lenght*width;
	}
	
	public void calculateYearsMonthsDays(int numberOfDays)
	{
		StringBuffer sb=new StringBuffer();
		System.out.println("Values of StringBuffer object : "+sb);
		
		int year=numberOfDays/365;
		
		sb.append(String.valueOf(year));
		sb.append(" years, ");
		numberOfDays=numberOfDays%365;
		
		int months=numberOfDays/30;
		sb.append(String.valueOf(months));
		sb.append(" months, ");
		
		int days=numberOfDays%30;
		sb.append(String.valueOf(days));
		sb.append(" days.");
		
		System.out.println(sb);
		
	}
	
	
}
