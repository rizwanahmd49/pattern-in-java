package programs;

public class Pattern {

	/**
	 * 
	 * @param args
	 */
	
	public static void printPattern() {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==1||i==7||j==1||j==7||i==4&&j==4) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	
	InheritanceTest Itest=new ClassToInheritInterface();
	Itest.Armstrong(153);
	Itest.reversString("rizwanahmad");
	
	

	}

}
