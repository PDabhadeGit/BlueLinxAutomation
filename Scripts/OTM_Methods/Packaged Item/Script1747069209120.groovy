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

WebUI.click(findTestObject('Object Repository/Page_Order Releases Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/input_BXC.SO_329_3851_Selected'))

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/input_Actions_rgViewButtonImg'))

WebUI.scrollToElement(findTestObject('Page_Invoice - Header/a_Line Items', [('variable') : 'Line Item Data']), 1)

WebUI.click(findTestObject('Page_Order Release/span_Line Item Data'))

WebUI.click(findTestObject('Page_Item - Package Items/a_1000983'))

WebUI.switchToWindowTitle('Packaged Item')

WebUI.delay(5)

WebUI.closeBrowser()

