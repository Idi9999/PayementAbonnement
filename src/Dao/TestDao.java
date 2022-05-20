package Dao;

import entities.Role;
import entities.User;

public class TestDao {
	public static void main(String[] args) {

		UserDaoImpl pdao = new UserDaoImpl();
		RoleDaoImpl r = new RoleDaoImpl();
		
		Role role = r.getRole(1);
		
		User user = new User();
		user.setNom("Seydou");
		user.setPrenom("Traore");
		user.setEmail("Seydou99@gmail.com");
		user.setPassword("azerty");
		user.setPhone("06003637728");
		user.setRole(role);
		
		
		pdao.save(user);
		

		//User prod = pdao.save(new User("Salam", "Idi", "salam07@gmail.com", "azerty", "06000000"));
		
		//System.out.print(prod.getNom());
		//pdao.deleteUser(3);

		/*User user =pdao.getUser(1);
		System.out.print(user);
		System.out.print(user.getRole());
		*/
		
	}
}
