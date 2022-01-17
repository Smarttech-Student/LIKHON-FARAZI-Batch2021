package com.QA_Practic;

public class Java_EnumProject {
//CASE Statement
		 enum Day{
			SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
		}
		
		public static void printTodaysThought(Day theDay) {
			switch (theDay) {
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY:
			case THURSDAY:
				System.out.println("Working day for the man");
				break;
			case FRIDAY:
				System.out.println("Happy Day");
				break;
			case SATURDAY:
			case SUNDAY:
				System.out.println("Ahh, the weekend.....");
				break;
				default:
					System.out.println("Day not found");
					;
			}
		}
		//public static void main(String[] args) {
			//Calendar calendar = Calendar.getInstance();
		}
