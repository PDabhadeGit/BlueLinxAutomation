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

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/svg_Notifications (188 unread)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/a_New Item Request NIR100101 Requires Definition'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_New Item Request/img_Bar Mesh_r20pc1tt10gotoTaskicon'))

WebUI.switchToWindowIndex(2)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Items of New Item Request/a_Specifications'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Items of New Item Request/a_Relationships'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Items of New Item Request/a_Associations'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Items of New Item Request/a_Categories'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Items of New Item Request/a_Relationships'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Items of New Item Request/img_Wrap__FOpt1_FOr10_FONSr20MAt20AP1TPIF11_520ccd'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Items of New Item Request/a_Customer Name__FOpt1_FOr10_FONSr20MAt20AP_1fccb5'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Items of New Item Request/span_DO IT BEST CORP'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Items of New Item Request/a_Customer Item__FOpt1_FOr10_FONSr20MAt20AP_dc8020'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Items of New Item Request/td_168026'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Items of New Item Request/a_OK'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Items of New Item Request/span_Save'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Items of New Item Request/span_Mark Complete'))

