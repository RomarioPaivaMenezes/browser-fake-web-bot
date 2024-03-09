package teste;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TesteClientHttp {
	
	public static void main(String[] args) {
	
		for (int i = 0; i < 20; i++) {
			// Create a neat value object to hold the URL
			URL url;
			try {
				url = new URL("https://fofocalheia.com.br/veja-quem-foram-as-brasileiras-que-se-destacaram-no-paris-fashion-week/");
				// Open a connection(?) on the URL(??) and cast the response(???)
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.connect();
				
				System.out.println("Conexão: "+i);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			
		}
	
		// use the client to send the request
		//var response = client.send(request, new JsonBodyHandler<>(APOD.class));

		// the response:
		//System.out.println(response.body().get().title);
	}

}
