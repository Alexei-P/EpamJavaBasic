package by.epam.tr.lesson14.sportEquipmentShop.dao;

import java.sql.Date;

import by.epam.tr.lesson14.sportEquipmentShop.bean.Equipment;
import by.epam.tr.lesson14.sportEquipmentShop.bean.User;
import by.epam.tr.lesson14.sportEquipmentShop.dao.exception.DAOException;

public interface OrderDAO {
	void createOrder(Date date, String equipment, String user) throws DAOException;
	void closeOrder(int id) throws DAOException;
	void openOrder(int id) throws DAOException;
	
}
