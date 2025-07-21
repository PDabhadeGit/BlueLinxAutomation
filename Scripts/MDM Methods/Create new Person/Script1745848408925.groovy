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

//WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/svg_Good afternoon, Prajyot Dabhade_suiicon_bb84df'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Customer Data Management'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Persons'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Person - Persons - Oracle/img_Wrap_pt1_FOr11_FONSr20_FOTsr10pt1r10AP1_5abd9a'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/a_Usage_pt1_FOr11_FONSr20MAnt21AP1r10select_1e6867'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/li_Contact'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/input_First Name_pt1_FOr11_FONSr20MAnt21AP1_dd4906'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/input_Last Name_pt1_FOr11_FONSr20MAnt21AP1r_5680c2'), 
    'Person')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/a_Customer_pt1_FOr11_FONSr20MAnt21AP1r10cus_5910e0'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/a_Search'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/input_Name_pt1_FOr11_FONSr20MAnt21AP1r10cus_3ecffd'), 
    'Test Customer')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/button_Search'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/span_Test Customer'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/button_OK'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/span_Save and Close'))

WebUI.closeBrowser()

