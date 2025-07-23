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

WebUI.click(findTestObject('MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Product Management'))

WebUI.click(findTestObject('MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Product Information Management'))

WebUI.click(findTestObject('MDM_Page_Objects/Page_Product Information/img_PrintMe_pt1_FOr11_FONSr20_FOTsdiItemReg_75331e'))

WebUI.click(findTestObject('MDM_Page_Objects/Page_Product Information/a_Manage Items'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/input_Keyword_pt1_FOr11_FONSr20MAt20pt1Item_0ae423 (1)'), 
    'test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/button_Add Fields'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/a_Item_pt1_FOr11_FONSr20MAt20pt1ItemC10simp_ff411d'))

WebUI.doubleClick(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/span_Created By'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/button_OK (1)'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/input_Created By Operator_pt1_FOr11_FONSr20_97ecaf'), 
    'Prajyot.Dabhade@BlueLinxCo.com')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/button_Search (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/a_1001384 (1)'))

