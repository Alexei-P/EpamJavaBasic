package by.epam.tr.lesson4.task1;

import java.util.Date;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private String surName;
	private Date birthDate;
	private String address;
	private String telephoneNumber;
	private String faculty;
	private int course;
	
	public static void main(String[] args){
		Student stud1 = new Student(1, "Alexei", "Parkhomchyk", "Alexandrovich", 
				new Date(1995, 10, 04), "Minsk City", "+375291234567", "Management", 5);
		Student stud2 = new Student(2, "Ivan", "Ivanov", "Ivanovich", 
				new Date(1995, 10, 04), "Minsk City", "+375297654321", "Accounting", 3);
		stud1.selectionCriteria1();
		stud2.selectionCriteria2();
		stud1.prepareForSession();
	}
	
	public Student(int id, String firstName, String lastName, String surName, Date birthDate, String address,
			String telephoneNumber, String faculty, int course) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.surName = surName;
		this.birthDate = birthDate;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
		this.faculty = faculty;
		this.course = course;
	}
	
	public void selectionCriteria1(){
		System.out.println(getFirstName()+" "+getLastName()+" "+getTelephoneNumber());
	}
	
	public void selectionCriteria2(){
		System.out.println(getId()+" "+getFirstName()+" "+getLastName()+" "+getFaculty()+" "+getCourse());
	}
	
	public void prepareForSession(){
		long timeToLearn=1000;
		long timeToEat=100;
		long timeToSleep=200;
		long daysToPrepare=0;
		while(daysToPrepare<3){			
			try {
				System.out.println(getFirstName()+" Learn...");
				Thread.currentThread().sleep(timeToLearn);
				System.out.println(getFirstName()+" Eat...");
				Thread.currentThread().sleep(timeToEat);
				System.out.println(getFirstName()+" Sleep...");
				Thread.currentThread().sleep(timeToSleep);				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			daysToPrepare++;
		}
	}
	
	public void showId(){
		System.out.println(getId());
	}
	public void showFirstName(){
		System.out.println(getFirstName());
	}
	public void showLastName(){
		System.out.println(getLastName());
	}
	public void showSurName(){
		System.out.println(getSurName());
	}
	public void showBirthDate(){
		System.out.println(getBirthDate());
	}
	public void showAddress(){
		System.out.println(getAddress());
	}
	public void showTelephoneNumber(){
		System.out.println(getTelephoneNumber());
	}
	public void showFaculty(){
		System.out.println(getFaculty());
	}
	public void showCourse(){
		System.out.println(getCourse());
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	
	 
	
}
