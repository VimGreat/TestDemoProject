package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChrome {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/alerts");
		String title=driver.getTitle();
		System.out.println(title);
		//driver.close();
		
		if(title.equals("DEMOQA")) {
			System.out.println("***Correct Title");
		}else {
			System.out.println("----Not Correct Title");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String source=driver.getPageSource();
		System.out.println(source);
		
		driver.close();
		
	}
}
