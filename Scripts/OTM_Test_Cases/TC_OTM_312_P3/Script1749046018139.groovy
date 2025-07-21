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

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/div_Shipment Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Shipment Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Buy Shipments'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Finder/button_Search'))

WebUI.delay(5)

WebUI.rightClick(findTestObject('Object Repository/Page_Buy Shipments Result/a_BXC.8000'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/a_Related Invoices'))

WebUI.click(findTestObject('Object Repository/Page_Invoices Result/span_Transportation and Global Trade Manage_f1b5a4'))

