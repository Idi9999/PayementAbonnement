package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entities.Role;
import entities.User;
import util.JPAutil;

public class RoleDaoImpl implements IRoleDao{
	private EntityManager entityManager = JPAutil.getEntityManager("payement_abonne");

	@Override
	public Role save(Role p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(p);
		tx.commit();
		return p;
	}

	@Override
	public Role getRole(int id) {
		return entityManager.find(Role.class, id);
	}

	@Override
	public Role updateRoler(Role p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.merge(p);
		tx.commit();
		return p;
	}

	@Override
	public void deleteRole(int id) {
		Role role = entityManager.find(Role.class, id);
		entityManager.getTransaction().begin();
		entityManager.remove(role);
		entityManager.getTransaction().commit();
	}
	
	

}
