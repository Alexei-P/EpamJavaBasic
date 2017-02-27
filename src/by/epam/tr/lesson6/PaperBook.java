package by.epam.tr.lesson6;

public class PaperBook extends PublishingForm{
	private double weight;
	private String printingHouse;
	private int pagesQuantity;
	public PaperBook(double weight, String printingHouse, int pagesQuantity) {
		super();
		this.isTangible = true;
		this.weight = weight;
		this.printingHouse = printingHouse;
		this.pagesQuantity = pagesQuantity;
	}
	@Override
	public void toConsume() {
		luxuryRead();
	}
	
	public void luxuryRead(){
		System.out.println("Luxury read...");
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + pagesQuantity;
		result = prime * result + ((printingHouse == null) ? 0 : printingHouse.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
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
		PaperBook other = (PaperBook) obj;
		if (pagesQuantity != other.pagesQuantity)
			return false;
		if (printingHouse == null) {
			if (other.printingHouse != null)
				return false;
		} else if (!printingHouse.equals(other.printingHouse))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	
	
	
}
