package by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl;

import by.epam.tr.lesson14.sportEquipmentShop.bean.User;
import by.epam.tr.lesson14.sportEquipmentShop.controller.command.Command;
import by.epam.tr.lesson14.sportEquipmentShop.service.ClientService;
import by.epam.tr.lesson14.sportEquipmentShop.service.ServiceException;
import by.epam.tr.lesson14.sportEquipmentShop.service.factory.ServiceFactory;

public class SignIn implements Command {

	@Override
	public String execute(String request) {
		String login;
		String password;
		String response;
		String[] arr = request.split(" ");
		login = arr[1];
		password = arr[2];
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		ClientService clientService = serviceFactory.getClientService();
		
		try {
			clientService.signIn(login, password);
			response = "User logged";
		} catch (ServiceException e) {
			response = "Error duiring login procedure";
		}
		return response;
	}

}
