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

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Product Management'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Product Information Management'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/img_PrintMe__FOpt1_FOr10_FONSr20_FOTsdiItem_3ddbb3'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/a_Create Item'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/label_Create from Copy'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/img_Item__FOpt1_FOr10_FONSr20MAt20ip1search_6d7e9b'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Item__FOpt1_FOr10_FONSr20MAt20ip1Popu_b4efb6'), 
    'test style')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_Search'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/span_Test Style Item41'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_OK'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Move__FOpt1_FOr10_FONSr20MAt20agshtlmoveall'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_OK_1'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/span_Save'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_Apply'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/select_Base Unit or EachCaseDisplay Shipper_f64abf'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Submit'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Next'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Name__FOpt1_FOr10_FONSr20MAt30pt1ap1S_b174b8'), 
    'Copy Item Test Automation')

WebUI.doubleClick(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Name__FOpt1_FOr10_FONSr20MAt30pt1ap1S_b174b8'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Name__FOpt1_FOr10_FONSr20MAt30pt1ap1S_b174b8'), 
    'Create Copy Item Automation Test ')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Name__FOpt1_FOr10_FONSr20MAt30pt1ap1S_b174b8'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/textarea_Description__FOpt1_FOr10_FONSr20MA_82238d'), 
    'Create Copy Item Automation Test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/span_Save and Edit'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/a_Submit'))

