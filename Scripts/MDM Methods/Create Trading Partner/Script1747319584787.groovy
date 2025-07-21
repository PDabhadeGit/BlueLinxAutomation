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

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/img_PrintMe_pt1_FOr11_FONSr20_FOTsdiItemReg_75331e'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/a_Manage Trading Partner Items'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Trading Partner/img_Filters_pt1_FOr11_FONSr20MAt20AP1ls1cal_f347bc'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Trading Partner/input_Trading Partner Item_pt1_FOr11_FONSr2_04c8ce'), 
    'Test partner')

WebUI.selectOptionByValue(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Trading Partner/select_CompetitorCustomerManufacturerSupplier'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Trading Partner/a_Trading Partner_pt1_FOr11_FONSr20MAt20AP1_e9b041'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Trading Partner/td_A-ONE LUMBER CO LLC'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Trading Partner/button_Save'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Trading Partner/a_Done'))

