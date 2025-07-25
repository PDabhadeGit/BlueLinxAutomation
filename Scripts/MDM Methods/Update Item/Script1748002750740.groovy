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

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/td_Long Description'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/textarea_testing'), 
    'test update')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/a_Specifications (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/a_Universal (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/a_Agility (1)'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/input_Agility Long Description_pt1_FOr11_FO_e7ebf3'), 
    'test update')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/span_Save (3)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/span_Next (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/span_Submit (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Change Order  BXC-CCO100123 (BL00) - P_e1f69e/span_Save'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_BlueLinx CCO BXC-CCO100123(BL00) - Pro_67e42b/span_Save and Close'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/button_Done (1)'))

WebUI.closeBrowser()

