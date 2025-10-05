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

WebUI.click(findTestObject('Object Repository/Export tool/Page_Oracle Fusion Cloud Applications/svg_DEV - 2_pt1_UISmmLinkicon'))

WebUI.click(findTestObject('Object Repository/Export tool/Page_Oracle Fusion Cloud Applications/div_Setup and Maintenance_pt1_UISnvr0nvgpgl_9d7f62'))

WebUI.click(findTestObject('Object Repository/Export tool/Page_Oracle Fusion Cloud Applications/span_Import Management_xmv'))

WebUI.click(findTestObject('Object Repository/Export tool/Page_Manage Exports - Export Management - O_98e4cb/button_Manage Exports__FOpt1_FOr10_FONSr20__9d949e'))

WebUI.setText(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/input_Object__FOpt1_FOr10_FONSr20MAnt21pt1A_aa49ab'), 
    'Organization')

WebUI.setText(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/input_Name__FOpt1_FOr10_FONSr20MAnt21pt1AP1_91d867'), 
    'TEST EXPORT')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/button_B__FOpt1_FOr10_FONSr20MAnt21pt1AP1APnxb (1)'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/img_Organization_xuy (1)'))

//WebUI.click(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/img_Organization_xuy (2)'))

WebUI.click(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/td_java.lang.String_xen (1)'))

WebUI.click(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/span_Fetching Data_xrk (1)'))

WebUI.click(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/span_Validate Script_xrk (1)'))

WebUI.setText(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/body (2)'),
	'Address1=\'test\' <br>')

//WebUI.click(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/button_My filters__FOpt1_FOr10_FONSr20MAnt2_650c13 (2)'))
WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/button_My filters__FOpt1_FOr10_FONSr20MAnt2_650c13 (1)'))

WebUI.click(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/button_B__FOpt1_FOr10_FONSr20MAnt22pt1AP1APnxb'))

WebUI.click(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/button_Create Export Activity  Review and S_c24da1'))

WebUI.click(findTestObject('Object Repository/Export tool/Page_Manage Exports - Export Management - O_98e4cb/a_Unsuccessful__FOpt1_FOr10_FONSr20_FOTsr10_ffe4a6'))

WebUI.closeBrowser()

