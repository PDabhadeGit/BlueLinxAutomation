import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
import net.sf.cglib.beans.BulkBean as BulkBean
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.utils.Write_Status as Write_Status
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By

WebUI.callTestCase(findTestCase('OTM_Methods/Login_OTM'), [:], FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()

WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/div_Fleet Management'))

if (WebUI.verifyElementPresent(findTestObject('Page_Transportation and Global Trade Manage_3d15c4/span_Driver Management'), 5, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Page_Transportation and Global Trade Manage_3d15c4/span_Driver Management'))
}

WebUI.click(findTestObject('Page_Transportation and Global Trade Manage_3d15c4/span_Driver Manager'))

def testData = TestDataFactory.findTestData('OTM Test Data/Driver IDs')

int totalRows = testData.getRowNumbers()

for (int i = 2; i <= totalRows; i++) {
	def cellValue = testData.getValue(1, i)
	def cellValue1 = testData.getValue(2, i)

	if ((cellValue == null) || cellValue.trim().isEmpty()) {
		println("Row $i is empty. Closing browser and exiting loop.")

		WebUI.closeBrowser()

		break
	}
	cellValue1 = testData.getValue(2, i)

if (cellValue1 != null && !cellValue1.trim().isEmpty()) {
	println('Skipping Ref num: ' + cellValue1)
	continue
}
	String driverID = testData.getValue(1, i)

	println('Running for Driver ID: ' + driverID)

	WebUI.delay(15)

	WebUI.setText(findTestObject('Object Repository/driver objects/Page_DRIVER Finder/input_Driver ID_driverdriver_xid'),
		driverID)

	WebUI.delay(5)

	WebUI.click(findTestObject('Object Repository/driver objects/Page_DRIVER Finder/button_Involved Party Contact_search_button'))

	WebUI.delay(5)

	String refnum = WebUI.getText(findTestObject('Object Repository/driver objects/Page_DRIVER Result/a_Domain Name_rgSGSec.2.1.1.3.k'))

	println('reference number: ' + refnum)

	String refnum1 = refnum.substring(refnum.length() - 8)

	System.out.println('Last 8 digits: ' + refnum1)

	//Write_Status.writeToCell('Data Files/OTM Test Data/Driver IDs data.xlsx', 'Sheet1', i - 1, 1, refnum1)
	WebUI.click(findTestObject('Object Repository/driver objects/Page_DRIVER Result/a_Domain Name_rgSGSec.2.1.1.3.k'))

	WebUI.switchToWindowIndex(1)

	WebUI.maximizeWindow()

	WebUI.delay(3)

	String text = WebUI.getText(findTestObject('Object Repository/driver objects/Page_Driver - Driver/Reference_Num'))

	println(text)

	if ((text == null) || text.trim().isEmpty()) {
		WebUI.selectOptionByValue(findTestObject('Object Repository/driver objects/Page_Driver - Driver/select__driver_refnumdriver_refnum_qualxidID'),
			'BXC.DRIVER_ID', true)

		// WebUI.click(findTestObject('Object Repository/driver objects/Page_Driver - Driver/td_DRIVER_ID_gridBodyCell'))
		WebUI.setText(findTestObject('Object Repository/driver objects/Page_Driver - Driver/input__driver_refnumdriver_refnum_value'),
			refnum1)

		WebUI.click(findTestObject('Object Repository/driver objects/Page_Driver - Driver/button__enButton'))

		WebUI.click(findTestObject('Object Repository/driver objects/Page_Driver - Driver/button_Driver_finished_button'))

		WebUI.delay(5)

		WebUI.closeWindowIndex(1)

		WebUI.switchToWindowIndex(0)

		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/driver objects/Page_DRIVER Result/a_Domain Name_rgSGSec.2.1.1.3.k'))

		WebUI.switchToWindowIndex(1)

		WebUI.maximizeWindow()

		WebUI.delay(3)

		String text1 = WebUI.getText(findTestObject('Object Repository/driver objects/Page_Driver - Driver/Reference_Num'))

		Write_Status.writeToCell('Data Files/OTM Test Data/Driver IDs data.xlsx', 'Sheet1', i - 1, 1, text1)

		WebUI.closeWindowIndex(1)

		WebUI.switchToWindowIndex(0)

		WebUI.click(findTestObject('Object Repository/driverobjects2/Page_DRIVER Result/button_New Query_enButton'))

		Write_Status.writeToCell('Data Files/OTM Test Data/Driver IDs data.xlsx', 'Sheet1', i - 1, 2, 'Success')
	} else {
		println('Reference number is already present : ' + text)

		WebUI.closeWindowIndex(1)

		WebUI.switchToWindowIndex(0)

		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/driverobjects2/Page_DRIVER Result/button_New Query_enButton'))

		Write_Status.writeToCell('Data Files/OTM Test Data/Driver IDs data.xlsx', 'Sheet1', i - 1, 1, text)

		Write_Status.writeToCell('Data Files/OTM Test Data/Driver IDs data.xlsx', 'Sheet1', i - 1, 2, 'Ref No. is already present')
	}
}

/*for (int i = 2; i <= totalRows; i++) {
	def cellValue = testData.getValue(1, i)
	

	
	
	if ((cellValue == null) || cellValue.trim().isEmpty()) {
		println("Row $i is empty. Closing browser and exiting loop.")
		WebUI.closeBrowser()
		break
	}
	
	def cellValue1 = testData.getValue(2, i)
	println("DEBUG: Row $i → cellValue1: '$cellValue1'")
	if (cellValue1 != null && !cellValue1.trim().isEmpty()) {
		println("Skipping Ref num (already exists): " + cellValue1)
		continue
	}

	
	String driverID = cellValue
	println("Running for Driver ID: " + driverID)

	WebUI.delay(15)

	WebUI.setText(findTestObject('Object Repository/driver objects/Page_DRIVER Finder/input_Driver ID_driverdriver_xid'), driverID)

	WebUI.delay(5)
	WebUI.click(findTestObject('Object Repository/driver objects/Page_DRIVER Finder/button_Involved Party Contact_search_button'))
	WebUI.delay(5)

	String refnum = WebUI.getText(findTestObject('Object Repository/driver objects/Page_DRIVER Result/a_Domain Name_rgSGSec.2.1.1.3.k'))
	println("Reference number: " + refnum)

	String refnum1 = refnum.substring(refnum.length() - 8)
	println("Last 8 digits: " + refnum1)

	WebUI.click(findTestObject('Object Repository/driver objects/Page_DRIVER Result/a_Domain Name_rgSGSec.2.1.1.3.k'))
	WebUI.switchToWindowIndex(1)
	WebUI.maximizeWindow()
	WebUI.delay(3)

	String text = WebUI.getText(findTestObject('Object Repository/driver objects/Page_Driver - Driver/Reference_Num'))

	if ((text == null) || text.trim().isEmpty()) {
		// Ref number field is empty → set the reference number
		WebUI.selectOptionByValue(findTestObject('Object Repository/driver objects/Page_Driver - Driver/select__driver_refnumdriver_refnum_qualxidID'), 'BXC.DRIVER_ID', true)

		WebUI.setText(findTestObject('Object Repository/driver objects/Page_Driver - Driver/input__driver_refnumdriver_refnum_value'), refnum1)

		WebUI.click(findTestObject('Object Repository/driver objects/Page_Driver - Driver/button__enButton'))
		WebUI.click(findTestObject('Object Repository/driver objects/Page_Driver - Driver/button_Driver_finished_button'))
		WebUI.delay(5)

		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
		WebUI.delay(3)

		// Open again to get the updated value
		WebUI.click(findTestObject('Object Repository/driver objects/Page_DRIVER Result/a_Domain Name_rgSGSec.2.1.1.3.k'))
		WebUI.switchToWindowIndex(1)
		WebUI.maximizeWindow()
		WebUI.delay(3)

		String text1 = WebUI.getText(findTestObject('Object Repository/driver objects/Page_Driver - Driver/Reference_Num'))

		Write_Status.writeToCell('Data Files/OTM Test Data/Driver IDs data.xlsx', 'Sheet1', i - 1, 1, text1)

		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)

		WebUI.click(findTestObject('Object Repository/driverobjects2/Page_DRIVER Result/button_New Query_enButton'))

		Write_Status.writeToCell('Data Files/OTM Test Data/Driver IDs data.xlsx', 'Sheet1', i - 1, 2, 'Success')
	} else {
		// Ref number is already present
		println("Reference number is already present: " + text)

		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/driverobjects2/Page_DRIVER Result/button_New Query_enButton'))

		Write_Status.writeToCell('Data Files/OTM Test Data/Driver IDs data.xlsx', 'Sheet1', i - 1, 1, text)
		Write_Status.writeToCell('Data Files/OTM Test Data/Driver IDs data.xlsx', 'Sheet1', i - 1, 2, 'Ref No. is already present')
	}
}
*/
WebUI.closeBrowser()

