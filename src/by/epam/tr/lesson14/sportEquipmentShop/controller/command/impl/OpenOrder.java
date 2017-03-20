package by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl;

import by.epam.tr.lesson14.sportEquipmentShop.controller.command.Command;
import by.epam.tr.lesson14.sportEquipmentShop.service.OrderService;
import by.epam.tr.lesson14.sportEquipmentShop.service.ServiceException;
import by.epam.tr.lesson14.sportEquipmentShop.service.factory.ServiceFactory;

public class OpenOrder implements Command {

	@Override
	public String execute(String request) {
		String response;
		String[] arr = request.split(" ");
		int id = Integer.parseInt(arr[1]);
	
		ServiceFactory sf = ServiceFactory.getInstance();
		OrderService os = sf.getOrderService();
		
		try {
			os.openOrder(id);
			response = "Order is open";
		} catch (ServiceException e) {
			response = "Order is not open";
		}
		return response;
	}

}
