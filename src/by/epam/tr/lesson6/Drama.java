package by.epam.tr.lesson6;

import java.util.Date;
import java.util.Scanner;

public class Drama extends Work{

	public void bringSad(){
		System.out.println("I'm drama and I bring sadness");
	}
	
	public void convertTimeToSadness(){
		System.out.println("Please enter quantity of time you want to turn in sadness:");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double result;
		int minutes = 0;
		if (scan.hasNextInt()){
			minutes = scan.nextInt();
			result = minutes*Math.sin(minutes)*Math.PI;
			System.out.println("As a result you will have "+result+
					" kilograms of sadness");
		}
	}

	public Drama(String name, String author, Date dateOfPublishing) {
		super(name, author, dateOfPublishing);
	}

	
	
}
