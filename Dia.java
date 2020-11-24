import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict=false)
public class Dia {
	@Attribute
	private String fecha;
	@Element
	private Temperatura temperatura;
	@Override
	public String toString() {
		return "Dia [fecha=" + fecha + ", temperatura=" + temperatura + "]";
	}
	
	

}
