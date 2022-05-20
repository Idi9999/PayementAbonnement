package Dao;

import java.util.List;

import entities.User;



public interface IUserDao {
	
	public User save(User p);

	public User getConnexion(String pseudo, String password);

	public List<User> UserParMC(String mc);
	
	public List<User> getAllUsers();

	public User getUser(int id);

	public User updateUser(User p);

	public void deleteUser(int id);
}