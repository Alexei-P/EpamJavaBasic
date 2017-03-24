package by.epam.tr.lesson15;

public class RowsMatrixA {
	private int[][] matrix;
	public RowsMatrixA(int[][] matrix){
		this.matrix = matrix;
	}
	public int[] getRow(int i){
		return matrix[i];
	}

}
