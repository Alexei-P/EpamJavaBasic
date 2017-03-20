package by.epam.tr.lesson14.sportEquipmentShop.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import by.epam.tr.lesson14.sportEquipmentShop.bean.Equipment;
import by.epam.tr.lesson14.sportEquipmentShop.dao.ConnectorDB;
import by.epam.tr.lesson14.sportEquipmentShop.dao.EquipmentDAO;

public class SQLEquipmentDAO implements EquipmentDAO {
	ArrayList<Equipment> list = new ArrayList<Equipment>();
	public SQLEquipmentDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addEquipment(Equipment e) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = ConnectorDB.getConnection();
			ps = connection.prepareStatement("INSERT INTO equipment (name, cost, price) VALUES(?,?,?)");
			ps.setString(1, e.getName());
			ps.setDouble(2, e.getCost());
			ps.setDouble(3, e.getPrice());
			ps.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e1) {

					e1.printStackTrace();
				}
			} else {
				System.err.println("Connection was not established");
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e1) {

					e1.printStackTrace();
				}
			} else {
				System.err.println("Statement was not created");
			}
		}

	}

	@Override
	public void deleteEquipment(Equipment e) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = ConnectorDB.getConnection();
			ps = connection.prepareStatement("DELETE FROM equipment WHERE name = ?");
			ps.setString(1, e.getName());
			ps.executeUpdate();
		} catch (SQLException e1) {

			e1.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e1) {

					e1.printStackTrace();
				}
			} else {
				System.err.println("Connection was not established");
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e1) {

					e1.printStackTrace();
				}
			} else {
				System.err.println("Statement was not prepared");
			}

		}

	}

	@Override
	public void deleteByID(int id) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = ConnectorDB.getConnection();
			ps = connection.prepareStatement("DELETE FROM equipment WHERE id = ?");
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e1) {

			e1.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e1) {

					e1.printStackTrace();
				}
			} else {
				System.err.println("Connection was not established");
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e1) {

					e1.printStackTrace();
				}
			} else {
				System.err.println("Statement was not prepared");
			}

		}

	}

	public int getEquipmentId(String name) {
		Connection con = null;
		Statement statement = null;
		int id = 0;
		String query = "SELECT id FROM equipment WHERE equipment.name = '"+name+"'";
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

	public void getAllEquipment(){
		
		Connection con = null;
		Statement st = null;
		try{
			con = ConnectorDB.getConnection();
			st = con.createStatement();
			
			ResultSet rs = null;
			try{
				rs = st.executeQuery("SELECT * FROM equipment");
				while(rs.next()){
					int id = rs.getInt(1);
					String name = rs.getString(2);
					double cost = rs.getDouble(3);
					double price = rs.getDouble(4);
					list.add(new Equipment(id, name, cost, price));
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
}
