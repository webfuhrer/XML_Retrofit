import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class ClasePrincipal {

	public static void main(String[] args) {
		Retrofit retrofit=new Retrofit.Builder().
				baseUrl("http://www.aemet.es/xml/").
				addConverterFactory(SimpleXmlConverterFactory.create())
				.build();
		ServicioAEMET servicio=retrofit.create(ServicioAEMET.class);
		Call<Raiz> llamada=servicio.pedirClima();
		llamada.enqueue(new Callback<Raiz>() {
			
			@Override
			public void onResponse(Call<Raiz> call, Response<Raiz> response) {
			Raiz r=response.body();
			System.out.println("Datos: "+r);
				
			}
			
			@Override
			public void onFailure(Call<Raiz> call, Throwable t) {
				System.out.println("error: "+t.getLocalizedMessage());
				
			}
		});
	}

}
