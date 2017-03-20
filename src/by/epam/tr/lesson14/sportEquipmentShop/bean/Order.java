package by.epam.tr.lesson14.sportEquipmentShop.bean;

import java.io.Serializable;
import java.sql.Date;

public class Order implements Serializable{
	private int id;
	private Date date;
	private Equipment equipment;
	private User user;
	private boolean isOpen;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Equipment getEquipment() {
		return equipment;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((equipment == null) ? 0 : equipment.hashCode());
		result = prime * result + id;
		result = prime * result + (isOpen ? 1231 : 1237);
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (equipment == null) {
			if (other.equipment != null)
				return false;
		} else if (!equipment.equals(other.equipment))
			return false;
		if (id != other.id)
			return false;
		if (isOpen != other.isOpen)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", equipment=" + equipment + ", user=" + user + ", isOpen="
				+ isOpen + "]";
	}
	public Order(int id, Date date, boolean isOpen, Equipment equipment, User user) {
		this.id = id;
		this.date = date;
		this.equipment = equipment;
		this.user = user;
		this.isOpen = isOpen;
	}
	
	
}
