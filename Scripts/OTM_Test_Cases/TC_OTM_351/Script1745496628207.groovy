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

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/div_Business Process Automation'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/ins_Document Manager_oj-treeview-icon oj-tr_a56262'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Report Manager'))

WebUI.click(findTestObject('Object Repository/Page_Reports/a_Run'))

WebUI.click(findTestObject('Object Repository/Page_BILL_OF_LADING Report/a__P_SHIPMENT_GID_find'))

WebUI.switchToWindowTitle('Shipments Finder')

WebUI.click(findTestObject('Object Repository/Page_Shipments Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Shipments Result/input_Domain Name_Selected'))

WebUI.click(findTestObject('Object Repository/Page_Shipments Result/button_Finish'))

WebUI.switchToWindowTitle('BILL_OF_LADING Report')

WebUI.click(findTestObject('Object Repository/Page_BILL_OF_LADING Report/button_Submit'))

WebUI.closeBrowser()

