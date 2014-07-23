package web;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import persistencia.dominio.Escuela;
import persistencia.dominio.Profesor;
import servicio.EscuelaServicio;
import servicio.IEscuelaServicio;
import servicio.IProfesorServicio;
import servicio.ProfesorServicio;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"beans.xml");
		Profesor Profesor01 = applicationContext.getBean("Profesor01",
				Profesor.class);
		Profesor Profesor02 = applicationContext.getBean("Profesor02",
				Profesor.class);
		Escuela escuela05 = applicationContext.getBean("Escuela05",
				Escuela.class);
		Escuela escuela06 = applicationContext.getBean("Escuela06",
				Escuela.class);

		IProfesorServicio ps = new ProfesorServicio();
		ps.guardar(Profesor01);
		ps.guardar(Profesor02);

		List<Profesor> profesorList = ps.listarTodos();
		System.out.println();
		System.out.println("Listando todos los profesores...");
		System.out.println("Tamaño lista: " + profesorList.size());
		System.out.println();
		for (Profesor profesor : profesorList) {
			System.out.println(profesor.toString());
		}

		IEscuelaServicio es = new EscuelaServicio();
		es.guardar(escuela05);
		es.guardar(escuela06);

		List<Escuela> escuelaList = es.listarTodos();

		System.out.println();
		System.out.println("Listando todas las escuelas...");
		System.out.println("Tamaño lista: " + escuelaList.size());
		System.out.println();
		for (Escuela escuela : escuelaList) {
			System.out.println(escuela.toString());
		}

		System.out.println();
		System.out.println("Busqueda de Escuelas");
		System.out.println("--------------------");
		System.out.println();

		System.out.println("Id de Escuela a buscar?");
		String entradaTeclado = "";
		Scanner entradaEscaner = new Scanner(System.in);
		entradaTeclado = entradaEscaner.nextLine();
		int idEscuela = Integer.parseInt(entradaTeclado);

		System.out.println("Listando la escuela con id: " + idEscuela);

		Escuela unaEscuela = es.buscarEscuelaPorId(idEscuela);
		System.out.println(unaEscuela.toString());

	}
}
