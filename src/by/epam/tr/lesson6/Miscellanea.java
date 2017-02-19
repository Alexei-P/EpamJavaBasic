package by.epam.tr.lesson6;

import java.util.ArrayList;

public class Miscellanea extends PublishingForm{
	private String name;
	private ArrayList<Work> listOfWorks = new ArrayList<Work>();
	
	public static void main(String[] args){
		Work w1 = new Work("Name1", "Prose");
		Work w2 = new Work("Name2", "Lyrics");
		Work w3 = new Work("Name2", "Poem");
		
		Miscellanea m1 = new Miscellanea("Magazine", "Misc1");
		Miscellanea m2 = new Miscellanea("Book", "Misc2in1");
		
		m1.getListOfWorks().add(w1);
		m1.getListOfWorks().add(w3);
		
		m1.getListOfWorks().add(w1);
		m2.getListOfWorks().add(w2);
		m2.getListOfWorks().add(w3);
		
		System.out.println(m1);
		System.out.println(m2);
	}
	
	public Miscellanea(String formType, String name) {
		super(formType);
		this.name = name;
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
	public void setListOfWorks(ArrayList<Work> listOfWorks) {
		this.listOfWorks = listOfWorks;
	}

	public boolean isWorkExist(Work w){
		return listOfWorks.contains(w);
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((listOfWorks == null) ? 0 : listOfWorks.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Miscellanea other = (Miscellanea) obj;
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
	
	
	@Override
	public String toString() {
		return "Miscellanea [name=" + name + ", listOfWorks=" + listOfWorks + "]";
	}
	
	

}
