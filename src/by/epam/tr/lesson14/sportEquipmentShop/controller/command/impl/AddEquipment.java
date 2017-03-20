package by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl;

import by.epam.tr.lesson14.sportEquipmentShop.bean.Equipment;
import by.epam.tr.lesson14.sportEquipmentShop.bean.User;
import by.epam.tr.lesson14.sportEquipmentShop.controller.command.Command;
import by.epam.tr.lesson14.sportEquipmentShop.service.ClientService;
import by.epam.tr.lesson14.sportEquipmentShop.service.EquipmentService;
import by.epam.tr.lesson14.sportEquipmentShop.service.ServiceException;
import by.epam.tr.lesson14.sportEquipmentShop.service.factory.ServiceFactory;

public class AddEquipment implements Command {

	@Override
	public String execute(String request) {
		String name;
		double cost;
		double price;
		String[] arr = request.split(" ");
		name = arr[1];
		cost = Double.parseDouble(arr[2]);
		price = Double.parseDouble(arr[3]);
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		EquipmentService equipmentService = serviceFactory.getEquipmentService();
		
		String response;
		try {
			equipmentService.addEquipment(new Equipment(name, cost, price));
			response = "Equipment added";
		} catch (ServiceException e) {
			response = "Error duiring equipment adding";
		}
		return response;
	}

}
