package teste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Proxy;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.cert.Certificate;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;

public class TesteClientHttp2 {
	
	public static void main(String[] args) {
	
		/*String url = "http://www.google.com/",
			       proxy = "proxy.mydomain.com",
			       port = "8080";
			URL server = new URL(url);
			Properties systemProperties = System.getProperties();
			systemProperties.setProperty("http.proxyHost",proxy);
			systemProperties.setProperty("http.proxyPort",port);
			HttpURLConnection connection = (HttpURLConnection)server.openConnection();
			connection.connect();
			InputStream in = connection.getInputStream();
			readResponse(in);*/
			
		/*for (int i = 0; i < 20; i++) {
			Thread r = new Thread(new TesteClientHttpTread());
			r.run();
		}*/
	
		
		URL url;
		try {
			url = new URL("https://fofocalheia.com.br");
			HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
			httpConn.addRequestProperty("User-Agent",
					"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36");
			
			httpConn.connect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// use the client to send the request
		//var response = client.send(request, new JsonBodyHandler<>(APOD.class));

		// the response:
		//System.out.println(response.body().get().title);
	}

	
	   private void testIt(){

	      String https_url = "https://www.fofocalheia.com.br";
	      URL url;
	      try {

	    	  Proxy proxy = new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress("65.108.230.239", 38543));
	          
	    	 Properties systemProperties = System.getProperties();
				systemProperties.setProperty("http.proxyHost","65.108.230.239");
				systemProperties.setProperty("http.proxyPort","38543");
				
		     url = new URL(https_url);
		     HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
				
		     con.addRequestProperty("User-Agent", 
		    		 "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		     
		     //dumpl all cert info
		     print_https_cert(con);
				
		     //dump all the content
		     //print_content(con);
				
	      } catch (MalformedURLException e) {
		     e.printStackTrace();
	      } catch (IOException e) {
		     e.printStackTrace();
	      }

	   }
		
	   private void print_https_cert(HttpsURLConnection con){
	     
	    if(con!=null){
				
	      try {
					
		System.out.println("Response Code : " + con.getResponseCode());
		System.out.println("Cipher Suite : " + con.getCipherSuite());
		System.out.println("\n");
					
		Certificate[] certs = con.getServerCertificates();
		for(Certificate cert : certs){
		   System.out.println("Cert Type : " + cert.getType());
		   System.out.println("Cert Hash Code : " + cert.hashCode());
		   System.out.println("Cert Public Key Algorithm : " 
	                                    + cert.getPublicKey().getAlgorithm());
		   System.out.println("Cert Public Key Format : " 
	                                    + cert.getPublicKey().getFormat());
		   System.out.println("\n");
		}
					
		} catch (SSLPeerUnverifiedException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}

	     }
		
	   }
		
	   private void print_content(HttpsURLConnection con){
		if(con!=null){
				
		try {
			
		   System.out.println("****** Content of the URL ********");			
		   BufferedReader br = 
			new BufferedReader(
				new InputStreamReader(con.getInputStream()));
					
		   String input;
					
		   while ((input = br.readLine()) != null){
		      System.out.println(input);
		   }
		   br.close();
					
		} catch (IOException e) {
		   e.printStackTrace();
		}
				
	       }
			
	   }
		
	}


