package browsersimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThreadFofocalheia2 implements Runnable{
	
	private String name;
	
	public ThreadFofocalheia2(String name) {
		this.name = name;
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

		WebDriver driver = new PhantomJSDriver(capabilities);

		driver.manage().deleteAllCookies();
			try {
				googleSearch(driver, "acervogenealogico.com.br site");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Conectando ao Blog..");
			
			driver.close();
			Thread.currentThread().interrupt();
			
	}


	private void conectandoFofocalheia(WebDriver driver) throws InterruptedException {
		driver.get("https://acervogenealogico.com.br");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://fofocalheia.com.br");
		Thread.sleep(60*10000);
		System.out.println("Thread "+name+": Conectando a pagina Famosos.");
		driver.navigate().to("https://acervogenealogico.com.br");
		System.out.println("Esperando 3 min...");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("Muito rapido...");
		readingPage(driver);
	}


	private void readingPage(WebDriver driver) throws InterruptedException {
		System.out.println("Esperando 30 seg...");
		Thread.sleep(60*10000);
		scrollDown(driver);
		System.out.println("Esperando 30 seg...");
		Thread.sleep(30*1000);
		scrollDown(driver);
		System.out.println("Esperando 30 seg...");
		Thread.sleep(60*10000);
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
	
	
	public void googleSearch(WebDriver driver, String search) throws InterruptedException {
		
		driver.manage().window().maximize();
	     driver.navigate().to("https://www.google.com/");
	     System.out.println("inside Test");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     System.out.println("Checking if the Search field is Enabled");
	     driver.findElement(By.name("q")).isEnabled();
	     System.out.println("Sending lol to Search field");
	    driver.findElement(By.name("q")).sendKeys(search);
	     
	     System.out.println("Clicking on Google Search button Next");
	    driver.findElement(By.name("btnk")).submit();
	     System.out.println("Google Search Completed");
	     

	     List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rso']//a"));
	    // List<WebElement> findElements = driver.findElements(By.name("rso"));

	     // this are all the links you like to visit
	     for (WebElement webElement : findElements)
	     {
	    	 if(webElement.getAttribute("href").contains("acervogenealogico.com.br")) {
	    		 String url = webElement.getAttribute("href");
	    		 System.out.println("Navegando para "+url+"...");
	    	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	     
	    		 driver.navigate().to(url);
	    	     driver.get(url);
	    		 Thread.sleep(30*1000);
	    		 break;
	    	 }
	     }

	    
	}
}
