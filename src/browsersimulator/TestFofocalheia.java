package browsersimulator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestFofocalheia {

	public static void main(String[] args) {
		
		Map<Integer, String> proxyList = new HashMap<>();
		proxyList.put(0, "191.96.251.53:80");
	    //proxyList.put(1, "189.113.14.243:80");
		//proxyList.put(2, "45.161.201.202:3386");
		//proxyList.put(3, "191.240.153.165:8000");
		
		List<Thread> threads = new ArrayList<>();
		for (int i = 0; i < proxyList.size(); i++) {
			Thread a = new Thread(new ThreadFofocalheia("ThreadName: "+i, proxyList.get(i)));
			threads.add(a);
		}
		
		threads.forEach(t -> {
			t.start();
		});
	}
}
