package by.epam.tr.lesson7;

import java.util.Date;
import java.util.Scanner;

public class Novel extends Work{
	
	public void fastenTime(){
		System.out.println("Please enter quantity of time you want read novel:");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double result;
		int minutes = 0;
		if (scan.hasNextInt()){
			minutes = scan.nextInt();
			result = minutes*2;
			System.out.println("As a result you will have "+result+
					" kilograms of interest");
		}
	}
	
	public Novel(String name, String author, Date dateOfPublishing){
		super(name, author, dateOfPublishing);
	}
	
	
}
