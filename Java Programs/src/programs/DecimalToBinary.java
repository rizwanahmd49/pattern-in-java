package programs;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) 
    {
		int x,y, n=231;
		x=n%10;
		y=n/2;
		
		System.out.printf("X: %d \nY: %d",x,y);
		//convertToBinary();
    }
	@SuppressWarnings("resource")
	public static void convertToBinary() {
		int n, count = 0, a;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        n = s.nextInt();
        while(n > 0)
        {
            a = n % 2;
            if(a == 1)
            {
                count++;
            }
            x = x + "" + a;
            n = n / 2;
        }
        System.out.println("Binary number:"+x);
        System.out.println("No. of 1s:"+count);
	}
}

