package iqa1;

public class StringVsStringBuffer {

	public static void main(String[] args) {
		String s= new String("Umakant");
		String s1=s.concat(" Pandey"); // still pointing to s object's value to old value
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println("****");
		StringBuffer sb=new StringBuffer("QA");
		sb.append("-Quality Assurance");
		System.out.println(sb);

	}

}
