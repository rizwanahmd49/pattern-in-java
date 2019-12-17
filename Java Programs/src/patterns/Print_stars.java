package patterns;

public class Print_stars implements StarPatterns {
	public static void main(String args[]) {

		Print_stars stars = new Print_stars();
		stars.LeftTriangleStarPattern(7);
	}

	@Override
	public void LeftTriangleStarPattern(int rows) {
		for(int i=1;i<=rows;i++){
			for(int j=rows-1;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(i+" " );
			}
			System.out.println();
			
		}
		
	}

}
