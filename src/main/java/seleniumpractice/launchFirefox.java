package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchFirefox {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com");
        String url=driver.getTitle();
        System.out.println(url);
        driver.close();
	}

}
