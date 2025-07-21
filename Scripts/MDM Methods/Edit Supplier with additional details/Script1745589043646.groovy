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

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_DQ Identifier_pt1_FOr11_FONSr20MAnt21r10A_abb236'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_Additional Names_pt1_FOr11_FONSr20MAnt21r_f89e26'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/img_Reorder Columns_pt1_FOr11_FONSr20MAnt21_beda38'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_Test Supplier_pt1_FOr11_FONSr20MAnt21r10A_0125ce'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/li_Industrial Reference'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Identifier Type_pt1_FOr11_FONSr20MAnt_dfd7ac'), 
    'Test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_Issue Date_pt1_FOr11_FONSr20MAnt21r10AP3r_117ffd'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/td_23'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_Expiration Date_pt1_FOr11_FONSr20MAnt21r1_f82ec6'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/td_29'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Sat_pt1_FOr11_FONSr20MAnt21r10AP3r30A_620afc'), 
    'test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_Issuing Authority Name_pt1_FOr11_FONSr20M_750f92'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/li_Belgium'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/button_Save'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/button_Save and Close'))

WebUI.closeBrowser()

