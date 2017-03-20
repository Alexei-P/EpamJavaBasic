package by.epam.tr.lesson14.sportEquipmentShop.dao.impl;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
//import com.mysql.jdbc.Connection;

import by.epam.tr.lesson14.sportEquipmentShop.bean.Equipment;
import by.epam.tr.lesson14.sportEquipmentShop.bean.User;
import by.epam.tr.lesson14.sportEquipmentShop.dao.ConnectorDB;
import by.epam.tr.lesson14.sportEquipmentShop.dao.UserDAO;

public class SQLUserDAO implements UserDAO {
	public ArrayList<User> list = new ArrayList<>();
	public SQLUserDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void signIn(String login, String password) {
		Connection connect = null;
		Statement statement = null;
		try {
			connect = ConnectorDB.getConnection();
			try {
				statement = connect.createStatement();
				ResultSet rs = null;
				try {
					rs = statement.executeQuery("SELECT DISTINCT * FROM user WHERE login='" + login + "'");
					if (rs.next()) {
						String pass = rs.getString(3);
						if (pass.equals(password)){
							statement.execute("UPDATE user SET is_logged = 1 WHERE login='" + login + "'");
							System.out.println("You logged in succesfully!");
						}
						else
							System.out.println("Wrong password!");
					} else
						System.out.println("Wron login!");

				} finally {
					if (rs != null) {
						rs.close();
					} else {
						System.out.println("Error while reading from DB");
					}
				}
			} finally {
				if (statement != null) {
					statement.close();
				} else {
					System.err.println("Statement was not created");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connect != null) {
				try {
					connect.close();
				} catch (SQLException e) {
					System.err.println("Connection error");
				}
			}
		}

	}

	@Override
	public void register(User user) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = ConnectorDB.getConnection();
			try {
				statement = connection.prepareStatement("INSERT INTO user (login, password) VALUES (?,?)");
				// statement.setInt(1, 3);
				statement.setString(1, user.getLogin());
				statement.setString(2, user.getPassword());
				statement.executeUpdate();
			} finally {
				if (statement != null) {
					statement.close();
				} else {
					System.err.println("Statement was not created");
				}
			}
		} catch (SQLException e) {
			System.err.println("Connection was not created");
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(User user) {
	
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = ConnectorDB.getConnection();
			statement = connection.prepareStatement("DELETE FROM user WHERE login = ?");
			statement.setString(1, user.getLogin());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.err.println("Connection was not created");
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.err.println("Statement was not created");
			}
		}

		// TODO Auto-generated method stub

	}
	
	public int getUserId(String login) {
		Connection con = null;
		Statement statement = null;
		int id = 0;
		String query = "SELECT id FROM user WHERE user.login = '"+login+"'";
		try {
			con = ConnectorDB.getConnection();
			statement = con.createStatement();
			ResultSet rs = null;
			try {
				rs = statement.executeQuery(query);
				if (rs.next()) {
					id = rs.getInt(1);
				}
			} finally {
				if (rs != null) {
					rs.close();
				} else {
					System.err.println("Error while reading");
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (statement != null){
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				System.err.println("Statement was not created");
			}
			if (con != null){
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				System.err.println("Connection was not created");
			}
		}

		return id;
	}

	public void getAllUser(){
		Connection con = null;
		Statement st = null;
		try{
			con = ConnectorDB.getConnection();
			st = con.createStatement();
			
			ResultSet rs = null;
			try{
				rs = st.executeQuery("SELECT * FROM user");
				while(rs.next()){
					int id = rs.getInt(1);
					String login = rs.getString(2);
					String pas = rs.getString(3);			
					list.add(new User(id, login, pas));
				}
			} finally{
				if (rs != null){
					rs.close();
				} else{
					System.err.println("Reading error");
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if (con!=null){
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				System.err.println("Connection error");
			}
			if (st!=null){
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
				System.err.print("Statement error");
			}
		}
	}

	@Override
	public void signOut(String login) {		
		try (Connection con = ConnectorDB.getConnection();
				Statement st = con.createStatement();){
			st.executeUpdate("UPDATE user SET is_logged = 0 WHERE login = '"+login+"'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
