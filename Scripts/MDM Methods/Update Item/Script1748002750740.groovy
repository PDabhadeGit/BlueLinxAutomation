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

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/textarea_Long Description__FOpt1_FOr10_FONS_41b69b'), 
    'Updated description')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/a_Specifications'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/a_Physical Attributes'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/input_Unit Weight__FOpt1_FOr10_FONSr20MAt30_ac25a3'), 
    '101')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/input_Unit Volume__FOpt1_FOr10_FONSr20MAt30_6f72b5'), 
    '101')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/a_Save'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/a_Next'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/textarea_Description__FOpt1_FOr10_FONSr20MA_82238d'), 
    'Update Item automation test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/a_Submit'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Change Order BXC-CCO100088/div_Save'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_BlueLinx CCO/span_Save and Close'))

WebUI.closeBrowser()

