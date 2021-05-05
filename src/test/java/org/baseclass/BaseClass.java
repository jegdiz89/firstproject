package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static Alert al;
	public static Actions ac;
	public static JavascriptExecutor js;
	public static Select sc;
	public static Robot rc;

	public String getDataFromExcel(String fileName, String sheetName, int row, int cellno) throws Throwable {
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\User1\\File\\" + fileName + ".xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row2 = sheet.getRow(row);
		Cell cell = row2.getCell(cellno);
		int cellType = cell.getCellType();
		String Value = "";
		if (cellType == 1) {
			Value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
			String format2 = dateFormat.format(dateCellValue);
			Value = dateFormat.format(dateCellValue);
		} else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			Value = String.valueOf(l);
		}
		return Value;
	}

	public static void writeDataToExcel(String fileName, String sheetName, int rowNo, int cloumnNo, String attribue)
			throws Throwable {
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\User1\\File\\" + fileName + ".xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.createRow(rowNo);
		Cell cell = row.createCell(cloumnNo);
		cell.setCellValue(attribue);
		FileOutputStream stream = new FileOutputStream(file);
		workbook.write(stream);

	}

	public static void write(String sheetname, int rowNo, int cellNo, String attribute) throws IOException {

		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\User1\\File\\Ddata.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet(sheetname);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.createCell(cellNo);
		cell.setCellValue(attribute);
		FileOutputStream o = new FileOutputStream(file);
		w.write(o);
	}

	public static void copyOperaion() throws AWTException {
		Robot rc = new Robot();
		rc.keyPress(KeyEvent.VK_COPY);
		rc.keyRelease(KeyEvent.VK_COPY);
	}

	public static void pasteOperation() {
		rc.keyPress(KeyEvent.VK_PASTE);
		rc.keyRelease(KeyEvent.VK_PASTE);
	}

	public static void keyPress() {
		rc.keyPress(0);
	}

	public static void keyRelease() {
		rc.keyRelease(0);
	}

	public static void screenShot(String data) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\jega\\" + data + ".png");
		FileUtils.copyFile(src, dest);
	}

	public static void frameSwitch(String data) {
		driver.switchTo().frame(data);
	}

	public static void setTextByJscript(String data, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
	}

	public static void getAttributeByJs(WebElement element) {
		js.executeScript("returnarguments[0].getAttribute('value');", element);

	}

	public static void clickByJscript(WebElement element) {
		js.executeScript("aguments[0].click();", element);
	}

	public static void selectByindex(WebElement element, int index) {
		Select sc = new Select(element);
		sc.selectByIndex(index);
	}

	public static void selectByValue(WebElement element, String data) {
		Select sc = new Select(element);
		sc.selectByValue("data");
	}

	public static void selectByVisibletext(WebElement element, String data) {
		Select sc = new Select(element);
		sc.selectByVisibleText(data);
	}

	public static String getAttribute(WebElement elememt) {
		String string = elememt.getAttribute("value");
		return string;

	}

	// Browser config
	public static void browserconfig() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\User1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void launchUrl(String data) {
		driver.get(data);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void enterText(WebElement element, String input) {
		element.sendKeys(input);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static WebElement findelementById(String data) {
		WebElement findelement = driver.findElement(By.id(data));
		return findelement;
	}

	public static WebElement findElementByName(String data) {
		WebElement findElement = driver.findElement(By.name(data));
		return findElement;
	}

	public static WebElement findElementByXpath(String data) {
		WebElement element = driver.findElement(By.xpath(data));
		return element;
	}

	public static void moveToElement(WebElement target) {
		Actions ac = new Actions(driver);
		ac.moveToElement(target).perform();
	}

	public static void rightClick(WebElement element) {
		ac.contextClick(element).perform();
	}

	public static void doubleClick(WebElement target) {
		ac.doubleClick(target).perform();

	}

	public static void dragAndDrop(WebElement source, WebElement target) {
		ac.dragAndDrop(source, target).perform();
	}

	public static void accept() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public static void sendKeys(String data) {
		al.sendKeys(data);
	}

	public static void dismiss() {
		al.dismiss();
	}

	public static void driverClose() {
		driver.close();
	}

	public static void getUrl() {
		driver.getCurrentUrl();
	}

	public static void getTitle() {
		driver.getTitle();
	}

	public static void Quit() {
		driver.quit();
	}

	public static void getPrtWindowId() {
		driver.getWindowHandle();
	}

	public static void getAllWindowId() {
		driver.getWindowHandles();
	}

}
