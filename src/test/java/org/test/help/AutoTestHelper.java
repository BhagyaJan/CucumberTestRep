package org.test.help;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class AutoTestHelper {
	
	static WebDriver driver;
	
	public static void loadURL(String url)
	{
		driver.get(url);
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	public static void type(WebElement element, String input)
	{
		element.sendKeys(input);
	}

	public static void btnClick(WebElement element)
	{
		element.click();
	}

	public static void selectByVisibleText(WebElement element,String input)
	{
		
		Select select = new Select(element);
		select.selectByVisibleText(input);
	}

	public static void selectByValue(WebElement element,String input)
	{
		
		Select select = new Select(element);
		select.selectByValue(input);
	}

	public static void quitBrowser()
	{
		driver.quit();
	}
	
	public static  List<String> setToArrayList(Set<String> set) {
		
		List<String> list = new ArrayList<String>();
		list.addAll(set);
		return list;   
	}
	
	public static  void handleWindow() {
		
		Set<String> allWindow1 = driver.getWindowHandles();
		//System.out.println(allWindow1);

		driver.switchTo().window(setToArrayList(allWindow1).get(1));
	}
	public static  void switchToParentsWindow() {
		
		Set<String> allWindow1 = driver.getWindowHandles();
		//System.out.println(allWindow1);

		driver.switchTo().window(setToArrayList(allWindow1).get(0));
	}
	
	public static  Alert isAlertPresent() 
	{ 
		Alert a = null;
	    try 
	    { 
	    	
	        a = driver.switchTo().alert(); 
	       // System.out.println(a.getText());
	        return a; 
	    }   // try 
	    catch (NoAlertPresentException Ex) 
	    { 
	        return a; 
	    }   // catch 
	}   // isAlertPresent()

	public static  void handleSimpleAlert() 
	{
		Alert a=isAlertPresent();
		
		if(a!=null)
		{
			a.accept();	
		}
	}
	public static  void handleConfirmAlert(int input) 
	{
		Alert a=isAlertPresent();
		
		if(a!=null)
		{
			if(input==1)
				a.accept();	
			else
				a.dismiss();
		}
	}
	public static  void handlePromptAlert(int input,String text) 
	{
		Alert a=isAlertPresent();
		
		if(a!=null)
		{
			if(input==1)
			{
				a.sendKeys(text);
				a.accept();	
			}
			else
				a.dismiss();
		}
	}

	public static  void handleFrames(String matchString) {
		
		int count = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("Frame size : " + count);
		
		for(int i=0; i<count; i++){
			
			driver.switchTo().frame(i);
			List<WebElement> elementFrames = driver.findElements(By.xpath(matchString));
			System.out.println(elementFrames.size());
			if(elementFrames.size()==1)
			{
					System.out.println("Frame Index : " + i);
					break;
			}
			driver.switchTo().defaultContent();
			}
		
	}
	
	public static  WebDriver getFirefoxDriver()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\BrowserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		maximize();
		return driver;
	}
	
	public static  WebDriver getChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		maximize();
		return driver;
	}
	
	public static  WebDriver launchIE()
	{
		System.setProperty("webdriver.ie.driver", "D:\\BrowserDrivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		maximize();
		return driver;
	}
	
	public  WebDriver getRemoteFireFoxriver() throws MalformedURLException
	{
		  final String USERNAME = "bagyarajt1";
		  final String AUTOMATE_KEY = "zusq13Btwpq8UjxaeCEB";
		  final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

		    DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("browser", "Firefox");
		    caps.setCapability("browser_version", "45.0");
		    caps.setCapability("os", "Windows");
		    caps.setCapability("os_version", "XP");
		    caps.setCapability("resolution", "1024x768");
		    caps.setCapability("name", "Bstack-[Java] Sample Test");

		    driver = new RemoteWebDriver(new URL(URL), caps);
		    maximize();
		return driver;
	}
	
	//maximize
	public static  void maximize()
	{
		driver.manage().window().maximize();
	}
	
	public static  void getCookies() {
		
	    for(Cookie ck : driver.manage().getCookies())							
	    {			
	        System.out.println(ck.getName()+";"+ck.getValue());
	        
	    }
	}
	

	public static  void print(String s) {
		System.out.println(s);
	}
	
	public static  void screenshot(String fileName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("D:\\Screenshot\\"+fileName + ".png"));
	}
	
	//accept alert
		public static  void acceptAlert()
		{
			driver.switchTo().alert().accept();
		}
		
		//dismiss alert
		public static  void dismissAlert()
		{
			driver.switchTo().alert().dismiss();
		}
		
		//enter value in alert textbox
		public static  void enterAlertText(String str)
		{
			driver.switchTo().alert().sendKeys(str);
		}
		
		//gets the text from alert box
		public static  void getAlertText()
		{
			driver.switchTo().alert().getText();
		}

}
