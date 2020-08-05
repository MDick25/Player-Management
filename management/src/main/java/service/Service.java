package service;

public enum Service {
	SAVE("Save", "Model save service"),
	UPDATE("UPDATE", "Model update service"),
	DELETE("DELETE", "Model delete service");
	
	private final String value;
	
	private final String description;
	
	Service(String value, String description){
		this.value = value;
		this.description = description;
	}
	public String getValue() {
		return value;
	}
	public String getDescription() {
		return description;
	}
}
