package by.epam.tr.lesson4.task1;

import java.util.Random;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String surName;
	private String address;
	private String creditCardNumber;
	private int bankAccountNumber;
	
	public static void main(String[] args){
		Customer c1 = new Customer(1, "Alexei", "Alexeev", "Alexeevich", "Minsk", "1234 5678 9101 1213", 1234567);
		c1.calculateLuckyNumber();
	}
	
	public Customer(int id, String firstName, String lastName, String surName, String address, String creditCardNumber,
			int bankAccountNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.surName = surName;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}
	
	public void selectionCriteria1(){
		System.out.println(getId()+" "+getFirstName()+" "+getCreditCardNumber());
	}
	
	public void selectionCriteria2(){
		System.out.println(getFirstName()+" "+getLastName()+" "+getBankAccountNumber());
	}
	
	public void show(){
		System.out.println(getId()+" "+
				getFirstName()+ " "+
				getLastName()+ " "+
				getSurName()+ " "+
				getAddress()+ " "+
				getCreditCardNumber()+ " "+
						getBankAccountNumber()+ " ");
	}
	
	public void calculateLuckyNumber(){ //calculate lucky number of customer for casino roulette
		Random rand = new Random(getBankAccountNumber());
		System.out.println("Your lucky number is "+rand.nextInt(100)+" Do All-in using this number!");
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	
	
	
	
}
