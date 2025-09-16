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

WebUI.navigateToUrl('https://ibuqjb-dev2.fa.ocs.oraclecloud.com/fscmUI/adfAuthentication?level=FORM&success_url=%2FfscmUI%2Ffaces%2FFuseWelcome%3Ffnd%3D%253B%253B%253B%253Bfalse%253B256%253B%253B%253B%26_adf.ctrl-state%3Dwkop9quvq_1%26_afrLoop%3D20541825189309280%26_afrWindowMode%3D0%26_afrWindowId%3Dnull%26_afrFS%3D16%26_afrMT%3Dscreen%26_afrMFW%3D1028%26_afrMFH%3D515%26_afrMFDW%3D1280%26_afrMFDH%3D720%26_afrMFC%3D8%26_afrMFCI%3D0%26_afrMFM%3D0%26_afrMFR%3D144%26_afrMFG%3D0%26_afrMFS%3D0%26_afrMFO%3D0%26_adf.no-new-window-redirect%3Dtrue')

WebUI.setText(findTestObject('Page_Sign In/input_User ID_userid'), 'Prajyot.Dabhade@BlueLinxCo.com')

WebUI.setEncryptedText(findTestObject('Page_Sign In/input_Password_password'), '5hR7QmHaNRjZKO09Vh/dgg==')

WebUI.click(findTestObject('Page_Sign In/button_Sign In'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Product Management (2)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Product Information Management (2)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information Management - Oracl_498cc2/img_PrintMe_pt1_FOr11_FONSr20_FOTsdiItemReg_75331e (6)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information Management - Oracl_498cc2/a_Create Item (3)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_Item Class_pt1_FOr11_FONSr20MAt20itemClas_b68128 (2)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/td_Bar Mesh (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/li_Steel (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_Supply Item_pt1_FOr11_FONSr20MAt20AppTe0s_a700f3'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/button_OK (2)'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/textarea_Long Description_pt1_FOr11_FONSr20_0f4b0a (1)'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_User Descriptor_pt1_FOr11_FONSr20MAt3_ceddce (1)'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Product Size_pt1_FOr11_FONSr20MAt30pt_91a4c9 (1)'), 
    '1')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_Finish_pt1_FOr11_FONSr20MAt30pt1ap1r10dyn_92b13d (2)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/td_Aluminum (1)'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Grade_pt1_FOr11_FONSr20MAt30pt1ap1r10_a0ec97 (1)'), 
    'A')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Product Type_pt1_FOr11_FONSr20MAt30pt_130a14 (1)'), 
    'Test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_Primary Unit of Measure_pt1_FOr11_FONSr20_69a4ec (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/td_BAG'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_Specifications'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_Transactional Attributes'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_Additional Attributes'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_Universal'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_Hazardous_pt1_FOr11_FONSr20MAt30pt1ap1ssp_eb9927'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/td_TBD'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_NMFC Class ID_pt1_FOr11_FONSr20MAt30pt1ap_7fd45e'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/td_100.0'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_STCC ID_pt1_FOr11_FONSr20MAt30pt1ap1sspec_18b928'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/td_24211'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Shipping Product (each) thickness_pt1_503a92'))

WebUI.closeBrowser()

