package models.DAO.mem;

import models.DAO.IRoundDAO;
import models.entities.Round;

public class MemRoundDAO extends MemGenericDAO<Round, Integer> implements IRoundDAO {

	@Override
	protected Integer getID(Round entity) {
		return entity.getId();
	}


}
