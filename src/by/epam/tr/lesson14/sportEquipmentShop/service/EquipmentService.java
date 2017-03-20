package by.epam.tr.lesson14.sportEquipmentShop.service;

import by.epam.tr.lesson14.sportEquipmentShop.bean.Equipment;
import by.epam.tr.lesson14.sportEquipmentShop.service.ServiceException;;

public interface EquipmentService {
	void addEquipment(Equipment e) throws ServiceException;
	void deleteEquipmentById(int id) throws ServiceException;
	void deleteEquipment(Equipment e) throws ServiceException;
	void getAllEquipment() throws ServiceException;
}
