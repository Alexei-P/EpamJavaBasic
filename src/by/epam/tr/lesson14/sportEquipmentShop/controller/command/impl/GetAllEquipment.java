package by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl;

import by.epam.tr.lesson14.sportEquipmentShop.controller.command.Command;
import by.epam.tr.lesson14.sportEquipmentShop.service.EquipmentService;
import by.epam.tr.lesson14.sportEquipmentShop.service.ServiceException;
import by.epam.tr.lesson14.sportEquipmentShop.service.factory.ServiceFactory;

public class GetAllEquipment implements Command {

	@Override
	public String execute(String request) {
		String response;
		ServiceFactory sf = ServiceFactory.getInstance();
		EquipmentService es = sf.getEquipmentService();
		
		try{
			es.getAllEquipment();
			response = "Equipment list prepared";
		}
		catch(ServiceException e){
			response = "Equipment list is not prepared";
		}
		return response;
	}

}
