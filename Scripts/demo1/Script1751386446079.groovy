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

WebUI.navigateToUrl('https://ibuqjb-dev2.fa.ocs.oraclecloud.com/fscmUI/adfAuthentication?level=FORM&success_url=%2FfscmUI%2Ffaces%2FFuseWelcome%3Ffnd%3D%253B%253B%253B%253Bfalse%253B256%253B%253B%253B%26_adf.ctrl-state%3D9e0n8bf6o_1%26_afrLoop%3D14124711577852065%26_afrWindowMode%3D0%26_afrWindowId%3Dnull%26_afrFS%3D16%26_afrMT%3Dscreen%26_afrMFW%3D1028%26_afrMFH%3D515%26_afrMFDW%3D1280%26_afrMFDH%3D720%26_afrMFC%3D8%26_afrMFCI%3D0%26_afrMFM%3D0%26_afrMFR%3D144%26_afrMFG%3D0%26_afrMFS%3D0%26_afrMFO%3D0%26_adf.no-new-window-redirect%3Dtrue')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Sign In/input_User ID_userid'), 'Prajyot.Dabhade@BlueLinxCo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/MDM_Page_Objects/Page_Sign In/input_Password_password'), '5hR7QmHaNRjZKO09Vh/dgg==')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Sign In/button_Sign In'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/svg_Navigator'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/div_Tools'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/span_Export Management'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Exports/button_Create Export Activity'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Export Activity/input_Name__FOpt1_FOr10_FONSr20MAnt21pt1AP1it1'), 
    'test')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Export Activity/input_Object__FOpt1_FOr10_FONSr20MAnt21pt1A_f7a7d3'), 
    'o')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Export Activity/li_Organization'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Export Activity/button_Next'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Export Activity/img_Organization_xv0'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Export Activity/body'), 
    'Address1=\'test\'')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Export Activity/button_Save and Close'))

