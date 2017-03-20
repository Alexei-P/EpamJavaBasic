package by.epam.tr.lesson14.sportEquipmentShop.service;

import by.epam.tr.lesson14.sportEquipmentShop.bean.*;
import by.epam.tr.lesson14.sportEquipmentShop.service.ServiceException;
public interface AdminService {
	void deleteUser(User user) throws ServiceException;
	void getAllUsers() throws ServiceException;	
}
