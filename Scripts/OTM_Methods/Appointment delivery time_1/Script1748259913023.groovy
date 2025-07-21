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

WebUI.callTestCase(findTestCase('OTM_Methods/Search Created shipment'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Buy Shipments Result/a_BXC.TESTSHP01234'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Identification/a_Stops'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Stops/button_MI_edit2_img'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Shipment Stop/a_Appointment Delivery Time_shipment_stopap_a065d9'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Shipment Stop/td_30'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Shipment Stop/button_Save'))

WebUI.delay(5)

