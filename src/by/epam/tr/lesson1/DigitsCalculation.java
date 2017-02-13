package by.epam.tr.lesson1;

public class DigitsCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate(1234);
		calculate(4321);
		calculate(1000);
	}
	public static void calculate(int numb){
		int result=1;
		int temp = numb;
		int numberLength = String.valueOf(numb).length();
		if (numberLength!=4){
			System.out.println("Number doesn't contain 4 digits");
			return;
		}
		for (int i=0; i<4; i++){
			result = result * (numb%10);
			numb /= 10;
		}
		System.out.println("Multiplication result of "+temp+" = "+result);
	}
}
