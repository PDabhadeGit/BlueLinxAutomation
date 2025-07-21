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

WebUI.click(findTestObject('MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/svg_Navigator (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/div_Tools'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/span_Audit Reports'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Audit Reports/div_Search Results_xmo'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MDM_Page_Objects/Page_Audit Reports/select_Pages and Business Objects Extensibi_9cd1d3'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Audit Reports/button_Search'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Audit Reports/a_Date__FOpt1_FOr10_FONSr20_FOTsr10qryId1va_01d494'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Audit Reports/td_30'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MDM_Page_Objects/Page_Audit Reports/select_EqualsBeforeAfterBetween'), 
    'BEFORE', true)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Audit Reports/button_Search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MDM_Page_Objects/Page_Audit Reports/select_Pages and Business Objects Extensibi_9cd1d3'), 
    '8', true)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Audit Reports/span_e'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Audit Reports/div_Search Results_xmo'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Audit Reports/td_Export to Excel'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Audit Reports/td_Home'))

