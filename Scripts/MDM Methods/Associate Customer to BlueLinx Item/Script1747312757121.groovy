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

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Product Management'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Product Information Management'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/img_PrintMe__FOpt1_FOr10_FONSr20_FOTsdiItem_3ddbb3'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/a_Manage Items'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/input_Item Operator__FOpt1_FOr10_FONSr20MAt_4d7e4b'), 
    'test style item41')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/button_Search'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/a_Test Style Item41'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/a_Relationships'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/a_Trading Partner Items'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/img_Wrap__FOpt1_FOr10_FONSr20MAt30pt1ap1sTP_fa60fb'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/a_Customer Name__FOpt1_FOr10_FONSr20MAt30pt_d6a78d'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/span_THE HOME DEPOT'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/a_Customer Item__FOpt1_FOr10_FONSr20MAt30pt_232dfd'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/td_265977'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/a_OK'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/a_Save__FOpt1_FOr10_FONSr20MAt30pt1ap1csave_83bb2e'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/td_Save and Close'))

