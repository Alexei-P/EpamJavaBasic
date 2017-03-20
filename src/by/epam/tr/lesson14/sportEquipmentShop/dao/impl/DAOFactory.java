package by.epam.tr.lesson14.sportEquipmentShop.dao.impl;

import by.epam.tr.lesson14.sportEquipmentShop.dao.*;


public class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();
	
	private final UserDAO sqlUserDAO = new SQLUserDAO();
	private final EquipmentDAO sqlEquipmentDAO = new SQLEquipmentDAO();
	private final OrderDAO sqlOrderDAO = new SQLOrderDAO();
	
	private DAOFactory(){}
	
	public static DAOFactory getInstance(){
		return instance;
	}
	
	public UserDAO getUserDAO(){
		return sqlUserDAO;
	}
	public EquipmentDAO getEquipmentDAO(){
		return sqlEquipmentDAO;
	}
	public OrderDAO getOrderDAO(){
		return sqlOrderDAO;
	}
}
