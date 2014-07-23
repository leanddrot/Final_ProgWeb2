package persistencia.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import persistencia.dominio.Profesor;

public class ProfesorRepositorio implements IProfesorRepositorio {

	EntityManager em;
	EntityManagerFactory factory;

	@Override
	public void guardar(Profesor unProfesor) {

		abrirConexion();
		em.persist(unProfesor);
		cerrarConexion();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Profesor> listarTodos() {

		abrirConexion();
		Query jpql1 = em.createQuery("SELECT p FROM Profesor p");
		List<Profesor> profesorList = jpql1.getResultList();
		cerrarConexion();
		return profesorList;
	}

	private void abrirConexion() {

		factory = Persistence.createEntityManagerFactory("Final",
				System.getProperties());
		em = factory.createEntityManager();
		em.getTransaction().begin();

	}

	private void cerrarConexion() {
		em.flush();
		em.getTransaction().commit();
	}

	@Override
	public Profesor buscarProfesorPorApellido(String apellido) {
		
		abrirConexion();
		
		Query jpql2 = em
                .createQuery("SELECT p FROM Profesor p WHERE p.apellido = :PROFESOR_APELLIDO");
        jpql2.setParameter("PROFESOR_APELLIDO", apellido);
        
        Profesor unProfesor = (Profesor) jpql2.getSingleResult();
        		
        cerrarConexion();
		return unProfesor;
		
	}
}
