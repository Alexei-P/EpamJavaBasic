package by.epam.tr.lesson3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calcTask5(6);
		//calcTask6(10);
	}

	public static void calcTask5(int matrixSize){
		if (matrixSize%2==1){
			System.out.println("Matrix size have to be odd");
			return;
		}
		int[][] matrix = new int[matrixSize][matrixSize];
		for(int i=0; i<matrixSize; i++){
			if (i%2==1){
				for (int j=0; j<matrixSize; j++){
					matrix[i][j]=j+1;
				}
			}
			else{
				for (int j=0; j<matrixSize; j++){
					matrix[i][j]=matrixSize-j;
				}
			}
		}
		
		for(int i=0; i<matrixSize; i++){
				for (int j=0; j<matrixSize; j++){
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}	
	}
	
	public static void calcTask6(int matrixSize){
		if (matrixSize%2==1){
			System.out.println("Matrix size have to be odd");
			return;
		}
		
		int[][] matrix = new int[matrixSize][matrixSize];
		for(int i=0; i<matrixSize; i++){
			if (i==0 || i==matrixSize-1){
				for (int j=0; j<matrixSize; j++){
					matrix[i][j]=1;
				}
			}			
			else{
				for(int j=0; j<matrixSize; j++){
					if (j==0 || j==matrixSize-1){
						matrix[i][j]=1;
					}
					else{
						matrix[i][j]=0;
					}
				}
			}
			
		}
		
		for(int i=0; i<matrixSize; i++){
				for (int j=0; j<matrixSize; j++){
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}	
		
	}
}
