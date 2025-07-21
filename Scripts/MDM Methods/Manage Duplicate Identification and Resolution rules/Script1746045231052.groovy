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

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Duplicate Identification'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Duplicate Identification/img_Wrap_pt1_FOr11_FONSr20_FOTsr10pt1r10AP1_9172b0'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Duplicate Identification/input_Batch Name_pt1_FOr11_FONSr20MAnt21AP1_34decf'), 
    'Test Batch')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Duplicate Identification/input_Batch Description_pt1_FOr11_FONSr20MA_7e93c7'), 
    'Test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Duplicate Identification/img_Wrap_pt1_FOr11_FONSr20MAnt21AP1AT4_ATpc_54736c'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Duplicate Identification/a_Value_pt1_FOr11_FONSr20MAnt21AP1AT4_ATpta_54bda1'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Duplicate Identification/li_Address'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Duplicate Identification/a_Object_pt1_FOr11_FONSr20MAnt21AP1AT4_ATpt_05fa57'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Duplicate Identification/li_Address line 1'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Duplicate Identification/a_Attribute_pt1_FOr11_FONSr20MAnt21AP1AT4_A_f89412'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Duplicate Identification/li_Starts with'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Duplicate Identification/input_Operator_pt1_FOr11_FONSr20MAnt21AP1AT_8c739b'), 
    'Test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Duplicate Identification/span_Schedule'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Duplicate Identification/input_Submission Notes_pt1_FOr11_FONSr20MAn_366fd3'), 
    'Test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Duplicate Identification/span_Submit'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Duplicate Identification/button_OK'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

