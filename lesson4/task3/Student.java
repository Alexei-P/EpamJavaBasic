package by.epam.tr.lesson4.task3;

public class Student {
	private String name;
	private int exam1Mark;
	private int exam2Mark;
	private int exam3Mark;
	private int exam4Mark;
	public Student(String name, int exam1Mark, int exam2Mark, int exam3Mark, int exam4Mark) {
		this.name = name;
		if (exam1Mark<0 || exam1Mark>10){
			throw new IllegalArgumentException();
		}
		if (exam2Mark<0 || exam2Mark>10){
			throw new IllegalArgumentException();
		}
		if (exam3Mark<0 || exam3Mark>10){
			throw new IllegalArgumentException();
		}
		if (exam4Mark<0 || exam4Mark>10){
			throw new IllegalArgumentException();
		}
		this.exam1Mark = exam1Mark;
		this.exam2Mark = exam2Mark;
		this.exam3Mark = exam3Mark;
		this.exam4Mark = exam4Mark;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExam1Mark() {
		return exam1Mark;
	}
	public void setExam1Mark(int exam1Mark) {
		this.exam1Mark = exam1Mark;
	}
	public int getExam2Mark() {
		return exam2Mark;
	}
	public void setExam2Mark(int exam2Mark) {
		this.exam2Mark = exam2Mark;
	}
	public int getExam3Mark() {
		return exam3Mark;
	}
	public void setExam3Mark(int exam3Mark) {
		this.exam3Mark = exam3Mark;
	}
	public int getExam4Mark() {
		return exam4Mark;
	}
	public void setExam4Mark(int exam4Mark) {
		this.exam4Mark = exam4Mark;
	}
	
	public double getAvarageMark(){
		return (exam1Mark+exam2Mark+exam3Mark+exam4Mark)/4;
	}
	
	
	
}
