package models.DAO.mem;

import models.DAO.DAOFactory;
import models.DAO.IRoundDAO;
import models.DAO.IUserDAO;

public class MemDAOFactory extends DAOFactory {

	public MemDAOFactory() {
		DAOFactory.setInstance(this);
	}

	@Override
	public IUserDAO getUserDAO() {
		return new MemUserDAO();
	}

	@Override
	public IRoundDAO getRoundDAO() {
		return new MemRoundDAO();
	}

}
