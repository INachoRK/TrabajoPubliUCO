package co.edu.uco.publiuco.crosscutting.exception;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;

public class PubliUcoException extends RuntimeException {

	private ExceptionType type;
	private String userMessage;
	
	protected PubliUcoException(String technicalMessage, String userMessage, Throwable rootCause, ExceptionType type) {
	super(technicalMessage, rootCause);
	setUserMessage(userMessage);
	setType(type);
}

	public final String getTehnicalMessage() {
		return UtilText.getUtilText().getDefaultIfEmpty(getMessage(), getUserMessage());
	}
	
	public ExceptionType getType() {
		return type;
	}

	private final void setType(ExceptionType type) {
		this.type = UtilObject.getDefault(type, ExceptionType.GENERAL);
	}

	public final Throwable getRootCause() {
		return UtilObject.getDefault(getCause(), new Exception());
	}
	
	
	public String getUserMessage() {
		return userMessage;
	}

	public void setUserMessage(String userMessage) {
		this.userMessage = UtilText.getUtilText().getDefault(userMessage);
	}
}