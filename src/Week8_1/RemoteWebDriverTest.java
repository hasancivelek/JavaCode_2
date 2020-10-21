package Week8_1;

public class RemoteWebDriverTest {

	public static void main(String[] args) {

		RemoteWebDriver driver =new FireFoxDriver();

		driver.get("https://www.google.com");

		driver.quit();


		driver=new ChromeDriver();

		driver.get("https://www.amazon.com");

		driver.quit();
		
		driver=new OperaDriver();
		
		driver.get("https://www.zaman.com");
		
		driver.quit();
	}

}
