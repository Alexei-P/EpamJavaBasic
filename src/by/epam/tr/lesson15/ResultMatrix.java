package by.epam.tr.lesson15;

public class ResultMatrix {
	public static int threadsCreated=0;
	private int size;
	private MatrixElement[][] m;
	public ResultMatrix(int[][] matrixA, int[][] matrixB){
		size = matrixA.length;
		m = new MatrixElement[size][size];
		for (int i = 0; i<size; i++){
			for (int j = 0; j<size; j++){
				m[i][j] = new MatrixElement(matrixA, matrixB, i, j);
			}
		}
	}
	
	public void calcMatrix() throws InterruptedException{
		for(int i=0; i<size; i++){
			for (int j=0; j<size; j++){
				Thread t = new Thread(m[i][j]);
				t.start();
				++threadsCreated;
			}
		}
	}
	
	public void showMatrix(){	
		for (int i=0 ;i<size; i++){
			for (int j=0; j<size; j++){
				System.out.print(m[i][j].getResult()+" ");
			}
			System.out.println();
		}
	}
	
}
