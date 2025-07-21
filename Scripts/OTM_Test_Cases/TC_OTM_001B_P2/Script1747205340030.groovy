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

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/div_Contract and Rate Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Contract Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Rate Record'))

WebUI.click(findTestObject('Object Repository/Page_Rate Records Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Rate Records Result/a_BXC.CN_RAIL_CHGO_IL_SCH_WI_LUMBER_53FT_LC_25'))

WebUI.click(findTestObject('Object Repository/Page_Rate Record - Lane Info/a_Attributes'))

WebUI.click(findTestObject('Object Repository/Page_Rate Record - Attributes/a_Rate Costs'))

WebUI.click(findTestObject('Object Repository/Page_Rate Record - Rate Costs/a_Accessorials'))

WebUI.click(findTestObject('Object Repository/Page_Rate Record - Accessorials/a_Special Services'))

WebUI.click(findTestObject('Object Repository/Page_Rate Record - Special Services/a_Remarks'))

WebUI.click(findTestObject('Object Repository/Page_Rate Record - Remarks/span_Transportation and Global Trade Manage_f1b5a4'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Contract and Rate Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Ask Oracle'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Rate Inquiry'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Ask Oracle About Rates/select_LTL_NMFC  BXCRAIL  BXCTL_RATE  BXC'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Ask Oracle About Rates/button_Search'))

WebUI.closeBrowser()

