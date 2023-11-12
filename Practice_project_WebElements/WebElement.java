package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.redbus.com/");
		
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")).clear();
		
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")) .sendKeys("Paris");

		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")).clear();
		
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")) .sendKeys("London");
		
		Thread.sleep(5000);

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("document.getElementById('onward_cal').value='11/12/2024'");

		Thread.sleep(3000);
		
		//driver.close();

	}

}








package MakeMyTRIProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProject {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.remove.bg/");
		
		

		Thread.sleep(5000);

		// div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]

		WebElement e1 = driver
				.findElement(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]"));

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-auto
		// w-full px-8 max-w-5xl relative']/descendant::button[1]")));

		e1.click();

		// Below code for script editor : Go to Window search > type "Script"
		
		Thread.sleep(5000);
		
		System.out.println("Above-----");

		Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\AutoIT_Files\\ScriptUpload1.exe");
		
		System.out.println("below-----");
		
		
		Thread.sleep(5000);
		
		

		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Project_Screenshots/car_image.png");
		FileUtils.copyFile(srcFile, destFile);
		driver.close();
       
	}

}



DBConnection:

package MakeMyTRIProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DBconnectionSelenium {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		String title = driver.getTitle();
		
		String url = driver.getCurrentUrl();


		
		String dburl = "jdbc:mysql://localhost:3306/seleniumtest";
		String username = "root";
		String password = "root";
		
         Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		PreparedStatement ps = con.prepareStatement("insert into webtest values(?,?)"); // execute query
		ps.setString(1,title);
		ps.setString(2,url);
		ps.executeUpdate();
		
		
		driver.navigate().to("https://github.com/");
		
		
		title= driver.getTitle();
		
		url = driver.getCurrentUrl();
		
		ps = con.prepareStatement("insert into webtest values(?,?)"); // execute query
		ps.setString(1,title);
		ps.setString(2,url);
		ps.executeUpdate();
		
		
		con.close();
	}
}












