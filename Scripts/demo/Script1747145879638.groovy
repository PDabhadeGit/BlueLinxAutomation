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

WebUI.navigateToUrl('https://ibuqjb-test.fa.ocs.oraclecloud.com/fscmUI/adfAuthentication?level=FORM&success_url=%2FfscmUI%2Ffaces%2FFuseWelcome%3F_adf.ctrl-state%3D8b1hyndqf_1%26fnd%3D%253B%253B%253B%253Bfalse%253B256%253B%253B%253B%26_afrLoop%3D28397764878268072%26_afrWindowMode%3D0%26_afrWindowId%3Dnull%26_afrFS%3D16%26_afrMT%3Dscreen%26_afrMFW%3D1028%26_afrMFH%3D515%26_afrMFDW%3D1280%26_afrMFDH%3D720%26_afrMFC%3D8%26_afrMFCI%3D0%26_afrMFM%3D0%26_afrMFR%3D144%26_afrMFG%3D0%26_afrMFS%3D0%26_afrMFO%3D0%26_adf.no-new-window-redirect%3Dtrue')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Sign In/input_User ID_userid (1)'), 'Prajyot.Dabhade@BlueLinxCo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/MDM_Page_Objects/Page_Sign In/input_Password_password (1)'), '5hR7QmHaNRjZKO09Vh/dgg==')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Sign In/button_Sign In (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Customer Data Management (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Organizations (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organization Organizations/a_Organization__FOpt1_FOr10_FONSr20_FOTsr10_d17e4e (1)'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organization Organizations/input_Name Operator__FOpt1_FOr10_FONSr20_FO_509af9 (1)'), 
    'Test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organization Organizations/button_Search (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organization Organizations/span_Test Customer 12NPO'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/img_Wrap__FOpt1_FOr10_FONSr20MAnt21r10AP3r5_7959f2 (1)'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Site Name__FOpt1_FOr10_FONSr20MAnt21r_cd125b (1)'), 
    'TEST ADDRESS')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/img_Wrap__FOpt1_FOr10_FONSr20MAnt21r10AP3r5_7959f2 (1)'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Site Name__FOpt1_FOr10_FONSr20MAnt21r_cd125b (1)'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Address Line 1__FOpt1_FOr10_FONSr20MA_075e6e (1)'), 
    'TEST')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/img_Manage Columns__FOpt1_FOr10_FONSr20MAnt_7973ac (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Purpose__FOpt1_FOr10_FONSr20MAnt21r10_3f1460'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/li_Ship to (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/button_OK (2)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/button_Save (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/button_Save and Close (2)'))

