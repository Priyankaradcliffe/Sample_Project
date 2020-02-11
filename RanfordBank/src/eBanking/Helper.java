package eBanking;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Helper

{
	WebDriver driver;
	String path = "X:\\R Priyanka Workspace\\Selenium Workspace\\Browser Drivers\\chromedriver.exe";
	

	/*
	 * Method Name:-->Launch_Browser
	 * Author:-->R Priyanka
	 * 
	 */
	public void Launch_Browser()
	{
		System.setProperty("webdriver.chrome.driver", path);
		driver= new ChromeDriver();	

	}
	
	/*
	 * Method Name:-->Load_Webpage
	 * Author:-->R Priyanka
	 * 
	 */
	
	public void Load_Webpage() throws Exception
	{
		driver.get("http://192.168.1.97/ebank2/home.aspx");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}

	/*
	 * Method Name:-->Admin_Login
	 * Author:-->R Priyanka
	 * 
	 */
	
	public void Admin_Login() throws Exception 
	{
		//Admin login
		driver.findElement(By.id("txtuId")).clear();
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		//Admin Pw
		driver.findElement(By.id("txtPword")).clear();
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
	}
	
	/*
	 * Method Name:-->Branches_button
	 * Author:-->R Priyanka
	 * 
	 */
	
	public void Branches_button() throws Exception
	
	{
		//Branches click
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		Thread.sleep(2000);
	}
	
	/*
	 * Method Name:-->New Branch Button
	 * Author:-->R Priyanka
	 * 
	 */
	public void New_Branch_Button() throws Exception
	{
		//New Branch
		driver.findElement(By.id("BtnNewBR")).click();
		Thread.sleep(2000);
	}

	/*
	 * Method Name:-->Enter Branch details
	 * Author:-->R Priyanka
	 * 
	 */
	public void Branch_Details() throws Exception
	{
	
		//Branch name
		driver.findElement(By.id("txtbName")).clear();
		driver.findElement(By.id("txtbName")).sendKeys("MQDSNR12345");
		
		//Address1
		driver.findElement(By.id("txtAdd1")).clear();
		driver.findElement(By.id("txtAdd1")).sendKeys("Chaitanyapuri123");
		
		//Address2
		driver.findElement(By.id("Txtadd2")).clear();
		driver.findElement(By.id("Txtadd2")).sendKeys("DSNR123");
		
		//Address3
		driver.findElement(By.id("txtadd3")).clear();
		driver.findElement(By.id("txtadd3")).sendKeys("Sree");
		
		//Area
		driver.findElement(By.id("txtArea")).clear();
		driver.findElement(By.id("txtArea")).sendKeys("Rama towers");
		
		//Zip code
		driver.findElement(By.id("txtZip")).clear();
		driver.findElement(By.id("txtZip")).sendKeys("12345");
		
		//Country
		new Select(driver.findElement(By.id("lst_counrtyU")))
		.selectByVisibleText("INDIA");
		//State
		new Select(driver.findElement(By.id("lst_stateI")))
		.selectByVisibleText("Andhra Pradesh");
		//City
		new Select(driver.findElement(By.id("lst_cityI")))
		.selectByVisibleText("Hyderabad");
		
		Thread.sleep(2000);
	}
	
	/*
	 * Method Name:-->New Branch Submit
	 * Author:-->R Priyanka
	 * 
	 */
	public void New_Branch_submit() throws Exception
	{
		driver.findElement(By.id("btn_insert")).click();
		Thread.sleep(2000);
	}
	public void Close_Alert() throws Exception
	{
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

	}
	/*
	 * Method Name:-->New Branch Reset 
	 * Author:-->R Priyanka
	 * 
	 */
	public void New_Branch_Reset() throws Exception
	
	{
		driver.findElement(By.id("Btn_Reset")).click();
		Thread.sleep(2000);
	}


	/*
	 * Method Name:-->New Branch Cancel 
	 * Author:-->R Priyanka
	 * 
	 */
	public void New_Branch_Cancel() throws Exception
	{
		driver.findElement(By.id("Btn_cancel")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	
	
	/*
	 * Method Name:-->Admin_home
	 * Author:-->R Priyanka
	 * 
	 */
	public void Admin_Home() throws Exception
	{
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")).click();
		Thread.sleep(2000);

	}
	
	// ROLES
	/*
	 * Method Name:-->Roles_button
	 * Author:-->R Priyanka
	 * //table[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a
	 */
	public void Roles_button() throws Exception
	
	{
		//Roles Button
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		Thread.sleep(2000);          
	}
	
	/*
	 * Method Name:--> New Role Button
	 * Author:-->R Priyanka
	 * 
	 */
	public void New_Role_Button() throws Exception
	{
		//New Role button
		driver.findElement(By.id("btnRoles")).click();
		Thread.sleep(2000);
	}
	
	/*
	 * Method Name:--> New Role Insertion
	 * Author:-->R Priyanka
	 * 
	 */
	public void New_Role_Insertion() throws Exception
	{
		//Role Name	
		driver.findElement(By.id("txtRname")).clear();
		driver.findElement(By.id("txtRname")).sendKeys("TellerPriyankaa");
		
		//Role Desc	
		driver.findElement(By.id("txtRDesc")).clear();
		driver.findElement(By.id("txtRDesc")).sendKeys("Teller");
		
		//Role Type	
		new Select(driver.findElement(By.id("lstRtypeN"))).selectByVisibleText("E");
		Thread.sleep(2000);
	}
	
	/*
	 * Method Name:--> New Role Submit
	 * Author:-->R Priyanka
	 * 
	 */
	public void New_Role_Submit() throws Exception
		
	{	
		driver.findElement(By.id("btninsert")).click();	
		Thread.sleep(2000);
		
	}
	
	
	
	
	// EMPLOYEE
		/*
		 * Method Name:-->Employee_button
		 * Author:-->R Priyanka
		 * //table[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a
		 */
		public void Employee_button() throws Exception
		
		{
			//Employee_button
			driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
			Thread.sleep(2000);          
		}
		
		/*
		 * Method Name:--> New Employee Button
		 * Author:-->R Priyanka
		 * 
		 */
		public void New_Employee_Button() throws Exception
		{
			//New Employee button
			driver.findElement(By.id("BtnNew")).click();
			Thread.sleep(2000);
		}
		
		/*
		 * Method Name:--> New Employee Creation
		 * Author:-->R Priyanka
		 * 
		 */
		public void New_Employee_Creation() throws Exception
		{
			//Employer Name		
			driver.findElement(By.id("txtUname")).clear();
			driver.findElement(By.id("txtUname")).sendKeys("TellerPriyankaa");
			
			//Login Password	
			driver.findElement(By.id("txtLpwd")).clear();
			driver.findElement(By.id("txtLpwd")).sendKeys("Teller");
			
			//Role
			new Select(driver.findElement(By.id("lst_Roles"))).selectByVisibleText("TellerPriyankaa");
			Thread.sleep(2000);
			
			//Branch
			new Select(driver.findElement(By.id("lst_Branch"))).selectByVisibleText("MQDSNR1234");
			Thread.sleep(2000);
			
		}
		
		/*
		 * Method Name:--> New Employee Submit
		 * Author:-->R Priyanka
		 * 
		 */
		public void New_Employee_Submit() throws Exception
			
		{	
			driver.findElement(By.id("BtnSubmit")).click();	
			Thread.sleep(2000);
		}
	
}
