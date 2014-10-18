package models.DAO.mem;

import models.DAO.IUserDAO;
import models.entities.User;

public class MemUserDAO extends MemGenericDAO<User, Integer> implements IUserDAO{

	@Override
	protected Integer getID(User entity) {
		return entity.getId();
	}

}
