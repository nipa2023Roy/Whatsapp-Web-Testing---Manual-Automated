import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;


public class Whatsapp_test {
    WebDriver driver;
    String ExcelPath = "F:\\codes\\WhatsApp_WEB\\src\\main\\resources\\PhnNmbr.xlsx";
    private String PhoneNum;

    @BeforeClass
    public void Setup(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://web.whatsapp.com/");

    }
    @Test
    public void TC_001() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[4]/div/div/div[1]")));
        String PhoneNum = null;
        try {
            XSSFWorkbook workbooks = new XSSFWorkbook(ExcelPath);
            XSSFSheet sheet = workbooks.getSheet("Numbers");
            PhoneNum = sheet.getRow(0).getCell(0).getStringCellValue();
            System.out.println(PhoneNum);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }

        WebElement Searchbx = driver.findElement(By.xpath("//*[@id=\"side\"]/div[1]/div/label/div/div[2]"));
        Searchbx.click();
        Searchbx.sendKeys(PhoneNum);
    }
    @Test
    public void TC_002() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[4]/div/div/div[1]")));
        String PhoneNum = null;
        try {
            XSSFWorkbook workbooks = new XSSFWorkbook(ExcelPath);
            XSSFSheet sheet = workbooks.getSheet("Numbers");
            PhoneNum = sheet.getRow(0).getCell(0).getStringCellValue();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }

        WebElement Searchbx = driver.findElement(By.xpath("//*[@id=\"side\"]/div[1]/div/label/div/div[2]"));
        Searchbx.click();
        Searchbx.sendKeys(PhoneNum);

        //Wait for Search Result
        WebElement Element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pane-side\"]/div[1]/div/div/div[1]/div/div/div[2]/div[1]/div")));
       driver.findElement(By.xpath("//*[@id=\"pane-side\"]/div[1]/div/div/div[1]/div/div/div[2]/div[1]/div")).click();

       //Message Box
       WebElement Message = driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/div/div[2]/div[1]/div/div[2]"));
       Message.click();
       Message.sendKeys("Message Sending..");

       //Send Button
       driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/div/div[2]/div[2]")).click();

    }
    @Test
    public void TC_003() {

        WebDriverWait wait = new WebDriverWait(driver, 18);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[4]/div/div/div[1]")));

        try {
            XSSFWorkbook workbooks = new XSSFWorkbook(ExcelPath);
            XSSFSheet sheet = workbooks.getSheet("Numbers");
            PhoneNum = sheet.getRow(0).getCell(0).getStringCellValue();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }

        WebElement Searchbx = driver.findElement(By.xpath("//*[@id=\"side\"]/div[1]/div/label/div/div[2]"));
        Searchbx.click();
        Searchbx.sendKeys(PhoneNum);

        //Wait for Search Result
        WebElement Element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pane-side\"]/div[1]/div/div/div[1]/div/div/div[2]/div[1]/div")));
        driver.findElement(By.xpath("//*[@id=\"pane-side\"]/div[1]/div/div/div[1]/div/div/div[2]/div[1]/div")).click();

        //Message Box
        WebElement Message = driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/div/div[2]/div[1]/div/div[2]"));
        Message.click();
        Message.sendKeys("Message Sending..");

        //Send Button
        driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/div/div[2]/div[2]")).click();
        try
        {
            File file = new File(ExcelPath);
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook workbook= new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet("Numbers");
            sheet.getRow(0).createCell(1).setCellValue("Sent");
            FileOutputStream fos = new FileOutputStream(ExcelPath);
            workbook.write(fos);
            workbook.close();
        }
        catch (Exception ex){

         }
    }

    @Test
    public void TC_004() {

        WebDriverWait wait = new WebDriverWait(driver, 18);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[4]/div/div/div[1]")));

        try {
            XSSFWorkbook workbooks = new XSSFWorkbook(ExcelPath);
            XSSFSheet sheet = workbooks.getSheet("Numbers");
            PhoneNum = sheet.getRow(0).getCell(0).getStringCellValue();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }

        WebElement Searchbx = driver.findElement(By.xpath("//*[@id=\"side\"]/div[1]/div/label/div/div[2]"));
        Searchbx.click();
        Searchbx.sendKeys(PhoneNum);

        //Wait for Search Result
        WebElement Element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pane-side\"]/div[1]/div/div/div[1]/div/div/div[2]/div[1]/div")));
        driver.findElement(By.xpath("//*[@id=\"pane-side\"]/div[1]/div/div/div[1]/div/div/div[2]/div[1]/div")).click();

        //Message Box
        WebElement Message = driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/div/div[2]/div[1]/div/div[2]"));
        Message.click();
        Message.sendKeys("Message Sending..");

        //Send Button
        driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/div/div[2]/div[2]")).click();
        try
        {
            File file = new File(ExcelPath);
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook workbook= new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet("Numbers");
            sheet.getRow(0).createCell(1).setCellValue("Sent");
            FileOutputStream fos = new FileOutputStream(ExcelPath);
            workbook.write(fos);
            workbook.close();
        }
        catch (Exception ex){

        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement ReadChck = driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div[2]/div[2]/div[20]/div/div/div/div[2]/div/div/span"));
        String confirmTxt= ReadChck.getAttribute("aria-label");
        System.out.println(confirmTxt);

        if (confirmTxt=="Delivered"){
            System.out.println("Message not Read");
        }
        else {
            System.out.println("Message Read");
            try
            {
                File file = new File(ExcelPath);
                FileInputStream fis = new FileInputStream(file);
                XSSFWorkbook workbook= new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheet("Numbers");
                sheet.getRow(0).createCell(2).setCellValue("Seen");
                FileOutputStream fos = new FileOutputStream(ExcelPath);
                workbook.write(fos);
                workbook.close();
            }
            catch (Exception exp){

            }

        }
    }

    @Test
    public void TC_005() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"side\"]/header/div[2]/div/span/div[3]/div")));

        driver.findElement(By.xpath("//*[@id=\"side\"]/header/div[2]/div/span/div[3]/div")).click();

        wait = new WebDriverWait(driver, 5);
        element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"side\"]/header/div[2]/div/span/div[3]/span/div[1]/ul/li[4]/div[1]")));
        driver.findElement(By.xpath("//*[@id=\"side\"]/header/div[2]/div/span/div[3]/span/div[1]/ul/li[4]/div[1]")).click();
    }

}
