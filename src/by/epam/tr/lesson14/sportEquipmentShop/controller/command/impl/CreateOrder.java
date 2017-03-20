package by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl;

import java.sql.Date;

import by.epam.tr.lesson14.sportEquipmentShop.controller.command.Command;
import by.epam.tr.lesson14.sportEquipmentShop.service.OrderService;
import by.epam.tr.lesson14.sportEquipmentShop.service.ServiceException;
import by.epam.tr.lesson14.sportEquipmentShop.service.factory.ServiceFactory;

public class CreateOrder implements Command {

	@Override
	public String execute(String request) {
		String response;
		String[] arr = request.split(" ");
		Date date = Date.valueOf(arr[1]);
		String equipment = arr[2]; 
		String user = arr[3];
		
		ServiceFactory sf = ServiceFactory.getInstance();
		OrderService os = sf.getOrderService();
		try{
			os.createOrder(date, equipment, user);
			response = "Order created";
		}
		catch(ServiceException e){
			response = "Order was not created";
		}
		return response;
	}

}
