package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		WebDriver driver = new ChromeDriver();
		driver.get("https://objectspy.space");
		driver.findElement(By.xpath("//form[@class = 'form-horizontal']/descendant::strong[1]")).click();	//this is how to deal with dynamic WebElements
																											//the example isnt dynamic but the solution is
																											//used a stable xpath and made a relative xpath of it
																											//then found the absolute xpath of the desired element
																											//in relation to the stable
	}

}
