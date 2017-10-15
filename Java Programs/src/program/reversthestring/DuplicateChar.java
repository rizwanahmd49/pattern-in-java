package program.reversthestring;

public class DuplicateChar {

	public static void findDuplicateChar(String str) {
		int size = str.length();
		System.out.printf("The Entered Word is : "+str+"\n");
		for (int i = 0; i < size; i++) {
			int counter = 0;
			for (int j = 0; j < size; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					counter++;
				}
				if (str.charAt(i) == str.charAt(j) && j < i) {
					break;
				}

			}
			if (counter > 1) {
				System.out.println(str.charAt(i) + " repeated: " + counter + " times");
			}
		}
	}

	public static void main(String[] args) {
		findDuplicateChar("rizwanahmadsalmani");
	}

}
