package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// step 1: create FileInputStream object
		FileInputStream fis=new FileInputStream("./TestData/TestScriptData.xlsx");
		
		// step 2: create respective file type object
		Workbook wb = WorkbookFactory.create(fis);
		
		// step 3: call read methods
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		
		String email = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(email);
		
		String password = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(password);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		driver.get(url);
	}
}
