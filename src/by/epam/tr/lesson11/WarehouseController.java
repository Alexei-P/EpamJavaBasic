package by.epam.tr.lesson11;

import java.util.Date;

public class WarehouseController {
	private Warehouse wh;
	private WarehouseView view;
	
	public WarehouseController(Warehouse wh, WarehouseView view){
		this.wh = wh;
		this.view = view;
	}
	
	public void addProduct(Product p1){
		wh.addProduct(p1);
	}
	
	public void updateView(String fileName){
		wh.readFromFile(fileName);
		System.out.println(wh);
	}
	
	public void updateFile(String fileName){
		wh.writeToFile(fileName);
	}
	
	public Product findProdcutByWord(String word){
		return wh.findByWord(word);
	}
	
	public Product findProductByCategory(Categories cat){
		return wh.findProductByCategory(cat);
	}
	
	public Product findProductByCodeAndDate(int code, Date date){
		return wh.findProductByCodeAndDate(code, date);
	}
	
	public Product findProductByID(int id){
		return wh.findProductByID(id);
	}
	
	public Product findProductByName(String name){
		return wh.findProductByName(name);
	}
	
	public Product findProductByProducerCode(int code){
		return wh.findProductByProducerCode(code);
	}
	
	public void sortByProducerCode(){
		wh.sortByProducerCode();
	}
	
	public void sortProductsByCategory(){
		wh.sortProductsByCategory();
	}
	public void sortProductsByName(){
		wh.sortProductsByName();
	}
	public void sortProductsByReleaseDate(){
		wh.sortProductsByReleaseDate();
	}
	
	public void writeToFile(String fileName){
		wh.writeToFile(fileName);
	}
	
	public void readFromFile(String fileName){
		wh.readFromFile(fileName);
	}

}
