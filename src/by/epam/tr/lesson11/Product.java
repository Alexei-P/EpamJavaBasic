package by.epam.tr.lesson11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
	int id;
	private String name;
	private Categories category;
	private int producerCode;
	private Date releaseDate;
	private String annotation;
	
	public Product(int id, String name, Categories category, int producerCode, Date releaseDate, String annotation) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.producerCode = producerCode;
		this.releaseDate = releaseDate;
		this.annotation = annotation;
	}
	public Categories getCategory() {
		return category;
	}
	public void setCategory(Categories category) {
		this.category = category;
	}
	public int getProducerCode() {
		return producerCode;
	}
	public void setProducerCode(int producerCode) {
		this.producerCode = producerCode;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getAnnotation() {
		return annotation;
	}
	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((annotation == null) ? 0 : annotation.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + producerCode;
		result = prime * result + ((releaseDate == null) ? 0 : releaseDate.hashCode());
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
		Product other = (Product) obj;
		if (annotation == null) {
			if (other.annotation != null)
				return false;
		} else if (!annotation.equals(other.annotation))
			return false;
		if (category != other.category)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (producerCode != other.producerCode)
			return false;
		if (releaseDate == null) {
			if (other.releaseDate != null)
				return false;
		} else if (!releaseDate.equals(other.releaseDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", producerCode=" + producerCode
				+ ", releaseDate=" + releaseDate + ", annotation=" + annotation + "]";
	}
	
	public String prepareToWriting(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		return id + "," + name + "," + category + "," + producerCode
				+ "," + sdf.format(releaseDate) + "," + annotation;
	}
	
	
	
}
