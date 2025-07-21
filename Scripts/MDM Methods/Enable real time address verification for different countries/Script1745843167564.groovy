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

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_Attachments__FOpt1_FOr10_FONSr20MAnt21r10_0925ca'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/img_Wrap__FOpt1_FOr10_FONSr20MAnt21r10AP3r5_7959f2'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Site Name__FOpt1_FOr10_FONSr20MAnt21r_cd125b'), 
    'real time address varification')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_City__FOpt1_FOr10_FONSr20MAnt21r10AP3_bf004d'), 
    'hamilton')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/li_Fairfield, Hamilton, OH'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Postal Code__FOpt1_FOr10_FONSr20MAnt2_3d9430'), 
    '45')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/li_45014, Fairfield, Hamilton, OH'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Address Line 1__FOpt1_FOr10_FONSr20MA_075e6e'), 
    'PO BOX 123')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/img_Autocompletes on TAB__FOpt1_FOr10_FONSr_b70590'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/button_Accept Address'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/button_OK'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/button_Save'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/button_Save and Close'))

