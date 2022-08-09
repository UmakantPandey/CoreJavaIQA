package codingInterviewQuestions;

public class FindDuplicateAlphabetInString {

	public void findDuplicateAlphabetInString(String input) {
		char[] charArr = input.toCharArray();
		int count;
		for (int i = 0; i < charArr.length; i++) {
			count = 1;
			for (int j = i + 1; j < charArr.length; j++) {
				if (charArr[i] == charArr[j] && charArr[i] != ' ') {
					count++;
					charArr[j] = '0';

				}
			}
			// if want alphabet which come more than 1 time.
//			if (count > 1 && charArr[i] != '0') {
//				System.out.println(charArr[i] + " : " + count);
//			}
			
			// if want alphabet which come equal to 1 or more than 1 time.
						if ( charArr[i] != '0') {
							System.out.println(charArr[i] + " : " + count);
						}

		}

	}

}
