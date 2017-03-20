package by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl;

import by.epam.tr.lesson14.sportEquipmentShop.controller.command.Command;
import by.epam.tr.lesson14.sportEquipmentShop.service.EquipmentService;
import by.epam.tr.lesson14.sportEquipmentShop.service.ServiceException;
import by.epam.tr.lesson14.sportEquipmentShop.service.factory.ServiceFactory;

public class DeleteEquipmentById implements Command {

	@Override
	public String execute(String request) {
		int id;
		String[] arr = request.split(" ");
		id = Integer.parseInt(arr[1]);
		String response;
		
		ServiceFactory sf = ServiceFactory.getInstance();
		EquipmentService es = sf.getEquipmentService();
		
		try{
			es.deleteEquipmentById(id);
			response = "Deleted";
		} catch(ServiceException e){
			response = "Error during deletion";
		}
		return response;
	}

}
