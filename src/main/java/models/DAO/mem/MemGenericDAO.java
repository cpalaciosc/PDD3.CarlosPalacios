package models.DAO.mem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import models.DAO.IGenericDAO;

public abstract class MemGenericDAO<T, ID> implements IGenericDAO<T, ID> {
	
	private Map<ID, T> list =  new HashMap<ID, T>();
	
	public void create(T entity) {
		this.list.put(this.getID(entity), entity);
	}

	public T read(ID id) {
		return list.get(id);
	}

	public void update(T entity) {
		this.delete(entity);
		this.list.put(this.getID(entity), entity);

	}

	public void delete(T entity) {
		this.list.remove(this.getID(entity));

	}

	public void deleteByID(ID id) {
		this.list.remove(id);

	}

	public List<T> findAll() {
		return null;
	}

	public List<T> findAll(int index, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	protected abstract ID getID(T entity);

}
