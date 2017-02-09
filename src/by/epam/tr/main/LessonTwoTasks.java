package by.epam.tr.main;

import java.util.Scanner;

public class LessonTwoTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showPersonalData();
		showTextTask3();
		
		calcRightTriangleParams(3,4);
		sumOfFour(2,7,4,3);
		calcTask6();
		
	}
	
	public static void showPersonalData(){
		System.out.println("Parkhomchyk A.A. \n"
				+ "Minsk, Mirnaya Street\n"
				+ "+375 29 135-32-51\n");
	}
	
	public static void showTextTask3(){
		System.out.println("Пройдет много лет, и полковник Аурелиано Буэндиа, стоя у стены в ожидании расстрела,\n"
				+ "вспомнит тот далекий вечер, когда отец взял его с собой посмотреть на лед. Макондо было\n"
				+ "тогда небольшим селением с двумя десятками хижин, выстроенных из глины и бамбука на\n"
				+ "берегу реки, которая мчала свои прозрачные воды …\n"
				);
	}
	
	public static void calcRightTriangleParams(double a, double b){
		double temp = a*a + b*b;
		double hypotenuse = Math.sqrt(temp);
		double square = a*b/2;
		
		System.out.println("Hypotenuse = " + hypotenuse);
		System.out.println("Square = " + square);
	}
	
	public static void sumOfFour(double a, double b, double c, double d){
		System.out.println("Sum of "+a+" "+b+" "+c+" "+d+" = "+(a+b+c+d));
	}
	
	public static void calcTask6(){
		double A = 0, B = 0, C = 0;
		double result = 0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a");
		if (scanner.hasNextDouble()){
			scanner.nextDouble();
		}
		System.out.println("Please enter b");
		if (scanner.hasNextDouble()){
			scanner.nextDouble();
		}
		System.out.println("Please enter c");
		if (scanner.hasNextDouble()){
			scanner.nextDouble();
		}
		result = A*A-(B-C)*(B-C)+Math.log(B*B+1);
		System.out.println(result);
	}
}
