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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://myservices-cacct-6330bf6be13e4766b9a1e72580c33104.console.oraclecloud.com/mycloud/cloudportal/cloudHome')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('null'), 
    'Gaurav.Prasad@BlueLinxCo.com')

WebUI.setEncryptedText(findTestObject('null'), 
    'TCRrBFWPcdZ2hzgwx4amHw==')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Page_My Home - Oracle Services/a_Oracle Transportation and Global Trade Cl_c81655'))

WebUI.switchToWindowTitle('Transportation and Global Trade Management - Home')

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/div_Order Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Order Release'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Order Release_1'))

WebUI.setText(findTestObject('Object Repository/Page_Order Releases Finder/input_Order Release ID_order_releasexid'), 'SO_1501759999')

WebUI.click(findTestObject('Object Repository/Page_Order Releases Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/a_BXC.SO_1501759999'))

