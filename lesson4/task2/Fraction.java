package by.epam.tr.lesson4.task2;

public class Fraction {
	private int numerator;
	private int denominator;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=5;
		Fraction[] arrFraction = new Fraction[k];
		
		Fraction f1 = new Fraction(5, 7);
		Fraction f2 = new Fraction(1, 4);
		Fraction f3 = new Fraction(5, 3);
		Fraction f4 = new Fraction(7, 9);
		Fraction f5 = new Fraction(9, 78);
		
		arrFraction[0] = f1;
		arrFraction[1] = f2;
		arrFraction[2] = f3;
		arrFraction[3] = f4;
		arrFraction[4] = f5;
		
		for (int i=0; i<arrFraction.length; i++){
			arrFraction[i].show();
		}

	}

	
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public void show(){
		System.out.println(numerator+"/"+denominator);
	}



	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	

}
