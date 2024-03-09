package browsersimulator;

import java.util.ArrayList;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AlterandoIpdaConexao {

	private static String name;
	private static String PHANTOMJS_EXE = "C:\\Users\\rmenezes\\Downloads\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe";
	
	public static void main(String[] args) {
		/*String[] phantomJsArgs = {"--webdriver=103.82.8.242:8989"};
	 	capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, phantomJsArgs);
	 	*/
		
/*		Proxy proxy = new Proxy();
		proxy.setHttpProxy("172.67.170.109:80");*/
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(CapabilityType.PROXY, proxy);
		
		capabilities.setBrowserName("phantomjs");
		capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
				PHANTOMJS_EXE);                  
		capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_PAGE_SETTINGS_PREFIX + "userAgent", 
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36");
		WebDriver driver = new PhantomJSDriver(capabilities);

			System.out.println("Conectando ao Blog..");
			driver.get("https://fofocalheia.com.br");

			System.out.println("Thread "+name+": Conectando a pagina Fashion.");
			driver.navigate().to("https://fofocalheia.com.br/fashion");

			System.out.println("Thread "+name+": Conectando a pagina Tecnologia.");
			driver.navigate().to("https://fofocalheia.com.br/tecnologia");

			System.out.println("Thread "+name+": Conectando a pagina Famosos.");
			driver.navigate().to("https://fofocalheia.com.br/famosos");

			driver.close();
			Thread.currentThread().interrupt();

	}


	private void readingPage(WebDriver driver) throws InterruptedException {
		System.out.println("Esperando 30 seg...");
		Thread.currentThread().sleep(30*1000);
		scrollDown(driver);
		System.out.println("Esperando 30 seg...");
		Thread.sleep(30*1000);
		scrollDown(driver);
		System.out.println("Esperando 30 seg...");
		Thread.currentThread().sleep(30*1000);
	}


	private void proxyConection(DesiredCapabilities capabilities) {
		//Proxy settings
		ArrayList<String> cliArgsCap = new ArrayList<String>();
		cliArgsCap.add("--proxy=address:200.150.204.37");
		cliArgsCap.add("--proxy=port:80");
		//cliArgsCap.add("--proxy-auth=username:password");
		cliArgsCap.add("--proxy-type=http");

		capabilities.setCapability(
				PhantomJSDriverService.PHANTOMJS_CLI_ARGS, cliArgsCap);
	}



	public void scrollDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}
}
