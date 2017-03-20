package by.epam.tr.lesson14.sportEquipmentShop.controller.command;

import java.util.HashMap;
import java.util.Map;

import by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl.AddEquipment;
import by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl.CloseOrder;
import by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl.CreateOrder;
import by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl.DeleteEquipmentById;
import by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl.DeleteUser;
import by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl.GetAllEquipment;
import by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl.GetAllUsers;
import by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl.OpenOrder;
import by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl.RegisterUser;
import by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl.SignIn;
import by.epam.tr.lesson14.sportEquipmentShop.controller.command.impl.SignOut;

public class CommandProvider {
	private final Map<CommandName, Command> repository = new HashMap<>();

	CommandProvider() {
		repository.put(CommandName.ADD_EQUIPMENT, new AddEquipment());
		repository.put(CommandName.CLOSE_ORDER, new CloseOrder());
		repository.put(CommandName.CREATE_ORDER, new CreateOrder());
		repository.put(CommandName.DELETE_EQUIPMENT_BY_ID, new DeleteEquipmentById());
		repository.put(CommandName.DELETE_USER, new DeleteUser());
		repository.put(CommandName.GET_ALL_EQUIPMENT, new GetAllEquipment());
		repository.put(CommandName.OPEN_ORDER, new OpenOrder());
		repository.put(CommandName.GET_ALL_USERS, new GetAllUsers());
		repository.put(CommandName.REGISTER, new RegisterUser());
		repository.put(CommandName.SIGN_IN, new SignIn());
		repository.put(CommandName.SIGN_OUT, new SignOut());
	}

	Command getCommand(String name) {
		CommandName commandName = null;
		Command command = null;
		try {
			commandName = CommandName.valueOf(name.toUpperCase());
			command = repository.get(commandName);
		} catch (IllegalArgumentException | NullPointerException e) {
			command = repository.get(CommandName.WRONG_REQUEST);
		}
		return command;
	}

}
