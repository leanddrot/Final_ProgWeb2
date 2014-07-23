package persistencia.repositorio;

import java.util.List;

import persistencia.dominio.Escuela;
public interface IEscuelaRepositorio {

	void guardar(Escuela unaEscuela);

	List<Escuela> listarTodos();

	Escuela buscarEscuelaPorId (int id);
	
}
