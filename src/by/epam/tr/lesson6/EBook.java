package by.epam.tr.lesson6;

public class EBook extends PublishingForm{
	double sizeInMB;
	boolean isColorful;
	public EBook(double sizeInMB, boolean isColorful){
		super();
		this.isTangible=false;
		this.sizeInMB = sizeInMB;
		this.isColorful = isColorful;
	}
	@Override
	public void toConsume() {
		toRead();
	}
	public void toRead(){
		System.out.println("Read...");
	}
}
