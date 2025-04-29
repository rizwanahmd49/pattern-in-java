package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ClassToInheritInterface implements InheritanceTest{

	
	public static void main(String[] args) {
		ClassToInheritInterface cti=new ClassToInheritInterface();
//		cti.reversString("rizwanahmad");
//		cti.Armstrong(155);
		cti.OccrenceOfChar("rizwanahmdrizwanahamdsalmani");
		
		
			 
		 
	}

	

	@Override
	public  void Armstrong(int num) {
		int temp,rem,arm=0;
		
		for(temp=num;temp>0;temp=temp/10) {
			rem=temp%10;
			arm=arm+rem*rem*rem;
		}
		if(arm==num) {
			System.out.printf("Entered Number: %d is Armstrong",num);
		}
		else {
			System.out.printf("Entered Number: %d is NOT Armstrong",num);
		}
		System.out.println();
	}



	@Override
	public void reversString(String str) {
		int size=str.length()-1;
		System.out.printf("The reversed String is: ");
		while(size>=0) {
			char c=str.charAt(size);
			System.out.print(c);
			size--;
		}System.out.println();
		
	}



	@Override
	public void OccrenceOfChar(String str) {
		
		char []ch=str.toCharArray();
		Map<Character, Integer>charMap=new HashMap<>();
		for(char c:ch) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
				}
			else {
				charMap.put(c, 1);
			}
		}
		
		Set<Character> kyes = charMap.keySet();
		
		for(char c:kyes) {
			System.out.println("Char:  "+c+" repeated "+charMap.get(c));
		}
		
	}

}
