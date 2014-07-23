package servicio;

import java.util.List;

import persistencia.dominio.Profesor;
import persistencia.repositorio.ProfesorRepositorio;

public class ProfesorServicio implements IProfesorServicio {

	ProfesorRepositorio pr;

	@Override
	public void guardar(Profesor unProfesor) {

		pr.guardar(unProfesor);

	}

	
	@Override
	public List<Profesor> listarTodos() {

		List<Profesor> profesorList = pr.listarTodos();

		return profesorList;
	}

	public ProfesorServicio() {

		pr = new ProfesorRepositorio();

	}


	@Override
	public Profesor buscarProfesorPorApellido(String apellido) {
		
		return pr.buscarProfesorPorApellido(apellido);
	}

}
