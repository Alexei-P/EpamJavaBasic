package by.epam.tr.lesson14.sportEquipmentShop.service.factory;

import by.epam.tr.lesson14.sportEquipmentShop.service.*;
import by.epam.tr.lesson14.sportEquipmentShop.service.impl.AdminServiceImpl;
import by.epam.tr.lesson14.sportEquipmentShop.service.impl.ClientServiceImpl;
import by.epam.tr.lesson14.sportEquipmentShop.service.impl.EquipmentServiceImpl;
import by.epam.tr.lesson14.sportEquipmentShop.service.impl.OrderServiceImpl;

public class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();
	
	private ServiceFactory(){}
	
	private final AdminService adminService = new AdminServiceImpl();
	private final ClientService clientService = new ClientServiceImpl();
	private final EquipmentService equipmentService = new EquipmentServiceImpl();
	private final OrderService orderService = new OrderServiceImpl();
	
	public static ServiceFactory getInstance(){
		return instance;
	}
	
	public AdminService getAdminService(){
		return adminService;
	}	
	public ClientService getClientService(){
		return clientService;
	}
	public EquipmentService getEquipmentService(){
		return equipmentService;
	}
	public OrderService getOrderService(){
		return orderService;
	}
}
