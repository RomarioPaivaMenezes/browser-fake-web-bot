package retrofit;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface ConversionService {

   @GET("/fashion")
   Call<ResponseBody> convertCurrency(@QueryMap Map<String,String> queryMap);
}