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

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/div_Order Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Order Release'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Order Release_1'))

WebUI.click(findTestObject('Object Repository/Page_Order Releases Finder/button_Search (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Order Releases Result/input_BXC.LTL_30_Selected'), 200)

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/input_BXC.LTL_30_Selected'))

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/a_Actions_finderActionButtonImg (1)'))

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/span_Operational Planning (1)'))

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/span_Create Buy Shipment (1)'))

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/a_Bulk Plan - Buy (1)'))

WebUI.switchToWindowIndex(1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Shipment Planning/select_BUFBUF_100MILES_BDBUF_150MILES_BDBUF_8e8dc0'), 
    97, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Shipment Planning/button_OK'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Bulk Plan/button_Refresh'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Plan/button_Refresh'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Plan/button_Refresh'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Plan/a_1'))

WebUI.switchToWindowIndex(2)

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/input_Domain Name_Selected'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/a_Actions_finderActionButtonImg'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/img'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/img_1'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/a_Map Shipments'))

WebUI.switchToWindowIndex(3)

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Page_Transportation Workbench/span_Shipment Stops'))

