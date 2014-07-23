package servicio;

import java.util.List;

import persistencia.dominio.Profesor;

public interface IProfesorServicio {

	void guardar(Profesor unProfesor);

	List<Profesor> listarTodos();
	
	Profesor buscarProfesorPorApellido (String apellido);

}
