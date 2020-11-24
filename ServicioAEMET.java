import retrofit2.Call;
import retrofit2.http.GET;

public interface ServicioAEMET {
	@GET("municipios/localidad_03005.xml")
	Call<Raiz> pedirClima();
}
