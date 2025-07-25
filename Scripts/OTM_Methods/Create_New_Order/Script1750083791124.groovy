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
import net.bytebuddy.asm.Advice.Enter as Enter
import java.nio.file.Files as Files
import java.nio.file.Paths as Paths
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.io.FileInputStream as FileInputStream
import java.io.FileOutputStream as FileOutputStream
import java.io.File as File
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils

//import com.utils.ExcelWriter
WebUI.callTestCase(findTestCase('OTM_Methods/Login_OTM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/div_Order Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Order Release'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Order Release_1'))

WebUI.click(findTestObject('Object Repository/Page_Order Releases Finder/button_New'))

Random rnd = new Random()

// Generate a random 6-digit number between 100000 and 999999
int randomNumber = 100000 + rnd.nextInt(900000)

// Combine the prefix with the random number
String result = 'SO_Test' + randomNumber

// Set the combined string in a text field
WebUI.setText(findTestObject('Object Repository/Page_Order Release - Order Release/input_Order Release ID_order_releasexid'), 
    result)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Order Release - Order Release/select_CUSTOMER_ORDERDISTRIBUTION_ORDEREQUI_466aab'), 
    'SALES_ORDER', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Order Release - Order Release/select_AGGREGATE LINE PREPACKAUTO_CALCAUTO__5ad408'), 
    'SHIP_UNIT_LINES', true)

WebUI.setText(findTestObject('Page_Order Release - Order Release/input__order_releasesourcexid'), 'CUS-11756-63834')

WebUI.setText(findTestObject('Page_Order Release - Order Release/input__order_releasedestinationxid'), 'CUS-6704-19924')

WebUI.click(findTestObject('Object Repository/Page_Order Release - Order Release/button_Ship Unit'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Order Release - Ship Unit/button_New Ship Unit'))

Random rnd1 = new Random()

// Generate a random 3-digit number between 100 and 999
int randomNumber1 = 100 + rnd1.nextInt(900)

WebUI.setText(findTestObject('Object Repository/Page_Order Release - Ship Unit/input_Ship Unit ID_ship_unitxid'), String.valueOf(
        randomNumber1))

WebUI.switchToWindowTitle('Order Release - Ship Unit')

WebUI.click(findTestObject('Object Repository/Page_Order Release - Ship Unit/button_New Line Item'))

WebUI.setText(findTestObject('Page_Order Release - Line Item/input_Packaged Item ID_linepackaged_itemxid'), '817933')

WebUI.switchToWindowTitle('Order Release - Ship Unit Line')

WebUI.click(findTestObject('Object Repository/Page_Order Release - Ship Unit Line/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Order Release - Ship Unit/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Order Release - Ship Unit/button_Line Item_1'))

WebUI.click(findTestObject('Object Repository/Page_Order Release - Constraints/button_Involved Parties'))

WebUI.click(findTestObject('Object Repository/Page_Order Release - Involved Parties/button_Other Attributes'))

WebUI.click(findTestObject('Object Repository/Page_Order Release - Other Attributes/button_Services'))

WebUI.click(findTestObject('Object Repository/Page_Order Release - Services/button_Remarks'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Order Release - Remarks/select_ACTUALS_RECEIVEDADD_INFOSAXLE_GROUPB_93247e'), 
    'TASK_NAME', true)

WebUI.setText(findTestObject('Object Repository/Page_Order Release - Remarks/textarea__order_release_remarkremark_text'), 
    'Testing')

WebUI.click(findTestObject('Object Repository/Page_Order Release - Remarks/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Order Release - Remarks/button_Finished'))

WebUI.click(findTestObject('Object Repository/Page_Results/button_View (1)'))

String neworderid = WebUI.getText(findTestObject('Page_Order Release/div_SO_TEST999999'))

WebUI.delay(5)

// Define Excel path
String excelFilePath = 'C:\\BlueLinx_Automation_Master\\Data Files\\OTM Test Data\\OTM Order data.xlsx'

// Call the custom keyword
CustomKeywords.'com.utils.ExcelWriter.writeOrderIdToExcel'(excelFilePath, neworderid)

println("Appended Order ID to Excel: $neworderid")

// Optional: Set to global variable
GlobalVariable.Enter_order_Id = neworderid

WebUI.closeBrowser()

