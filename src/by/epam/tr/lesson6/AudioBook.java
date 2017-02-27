package by.epam.tr.lesson6;

public class AudioBook extends PublishingForm{
	double sizeInMB;
	
	public AudioBook(double sizeInMB){
		super();
		this.isTangible = false;
		this.sizeInMB = sizeInMB;
	}
	@Override
	public void toConsume() {
		this.listenBook();
	}
	
	public void listenBook(){
		System.out.println("Listen...");
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(sizeInMB);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		AudioBook other = (AudioBook) obj;
		if (Double.doubleToLongBits(sizeInMB) != Double.doubleToLongBits(other.sizeInMB))
			return false;
		return true;
	}
	
	
	
}
