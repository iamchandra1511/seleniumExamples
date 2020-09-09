package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;;

public class TestBrowsers 
{
	public static void main(String args[])
	{
		//Programme for FireFox Driver
		/*
		System.setProperty("webdriver.gecko.driver", "D:\\BrowserNatives\\geckodriver.exe");
		FirefoxDriver fox=new FirefoxDriver();
		fox.get("http://way2automation.com");
		*/
		
		
		//Programme for Chrome Driver
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserNatives\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		
		chrome.get("http://way2automation.com");
 		
	}

}
