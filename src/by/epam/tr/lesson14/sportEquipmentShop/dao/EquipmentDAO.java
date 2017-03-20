package by.epam.tr.lesson14.sportEquipmentShop.dao;

import java.util.ArrayList;

import by.epam.tr.lesson14.sportEquipmentShop.bean.Equipment;
import by.epam.tr.lesson14.sportEquipmentShop.dao.exception.DAOException;

public interface EquipmentDAO {
	void addEquipment(Equipment e) throws DAOException;
	void deleteEquipment(Equipment e) throws DAOException;
	void deleteByID(int id) throws DAOException;
	void getAllEquipment() throws DAOException;
}
