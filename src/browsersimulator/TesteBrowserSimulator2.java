package browsersimulator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;


public class TesteBrowserSimulator2 {
	
	/*public static void main(String[] args) throws MalformedURLException {
		
		  DesiredCapabilities dr = new DesiredCapabilities();
		  
		//specify the browser
		        dr.setBrowserName("chrome");  
		//specify the environment                
		        dr.setPlatform(Platform.WINDOWS);     
		     
		  //specify the hub URL           
		        RemoteWebDriver driver=new RemoteWebDriver(new URL("https://fofocalheia.com.br"), dr);
		        driver.navigate().to("https://fofocalheia.com.br/fashion");
		      //  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		       // driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		        driver.close();
	}*/
	
	/*public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmenezes\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = null;
		try {
			driver = new RemoteWebDriver(new URL("https://fofocalheia.com.br"), new ImmutableCapabilities());
			driver.get("https://fofocalheia.com.br");
			driver.quit();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	
	}*/

	public static void main(String[] args) throws Exception {
		
		for (int i = 0; i < 10; i++) {
			phantomJs();

		}
		
	}
	
	
	public static void accessRobot() {
		// TODO Auto-generated method stub
		
				ChromeOptions handlingSSL = new ChromeOptions();
				//handlingSSL.addArguments("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36");
				handlingSSL.addArguments("--remote-allow-origins=*");
				//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
				handlingSSL.setAcceptInsecureCerts(true);
				
				//setting the driver executable
				//System.setProperty("webdriver.http.factory", "jdk-http-client");
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmenezes\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
				//Initiating your chromedriver
				WebDriver driver =new ChromeDriver(handlingSSL);
				//RemoteWebDriver driver=new RemoteWebDriver(new URL("https://fofocalheia.com.br"), dr);
				//maximize window
				//driver.manage().window().maximize();
				driver.manage().window().minimize();
				//open browser with desried URL
				driver.get("https://fofocalheia.com.br");
				driver.navigate().to("https://fofocalheia.com.br/fashion");
				//closing the browser
				driver.close();
	}
	
	public static void phantomJs() {
		
		ChromeOptions handlingSSL = new ChromeOptions();
		//handlingSSL.addArguments("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36");
		handlingSSL.addArguments("--remote-allow-origins=*");
		//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
		handlingSSL.setAcceptInsecureCerts(true);
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("phantomjs");
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
		                "C:\\Users\\rmenezes\\Downloads\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");                  
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_PAGE_SETTINGS_PREFIX + "userAgent", 
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Safari/537.36");

		WebDriver driver = new PhantomJSDriver(caps);
		
		System.out.println("Conectando ao Blog..");
		driver.get("https://fofocalheia.com.br");
		try {
			driver.navigate().to("https://fofocalheia.com.br/fashion");
			driver.wait(30*1000);
			driver.navigate().to("https://fofocalheia.com.br/tecnologia");
			driver.wait(30*1000);
			driver.navigate().to("https://fofocalheia.com.br/famosos");
			driver.wait(30*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
