package by.epam.tr.lesson6;

import java.util.Date;
import java.util.Scanner;

public class Poem extends Work{
	
	private int quantityOfRhymes;
	public void calcTimeOfWriting(){
		System.out.println("How many");
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
	
	public int getQuantityOfRhymes() {
		return quantityOfRhymes;
	}

	public Poem(String name, String author, Date dateOfPublishing, int quantityOfRhymes) {
		super(name, author, dateOfPublishing);
		this.quantityOfRhymes = quantityOfRhymes;
	}
}
