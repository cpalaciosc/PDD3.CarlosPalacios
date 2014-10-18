package models.DAO.mem;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import models.DAO.IGenericDAO;

public abstract class MemGenericDAO<T, ID> implements IGenericDAO<T, ID> {
	
	private TreeMap<ID, T> list =  new TreeMap<ID, T>();
	
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
		return new ArrayList<T>(this.list.values());
	}

	public List<T> findAll(int index, int size) {
		List<T> array = new ArrayList<T>(this.list.values());
		return array.subList(index, (index+size)-1);
	}

	protected abstract ID getID(T entity);

}
