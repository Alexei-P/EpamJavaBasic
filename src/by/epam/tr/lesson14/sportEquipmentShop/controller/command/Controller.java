package by.epam.tr.lesson14.sportEquipmentShop.controller.command;

public final class Controller {
	private final CommandProvider provider = new CommandProvider();
	
	private final char paramDelimeter = ' ';
	public String executeTask(String request){
		String commandName;
		Command executionCommand;
		
		commandName = request.substring(0, request.indexOf(paramDelimeter));
		executionCommand = provider.getCommand(commandName);
		
		String response;
		response = executionCommand.execute(request);
		
		return response;
	}
	
	public void init(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
}
