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

WebUI.acceptAlert()

WebUI.navigateToUrl('https://ibuqjb-test.fa.ocs.oraclecloud.com/fscmUI/adfAuthentication?level=FORM&success_url=%2FfscmUI%2Ffaces%2FFuseWelcome%3F_adf.ctrl-state%3Dknf4iwios_1%26fnd%3D%253B%253B%253B%253Bfalse%253B256%253B%253B%253B%26_afrLoop%3D32099846134087096%26_afrWindowMode%3D0%26_afrWindowId%3Dnull%26_afrFS%3D16%26_afrMT%3Dscreen%26_afrMFW%3D1036%26_afrMFH%3D506%26_afrMFDW%3D1280%26_afrMFDH%3D720%26_afrMFC%3D8%26_afrMFCI%3D0%26_afrMFM%3D0%26_afrMFR%3D144%26_afrMFG%3D0%26_afrMFS%3D0%26_afrMFO%3D0%26_adf.no-new-window-redirect%3Dtrue')

WebUI.setText(findTestObject('Page_Sign In/input_User ID_userid'), 'Prajyot.Dabhade@BlueLinxCo.com')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ibuqjb-test.fa.ocs.oraclecloud.com/fscmUI/adfAuthentication?level=FORM&success_url=%2FfscmUI%2Ffaces%2FFuseWelcome%3F_adf.ctrl-state%3Dlhzn4p3sx_1%26fnd%3D%253B%253B%253B%253Bfalse%253B256%253B%253B%253B%26_afrLoop%3D32099979393547538%26_afrWindowMode%3D0%26_afrWindowId%3Dnull%26_afrFS%3D16%26_afrMT%3Dscreen%26_afrMFW%3D1028%26_afrMFH%3D515%26_afrMFDW%3D1280%26_afrMFDH%3D720%26_afrMFC%3D8%26_afrMFCI%3D0%26_afrMFM%3D0%26_afrMFR%3D144%26_afrMFG%3D0%26_afrMFS%3D0%26_afrMFO%3D0%26_adf.no-new-window-redirect%3Dtrue')

WebUI.setText(findTestObject('Page_Sign In/input_User ID_userid'), 'Prajyot.Dabhade@BlueLinxCo.com')

WebUI.setEncryptedText(findTestObject('Page_Sign In/input_Password_password'), '5hR7QmHaNRjZKO09Vh/dgg==')

WebUI.click(findTestObject('Page_Sign In/button_Forgot Password_btnActive'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Good afternoon, Prajyot Dabhade_groupNode_fc4e51'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Apps_itemNode_product_management_items_0'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information Management - Oracl_498cc2/img_PrintMe_pt1_FOr11_FONSr20_FOTsdiItemReg_75331e (5)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information Management - Oracl_498cc2/a_Item Management_pt1_FOr11_FONSr20_FOTRaT0RAtl1'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_Item Class_pt1_FOr11_FONSr20MAt20itemClas_b68128 (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/span_Bar Mesh_x2f0'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/li_Fiberglass_x1na'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_Steel_pt1_FOr11_FONSr20MAt20AppTe0selectM_1e3d29 (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/button_Selected List_pt1_FOr11_FONSr20MAt20_cdbaeb'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/textarea_Long Description_pt1_FOr11_FONSr20_21bca2'), 
    'test')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_User Descriptor_pt1_FOr11_FONSr20MAt3_7c1c05'), 
    'test')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Product Size_pt1_FOr11_FONSr20MAt30pt_d66137'), 
    '1')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_Finish_pt1_FOr11_FONSr20MAt30pt1ap1r10dyn_92b13d (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/td_PrintMe_xen'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Grade_pt1_FOr11_FONSr20MAt30pt1ap1r10_6f88c4'), 
    't')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Product Type_pt1_FOr11_FONSr20MAt30pt_4e8e93'), 
    'test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_Primary Unit of Measure_pt1_FOr11_FONSr20_69a4ec'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/td_PrintMe_xen_1'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_Creation Date_pt1_FOr11_FONSr20MAt30pt1ap_c06629'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_Item_pt1_FOr11_FONSr20MAt30pt1ap1sspecf1r_c48a76'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Shipping Product (each) thickness_pt1_c26ce2'), 
    '10')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Shipping Product (each) thickness UOM_71bc27'), 
    'TBD')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Shipping Product (each) width_pt1_FOr_92a73b'), 
    '10')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Shipping Product (each) width UOM_pt1_ecdc0d'), 
    'TBD')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Shipping Product (each) length_pt1_FO_84f2ba'), 
    '10')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Shipping Product (each) length UOM_pt_2d753d'), 
    'TBD')

