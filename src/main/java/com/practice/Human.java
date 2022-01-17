package com.practice;

public class Human {
	public void getText() {
		System.out.println("wellcome");
			
	}
     public static void getstaticvoid() {
    	 
    	 System.out.println("static Welcome");
    	 Human.getstaticvoid();
    	 
    	 Human.getstaticvoid();
     }
     public String getReturnMethod() {
    	 
    	 System.out.println("This is return Method");
    	 return "Batch21";
     }
public static void main(String[] args) {
	Human obj = new Human();
	obj.getText();
	obj.getReturnMethod();
	
}
}
