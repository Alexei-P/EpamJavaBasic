package by.epam.tr.lesson6;

import java.util.Date;

public class Work {
	private String name;
	private String author;
	private Date dateOfPublishing;
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public Date getDateOfPublishing() {
		return dateOfPublishing;
	}
	public Work(String name, String author, Date dateOfPublishing) {
		super();
		this.name = name;
		this.author = author;
		this.dateOfPublishing = dateOfPublishing;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((dateOfPublishing == null) ? 0 : dateOfPublishing.hashCode());
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
		Work other = (Work) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (dateOfPublishing == null) {
			if (other.dateOfPublishing != null)
				return false;
		} else if (!dateOfPublishing.equals(other.dateOfPublishing))
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
		return "Work [name=" + name + ", author=" + author + ", dateOfPublishing=" + dateOfPublishing + "]";
	}
	
	
}
