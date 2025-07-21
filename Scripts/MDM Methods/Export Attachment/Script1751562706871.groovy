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

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/svg_Navigator'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/div_Tools'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/span_Export Management'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Exports/button_Create Export Activity'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Export Activity/input_Name__FOpt1_FOr10_FONSr20MAnt21pt1AP1it1'), 
    'Test Export')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Export Activity/input_Object__FOpt1_FOr10_FONSr20MAnt21pt1A_f7a7d3'), 
    'Organization')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Export Activity/li_Organization'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Export Activity/button_Next'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Export Activity/img_Organization_xv0'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Export Activity/body'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Export Activity/body'), 
    'Address1=\'test\'<br>')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Export Activity/button_Save and Close'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Export Activity/button_Next_1'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Export Activity/button_Next_1'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Export Activity/button_Submit'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Exports/img_Unsuccessful__FOpt1_FOr10_FONSr20_FOTsr_ffb4be'))

WebUI.takeFullPageScreenshot()

