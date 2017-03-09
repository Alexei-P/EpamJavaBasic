package by.epam.tr.lesson13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class WarehouseView {
	public static void main(String[] args) {
		Warehouse wh = new Warehouse();
		Warehouse wh2 = new Warehouse();
		WarehouseView wv1 = new WarehouseView();
		WarehouseView wv2 = new WarehouseView();

		WarehouseController controller = new WarehouseController(wh, wv1);
		WarehouseController controller2 = new WarehouseController(wh2, wv2);

		Product p1 = new Product(1, "Item1", Categories.PROCESSORS, 123456, new Date(2017 - 1900, 01, 01),
				"processor 123 2.8 GHz dual core");
		Product p2 = new Product(2, "Item11", Categories.MONITORS, 111111, new Date(2015 - 1900, 01, 01),
				"Monitor DELL");
		Product p3 = new Product(3, "Item22", Categories.HDDS, 231232, new Date(2015 - 1900, 01, 01),
				"HDD 250 GB samsung");
		Product p4 = new Product(4, "Item3", Categories.NOTEBOOKS, 876543, new Date(2016 - 1900, 01, 01),
				"HP pavilion");
		Product p5 = new Product(5, "Item4", Categories.MONITORS, 123455, new Date(2016 - 1900, 01, 01),
				"HP 21 inches");

		controller.addProduct(p1);
		controller.addProduct(p2);
		controller.addProduct(p3);
		controller.addProduct(p4);
		controller.addProduct(p5);

		System.out.println(wh);
		controller.writeToFile("C:/Users/Alexei_Parkhomchyk/Desktop/EpamJavaBasic/test.txt");
		controller2.readFromFile("C:/Users/Alexei_Parkhomchyk/Desktop/EpamJavaBasic/test.txt");
		System.out.println(wh2);

		System.out.println(controller.findProdcutByWord("HP"));
		System.out.println(controller.findProductByCodeAndDate(111111, new Date(2015 - 1900, 01, 01)));

		wv1.printWarehouse(wh);
		String fileName = "C:/Users/Alexei_Parkhomchyk/workspace/EpamJavaBasic/src/by/epam/tr/lesson13/example.ser";
		
		// Serialization example 
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(wh);
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Warehouse wh3 = (Warehouse) ois.readObject();
			WarehouseView wv3 = new WarehouseView();
			wv3.printWarehouse(wh3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void printWarehouse(Warehouse wh) {
		System.out.println("-------------View representation-------------");
		System.out.println(wh);
	}

}
