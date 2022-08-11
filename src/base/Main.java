package base;

import stringcodes.UtilitiesForString;

public class Main {

	public static void main(String[] args) {

		UtilitiesForString utils=new UtilitiesForString();
		System.out.println(utils.isAnagram("hello", "hello"));
		System.out.println(utils.isAnagram("hello", "eolhl"));
		System.out.println(utils.isAnagram("hello", "helloo"));
		System.out.println(utils.isAnagram("hello", "helao"));
		
	}
}
