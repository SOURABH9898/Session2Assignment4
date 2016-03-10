package com.acadglid.java.core.session2.assignment4;

import java.util.Scanner;

public class NumberOfDaysMonth {
	private static Scanner s;
	static String [] monthArray={"JAN", "FEB", "MAR","APR","MAY","JUN", "JUL", "AUG","SEP","OCT","NOV","DEC"};
	static int findNumDays(String monthName){
		int days=0;
		switch(monthName.toUpperCase()){
		case "JAN":
			days=31;
			break;
		case "FEB":
			days=28;
		case "MAR":
			days=31;
			break;
		case "APR":
			days=30;
			break;
		case "MAY":
			days=31;
			break;
		case "JUN":
			days=30;
			break;
		case "JUL":
			days=31;
			break;
		case "AUG":
			days=31;
			break;
		case "SEP":
			days=30;
			break;
		case "OCT":
			days=31;
			break;
		case "NOV":
			days=30;
			break;
		case "DEC":
			days=31;
			break;
		default:
			break;
		
		
		
		}
			
		
		return days;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s=new Scanner(System.in);
		System.out.println("Enter the month");
		StringBuilder monthName=new StringBuilder();
		monthName.append(s.next());
		boolean check=false;
		for(int i=0; i<monthArray.length; i++){
			if((monthName.substring(0, monthArray[i].length()).toUpperCase().equals(monthArray[i]))){
				check=true;
				break;				
			}
			
		}
		if(!check){
			System.out.println("Invalid month name");
		}
		System.out.println(monthName + " has " + findNumDays((monthName.substring(0, monthArray[1].length()).toUpperCase()))+ " days");
		
	}

}
