package by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl;

import by.epam.tr.lesson14.sportEquipmentShop.bean.User;
import by.epam.tr.lesson14.sportEquipmentShop.controller.command.Command;
import by.epam.tr.lesson14.sportEquipmentShop.service.AdminService;
import by.epam.tr.lesson14.sportEquipmentShop.service.ClientService;
import by.epam.tr.lesson14.sportEquipmentShop.service.ServiceException;
import by.epam.tr.lesson14.sportEquipmentShop.service.factory.ServiceFactory;

public class DeleteUser implements Command {

	@Override
	public String execute(String request) {
		String login;
		String password;
		String response;
		String[] arr = request.split(" ");
		login = arr[1];
		password = arr[2];
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		AdminService adminService = serviceFactory.getAdminService();
		
		try {
			adminService.deleteUser(new User(login, password));
			response = "User deleted";
		} catch (ServiceException e) {
			response = "Error duiring delete procedure";
		}
		return response;
	}

}
