package by.epam.tr.lesson14.sportEquipmentShop.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;

import by.epam.tr.lesson14.sportEquipmentShop.bean.Equipment;
import by.epam.tr.lesson14.sportEquipmentShop.bean.Order;
import by.epam.tr.lesson14.sportEquipmentShop.bean.User;
import by.epam.tr.lesson14.sportEquipmentShop.dao.ConnectorDB;
import by.epam.tr.lesson14.sportEquipmentShop.dao.OrderDAO;

public class SQLOrderDAO implements OrderDAO {
	public ArrayList<Order> list = new ArrayList<>();

	@Override
	public void createOrder(Date date, String equipment, String user) {
		SQLEquipmentDAO eqDAO = new SQLEquipmentDAO();
		SQLUserDAO userDAO = new SQLUserDAO();
		int eqId = eqDAO.getEquipmentId(equipment);
		int userId = userDAO.getUserId(user);
		try (Connection con = ConnectorDB.getConnection();
				PreparedStatement ps = con.prepareStatement(
						"INSERT INTO sportequipmentshop.order (date, is_open, equipment_id, user_id) VALUES(?,?,?,?)");) {
			ps.setDate(1, date);
			ps.setBoolean(2, true);
			ps.setInt(3, eqId);
			ps.setInt(4, userId);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void closeOrder(int id) {
		Connection con = null;
		Statement st = null;
		try {
			con = ConnectorDB.getConnection();
			st = con.createStatement();
			st.executeUpdate("UPDATE sportequipmentshop.order SET is_open = false WHERE id = '" + id + "'");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.err.println("Connection error");
			}
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.err.println("Statement error");
			}
		}
	}

	@Override
	public void openOrder(int id) {
		Connection con = null;
		Statement st = null;
		try {
			con = ConnectorDB.getConnection();
			st = con.createStatement();
			st.executeUpdate("UPDATE sportequipmentshop.order SET is_open = true WHERE id = '" + id + "'");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.err.println("Connection error");
			}
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.err.println("Statement error");
			}
		}

	}

	public void deleteOrder(int id) {
		Connection con = null;
		Statement st = null;
		try {
			con = ConnectorDB.getConnection();
			st = con.createStatement();
			st.executeUpdate("DELETE FROM sportequipmentshop.order WHERE id = '" + id + "'");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.err.println("Connection error");
			}
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.err.println("Statement error");
			}
		}

	}

	public void getAllOrders() {
		Connection con = null;
		Statement st = null;
		try {
			con = ConnectorDB.getConnection();
			st = con.createStatement();

			ResultSet rs = null;
			try {
				rs = st.executeQuery(
						"SELECT sportequipmentshop.order.id, date, is_open, equipment_id, user_id, user.login, "
						+ "user.password, equipment.name, equipment.price, equipment.cost "
						+ "FROM sportequipmentshop.order "
						+ "JOIN sportequipmentshop.equipment ON sportequipmentshop.order.equipment_id = equipment.id "
						+ "JOIN sportequipmentshop.user ON sportequipmentshop.order.user_id = user.id");
				while (rs.next()) {
					int id = rs.getInt(1);
					Date date = rs.getDate(2);
					boolean is_open = rs.getBoolean(3);
					int eq_id = rs.getInt(4);
					int user_id = rs.getInt(5);
					String login = rs.getString(6);
					String pas = rs.getString(7);
					String eq_name = rs.getString(8);
					double eq_price = rs.getDouble(9);
					double eq_cost = rs.getDouble(10);
					list.add(new Order(id, date, is_open, new Equipment(eq_id, eq_name, eq_cost, eq_price), new User(user_id, login, pas)));
				}
			} finally {
				if (rs != null) {
					rs.close();
				} else {
					System.err.println("Reading error");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.err.println("Connection error");
			}
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.err.print("Statement error");
			}
		}
	}

}
