package com.generic;

public class CreateLooping {
	
	
	public void getDetails() {
		String C = "How to Learn Basic Java";
		System.out.println(C.length());
		for (int i = C.length()-1;i >= 0;i--) {
			System.out.print(C.charAt(i));
			
		}
		
		
	}
	public void getloop() {
		String B = "How to Learn Basic Java";
		
		System.out.println(B.length());
		for (int i = 0; i <B.length();i++ ) {
			System.out.print(B.charAt(i));
		}
		
		
	}
}
