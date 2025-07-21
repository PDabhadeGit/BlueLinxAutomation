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

WebUI.click(findTestObject('Page_Transportation and Global Trade Manage_3d15c4/div_Contract and Rate Management'))

WebUI.click(findTestObject('Page_Transportation and Global Trade Manage_3d15c4/span_Contract Management'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Rate Offering'))

WebUI.setText(findTestObject('Object Repository/Page_Rate Offering Finder/input_Rate Offering ID_rate_offeringxid'), 'RAIL')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Rate Offering Finder/select_Begins WithEnds WithIs NullNot NullO_756104'), 
    'contains', true)

WebUI.click(findTestObject('Object Repository/Page_Rate Offering Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Rate Offering Result/a_BXC.GENERIC_RAIL'))

WebUI.click(findTestObject('Object Repository/Page_Rate Offering - Rate Header/button_Finished'))

WebUI.closeBrowser()

