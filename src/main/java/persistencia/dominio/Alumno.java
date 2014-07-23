package persistencia.dominio;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "AL")
public class Alumno extends Persona{
	
	String turno;

}
