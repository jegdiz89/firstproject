package org.tcs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\User1\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement btndropDown = driver.findElement(By.id("countries"));
		Select sc=new Select(btndropDown);
		List<WebElement> options = sc.getOptions();
		File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\User1\\File\\Details2.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet createSheet = w.createSheet("Dummydata");

		for (int i = 0; i < options.size(); i++) {
			
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
			Row createRow = createSheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(text);
		}
	
		FileOutputStream os=new FileOutputStream(f);
		w.write(os);
		
		

}
}
