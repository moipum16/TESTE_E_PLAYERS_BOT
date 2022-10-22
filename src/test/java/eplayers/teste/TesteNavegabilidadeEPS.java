package eplayers.teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class TesteNavegabilidadeEPS {
ChromeDriver driver;
	
	@Before
	public void preTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:4201/");
	}
	
	@Test
	public void TesteNavegacao() throws InterruptedException {
		driver.findElement(By.id("inscrever")).click();
		Thread.sleep(250);
		driver.findElement(By.id("logar")).click();
		Thread.sleep(250);
		driver.findElement(By.id("login")).sendKeys("caiopacheco02@gmail.com");
		Thread.sleep(250);
		driver.findElement(By.id("senha")).sendKeys("123456");
		Thread.sleep(250);
		driver.findElement(By.id("enviar")).click();
		
		
	}
	@After
	public void posTeste() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}

