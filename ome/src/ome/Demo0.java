package ome;

import java.sql.Driver;
import java.util.Collection;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;

import com.sun.xml.internal.ws.Closeable;

public class Demo0 {

	public static void main(String[] args) throws Exception {
		
		String url="https://www.facebook.com/";
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	String parentAdderss=driver.getWindowHandle();
	System.out.println(parentAdderss);
	Quit();
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
			}

	private static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

	private static void Quit() {
		// TODO Auto-generated method stub
		
	}

	private static void Close() {
		// TODO Auto-generated method stub
		
	}
}
