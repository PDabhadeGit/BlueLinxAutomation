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

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Open in New Window_tm-sb-icon'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Payment Rule Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Match Rule Profile'))

WebUI.click(findTestObject('Object Repository/Page_Match Rule Profiles Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Match Rule Profiles Result/div_BXC.DEFAULT_TL'))

WebUI.click(findTestObject('Object Repository/Page_Match Rule Profiles Result/a_BXC.DEFAULT_TL'))

WebUI.click(findTestObject('Object Repository/Page_Match Rule Profile/a_INVOICE_TL_MATCH_RULE'))

WebUI.switchToWindowTitle('Match Rule')

WebUI.doubleClick(findTestObject('Object Repository/Page_Match Rule/div_TL MATCH RULE SHIPMENT ID, CARRIER SCAC_c7d11b'))

WebUI.click(findTestObject('Object Repository/Page_Match Rule/table_Match Rule IDINVOICE_TL_MATCH_RULEMat_8c5efe'))

WebUI.delay(5)

WebUI.closeBrowser()

