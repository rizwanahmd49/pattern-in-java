package programs;

public class Reverse {
	public static void reversString(String str) {
		
		char[]chArray=str.toCharArray();
		int size=chArray.length-1;
		while(size>=0) {
			char c=chArray[size];
			System.out.print(c);
			size--;
		}
		
		}
		/**
		 * reversStringUsingCharAt
		 * @param str
		 */
		public static void reversStringUsingCharAt(String str) {
			int strsize=str.length()-1;
			for(int i=0;strsize>=i;strsize--) {
				System.out.print(str.charAt(strsize));
			}
	}
	public static void main(String[] args) {
		reversString("Hello");
	}

}
