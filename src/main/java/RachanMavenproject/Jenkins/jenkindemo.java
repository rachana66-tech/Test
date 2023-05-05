package RachanMavenproject.Jenkins;


	import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
	 
	public class jenkindemo
	{
	 
	@Test
	public void testgooglrsearch()
	{
	 
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\Jenkins\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//it will open the goggle page
	driver.get("http://google.in"); 
	//we expect the title “Google “ should be present 
	String Expectedtitle = "Google";
	//it will fetch the actual title 
	String Actualtitle = driver.getTitle();
	System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
	//it will compare actual title and expected title
	Assert.assertEquals(Actualtitle, Expectedtitle);
	//print out the result
	System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
	
	
	System.out.println("hi");
	 }
	}


