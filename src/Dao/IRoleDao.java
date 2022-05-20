package Dao;

import entities.Role;
import entities.User;

public interface IRoleDao {
	
	public Role save(Role p);
	public Role getRole(int id);

	public Role updateRoler(Role p);

	public void deleteRole(int id);

}
