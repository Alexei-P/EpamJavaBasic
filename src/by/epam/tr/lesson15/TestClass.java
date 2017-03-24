package by.epam.tr.lesson15;

public class TestClass {

	public static void main(String[] args) {
		
		int[][] matrixA = d2MatrixGen(30);
		int[][] matrixB = d2MatrixGen(30);
		
		long startTime = System.currentTimeMillis();
		ResultMatrix rm = new ResultMatrix(matrixA, matrixB);  // Multithreading method
		rm.showMatrix();
		try {
			rm.calcMatrix();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rm.showMatrix();
		
		System.out.println("\nThreads created = "+ResultMatrix.threadsCreated);
		
		
		//simpleMatrixCalculation(matrixA, matrixB);  // One thread method, just to check performance
		
		long endTime = System.currentTimeMillis();
		long result = endTime - startTime;
		System.out.println("\nTime to calculate = "+result);
		
	}

	public static void simpleMatrixCalculation(int[][] matrixA, int[][] matrixB){
		int[][] matrixBT = getTransposed(matrixB);
		int[][] resultM = new int[matrixA.length][matrixA.length];
		for (int i=0; i<matrixA.length; i++){
			for (int j=0; j<matrixB.length; j++){
				resultM[i][j] = calcElement(matrixA[i], matrixBT[j]);
			}
		}
		
		for (int i =0; i<resultM.length; i++){
			for (int j =0; j<resultM.length; j++){
				System.out.print(resultM[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int calcElement(int[] a, int[] b){
		int sum=0;
		for (int i= 0; i<a.length; i++){
			sum += a[i]*b[i];
		}
		return sum;
	}
	
	public static int[][] getTransposed(int[][] m){
		int[][] mR = new int[m[0].length][m.length];
		for (int i = 0; i<m.length; i++){
			for (int j = 0; j<m[i].length; j++){
				mR[j][i] = m[i][j];
			}
		}
		return mR;
	}
	
	public static int[][] d2MatrixGen(int size){
		int k = 1;
		int[][] matrix = new int[size][size];
		for (int i = 0; i<size; i++){
			for (int j = 0; j<size; j++){
				matrix[i][j] = k;
				++k;
			}
		}
		return matrix;
	}
	
}
