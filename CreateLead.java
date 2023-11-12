package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass{
@Test(dataProvider="sendData")
	public  void runCreateLead(String CName,String fName, String lName) {
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
@DataProvider
public String[][] sendData() {
	String[][] data= new String[3][3];
	data[0][0]="TestLeaf";
	data[0][1]="Hari";
	data[0][2]="R";
	
	data[1][0]="TestLeaf";
	data[1][1]="Vidya";
	data[1][2]="R";
	
	data[2][0]="TestLeaf";
	data[2][1]="Dilip";
	data[2][2]="R";
	return data;

}
}






