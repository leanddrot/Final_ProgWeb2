package persistencia.repositorio;

import java.util.List;

import persistencia.dominio.Profesor;

public interface IProfesorRepositorio {

	void guardar(Profesor unProfesor);

	List<Profesor> listarTodos();

	
}
