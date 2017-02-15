package by.epam.tr.lesson5.task2;

import java.util.Date;

public class Person {
	String lastName;
	String telNumber;
	Date birthDate;
	
	public Person(String lastName, String telNumber, Date birthDate) {
		this.lastName = lastName;
		this.telNumber = telNumber;
		this.birthDate = birthDate;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public void showPerson(){
		String s = String.format("%1$s, %2$s, %3$tD", this.getLastName(), this.getTelNumber(), this.getBirthDate());
		System.out.println(s);
	}
	
}
