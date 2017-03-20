package by.epam.tr.lesson14.sportEquipmentShop.service;

import java.sql.Date;
import by.epam.tr.lesson14.sportEquipmentShop.service.ServiceException;
public interface OrderService {
	void createOrder(Date date, String equipment, String user) throws ServiceException;
	void closeOrder(int id) throws ServiceException;
	void openOrder(int id) throws ServiceException;
	 
}
