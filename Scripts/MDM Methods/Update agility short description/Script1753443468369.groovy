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


WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/a_Specifications'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/a_Agility'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/td_Agility Short Description'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/input_Agility Short Description_pt1_FOr11_F_43c42b'), 
    'test updated')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/span_Save'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/a_Next'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/a_Effective Date_pt1_FOr11_FONSr20MAt30pt1a_1f16cf'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/a_Select Hours_pt1_FOr11_FONSr20MAt30pt1ap1_486e51'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/button_OK'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/a_Effective Date_pt1_FOr11_FONSr20MAt30pt1a_1f16cf'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/a_Select Hours_pt1_FOr11_FONSr20MAt30pt1ap1_486e51'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/td_26'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/button_OK'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/span_Submit'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Change Order  BXC-CCO100121 (BL00) - P_469f0d/a_Assignee Role_pt1_FOr11_FONSr20MAt40AP2as_3e2b1d'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Change Order  BXC-CCO100121 (BL00) - P_469f0d/a_Assignee Role_pt1_FOr11_FONSr20MAt40AP2as_3e2b1d'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Change Order  BXC-CCO100121 (BL00) - P_469f0d/span_Save and Close'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/button_Done'))

WebUI.closeBrowser()

