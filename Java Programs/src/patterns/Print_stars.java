package patterns;

public class Print_stars implements StarPatterns {
	public static void main(String args[]) {
		Print_stars stars = new Print_stars();
		stars.checkPalindrome("madam");
	}

	@Override
	public void LeftTriangleStarPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = rows - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	@Override
	public void pyramidPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = rows - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i + " ");
			}
			System.out.println();

		}
	}

	@Override
	public void RightTriangleStarPattern(int rows) {
		for (int i = 1; i <= rows; i++) {

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	@Override
	public void checkPalindrome(String str) {
		char[] charArray = str.toCharArray();
		int size = charArray.length - 1;
		StringBuilder sb = new StringBuilder();
		for (int i = size; i >= 0; i--) {
			sb.append(charArray[i]);
		}
		String string = sb.toString();
		System.out.println("********************************\nGiven String: " + str + "\nReverse String: " + string+"\n********************************\n");
		if (str.equals(string)) {
			System.out.println("String is Palindrome");
		}else
			System.out.println("String is not Palindrome");

	}

}
