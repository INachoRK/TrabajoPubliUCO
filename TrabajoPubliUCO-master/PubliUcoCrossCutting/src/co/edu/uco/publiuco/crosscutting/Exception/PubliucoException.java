package co.edu.uco.publiuco.crosscutting.Exception;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;

public class PubliucoException extends RuntimeException {
	
	private static final long serialVersionUID = -1364814498970458340L;
	private ExceptionType type;
	private String usermessage;
		
	protected PubliucoException(String technicalMessage, String userMessage, Throwable rootCause, ExceptionType type) {
		super(technicalMessage, rootCause);
		setUserMessage(userMessage);
		setType(type);
	}
	
	public final String getTechnicalMessage() {
		return UtilText.getUtilText().getDefaultEmpty(getMessage(), getUsermessage());
	}
	
	public final Throwable getRootCause() {
		return UtilObject.getDefault(getCause(), new Exception());
	}

	public ExceptionType getType() {
		return type;
	}

	public void setType(ExceptionType type) {
		this.type = type;
	}

	public String getUsermessage() {
		return usermessage;
	}

	public final void setUserMessage(final String usermessage) {
		this.usermessage = UtilText.getUtilText().getDefault(usermessage);
	}
	
	
	
}
