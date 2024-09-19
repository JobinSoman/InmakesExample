package org.newchl;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass 
{
	public static WebDriver driver;
	public static Actions act;
	public static Select sl;
	public static TakesScreenshot ts;
	public static File f,img;
	public static JavascriptExecutor js;
	public static Robot rt;
	public static FileInputStream fis;
	public static Workbook wb;
	public static Sheet mySheet,newSheet,sheet;
	public static Row particularRow, iterateRow,r,newRow;
	static org.apache.poi.ss.usermodel.Cell particularCell,newCell,iterateCell,c;
	public static FileOutputStream fos;
	public static Alert al;
	
	public static void LaunchBrowser()
	{
		driver=new ChromeDriver();
	}
	public static WebDriver createDriver(String browserType) 
	{
        switch (browserType.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Browser type not supported: " + browserType);
        }
        return driver;
    }
	public static void Maximize()
	{
		driver.manage().window().maximize();
	}
	public static void OpenApplication(String url)
	{
		driver.get(url);
	}
	public static void CloseBrowser()
	{
		driver.close();
	}
	public static void QuitBrowser()
	{
		driver.quit();
	}
	public static String GetTitle()
	{
		return driver.getTitle();
	}
	public static String GetURL()
	{
		return driver.getCurrentUrl();
	}
	public static WebElement ElementByXpath(String path)
	{
		return driver.findElement(By.xpath(path));
	}
	public static WebElement ElementByID(String id)
	{
		return driver.findElement(By.id(id));
	}
	public static WebElement ElementByName(String name)
	{
		return driver.findElement(By.name(name));
	}
	public static WebElement ElementByClassName(String clsaname)
	{
		return driver.findElement(By.className(clsaname));
	}
	public static WebElement ElementByCssSelector(String csselect)
	{
		return driver.findElement(By.cssSelector(csselect));
	}
	public static WebElement ElementByTagName(String tgname)
	{
		return driver.findElement(By.tagName(tgname));
	}
	public static WebElement ElementByLinkText(String lktxt)
	{
		return driver.findElement(By.linkText(lktxt));
	}
	public static WebElement ElementByPartialText(String pltxt)
	{
		return driver.findElement(By.partialLinkText(pltxt));
	}
	public static void Write(WebElement ele, String text)
	{
		ele.sendKeys(text);
	}
	public static void Click(WebElement ele)
	{
		ele.click();
	}
	public static String GetText(WebElement ele)
	{
		return ele.getText();
	}
	public static void MouseHover(WebElement ele)
	{
		act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	public static void DoubleClick(WebElement ele)
	{
		act=new Actions(driver);
		act.doubleClick(ele).perform();
	}
	public static void RightClick(WebElement ele)
	{
		act=new Actions(driver);
		act.contextClick(ele).perform();
	}
	public static void DragAndDrop(WebElement src,WebElement trg)
	{
		act=new Actions(driver);
		act.dragAndDrop(src, trg).perform();
	}
	public static void AlertAccept()
	{
		driver.switchTo().alert().accept();
	}
	public static void AlertDismiss()
	{
		driver.switchTo().alert().dismiss();
	}
	public static String AlertGetText()
	{
		return driver.switchTo().alert().getText();
	}
	public static void SelectByIndex(int i)
	{
		sl.selectByIndex(i);
	}
	public static void SelectByValue(String  val)
	{
		sl.selectByValue(val);
	}
	public static void SelectByText(String  txt)
	{
		sl.selectByVisibleText(txt);
	}
	public static void AllOptions(WebElement drp)
	{
		sl=new Select(drp);
		List<WebElement> options= sl.getOptions();
		for(int i=0;i<options.size();i++)
		  { 
			WebElement ele = options.get(i); 
			String cntry=ele.getText();
		    System.out.println(cntry); 
		  }
	}
	public static void FrameSwitchIndex(int i)
	{
		driver.switchTo().frame(i);
	}
	public static void FrameSwitchId(String id)
	{
		driver.switchTo().frame(id);
	}
	public static void FrameSwitchName(String name)
	{
		driver.switchTo().frame(name);
	}
	public static void FrameSwitchElement(WebElement ele)
	{
		driver.switchTo().frame(ele);
	}
	public static void TakeScreenshot(String file) throws IOException
	{
		ts=(TakesScreenshot)driver;
		img=ts.getScreenshotAs(OutputType.FILE);
		f=new File("C:\\Users\\Dell\\eclipse-workspace\\SeleniumWebDriver\\src\\test\\resources\\Screenshot\\"+file+".png");
		FileUtils.copyFile(img, f);	
	}
	public static void JsClick(WebElement ele)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
	}
	public static void JsWrite(WebElement ele, String text)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+text+"')", ele);
	}
	public static void JsScroll(WebElement ele, boolean res)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView("+res+")", ele);
	}
	public static Object JsFetch(WebElement ele, String val)
	{
		js=(JavascriptExecutor)driver;
		return js.executeScript("return arguments[0].getAttribute('"+val+"')", ele);
	}
	public static void SaveLinkRobot() throws AWTException
	{
		rt=new Robot();
		for(int i=0;i<5;i++)
		{
			rt.keyPress(KeyEvent.VK_DOWN);
			rt.keyRelease(KeyEvent.VK_DOWN);
		}
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void OpenNewWindowRobot() throws AWTException
	{
		rt=new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN); 
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void SelectAllTextRobot() throws AWTException
	{
		rt=new Robot();
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_A); 
		rt.keyRelease(KeyEvent.VK_CONTROL);
		rt.keyRelease(KeyEvent.VK_A);
	}
	public static void CutTextRobot() throws AWTException
	{
		rt=new Robot();
		for(int i=0;i<2;i++)
		{
			rt.keyPress(KeyEvent.VK_DOWN);
			rt.keyRelease(KeyEvent.VK_DOWN);
		}
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER); 
		rt.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void CopyRobot() throws AWTException
	{
		rt=new Robot();
		 rt.keyPress(KeyEvent.VK_CONTROL);
		 rt.keyPress(KeyEvent.VK_C); 
		 rt.keyRelease(KeyEvent.VK_CONTROL);
		 rt.keyRelease(KeyEvent.VK_C);
	}
	public static void PasteRobot() throws AWTException
	{
		rt=new Robot();
		 rt.keyPress(KeyEvent.VK_CONTROL); 
		 rt.keyPress(KeyEvent.VK_V);
		 rt.keyRelease(KeyEvent.VK_CONTROL);
		 rt.keyRelease(KeyEvent.VK_V);
	}
	public static void CutRobot() throws AWTException
	{
		rt=new Robot();
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_X);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		rt.keyRelease(KeyEvent.VK_X); 
	}
	public static void TabRobot() throws AWTException
	{
		rt=new Robot();
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyRelease(KeyEvent.VK_TAB);
	}
	public static String ParentId()
	{
		return driver.getWindowHandle();
	}
	public static Set<String> ChildIds()
	{
		return driver.getWindowHandles();
	}
	public static void SwitchChildWindow(Set<String> allid, String parentid)
	{
		for (String winid : allid) 
		{
			if (winid != parentid) 
			{
				driver.switchTo().window(winid);
			}
		}
	}
	public static org.apache.poi.ss.usermodel.Cell FetchSpecificCellData(String path,String sheetname, int i,int j) throws IOException
	{
		f=new File(path);
		fis=new FileInputStream(f);
		wb=new XSSFWorkbook(fis);
		mySheet=wb.getSheet(sheetname);
		particularRow=mySheet.getRow(i);
		return particularRow.getCell(j);
	}
	public static void FetchAllData(String file,String sheetname) throws IOException 
	{
		f=new File("C:\\Users\\Dell\\eclipse-workspace\\SeleniumWebDriver\\src\\test\\resources\\Data\\"+file+".xlsx"); 
		fis=new FileInputStream(f);
		wb=new XSSFWorkbook(fis);
		mySheet=wb.getSheet(sheetname);
		for(int i=0;i<mySheet.getPhysicalNumberOfRows();i++)
		{
			iterateRow=mySheet.getRow(i); 
			for (int j = 0; j <iterateRow.getPhysicalNumberOfCells(); j++) 
			{ 
				iterateCell=iterateRow.getCell(j); 
				System.out.println(iterateCell);
			}
		}
	}
	public static void DataType(String file,String sheetname) throws IOException
	{
		f = new File("C:\\Users\\Dell\\eclipse-workspace\\SeleniumWebDriver\\src\\test\\resources\\Data\\"+file+".xlsx");
		fis = new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
		mySheet=wb.getSheet(sheetname);
		for (int i = 0; i < mySheet.getPhysicalNumberOfRows(); i++) 
		{
			r=mySheet.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) 
			{
				c=r.getCell(j);
				int cellType=c.getCellType(); // CellType 1--String , other than 1 date, numeric

				if (cellType == 1) 
				{
					String value = c.getStringCellValue();
					System.out.println(value);
				}
				else if (DateUtil.isCellDateFormatted(c)) 
				{
					Date dt = c.getDateCellValue();
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
					String value1 = sdf.format(dt);
					System.out.println(value1);
				}
				else 
				{
					double value2 = c.getNumericCellValue();
					long l = (long) value2;
					String value3 = String.valueOf(l);
					System.out.println(value3);
				}

			}
		}
	}
	public static void AddNewData(String file ,String sheetname, String data) throws IOException
	{
		f = new File("C:\\Users\\Dell\\eclipse-workspace\\SeleniumWebDriver\\src\\test\\resources\\Data\\"+file+".xlsx");
		wb = new XSSFWorkbook();
		newSheet=wb.createSheet(sheetname);
		newRow=newSheet.createRow(0);
		newCell=newRow.createCell(0);
		newCell.setCellValue(data);
		
		fos = new FileOutputStream(f);
		wb.write(fos);
	}
	public static void createNewExcel(int rowNum, int cellNum, String newData, String file, String sheet) throws IOException
	{
		f = new File("C:\\Users\\Dell\\eclipse-workspace\\SeleniumWebDriver\\src\\test\\resources\\Data\\"+file+".xlsx");
		wb = new XSSFWorkbook();
		newSheet=wb.createSheet(sheet);
		newRow=newSheet.createRow(rowNum);
		newCell=newRow.createCell(cellNum);
		newCell.setCellValue(newData);
		
		fos = new FileOutputStream(f);
		wb.write(fos);
	}	
	public static void createRow(int rowNum, int cellNum,  String newData, String file, String sheet) throws IOException
	{
		f = new File("C:\\Users\\Dell\\eclipse-workspace\\SeleniumWebDriver\\src\\test\\resources\\Data\\"+file+".xlsx");
		fis=new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
		mySheet=wb.getSheet(sheet);
		r=mySheet.createRow(rowNum);
		c=r.createCell(cellNum);
		c.setCellValue(newData);
		
		fos = new FileOutputStream(f);
		wb.write(fos);
	}
	public static void createCell(int rowNum, int cellNum,  String newData, String file, String sheetname) throws IOException
	{
		f = new File("C:\\Users\\Dell\\eclipse-workspace\\SeleniumWebDriver\\src\\test\\resources\\Data\\"+file+".xlsx");
		fis=new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetname);
		r=sheet.getRow(rowNum);
		c=r.createCell(cellNum);
		c.setCellValue(newData);
		
		fos = new FileOutputStream(f);
		wb.write(fos);
	}
	public static void updateDataToParticularCell(int getTheRow, int getTheCell,  String existingData, String writeNewData, String file, String sheet) throws IOException
	{
		f = new File("C:\\Users\\Dell\\eclipse-workspace\\SeleniumWebDriver\\src\\test\\resources\\Data\\"+file+".xlsx");
		fis=new FileInputStream(f);
		wb = new XSSFWorkbook(fis);
		mySheet=wb.getSheet(sheet);
		r=mySheet.getRow(getTheRow);
		c=r.createCell(getTheCell);
		String str=c.getStringCellValue();
		if(str.equals(existingData))
		{
			c.setCellValue(writeNewData);
		}
		
		fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
}
