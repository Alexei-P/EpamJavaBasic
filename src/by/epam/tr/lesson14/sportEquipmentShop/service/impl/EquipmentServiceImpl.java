package by.epam.tr.lesson14.sportEquipmentShop.service.impl;

import by.epam.tr.lesson14.sportEquipmentShop.bean.Equipment;
import by.epam.tr.lesson14.sportEquipmentShop.dao.EquipmentDAO;
import by.epam.tr.lesson14.sportEquipmentShop.dao.UserDAO;
import by.epam.tr.lesson14.sportEquipmentShop.dao.exception.DAOException;
import by.epam.tr.lesson14.sportEquipmentShop.dao.impl.DAOFactory;
import by.epam.tr.lesson14.sportEquipmentShop.service.EquipmentService;
import by.epam.tr.lesson14.sportEquipmentShop.service.ServiceException;

public class EquipmentServiceImpl implements EquipmentService {

	@Override
	public void addEquipment(Equipment e) throws ServiceException {
		DAOFactory obj = DAOFactory.getInstance();
		EquipmentDAO eq = obj.getEquipmentDAO();
		try {
			eq.addEquipment(e);
		} catch (DAOException e1) {
			throw new ServiceException();
		}

	}

	@Override
	public void deleteEquipmentById(int id) throws ServiceException {
		DAOFactory obj = DAOFactory.getInstance();
		EquipmentDAO eq = obj.getEquipmentDAO();
		try {
			eq.deleteByID(id);
		} catch (DAOException e) {
			throw new ServiceException();
		}

	}

	@Override
	public void deleteEquipment(Equipment e) throws ServiceException {
		DAOFactory obj = DAOFactory.getInstance();
		EquipmentDAO eq = obj.getEquipmentDAO();
		try {
			eq.deleteEquipment(e);
		} catch (DAOException e1) {
			throw new ServiceException();
		}
	}

	@Override
	public void getAllEquipment() throws ServiceException {
		DAOFactory obj = DAOFactory.getInstance();
		EquipmentDAO eq = obj.getEquipmentDAO();
		try {
			eq.getAllEquipment();
		} catch (DAOException e) {
			throw new ServiceException();
		}
	}

}
