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

WebUI.callTestCase(findTestCase('OTM_Methods/Search Created Order'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('OTM_Methods/Select Order'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/a_Actions_finderActionButtonImg'))

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/span_Operational Planning'))

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/span_Create Buy Shipment'))

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/a_Bulk Plan - Buy'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/Page_Shipment Planning/button_OK (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Bulk Plan/button_Refresh'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Bulk Plan/button_Refresh'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Bulk Plan/button_Refresh'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Bulk Plan/a_1'))

WebUI.switchToWindowIndex(2)

WebUI.click(findTestObject('Bulk plan objects/Page_Buy Shipments Result/input_Domain Name_Selected'))

WebUI.click(findTestObject('Bulk plan objects/Page_Buy Shipments Result/button_Actions'))

WebUI.click(findTestObject('Bulk plan objects/Page_Buy Shipments Result/span_Shipment Management'))

WebUI.click(findTestObject('Bulk plan objects/Page_Buy Shipments Result/span_Map'))

WebUI.click(findTestObject('Bulk plan objects/Page_Buy Shipments Result/a_Map Shipments'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

