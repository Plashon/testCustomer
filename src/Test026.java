import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.junit.jupiter.api.Test;

class Test026 {

	@Test
	void testcase01() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/026/testcase.html");
        
        WebElement first = driver.findElement(By.id("firstName"));
        WebElement lastname = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        WebElement submit = driver.findElement(By.id("submit"));
        
        first.sendKeys("johnjohn");
        lastname.sendKeys("cononc");
        age.sendKeys("2");
        submit.click();
        
        
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name:johnjohn",result);
        driver.close();
      
	}
	
	@Test
	void testcase02() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/026/testcase.html");
        
        WebElement first = driver.findElement(By.id("firstName"));
        WebElement lastname = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        WebElement submit = driver.findElement(By.id("submit"));
        
        first.sendKeys("Johnj");
        lastname.sendKeys("canoncanoncano");
        age.sendKeys("149");
        submit.click();
        
        
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name:Johnj",result);
        driver.close();
      
	}
	@Test
	void testcase03() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/026/testcase.html");
        
        WebElement first = driver.findElement(By.id("firstName"));
        WebElement lastname = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        WebElement submit = driver.findElement(By.id("submit"));
        
        first.sendKeys("Johnjo");
        lastname.sendKeys("canoncanoncanon");
        age.sendKeys("150");
        submit.click();
        
        
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name:Johnj",result);
        driver.close();
      
	}
	@Test
	void testcase04() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/026/testcase.html");
        
        WebElement first = driver.findElement(By.id("firstName"));
        WebElement lastname = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        WebElement submit = driver.findElement(By.id("submit"));
        
        first.sendKeys("Johnjohnjohnjo");
        lastname.sendKeys("canoncan");
        age.sendKeys("75");
        submit.click();
        
        
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name:Johnj",result);
        driver.close();
      
	}
	@Test
	void testcase05() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/026/testcase.html");
        
        WebElement first = driver.findElement(By.id("firstName"));
        WebElement lastname = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        WebElement submit = driver.findElement(By.id("submit"));
        
        first.sendKeys("Johnjohnjohnjoh");
        lastname.sendKeys("canoncan");
        age.sendKeys("75");
        submit.click();
        
        
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("First Name:Johnj",result);
        driver.close();
      
	}
	
	@Test
	void testcase06() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/026/testcase.html");
        
        WebElement first = driver.findElement(By.id("firstName"));
        WebElement lastname = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        WebElement submit = driver.findElement(By.id("submit"));
        
        first.sendKeys("john");
        lastname.sendKeys("canoncan");
        age.sendKeys("75");
        submit.click();
        
        
        String result = driver.findElement(By.id("personalInfoForm")).getText();
        assertEquals("Personal Information Form",result);
        driver.close();
      
	}
	
	@Disabled
	void testcase07() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/026/testcase.html");
        
        WebElement first = driver.findElement(By.id("firstName"));
        WebElement lastname = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        WebElement submit = driver.findElement(By.id("submit"));
        
        first.sendKeys("Johnjohn");
        lastname.sendKeys("canoncan");
        age.sendKeys("149");
        submit.click();
        
        
        String result = driver.findElement(By.id("personalInfoForm")).getText();
        assertEquals("Personal Information Form",result);
        driver.close();
      
	}
	@Test
	void testcase08() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/026/testcase.html");
        
        WebElement first = driver.findElement(By.id("firstName"));
        WebElement lastname = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        WebElement submit = driver.findElement(By.id("submit"));
        
        first.sendKeys("Johnjohn");
        lastname.sendKeys("cano");
        age.sendKeys("75");
        submit.click();
        
        
        String result = driver.findElement(By.id("personalInfoForm")).getText();
        assertEquals("Personal Information Form",result);
        driver.close();
      
	}
	@Disabled
	void testcase09() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/026/testcase.html");
        
        WebElement first = driver.findElement(By.id("firstName"));
        WebElement lastname = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        WebElement submit = driver.findElement(By.id("submit"));
        
        first.sendKeys("Johnjohn");
        lastname.sendKeys("canoncancanoncancanoncan");
        age.sendKeys("75");
        submit.click();
        
        
        String result = driver.findElement(By.id("personalInfoForm")).getText();
        assertEquals("Personal Information Form",result);
        driver.close();
      
	}
	@Test
	void testcase10() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/026/testcase.html");
        
        WebElement first = driver.findElement(By.id("firstName"));
        WebElement lastname = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        WebElement submit = driver.findElement(By.id("submit"));
        
        first.sendKeys("Johnjohn");
        lastname.sendKeys("canoncan");
        age.sendKeys("0");
        submit.click();
        
        
        String result = driver.findElement(By.id("personalInfoForm")).getText();
        assertEquals("Personal Information Form",result);
        driver.close();
      
	}
	@Test
	void testcase11() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1/026/testcase.html");
        
        WebElement first = driver.findElement(By.id("firstName"));
        WebElement lastname = driver.findElement(By.id("lastName"));
        WebElement age = driver.findElement(By.id("age"));
        WebElement submit = driver.findElement(By.id("submit"));
        
        first.sendKeys("Johnjohn");
        lastname.sendKeys("canoncan");
        age.sendKeys("151");
        submit.click();
        
        
        String result = driver.findElement(By.id("personalInfoForm")).getText();
        assertEquals("Personal Information Form",result);
        driver.close();
      
	}
}
