package by.epam.tr.lesson7;

public abstract class PublishingForm {
	public boolean isTangible;
	public abstract void toConsume();
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isTangible ? 1231 : 1237);
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
		PublishingForm other = (PublishingForm) obj;
		if (isTangible != other.isTangible)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PublishingForm [isTangible=" + isTangible + "]";
	}
	
	
}
