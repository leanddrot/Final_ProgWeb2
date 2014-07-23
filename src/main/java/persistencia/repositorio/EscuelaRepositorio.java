package persistencia.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import persistencia.dominio.Escuela;


public class EscuelaRepositorio implements IEscuelaRepositorio {

	EntityManager em;
	EntityManagerFactory factory;

	@Override
	public void guardar(Escuela unaEscuela) {
		abrirConexion();
		em.persist(unaEscuela);
		cerrarConexion();
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Escuela> listarTodos() {
		
		abrirConexion();
		Query jpql1 = em.createQuery("SELECT e FROM Escuela e order by e.id asc");
		List<Escuela> escuelaList = jpql1.getResultList();
		cerrarConexion();
		return escuelaList;
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
	public Escuela buscarEscuelaPorId(int id) {
		
		abrirConexion();
		
		Query jpql2 = em
                .createQuery("SELECT e FROM Escuela e WHERE e.id = :ESCUELA_ID");
        jpql2.setParameter("ESCUELA_ID", id);
        
        Escuela unaEscuela = (Escuela) jpql2.getSingleResult();
        		
        cerrarConexion();
		return unaEscuela;
	}

	
}
