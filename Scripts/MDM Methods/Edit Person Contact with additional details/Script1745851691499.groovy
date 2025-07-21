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

//WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/svg_Good evening, Prajyot Dabhade_suiicon f_37fe22'))
WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Customer Data Management'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Persons'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Person - Persons - Oracle/a_Persons__FOpt1_FOr10_FONSr20_FOTsr10pt1r1_eb2d50'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Person - Persons - Oracle/input_Name Operator__FOpt1_FOr10_FONSr20_FO_509af9'), 
    'test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Person - Persons - Oracle/button_Search'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Person - Persons - Oracle/span_Test Person'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/img_Wrap__FOpt1_FOr10_FONSr20MAnt21r10AP3r1_01021f'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/a_Contact Preferences__FOpt1_FOr10_FONSr20M_c968e7'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/a_Fax__FOpt1_FOr10_FONSr20MAnt21r10AP3r110A_7d8dc0'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/li_Work'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/input_Area Code__FOpt1_FOr10_FONSr20MAnt21r_5df2a0'), 
    '9999999999')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/img_Wrap__FOpt1_FOr10_FONSr20MAnt21r10AP3r1_edc652'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/a_Contact Preferences__FOpt1_FOr10_FONSr20M_fd8c0f'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/input_Bill To__FOpt1_FOr10_FONSr20MAnt21r10_9cc4af'), 
    'test@gmail.com')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/button_Save'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Persons - Oracle Fusion/button_Save and Close'))

WebUI.closeBrowser()

