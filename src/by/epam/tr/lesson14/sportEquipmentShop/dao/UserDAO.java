package by.epam.tr.lesson14.sportEquipmentShop.dao;

import by.epam.tr.lesson14.sportEquipmentShop.bean.User;
import by.epam.tr.lesson14.sportEquipmentShop.dao.exception.*;

public interface UserDAO {
	void signIn(String login, String password) throws DAOException;
	void register(User user) throws DAOException;
	void deleteUser(User user) throws DAOException;
	void getAllUser() throws DAOException;
	void signOut(String login) throws DAOException;
}
