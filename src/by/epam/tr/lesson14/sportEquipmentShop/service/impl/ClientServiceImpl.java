package by.epam.tr.lesson14.sportEquipmentShop.service.impl;

import by.epam.tr.lesson14.sportEquipmentShop.bean.User;
import by.epam.tr.lesson14.sportEquipmentShop.dao.UserDAO;
import by.epam.tr.lesson14.sportEquipmentShop.dao.exception.DAOException;
import by.epam.tr.lesson14.sportEquipmentShop.dao.impl.DAOFactory;
import by.epam.tr.lesson14.sportEquipmentShop.service.ClientService;
import by.epam.tr.lesson14.sportEquipmentShop.service.ServiceException;

public class ClientServiceImpl implements ClientService {

	@Override
	public void signIn(String login, String password) throws ServiceException {
		DAOFactory obj = DAOFactory.getInstance();
		UserDAO user = obj.getUserDAO();
		try {
			user.signIn(login, password);
		} catch (DAOException e) {
			throw new ServiceException();
		}

	}

	@Override
	public void signOut(String login) throws ServiceException {
		DAOFactory obj = DAOFactory.getInstance();
		UserDAO user = obj.getUserDAO();
		try {
			user.signOut(login);
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

	@Override
	public void register(User user_N) throws ServiceException {
		DAOFactory obj = DAOFactory.getInstance();
		UserDAO user = obj.getUserDAO();
		try {
			user.register(user_N);
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

}
