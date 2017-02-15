package by.epam.tr.lesson5.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;

public class PocketBook {
	private String pocketBookName;
	private ArrayList<Person> pocketBook;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Ivanov", "+375291234567", new Date(1990-1900, 12, 31));
		Person p2 = new Person("Andreev", "+375298765431", new Date(1993-1900, 12, 31));
		Person p3 = new Person("Petrov", "+375295556688", new Date(1994-1900, 12, 31));
		Person p4 = new Person("Sidorov", "+375299997722", new Date(1989-1900, 12, 31));
		Person p5 = new Person("Antonov", "+375295253535", new Date(1991-1900, 12, 31));
		
		PocketBook pb = new PocketBook("PocketBook");
		
		pb.getPocketBook().add(p1);
		pb.getPocketBook().add(p2);
		pb.getPocketBook().add(p3);
		pb.getPocketBook().add(p4);
		pb.getPocketBook().add(p5);
		
		pb.showPocketBook();
		
		System.out.println();
		pb.findByLastname("Sidorov");
		
		pb.deletePersonByLastname("Petrov");
		System.out.println();
		pb.showPocketBook();
		
		System.out.println("pb.sortByTelNumber();");
		pb.sortByTelNumber();
		pb.showPocketBook();
		
		System.out.println("pb.sortByLastName();");
		pb.sortByLastName();
		pb.showPocketBook();
		
		System.out.println("pb.sortByBirthDate();");
		pb.sortByBirthDate();
		pb.showPocketBook();
	}
	
	public PocketBook(String name) {
		this.pocketBookName = name;
		pocketBook = new ArrayList<>();
	}
	
	public ArrayList<Person> getPocketBook() {
		return pocketBook;
	}
	
	public String getPocketBookName() {
		return pocketBookName;
	}
	public void showPocketBook(){
		Person temp=null;
		Iterator<Person> iter = pocketBook.iterator();
		while (iter.hasNext()){
			temp = iter.next();
			temp.showPerson();
		}
	}
	
	public void findByLastname(String lastname){
		for(Person p : pocketBook){
			if(p.getLastName().compareTo(lastname)==0){
				System.out.print("By your request we found: ");
				p.showPerson();
				return;
			}
		}
		System.out.println("There is no such person!");
		
	}
	
	public void addPerson(String lastName, String telNumber, Date birthDate){
		Person p = new Person(lastName, telNumber, birthDate);
		pocketBook.add(p);
	}
	
	public void deletePersonByLastname(String lastname){
		Person temp;
		Iterator<Person> iter = pocketBook.iterator();
		while (iter.hasNext()){
			temp = iter.next();
			if (temp.getLastName().compareTo(lastname)==0){
				iter.remove();
				return;
			}
			
		}
	}
	
	public void sortByLastName(){
		Collections.sort(pocketBook, new Comparator<Person>(){
			public int compare(Person p1, Person p2){
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});
	}
	
	public void sortByTelNumber(){
		Collections.sort(pocketBook, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getTelNumber().compareTo(o2.getTelNumber());
			}
		});
	}
	
	public void sortByBirthDate(){
		Collections.sort(pocketBook, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getBirthDate().compareTo(o2.getBirthDate());
			}
		});
	}


}
