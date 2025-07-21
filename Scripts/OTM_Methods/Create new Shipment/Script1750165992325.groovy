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
import org.openqa.selenium.Keys as Keys
import net.bytebuddy.asm.Advice.Enter as Enter
import java.nio.file.Files as Files
import java.nio.file.Paths as Paths
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.io.FileInputStream as FileInputStream
import java.io.FileOutputStream as FileOutputStream
import java.io.File as File
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('OTM_Methods/Login_OTM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/div_Shipment Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Shipment Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Buy Shipments'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Finder/button_New'))

Random rnd = new Random()

// Generate a random 6-digit number between 100000 and 999999
int randomNumber = 100 + rnd.nextInt(900)

// Combine the prefix with the random number
String result = 'TESTSHP' + randomNumber

WebUI.setText(findTestObject('Object Repository/Page_Buy Shipment - Identification/input_Shipment ID_shipmentxid'), result)

WebUI.setText(findTestObject('Object Repository/Page_Buy Shipment - Identification/input_Shipment Name_shipmentname'), 'Test Shipment')

WebUI.setText(findTestObject('Object Repository/Page_Buy Shipment - Identification/input_Service Provider ID_shipmentservprovxid'), 
    'BXC_FLEET')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Buy Shipment - Identification/select_AIRALLBARGEDEMURRAGEDRAYAGEETLEXPRES_72ebf5'), 
    'FLEET', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Buy Shipment - Identification/select_APPOINTMENTHANDLINGLINEHAULNON FREIG_c6dca6'), 
    'TRANSPORT', true)

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Identification/a__shipmentstart_timeglyph'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Identification/a_Select Date and Time_shipmentstart_timepo_5b5b48'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Identification/td_11'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Identification/a__shipmentend_timeglyph'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Identification/a_Select Date and Time_shipmentend_timepopC_451a14'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Identification/td_20'))

WebUI.click(findTestObject('Page_Buy Shipment - Identification/button_Equipment (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Buy Shipment - Equipment/input__shipment_s_equipment_joins_equipmentxid'), 
    '6080')

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Equipment/button_Save'))

WebUI.click(findTestObject('Page_Buy Shipment - Equipment/button_Stops (2)'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Stops/button_New Stop'))

WebUI.setText(findTestObject('Object Repository/Page_Buy Shipment - Shipment Stop/input__shipment_stopstop_numPRF'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Buy Shipment - Shipment Stop/input__shipment_stoplocationxid'), 'CUS-6703-21053')

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Shipment Stop/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Stops/button_New Stop_1'))

WebUI.setText(findTestObject('Object Repository/Page_Buy Shipment - Shipment Stop/input__shipment_stopstop_numPRF'), '2')

WebUI.setText(findTestObject('Object Repository/Page_Buy Shipment - Shipment Stop/input__shipment_stoplocationxid'), 'CUS-8397-29598')

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Shipment Stop/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Stops/button_Financials_1'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Remarks/button_Finished'))

WebUI.click(findTestObject('Object Repository/Page_Results/button_View'))

String newshipmentid = WebUI.getText(findTestObject('Object Repository/Page_Buy Shipment/div_EFEWWE'))

WebUI.delay(5)

// Define Excel path
String excelFilePath = 'C:\\BlueLinx_Automation_Master\\Data Files\\OTM Test Data\\OTM Shipment data.xlsx'

// Call the custom keyword
CustomKeywords.'com.utils.ExcelWriter.writeOrderIdToExcel'(excelFilePath, newshipmentid)

println("Appended Order ID to Excel: $newshipmentid")

