package co.edu.uco.publiuco.crosscutting.utils;

import java.sql.Connection;

import co.edu.uco.publiuco.crosscutting.utils.Messages.UtilSqlMessages;

public final class UtilSql {
	
	private UtilSql() {
		super();
	}
	
	public static boolean connectionIsOpen(final Connection connection) {
		if(UtilObject.isNull(connection)) {
			throw PubliucoCrossCuttingException.create("No es posible validar si una conexión está abierta cuando se encuentra nula") {
				
			}
			
			try {
				return !connection.isClosed();
			}catch (final SQLException exception) {
				var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
				var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION;
				throw PubliucoCrossCuttingException.create(technicalMessage, userMessage, exception);
			}catch (final SQLException exception) {
				var userMessage = "Se ha presentado un problema tratando validar si una conexión con la fuente de información estaba o no abierta...";
				var technicalMessage = "Se ha presentado una excepción de tipo SQLException trata"
			}
		}
	}

}
