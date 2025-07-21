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

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/a_BXC.TESTSHP01234'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Stops/button_Financials'))

WebUI.scrollToElement(findTestObject('Page_Buy Shipment - Financials/td_New Shipment Cost'), 100)

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Financials/button_New Shipment Cost'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Buy Shipment - Shipment Cost/select_BaseAccessorialStop-off ChargeDiscou_5bbcb7'), 
    'A', true)

WebUI.setText(findTestObject('Object Repository/Page_Buy Shipment - Shipment Cost/input__shipment_costcostPRF'), '400')

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Shipment Cost/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Financials/button_Finished'))

WebUI.click(findTestObject('Object Repository/Page_Results/a_Buy Shipments Result'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('OTM_Methods/Click Shipment'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Stops/button_Financials'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Buy Shipment - Financials/div_Cost Type'), 100)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

