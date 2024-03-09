package api.hotmart.metodo.search;

import java.io.IOException;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;
import okhttp3.internal.http2.Header;

public class ResquestHotmart {
	
	@Provider
	public class MyContainerRequestFilter implements ContainerRequestFilter {

	    @Override
	    public void filter(ContainerRequestContext requestContext) throws IOException {
	        requestContext.getHeaders().add("header", "value");
	    }
	}
	

	public static void main(String[] args) {
		
		Client client = ClientBuilder.newBuilder()
                .property("connection.timeout", 100)
                .build();
		
		JsonObject json = new JsonObject();
		json.addProperty("name", "");
		json.addProperty("rows", 20);
		json.addProperty("locale", "PT_BR");
		json.addProperty("page", "1");
		json.addProperty("userSessionId", "GA1.2.1671460792.1680122838");
		
		WebTarget myResource = client.target("https://api-affiliation-market.hotmart.com/v1/market/search");
		JsonObject response = (JsonObject) myResource.request(MediaType.APPLICATION_JSON)
        		 .header("Authorization", "Bearer H4sIAAAAAAAAAH1SyZKjOhD8Ik%2BAbIx9ZB8wkhosFnHpYLFBYvECNsvXD%2B547zCXOVQoFFXKSmXmZXaqzMoZZs45WGwRMbu3O1%2FKNXtv1%2Fc41Jzjr8vsiDkI5xhIVRYFn%2BE5A2KVt807jaTWs4qBRk3vtuidkV6Clj1CrixQExaoN8wlfotab8AWlSgTa8oNKdHLLV0chonBXM1ZKDiOydneR7MzJ5FZ22xkxda5F1bA4vPIUusouHG4JLG97rcXyEuAdEWCy3DOwFa%2Fxc49m1WURFJzacMFL%2F3s8nJy%2BTqr7SbIh39w%2FruHFwNAPReRHqz8gxHqiux1TpWDpsfL4JDad8K6McLAhLEQ4tBogogMamE1IFsGLzSPWsCHMBA8GVvGhBaTIeANkFQtOgsCJn7lRk6DOBwoMRnlUEx4MCYtnVbe42c%2F1pX1HRTXEqBuy6QVecCrU2GIcyZWrOgKI6nvvOh8kNX%2BmJJqnTVXPewd4t6ICZQhoQLiFCBSr6Ws%2F%2BjlFV%2FGujf9nP%2FVR%2Bskrkab3ybEyxEuHoBLvqy%2BVEXs37IfH5omn3%2F8IYFhns%2FCZMZiSPzQ%2FvgHVt3rJPLf%2BSdAH01jdab%2F3xsVeqFvEdFBsYgcX5DCQPsETV1198XCOs4%2FfseoyZsjy5lTrJiPwqo%2FWWMU2Gs%2B6I4yQaBLvax5amBEB0yChc5iDVtjBwFqYYQa2AYfPjxb%2BWadf00j74NRQ52umXMYmsUKLcHsEm9K%2BIqhoxYxYUdbD1BCJQTgDnLIrt4v%2FqWXXheEG7sm%2BNqIX8RK77eUy10KJCj681OTMiSNQhWf03e4g83eeqmRuekuh4P3G6iLqsRoo5z06uY%2F9mGXU%2FQEYYMjD3vpQy6nohyDSyCr5UXKsk3Kpw3qhXdB9WsYAq%2FCrjWc8ZWmr%2BmIv2c8%2FL7qr7Z8J8x%2FgMy4bI%2FTdDLlvpNVWLvql3w61dpetl%2B754O6oKj2%2FeGqR8pb%2BTZVyZ9WgnkaZbRU5448OFGfgRU%2FtVOtdPu6krN8n5UM5cms0acbEVLeoqrPrz2UtvIUbPJGD89XejjquA%2BmEj7vLFTenZO%2FNkZhFxtD20bJ7XGQYw29xm%2BMD7dCdN0yV5EvpypKv%2Fzy4P0B4KC3XHIEAAA%3D")
        		 .post(Entity.json(json))
                 .getEntity();
		
		JsonArray products = response.getAsJsonArray("product");
		System.out.println(products);
		
		client.close();
	}

}
