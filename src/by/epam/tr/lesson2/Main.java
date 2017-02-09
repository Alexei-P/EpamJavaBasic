package by.epam.tr.lesson2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calcTask6();
		//calcTask7(5.0, 5.2, 8);
		//calcTask8(5.0, 5.2, 8);
	}
	
	public static void calcTask6(){
		double a = 0,b = 0,c = 0;
		double result = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a: ");
		if (sc.hasNextDouble()){
			a=sc.nextDouble();
		}
		System.out.println("Please enter b: ");
		if (sc.hasNextDouble()){
			b=sc.nextDouble();
		}
		System.out.println("Please enter c: ");
		if (sc.hasNextDouble()){
			c=sc.nextDouble();
		}
		result = a * a - (b - c) * (b - c) + Math.log(b * b + 1);
		System.out.println("Result = "+result);
	}
	
	public static void calcTask7(double a, double b, double c){
		if (a>b){
			System.out.println("Sum of b and c = "+(b+c));
		}
		else if (a==b){
			System.out.println("Конец");
		}
		else if (a<b){
			System.out.println((a+b+c)+" Новый год!");
		}
	}
	
	public static void calcTask8(double a, double b, double c){
		if (a==b){
			System.out.println("скоро Новый Год!");
		}
		else{
			System.out.println("a+b+c = "+(a+b+c)+"\n"
					+ "a^2 + b^2 = " + (a*a+b*b)+"\n"
					+ "моя любимая футбольная команда"
					);
		}
	}
	

}
