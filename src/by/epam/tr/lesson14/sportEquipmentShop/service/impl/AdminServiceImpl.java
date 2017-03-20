package by.epam.tr.lesson14.sportEquipmentShop.service.impl;

import by.epam.tr.lesson14.sportEquipmentShop.bean.User;
import by.epam.tr.lesson14.sportEquipmentShop.dao.UserDAO;
import by.epam.tr.lesson14.sportEquipmentShop.dao.exception.DAOException;
import by.epam.tr.lesson14.sportEquipmentShop.dao.impl.DAOFactory;
import by.epam.tr.lesson14.sportEquipmentShop.service.AdminService;
import by.epam.tr.lesson14.sportEquipmentShop.service.ServiceException;

public class AdminServiceImpl implements AdminService {

	@Override
	public void deleteUser(User user) throws ServiceException {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		UserDAO userDAO = daoObjectFactory.getUserDAO();
		try {
			userDAO.deleteUser(user);
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

	@Override
	public void getAllUsers() throws ServiceException {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		UserDAO userDAO = daoObjectFactory.getUserDAO();
		try {
			userDAO.getAllUser();
		} catch (DAOException e) {
			throw new ServiceException();
		}

	}

}
