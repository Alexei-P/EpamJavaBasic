package by.epam.tr.lesson1;

public class Circle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double R = 5.20;
		System.out.println(calculateSquareOfCircle(R));
		System.out.println(calculatePerimetrOfCircle(R));
	}
	public static double calculateSquareOfCircle(double R){
		return Math.PI*Math.pow(R, 2);
	}
	
	public static double calculatePerimetrOfCircle(double R){
		return 2*Math.PI*R;
	}
}
