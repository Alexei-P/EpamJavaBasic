package by.epam.tr.lesson14.sportEquipmentShop.service.impl;

import java.sql.Date;

import by.epam.tr.lesson14.sportEquipmentShop.dao.EquipmentDAO;
import by.epam.tr.lesson14.sportEquipmentShop.dao.OrderDAO;
import by.epam.tr.lesson14.sportEquipmentShop.dao.exception.DAOException;
import by.epam.tr.lesson14.sportEquipmentShop.dao.impl.DAOFactory;
import by.epam.tr.lesson14.sportEquipmentShop.service.OrderService;
import by.epam.tr.lesson14.sportEquipmentShop.service.ServiceException;

public class OrderServiceImpl implements OrderService {

	@Override
	public void createOrder(Date date, String equipment, String user) throws ServiceException {
		DAOFactory obj = DAOFactory.getInstance();
		OrderDAO order = obj.getOrderDAO();
		try {
			order.createOrder(date, equipment, user);
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

	@Override
	public void closeOrder(int id) throws ServiceException {
		DAOFactory obj = DAOFactory.getInstance();
		OrderDAO order = obj.getOrderDAO();
		try {
			order.closeOrder(id);
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

	@Override
	public void openOrder(int id) throws ServiceException {
		DAOFactory obj = DAOFactory.getInstance();
		OrderDAO order = obj.getOrderDAO();
		try {
			order.openOrder(id);
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

}
