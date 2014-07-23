package persistencia.dominio;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue(value = "PR")
public class Profesor extends Persona {

	@Temporal(value = TemporalType.DATE)
	Date fechaIngreso;
	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	List<Escuela> escuelas;

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public List<Escuela> getEscuelas() {
		return escuelas;
	}

	public void setEscuelas(List<Escuela> escuelas) {
		this.escuelas = escuelas;
	}

	@Override
	public String toString() {
		return  "Profesor [" +
				" id=" + id + 
				", tipoDoc=" + tipoDoc 	+ 
				", nroDoc=" + nroDoc + 
				", nombre=" + nombre + 
				", apellido=" + apellido + 
				", fechaIngreso=" + fechaIngreso + 
				", escuelas=" + escuelas + 
				"]";
	}

}
