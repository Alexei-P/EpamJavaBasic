package by.epam.tr.lesson3;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calcTask1(10, 7);
		//calcTask2();
		//calcTask3(10);
		//calcTask4(10);
		//calcTask14(-4,3,5);
		//calcTask15(2, 4, 0.1);
		//calcTask16(6);
		//calcTask17(-3);
	}

	public static void calcTask1(int N, int k){
		int[] A = new int[N];
		int sum=0;
		
		Random rand = new Random(100);
		
		for (int i=0; i<N; i++){
			A[i] = rand.nextInt()%10;
			//System.out.println(A[i]);
		}
		
		for (int i=0; i<N; i++){
			if (A[i]%k==0){
				sum+=A[i];
			}
		}
		
		System.out.println("Sum of divided by "+k+" = "+sum);
	}
	
	public static void calcTask2(){
		
		int[] A = new int[10];
		int quantityOfZeros=0;
		Random rand = new Random(100);
		for (int i=0; i<10; i++){
			A[i] = rand.nextInt()%3;
			System.out.println(A[i]);
		}
		
		for(int i=0; i<10; i++){
			if(A[i]==0){
				quantityOfZeros++;
			}
		}
		
		int[] resultMas = new int[quantityOfZeros];
		
		int j=0;
		for (int i=0; i<A.length; i++){
			if(A[i]==0){
				resultMas[j]=i;
				++j;
			}
		}
		System.out.println("-------------------------");
		for(int i=0; i<resultMas.length; i++){
			
			System.out.println(resultMas[i]);
		}
		
	}
	
	public static void calcTask3(int arraySize){
		if (arraySize==0){
			System.out.println("Sequence have to be more than 1");
			return;
		}
		
		if (arraySize==0){
			System.out.println("Sequence have to be more than 1");
			return;
		}
		
		int[] A = new int[arraySize];
		//int[] A = new int[]{1,2,3,4,5,6};
		Random rand = new Random(100);
		for (int i=0; i<A.length; i++){
			A[i] = rand.nextInt()%10;
			System.out.println(A[i]);
		}	
		
		int prev=A[0];
		for (int i=1; i<A.length;i++){
			if (A[i]<=prev){
				System.out.println("Sequence is not rising");
				return;
			}
		}
		System.out.println("Sequence is rising");
	}
	
	public static void calcTask4(int arraySize){
		if (arraySize==0){
			System.out.println("Sequence have to be more than 0");
			return;
		}
		
		int[] A = new int[arraySize];
		int quantityOfOdds=0;
		Random rand = new Random(100);
		for (int i=0; i<A.length; i++){
			A[i] = rand.nextInt()%100;
			System.out.println(A[i]);
		}	
		
		for(int i=0; i<A.length; i++){
			if(A[i]%2==0){
				quantityOfOdds++;
			}
		}
		
		int[] resultMas = new int[quantityOfOdds];
		
		int j=0;
		for (int i=0; i<A.length; i++){
			if(A[i]%2==0){
				resultMas[j]=A[i];
				++j;
			}
		}
		
		System.out.println("-------------------------");
		for(int i=0; i<resultMas.length; i++){
			
			System.out.println(resultMas[i]);
		}
		
		
	}
	
}
