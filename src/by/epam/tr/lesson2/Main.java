package by.epam.tr.lesson2;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calcTask6();
		//calcTask7(5.0, 5.2, 8);
		//calcTask8(5.0, 5.2, 8);
		//calcTask9();
		//calcTask10(10);
		//calcTask11();
		//calcTask12();
		//calcTask14(-4,3,5);
		//calcTask15(2, 4, 0.1);
		//calcTask16(6);
		//calcTask17(-3);
	}
	
	public static void task1HelloWorld(){
		System.out.println("Hello, world!");
	}
	
	public static void task2ShowPersonalData(){
		System.out.println("Parkhomchyk A.A. \n"
				+ "Minsk, Mirnaya Street\n"
				+ "+375 29 135-32-51\n");
	}
	
	public static void task3showText(){
		System.out.println("Ïðîéäåò ìíîãî ëåò, è ïîëêîâíèê Àóðåëèàíî Áóýíäèà, ñòîÿ ó ñòåíû â îæèäàíèè ðàññòðåëà,\n"
				+ "âñïîìíèò òîò äàëåêèé âå÷åð, êîãäà îòåö âçÿë åãî ñ ñîáîé ïîñìîòðåòü íà ëåä. Ìàêîíäî áûëî\n"
				+ "òîãäà íåáîëüøèì ñåëåíèåì ñ äâóìÿ äåñÿòêàìè õèæèí, âûñòðîåííûõ èç ãëèíû è áàìáóêà íà\n"
				+ "áåðåãó ðåêè, êîòîðàÿ ì÷àëà ñâîè ïðîçðà÷íûå âîäû …\n"
				);
	}
	
	public static void task4CalcRightTriangleParams(double a, double b){
		double temp = a*a + b*b;
		double hypotenuse = Math.sqrt(temp);
		double square = a*b/2;
		
		System.out.println("Hypotenuse = " + hypotenuse);
		System.out.println("Square = " + square);
	}
	
	public static void task5SumOfFour(double a, double b, double c, double d){
		System.out.println("Sum of "+a+" "+b+" "+c+" "+d+" = "+(a+b+c+d));
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
	
	public static void calcTask9(){ // Correctly?
		int intQuant=0;
		int quantityOfDivBy3 = 0;
		System.out.println("Enter quantity of integers: ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()){
			intQuant = sc.nextInt();
		}
		
		System.out.println("Quantity of odd numbers = "+intQuant/2);
		
		for (int i=1; i<=intQuant; i++){
			if (i%3==0){
				quantityOfDivBy3++;
			}
		}
		System.out.println("Quantity of divided by 3 = "+quantityOfDivBy3);
		
		if (intQuant>=3){
			System.out.println("abs<3 = 1, 2, 3");
		}
		else if(intQuant==2){
			System.out.println("abs<3 = 1, 2");
		}
		else if(intQuant==1){
			System.out.println("abs<3 = 1");
		}
		else{
			System.out.println("Quantity couldn't be less or equal to 0");
		}
					
	}
	
	public static void calcTask10(int N){
		Random rand = new Random(50);
		double dArr[] = new double[N];
		long iArr[] = new long[N];
		int quantityOfOdds=0;
		int quantityOfMore15=0;
		
		
		for (int i=0; i<N; i++){
			dArr[i]=rand.nextDouble()*20;
		}
		
		for(int i=0; i<N; i++){
			iArr[i]=Math.round(dArr[i]);
		}
		
		for(long x: iArr){
			System.out.print(x+" ");
		}
		
		for(long x : iArr){
			if (x%2==0 && x!=0){
				quantityOfOdds++;
			}
			if(x>15){
				quantityOfMore15++;
			}
		}
		System.out.println("\nQuantity of odds = "+quantityOfOdds+"\n"
				+ "Quantity of more than 15 = "+quantityOfMore15);
		
	}
	
	public static void calcTask11(){
		Random rand = new Random(50);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int N=0;
		int nOf15=0;
		int nOf2=0;
		int sumOfMod5=0;
		System.out.print("Enter quantity: ");
		if (scan.hasNextInt()){
			N=scan.nextInt();
		}
		
		int iArr[] = new int[N];
		for (int i=0; i<N; i++){
			iArr[i]=rand.nextInt()%100;
		}
		
		for(long x: iArr){
			System.out.print(x+" ");
		}
		
		for (int x : iArr){
			if(x>15) {
				nOf15++;
				}
			else if(x<2){
				nOf2++;
			}
			
			if (x%5==4 || x%5==-4){
				System.out.print("%5 = 4 "+x+" ");
				sumOfMod5+=x;
			}
			
		}
		
		System.out.print("Number of more than 15 = "+nOf15+"\n"
				+ "Number of less than 2 = "+nOf2+"\n"
						+ "Sum of (x%5 = 4 or -4) = "+sumOfMod5+"\n");
		
	}
	
	public static void calcTask12(){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int sum=0;
		System.out.println("\nEnter integers, if want to stop leave line blank");
		while(scan.hasNextLine()){
			String str = scan.nextLine();
			if (str.isEmpty()){
				break;
			}
			else{
				sum += Integer.parseInt(str);
			}
		}
		
		System.out.print("Sum of ints = "+sum);
	}

	
	public static void calcTask13a(double a, double b, double c){
		double numerator = b + (Math.sqrt(b*b + 4*a*c));
		double denominator = 2*a;
		double result = numerator/denominator - Math.pow(a, 3)*c + b;
		
		System.out.println("Expression result = "+result);
	}
	
	public static void calcTask13b(double a, double b, double c, double d){
		double result = (a/c*b/d) - ((a*b-c) / c*d);
		System.out.println(result);
	}
	
	public static void calcTask14(double a, double b, double c){
		if (a>=0) {
			a *= a;
			}
		else {
			a = a*a*a*a;
		}
		if (b>=0) {
			b *= b;
			}
		else {
			b = b*b*b*b;
		}
		if (c>=0) {
			c *= c;
			}
		else {
			c = c*c*c*c;
		}
		
		System.out.println("a = "+a+""
				+ " b = "+b
				+ " c = "+c
				);
	}

	public static void calcTask15(double a, double b, double h){
		double temp=a;
		double fx=0;
		System.out.println("1st table x 2nd F(x)");
		while(temp<=b){
			fx = 2*Math.tan(temp/2)+1;
			System.out.println("x = "+ temp+ "F(x) = "+fx);
			temp+=h;
		}
	}

	public static void calcTask16(double R){
		double circleSquare = Math.PI*R*R;
		double circleLength = 2*Math.PI*R;
		System.out.println("Circle square = "+circleSquare+" Circle length = "+circleLength);
	}

	public static void calcTask17(double x){
		if (x<=-3){
			System.out.println("F(x) = "+9);
		}
		else if (x>3){
			double result = 1 / (x*x + 1);
			System.out.println("F(x) = "+result);
		}
		else{
			System.out.println("Function domain is not defined");
		}
	}
}
