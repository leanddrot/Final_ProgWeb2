package servicio;

import java.util.List;
import persistencia.dominio.Escuela;
import persistencia.repositorio.EscuelaRepositorio;

public class EscuelaServicio implements IEscuelaServicio {

	EscuelaRepositorio er;

	@Override
	public void guardar(Escuela unaEscuela) {

		er.guardar(unaEscuela);

	}

	
	@Override
	public List<Escuela> listarTodos() {

		return er.listarTodos();
	}

	public EscuelaServicio() {

		er = new EscuelaRepositorio();

	}


	@Override
	public Escuela buscarEscuelaPorId(int id) {
		
		return er.buscarEscuelaPorId(id);
	}

}
