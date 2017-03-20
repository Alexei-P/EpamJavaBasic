package by.epam.tr.lesson14.sportEquipmentShop.view;

import by.epam.tr.lesson14.sportEquipmentShop.bean.User;
import by.epam.tr.lesson14.sportEquipmentShop.controller.command.Controller;
import by.epam.tr.lesson14.sportEquipmentShop.dao.impl.SQLEquipmentDAO;
import by.epam.tr.lesson14.sportEquipmentShop.dao.impl.SQLOrderDAO;
import by.epam.tr.lesson14.sportEquipmentShop.dao.impl.SQLUserDAO;
import java.sql.Date;

public class TestClass {
	public static void main(String[] args){
		
		Controller controller = new Controller();
		controller.init();
		String result;
		result = controller.executeTask("SIGN_IN user1 1234");
		System.out.println(result);
		result = controller.executeTask("SIGN_OUT user1");
		System.out.println(result);
		/*result = controller.executeTask("DELETE_USER NewUser3 4321");
		System.out.println(result);*/
		/*result = controller.executeTask("ADD_EQUIPMENT Skies 200.0 15.0");
		System.out.println(result);*/
		result = controller.executeTask("CLOSE_ORDER 4");
		System.out.println(result);
		result = controller.executeTask("OPEN_ORDER 4");
		System.out.println(result);
		/*result = controller.executeTask("REGISTER ABC QWE");
		System.out.println(result);*/
		
	}
	
}
