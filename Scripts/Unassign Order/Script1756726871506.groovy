import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.utils.Write_Status as Write_Status
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.utils.Write_Status as Write_Status
 
WebUI.callTestCase(findTestCase('OTM_Methods/Login_OTM'), [:], FailureHandling.STOP_ON_FAILURE)
 
WebDriver driver = DriverFactory.getWebDriver()
 
WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/div_Fleet Management'))
 
WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/span_Dispatch Board'))
 
WebUI.delay(20)
 
WebUI.click(findTestObject('Page_Fleet management/Shipment_adder'))
 
WebUI.switchToFrame(findTestObject('Shipment_finder'), 1)
 
//WebUI.setText(findTestObject('Page_Fleet management/Bulk plan id'), '20250604-0002')
WebUI.click(findTestObject('Page_Fleet management/Search_button'))
 
WebUI.click(findTestObject('Page_Fleet management/checkbox1'))
 
WebUI.switchToDefaultContent()
 
WebUI.delay(4)
 
WebUI.click(findTestObject('Page_Fleet management/Finish_button'))
 
WebUI.click(findTestObject('Page_Fleet management/checkbox2'))
 
WebUI.click(findTestObject('Page_Fleet management/Shipment order_release'))
 
WebUI.click(findTestObject('Page_Fleet management/checkbox3'))
 
WebElement table = driver.findElement(By.xpath('//*[@id="RootPane_2_1"]/wb-layout//*[@id="RootPane_2_1_region_3_moduleRegion"]/div[1]'))
 
List<WebElement> rows = table.findElements(By.xpath('.//tbody/tr'))
 
println('Total rows: ' + rows.size())
 
List<String> fifthColumnValues = []
 
 
for (int k = 0; k < rows.size(); k++) {
	WebElement row = rows.get(k)
	List<WebElement> cols = row.findElements(By.tagName('td'))
 
	if (cols.size() >= 5) {
		String cellText = cols[4].getText().trim()
 
		println("Row ${k + 1}, Column 5: ${cellText}")
 
		fifthColumnValues.add(cellText)
	} else {
		println("Row ${k + 1} has less than 5 columns")
	}
}
 
String combinedText = fifthColumnValues.join(', ')
 
println("Combined 5th column values: ${combinedText}")
 
Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', 1, 1, combinedText)
 
WebUI.closeBrowser()
 