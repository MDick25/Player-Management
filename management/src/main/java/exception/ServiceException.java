package exception;

import service.Service;

public class ServiceException extends Exception {
	
	private String errorMessage;
	private final String serviceMessage;
	
	public ServiceException(String errorMessage, Service service) {
		super(errorMessage);
		this.serviceMessage = serviceMessageGenerator(service);
	}
	public String serviceMessageGenerator(Service service) {
		return "Error found at " + service.getDescription() + ".";
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public String getServiceManager() {
		return serviceMessage;
	}

}
