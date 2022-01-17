package com.QA_Practic;

public class Convert_variable {

	public void getConvertsalary() {
		// how to convert String to int
		int a = Integer.parseInt("10");
		System.out.println(a);

		// how to convert String to Double
		double b = Double.parseDouble("10000.25");
		System.out.println(b);

		// how to convert int to String
		String c = String.valueOf("10");
		System.out.println(c);

		// how to convert int to String
		String d = String.valueOf("10.25");
		System.out.println(d);

		// how to add two String together by which java String method?

		String fristName = "Meheraf";
		String lastName = "Hasan";
		String Together = fristName.concat(lastName);
		System.out.println(Together);

		// How to break a big String in small pierces?
		String Country = "United States of America";
		String[] parts = Country.split(Country);
		System.out.println(parts);

		// Find out any letter like all 'e' from the "United States of America"

		String find = new String("United States of America");
		int count = 0;
		for (int i = 0; i < find.length(); i++) {
			if (find.charAt(i) == 'e') {
				System.out.println("");
				System.out.println(find.charAt(i) + "::" + count);
				System.out.println("Index of e::" + i);
				count++;
			}
		}
		// how to reverse The People republic of Bangladesh

		String x = "The People republic of Bangladesh";
		System.out.println(x.length());

		for (int i = x.length() - 1; i >= 0; i--) {
			System.out.print(x.charAt(i));
		}

		// Find out which numbers contains 3 from 10 to 30

		for (int i = 10; i <= 30; i++) {
			if (String.valueOf(i).contains("3")) {
				System.out.println(i);
			}
		}	
		
		
	}
}