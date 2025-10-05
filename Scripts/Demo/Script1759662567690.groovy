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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ibuqjb-dev2.fa.ocs.oraclecloud.com/fscmUI/adfAuthentication?level=FORM&success_url=%2FfscmUI%2Ffaces%2FFuseWelcome%3Ffnd%3D%253B%253B%253B%253Bfalse%253B256%253B%253B%253B%26_adf.ctrl-state%3D5xa3scm90_1%26_afrLoop%3D22182679558757395%26_afrWindowMode%3D0%26_afrWindowId%3Dnull%26_afrFS%3D16%26_afrMT%3Dscreen%26_afrMFW%3D1028%26_afrMFH%3D515%26_afrMFDW%3D1280%26_afrMFDH%3D720%26_afrMFC%3D8%26_afrMFCI%3D0%26_afrMFM%3D0%26_afrMFR%3D144%26_afrMFG%3D0%26_afrMFS%3D0%26_afrMFO%3D0%26_adf.no-new-window-redirect%3Dtrue')

WebUI.setEncryptedText(findTestObject('Object Repository/Export tool/Page_Sign In/input_Password_password (1)'), '5hR7QmHaNRjZKO09Vh/dgg==')

WebUI.setText(findTestObject('Object Repository/Export tool/Page_Sign In/input_User ID_userid (1)'), 'Prajyot.Dabhade@BlueLinxCo.com')

WebUI.click(findTestObject('Object Repository/Export tool/Page_Sign In/button_Forgot Password_btnActive (1)'))

WebUI.click(findTestObject('Object Repository/Export tool/Page_Oracle Fusion Cloud Applications/svg_DEV - 2_pt1_UISmmLinkicon (1)'))

WebUI.click(findTestObject('Object Repository/Export tool/Page_Oracle Fusion Cloud Applications/div_Setup and Maintenance_pt1_UISnvr0nvgpgl_9d7f62 (2)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Export tool/Page_Oracle Fusion Cloud Applications/span_Import Management_xmv (2)'))

WebUI.click(findTestObject('Object Repository/Export tool/Page_Manage Exports - Export Management - O_98e4cb/button_Manage Exports__FOpt1_FOr10_FONSr20__9d949e (2)'))

WebUI.setText(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/input_Name__FOpt1_FOr10_FONSr20MAnt21pt1AP1_91d867 (2)'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/input_Object__FOpt1_FOr10_FONSr20MAnt21pt1A_aa49ab (2)'), 
    'Organization')

WebUI.click(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/button_B__FOpt1_FOr10_FONSr20MAnt21pt1AP1APnxb (2)'))

WebUI.click(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/img_Organization_xuy (2)'))

WebUI.click(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/td_java.lang.String_xen (1)'))

WebUI.click(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/span_Fetching Data_xrk (1)'))

WebUI.click(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/span_Validate Script_xrk (1)'))

WebUI.setText(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/body (2)'), 
    'Address1=\'test\' <br>')

WebUI.click(findTestObject('Object Repository/Export tool/Page_Create Export Activity - Export Manage_e9b1a6/button_My filters__FOpt1_FOr10_FONSr20MAnt2_650c13 (2)'))

