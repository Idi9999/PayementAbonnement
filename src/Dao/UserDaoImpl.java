package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import entities.User;
import util.JPAutil;

public class UserDaoImpl implements IUserDao  {
	private EntityManager entityManager = JPAutil.getEntityManager("payement_abonne");

	@Override
	public User save(User p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(p);
		tx.commit();
		return p;
	}

	@Override
	public User getConnexion(String email, String password) {
		TypedQuery<User> query = entityManager.createQuery("from User as p where p.email=?1 and p.password=?2", User.class);
		query.setParameter(1, email);
		query.setParameter(2, password);
		
		User user = query.getSingleResult();
		return user;
	}

	@Override
	public List<User> UserParMC(String mc) {
		List<User> prods = entityManager.createQuery("select p from User p where p.pseudo like :mc")
				.setParameter("mc", "%" + mc + "%").getResultList();
		return prods;
	}
	

	@Override
	public User getUser(int id) {
		return entityManager.find(User.class, id);
	}

	@Override
	public User updateUser(User p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.merge(p);
		tx.commit();
		return p;
	}

	@Override
	public void deleteUser(int i) {
		User user = entityManager.find(User.class, i);
		entityManager.getTransaction().begin();
		entityManager.remove(user);
		entityManager.getTransaction().commit();
		
	}

	@Override
	public List<User> getAllUsers() {
		List<User> prods = entityManager.createQuery("select p from User p").getResultList();
		return prods;
	}
}
