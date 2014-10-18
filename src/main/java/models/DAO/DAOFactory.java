package models.DAO;


public abstract class DAOFactory {

	private static DAOFactory factory;

	protected DAOFactory() {
	}
	
	public static void setInstance(DAOFactory factory){
		DAOFactory.factory = factory;
	}

	public static DAOFactory getInstance() {
		assert factory != null;
		return factory;
	}

	public abstract IUserDAO getUserDAO();

	public abstract IRoundDAO getRoundDAO();

}
