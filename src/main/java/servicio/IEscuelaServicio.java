package servicio;

import java.util.List;

import persistencia.dominio.Escuela;

public interface IEscuelaServicio {

	void guardar(Escuela unaEscuela);

	List<Escuela> listarTodos();

	Escuela buscarEscuelaPorId (int id);
}
