package co.edu.uco.publiuco.crosscutting.Exception;

public class PubliucoDataException extends PubliucoException {

	private static final long serialVersionUID = 2293953275272930755L;
	
	private PubliucoDataException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.DATA);
	}
	
	public static PubliucoBusinessException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new PubliucoDataException(technicalMessage, userMessage, rootCause);
	}
	
	public static PubliucoBusinessException create(final String userMessage) {
		return new PubliucoDataException(userMessage, userMessage, new Exception());
	}
	
	public static PubliucoBusinessException create (final String technicalMessage, final userMessage) {
		return new PubliucoDataException(technicalMessage, userMessage, new Exception());
	}
	
}
