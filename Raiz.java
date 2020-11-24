import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name="root", strict=false)
public class Raiz {
	@Element
	private String nombre;
	@ElementList
	private List<Dia> prediccion;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Dia> getPrediccion() {
		return prediccion;
	}

	public void setPrediccion(List<Dia> prediccion) {
		this.prediccion = prediccion;
	}

	@Override
	public String toString() {
		return "Raiz [nombre=" + nombre + ", prediccion=" + prediccion + "]";
	}

	
	
	
	
}
