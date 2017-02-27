package by.epam.tr.lesson6;

import java.util.ArrayList;
import java.util.Date;

public class Miscellanea{
	private String name;
	private PublishingForm form;
	private ArrayList<Work> listOfWorks = new ArrayList<Work>();
	
	public static void main(String[] args){
		EBook form1 = new EBook(21.1, true);
		PaperBook form2 = new PaperBook(1.3, "Piter-M", 300);
		AudioBook form3 = new AudioBook(400.4);
		/*Work w1 = new Drama("Drama1", "Author1", new Date(1900-1980,01,01));
		Work w2 = new Poem("Poem1", "Author2", new Date(1900-1980,01,01), 524);
		Work w3 = new Novel("Novel1", "Author3", new Date(1900-1980,01,01));*/
		
		Work w1 = new Drama("Drama1", "Author1", new Date(1900-1980,01,01));
		Work w2 = new Poem("Poem1", "Author2", new Date(1900-1980,01,01), 524);
		Work w3 = new Novel("Novel1", "Author3", new Date(1900-1980,01,01));
		
		
		Miscellanea m1 = new Miscellanea("Magazine", form1);
		Miscellanea m2 = new Miscellanea("Book", form2);
		
		m1.getListOfWorks().add(w1);
		m1.getListOfWorks().add(w3);
		
		m1.getListOfWorks().add(w1);
		m2.getListOfWorks().add(w2);
		m2.getListOfWorks().add(w3);
		
		/*System.out.println(m1);
		System.out.println(m2);*/
		System.out.println(m2.contains(w3));
	}

	public Miscellanea(String name, PublishingForm form) {
		super();
		this.name = name;
		this.form = form;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Work> getListOfWorks() {
		return listOfWorks;
	}

	public PublishingForm getForm() {
		return form;
	}

	@Override
	public String toString() {
		return "Miscellanea [name=" + name + ", form=" + form + ", listOfWorks=" + listOfWorks + "]";
	}
	
	public boolean contains(Object o){
		return listOfWorks.contains(o);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((form == null) ? 0 : form.hashCode());
		result = prime * result + ((listOfWorks == null) ? 0 : listOfWorks.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Miscellanea other = (Miscellanea) obj;
		if (form == null) {
			if (other.form != null)
				return false;
		} else if (!form.equals(other.form))
			return false;
		if (listOfWorks == null) {
			if (other.listOfWorks != null)
				return false;
		} else if (!listOfWorks.equals(other.listOfWorks))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	

}
