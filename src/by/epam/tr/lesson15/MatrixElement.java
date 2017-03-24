package by.epam.tr.lesson15;

public class MatrixElement implements Runnable {
	private RowsMatrixA rowsA;
	private ColumnsMatrixB columnsB;
	private int i; // Row
	private int j; // Column
	private volatile boolean processed = false;
	private int result;

	public MatrixElement(int[][] matrixA, int[][] matrixB, int i, int j) {
		this.rowsA = new RowsMatrixA(matrixA);
		this.columnsB = new ColumnsMatrixB(matrixB);
		this.i = i;
		this.j = j;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public boolean isProcessed() {
		return processed;
	}

	public synchronized void setProcessed(boolean processed) {
		this.processed = processed;
	}

	public int getResult() {
		return result;
	}

	public synchronized void setResult(int result) {
		this.result = result;
	}

	public synchronized void calcElement() {
		int[] rA = this.rowsA.getRow(i);
		int[] cB = this.columnsB.getRow(j);
		this.setProcessed(true);
		int sum = 0;
		for (int i = 0; i < rA.length; i++) {
			sum += rA[i] * cB[i];
		}
		this.setResult(sum);
	}

	@Override
	public void run() {
		if (processed == false) {
			this.calcElement();	
		}
	}

}
