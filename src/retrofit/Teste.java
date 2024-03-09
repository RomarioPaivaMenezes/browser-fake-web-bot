package retrofit;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class Teste {

	public static void main(String[] args) {
		
	  final Map<String,String> fieldMap = new HashMap<>();

      fieldMap.put("a","5");
      fieldMap.put("from","GBP");
      fieldMap.put("to","USD");

      RequestBody requestBody = RequestBody.create(MediaType.parse("text/plain"), "");
      final Retrofit retrofit = new Retrofit.Builder()
               .baseUrl("https://fofocalheia.com.br")
               .build();

         final ConversionService wService = retrofit.create(ConversionService.class);
         Call<ResponseBody> data  = wService.convertCurrency(fieldMap);

         data.enqueue(new Callback<ResponseBody>() {
             @Override
             public void onResponse(Call<ResponseBody> call, retrofit2.Response<ResponseBody> response) {
                String resp = "";

                if ( response.body() != null ) {
                	 /**  try {
                     resp = response.body().string();
                      int index = resp.indexOf("currency_converter_result" );
                      int end = resp.indexOf("</span>", index );
                      String result = resp.substring(index, end);
                   } catch ( IOException e) {
                   }*/
                   System.out.println("conectou");
                }
             }

             @Override
             public void onFailure(Call<ResponseBody> call, Throwable t) {
            	 System.out.println("Failure");
             }
          });

   }

}
