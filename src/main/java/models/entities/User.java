package models.entities;

import java.util.HashMap;
import java.util.Map;

public class User {

	private int id;
	private String username;
	private Map<Integer, Round> rounds = new HashMap<Integer, Round>();

	public User() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Map<Integer, Round> getRounds() {
		return rounds;
	}

	public void setRounds(Map<Integer, Round> rounds) {
		this.rounds = rounds;
	}

}
