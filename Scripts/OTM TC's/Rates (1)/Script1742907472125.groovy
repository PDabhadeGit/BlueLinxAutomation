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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://myservices-cacct-6330bf6be13e4766b9a1e72580c33104.console.oraclecloud.com/mycloud/cloudportal/cloudHome')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    'Gaurav.Prasad@BlueLinxCo.com')

WebUI.setEncryptedText(findTestObject('null'), 
    'TCRrBFWPcdZ2hzgwx4amHw==')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Page_My Home - Oracle Services/a_Oracle Transportation and Global Trade Cl_c81655'))

WebUI.switchToWindowTitle('Transportation and Global Trade Management - Home')

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/div_Ask Oracle'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Rates'))

WebUI.click(findTestObject('Object Repository/Page_Ask Oracle About Rates/input_Location ID_location_xid_src'))

WebUI.setText(findTestObject('Object Repository/Page_Ask Oracle About Rates/input_Location ID_location_xid_src'), 'BXC_ATL')

WebUI.click(findTestObject('Object Repository/Page_Ask Oracle About Rates/input_Location ID_location_xid_src'))

WebUI.setText(findTestObject('Object Repository/Page_Ask Oracle About Rates/input_Location ID_location_xid_dest'), '')

WebUI.click(findTestObject('Object Repository/Page_Ask Oracle About Rates/input_Location ID_location_xid_dest'))

WebUI.setText(findTestObject('Object Repository/Page_Ask Oracle About Rates/input_Location ID_location_xid_dest'), 'CUS_WOOMACCOLGA')

WebUI.click(findTestObject('Object Repository/Page_Ask Oracle About Rates/button_Search'))

WebUI.closeBrowser()

