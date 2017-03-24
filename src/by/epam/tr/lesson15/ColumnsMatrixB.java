package by.epam.tr.lesson15;

import java.util.Arrays;

public class ColumnsMatrixB {
	private int[][] matrix;
	
	public ColumnsMatrixB(int[][] matrix){
		this.matrix = getTransposed(matrix);
	}
	
	private int[][] getTransposed(int[][] m){
		int[][] mR = new int[m[0].length][m.length];
		for (int i = 0; i<m.length; i++){
			for (int j = 0; j<m[i].length; j++){
				mR[j][i] = m[i][j];
			}
		}
		return mR;
	}
	
	public int[] getRow(int i){
		return matrix[i];
	}

	@Override
	public String toString() {
		return "ColumnsMatrixB [matrix=" + Arrays.toString(matrix) + "]";
	}
	
	public void showB(){
		for (int i = 0; i<matrix.length; i++){
			for (int j = 0; j<matrix[i].length; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
