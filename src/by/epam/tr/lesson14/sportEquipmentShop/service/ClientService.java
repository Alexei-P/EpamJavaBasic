package by.epam.tr.lesson14.sportEquipmentShop.service;

import by.epam.tr.lesson14.sportEquipmentShop.bean.*;
import by.epam.tr.lesson14.sportEquipmentShop.dao.exception.DAOException;

public interface ClientService {
	void signIn(String login, String password) throws ServiceException;
	void signOut(String login) throws ServiceException;
	void register(User user) throws ServiceException;
}
