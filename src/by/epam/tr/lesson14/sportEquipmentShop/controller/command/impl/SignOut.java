package by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl;

import by.epam.tr.lesson14.sportEquipmentShop.bean.User;
import by.epam.tr.lesson14.sportEquipmentShop.controller.command.Command;
import by.epam.tr.lesson14.sportEquipmentShop.service.ClientService;
import by.epam.tr.lesson14.sportEquipmentShop.service.ServiceException;
import by.epam.tr.lesson14.sportEquipmentShop.service.factory.ServiceFactory;

public class SignOut implements Command {

	@Override
	public String execute(String request) {
		String login;
		String response;
		String[] arr = request.split(" ");
		login = arr[1];
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		ClientService clientService = serviceFactory.getClientService();
		
		try {
			clientService.signOut(login);
			response = "User logged out";
		} catch (ServiceException e) {
			response = "Error duiring loggin out procedure";
		}
		return response;
	}

}
