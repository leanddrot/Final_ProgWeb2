package persistencia.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Escuela {
	
	@Id
	long id;
	String nombre;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Escuela [id=" + id + ", nombre=" + nombre + "]";
	}
	
	

}
