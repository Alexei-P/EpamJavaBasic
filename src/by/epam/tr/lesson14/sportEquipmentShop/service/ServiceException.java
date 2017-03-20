package by.epam.tr.lesson14.sportEquipmentShop.service;

public class ServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceException() {
		// TODO Auto-generated constructor stub
	}

	public ServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ServiceException(Exception cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public ServiceException(String message, Exception cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ServiceException(String message, Exception cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
