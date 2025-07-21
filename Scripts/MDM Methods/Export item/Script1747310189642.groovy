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

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/a_Manage Items'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/button_Add Fields'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/a_Item Relationships__FOpt1_FOr10_FONSr20MA_09392f'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/span_Catalog'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/td_Category'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/img_Detached treeTable__FOpt1_FOr10_FONSr20_6421da'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/button_OK'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/a_Catalog__FOpt1_FOr10_FONSr20MAt20pt1ItemC_f9b23a'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/td_Exterior'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/input_Keyword__FOpt1_FOr10_FONSr20MAt20pt1I_a7cd7f'), 
    'test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/button_Search'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/img_Delete__FOpt1_FOr10_FONSr20MAt20pt1Item_f3f3fa'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items Product/img_Delete__FOpt1_FOr10_FONSr20MAt20pt1Item_f3f3fa'))

WebUI.closeBrowser()

