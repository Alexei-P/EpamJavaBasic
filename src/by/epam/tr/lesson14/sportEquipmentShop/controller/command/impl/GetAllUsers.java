package by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl;

import by.epam.tr.lesson14.sportEquipmentShop.bean.User;
import by.epam.tr.lesson14.sportEquipmentShop.controller.command.Command;
import by.epam.tr.lesson14.sportEquipmentShop.service.AdminService;
import by.epam.tr.lesson14.sportEquipmentShop.service.ClientService;
import by.epam.tr.lesson14.sportEquipmentShop.service.ServiceException;
import by.epam.tr.lesson14.sportEquipmentShop.service.factory.ServiceFactory;

public class GetAllUsers implements Command {

	@Override
	public String execute(String request) {
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		AdminService adminService = serviceFactory.getAdminService();
		String response;
		try {
			adminService.getAllUsers();
			response = "User registered";
		} catch (ServiceException e) {
			response = "Error duiring login procedure";
		}
		return response;
		
	}

}
