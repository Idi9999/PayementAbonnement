package web;

import java.util.ArrayList;
import java.util.List;

import entities.User;


public class userModele {
	private String motCle;
	
	List<User> users = new ArrayList<>();

	public String getMotCle() {
		return motCle;
	}

	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
