package by.epam.tr.lesson11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Warehouse {
	private ArrayList<Product> list = new ArrayList<Product>();
	
	public void addProduct(Product p){
		list.add(p);
	}
	
	public void deleteProductByName(String name){
		Iterator<Product> iter = list.iterator();
		Product temp;
		while(iter.hasNext()){
			temp = iter.next();
			if (temp.getName().compareTo(name)==0){
				iter.remove();
				return;
			}
		}
	}
	
	public Product findProductByID(int id){
		Iterator<Product> iter = list.iterator();
		Product temp;
		while(iter.hasNext()){
			temp = iter.next();
			if (temp.getId()==id)
				return temp;
		}
		return null;
	}
	
	public Product findProductByName(String name){
		Iterator<Product> iter = list.iterator();
		Product temp;
		while(iter.hasNext()){
			temp = iter.next();
			if (temp.getName().compareTo(name)==0)
				return temp;
		}
		return null;
	}
	
	public Product findProductByCategory(Categories cat){
		Iterator<Product> iter = list.iterator();
		Product temp;
		while(iter.hasNext()){
			temp = iter.next();
			if (temp.getCategory().compareTo(cat)==0)
				return temp;
		}
		return null;
	}
	
	public Product findProductByProducerCode(int producerCode){
		Iterator<Product> iter = list.iterator();
		Product temp;
		while(iter.hasNext()){
			temp = iter.next();
			if (temp.getProducerCode()==producerCode)
				return temp;
		}
		return null;
	}
	public Product findProductByDate(Date date){
		Iterator<Product> iter = list.iterator();
		Product temp;
		while(iter.hasNext()){
			temp = iter.next();
			if (temp.getReleaseDate().compareTo(date)==0)
				return temp;
		}
		return null;
	}
	
	public Product findProductByCodeAndDate(int producerCode, Date date){
		Product p1, p2;
		p1 = findProductByProducerCode(producerCode);
		p2 = findProductByDate(date);
		if (p2.equals(p1)) return p1;
		else return null;
	}

	
	public Product findByWord(String str){
		Pattern p1 = Pattern.compile(str);
		Iterator<Product> iter = list.iterator();
		Product temp;
		while(iter.hasNext()){
			temp = iter.next();
			Matcher m = p1.matcher(temp.getAnnotation());
			if (m.find()){
				return temp;
			}
		}
		return null;
	}
	
	public void sortProductsByCategory(){
		Collections.sort(list, new Comparator<Product>(){

			@Override
			public int compare(Product o1, Product o2) {
				return o1.getCategory().toString().compareTo(o2.getCategory().toString());
			}
			
		});
	}
	
	public void sortProductsByName(){
		Collections.sort(list, new Comparator<Product>(){

			@Override
			public int compare(Product o1, Product o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
	}
	
	public void sortProductsByReleaseDate(){
		Collections.sort(list, new Comparator<Product>(){

			@Override
			public int compare(Product o1, Product o2) {
				return o1.getReleaseDate().compareTo(o2.getReleaseDate());
			}
			
		});
	}
	
	public void sortByProducerCode(){
		Collections.sort(list, new Comparator<Product>(){

			@Override
			public int compare(Product o1, Product o2) {
				return o1.getProducerCode() - o2.getProducerCode();
			}
			
		});
	}
	
	public void writeToFile(String fileName){
		File file = new File(fileName);
		try {
			FileOutputStream fos = new FileOutputStream(file);
			Iterator<Product> iter = list.iterator();
			Product temp;
			while (iter.hasNext()){
				temp = iter.next();
				fos.write(temp.prepareToWriting().getBytes());
				fos.write("\n".getBytes());
			}
		} catch (FileNotFoundException e) {
			System.out.println("File with such name was not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("writing to file is incorrect");
			e.printStackTrace();
		}
		
	}
	//TODO: parse dates
	public void readFromFile(String fileName){
		list.clear();
		File file = new File(fileName);
		String temp;
		int id;
		String name;
		Categories category;
		int producerCode;
		Date releaseDate;
		String annotation;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			FileReader fis = new FileReader(file);
			BufferedReader br = new BufferedReader(fis);
			while((temp = br.readLine())!=null){
				String[] strArr = temp.split(",");
				id = Integer.parseInt(strArr[0]);
				name = strArr[1];
				category = Categories.valueOf(strArr[2]);
				producerCode = Integer.parseInt(strArr[3]);
				releaseDate = sdf.parse(strArr[4]);
				annotation = strArr[5];
				list.add(new Product(id,name,category, producerCode, releaseDate,annotation));
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File with such name was not found");		
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String toString() {
		return "Warehouse [list=" + list + "]";
	}
	


}
