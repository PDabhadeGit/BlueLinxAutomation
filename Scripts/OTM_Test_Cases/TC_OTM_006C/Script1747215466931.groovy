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

WebUI.callTestCase(findTestCase('OTM_Methods/Login_OTM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('OTM_Methods/Search Created shipment'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Buy Shipments Result/a_BXC.TESTSHP01234'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Identification/button_Equipment'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Equipment/button_Stops'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Stops/button_Financials'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Financials/button_Involved Parties'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Involved Parties/button_Mode'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Mode/button_Remarks'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Remarks/button_Groups and Charges'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Groups and Charges/button_Tracking'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Tracking/button_Documents'))

WebUI.closeBrowser()

