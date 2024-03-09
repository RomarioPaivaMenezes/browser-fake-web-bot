package browsersimulator;

import java.lang.System.Logger;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

import org.apache.commons.logging.impl.Log4JLogger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ThreadFofocalheia implements Runnable{
	
	private String name;
	private String proxy;
	
	public ThreadFofocalheia(String name, String proxy) {
		this.name = name;
		this.proxy = proxy;
	}
	
	public void proxyConection(){
		proxyConection(null);
	}

	@Override
	public void run() {
		ChromeOptions handlingSSL = new ChromeOptions();
		//handlingSSL.addArguments("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36");
		handlingSSL.addArguments("--remote-allow-origins=*");
		//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
		handlingSSL.setAcceptInsecureCerts(true);

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("phantomjs");
		capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
				"C:\\Users\\rmenezes\\Downloads\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");                  
		capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_PAGE_SETTINGS_PREFIX + "userAgent", 
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36");
		//capabilities.setCapability(CapabilityType.PROXY, proxy);
		capabilities.setJavascriptEnabled(true);
		proxyConection(capabilities);
		
		WebDriver driver = new PhantomJSDriver(capabilities);

	
		
		driver.manage().deleteAllCookies();
		try {
			System.out.println("Conectando ao Acervo pagina Militares..");
			driver.get("https://acervogenealogico.com.br/militares");
			
			System.out.println(driver.getPageSource());
			
			System.out.println("Thread "+name+": Conectando a pagina Biblioteca.");
			driver.navigate().to("https://acervogenealogico.com.br/biblioteca");
			//readingPage(driver);
			
			System.out.println("Thread "+name+": Conectando a pagina Sobre-nos.");
			driver.navigate().to("https://acervogenealogico.com.br/sobre-nos");
			readingPage(driver);
		
			readingPage(driver);
			
			driver.close();
			Thread.currentThread().interrupt();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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

	private void proxyConnection2() {
		DesiredCapabilities capabilities = DesiredCapabilities.phantomjs();
		capabilities.setJavascriptEnabled(true);
		System.setProperty("phantomjs.binary.path", "../Drivers/phantomjs.exe");

		ArrayList<String> cliArgsCap = new ArrayList<String>();
		cliArgsCap.add("--proxy=hostname:port");
		cliArgsCap.add("--proxy-auth=username:password");
		cliArgsCap.add("--proxy-type=http");
		capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, cliArgsCap);

	}

	private void proxyConection(DesiredCapabilities capabilities) {
		
		org.openqa.selenium.Proxy proxys = new org.openqa.selenium.Proxy(); 
		proxys.setHttpProxy(this.proxy); 
		//proxys.setSslProxy(this.proxy); 
		//proxys.setSslProxy("yoururl:portno"); 
		capabilities.setCapability("proxy", proxys); 

	}


	
	public void scrollDown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}
}
