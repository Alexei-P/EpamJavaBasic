package by.epam.tr.lesson4.task4;

import java.util.Arrays;

public class Abiturient implements Comparable<Abiturient>{
	private String name;
	private int mark1;
	private int mark2;
	private int mark3;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abiturient a1 = new Abiturient("Ivan", 9, 8, 7);
		Abiturient a2 = new Abiturient("Ivan2", 7, 8, 7);
		Abiturient a3 = new Abiturient("Ivan3", 9, 6, 7);
		Abiturient a4 = new Abiturient("Ivan4", 8, 8, 7);
		Abiturient a5 = new Abiturient("Ivan5", 10, 8, 7);
		
		Abiturient[] abitArr = new Abiturient[5];
		
		abitArr[0] = a1;
		abitArr[1] = a2;
		abitArr[2] = a3;
		abitArr[3] = a4;
		abitArr[4] = a5;
		
		showPasAbit(abitArr, 2);

	}

	public static void showPasAbit(Abiturient[] abitArr, int freePlaces){
		Arrays.sort(abitArr);
		if (freePlaces<abitArr.length){
			for (int i=0; i<freePlaces; i++){
				abitArr[i].showAbiturient();
			}	
		}
		else{
			for (int i=0; i<abitArr.length; i++){
				abitArr[i].showAbiturient();
			}	
		}
		
	}
	
	public void showAbiturient(){
		System.out.println(this.name +" N of points = "+ this.getSumOfExams());
	}

	public Abiturient(String name, int mark1, int mark2, int mark3) {
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMark1() {
		return mark1;
	}


	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}


	public int getMark2() {
		return mark2;
	}


	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}


	public int getMark3() {
		return mark3;
	}


	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}
	
	public int getSumOfExams(){
		return getMark1()+getMark2()+getMark3();
	}


	@Override
	public int compareTo(Abiturient arg0) {
		// TODO Auto-generated method stub
		return arg0.getSumOfExams() - this.getSumOfExams();
	}
	

}
