package co.edu.uco.publiuco.data.dao.factory;

import co.edu.uco.publiuco.data.dao.EstadoTipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.TipoRelacionInstitucionDAO;

public abstract class DAOFactory {

	public static void getFactory(final Factory factory) {
		
		SqlServerDAOFactory daoFactory;
		
		DAOFactory daoFactory;
		
		switch (factory) {
		case SQLSERVER: {
			daoFactory = new SqlServerDAOFactory();
			break;
		}
		case POSTGRESQL:{
			daoFactory = new Post
			break;
		}default:
			throw new IllegalArgumentException("Unexpected value: "+factory);

	}}
	

	protected abstract void abrirConexion();

	public abstract void cerrarConexion();

	public abstract void iniciarTransaccion();

	public abstract void confirmarTransaccion();

	public abstract void cancelarTransaccion();

	public abstract EstadoTipoRelacionInstitucionDAO getEstadoTipoRelacionInstitucionDAO();

	public abstract TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO();
}