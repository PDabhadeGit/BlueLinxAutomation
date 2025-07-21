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

WebUI.scrollToElement(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/img_Wrap__FOpt1_FOr10_FONSr20MAnt21r10AP3r5_7959f2 (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/img_Wrap__FOpt1_FOr10_FONSr20MAnt21r10AP3r5_7959f2 (2)'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Site Name__FOpt1_FOr10_FONSr20MAnt21r_cd125b (2)'), 
    'Test Address')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Address Line 1__FOpt1_FOr10_FONSr20MA_075e6e (2)'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Address Line 2__FOpt1_FOr10_FONSr20MA_363c4f (1)'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Address Line 3__FOpt1_FOr10_FONSr20MA_ca5faf (1)'), 
    'Test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_City__FOpt1_FOr10_FONSr20MAnt21r10AP3r50A_95f0a1 (2)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_Search (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/button_Search (1)'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_City__FOpt1_FOr10_FONSr20MAnt21r10AP3_16e0d9'), 
    'a')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/button_Search (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/span_Aaronsburg, Centre, PA'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/button_OK (3)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_Postal Code__FOpt1_FOr10_FONSr20MAnt21r10_9e2481 (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/span_16820, Aaronsburg, Centre, PA (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/img_Manage Columns__FOpt1_FOr10_FONSr20MAnt_7973ac (2)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Purpose__FOpt1_FOr10_FONSr20MAnt21r10_3f1460 (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/li_Ship to (2)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/button_OK_1 (2)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/button_Save (2)'))

