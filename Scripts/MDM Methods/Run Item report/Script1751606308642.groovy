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

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/img_PrintMe_pt1_FOr11_FONSr20_FOTsdiReports_d95ede'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/span_Shared Reports and Analytics'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/a_My Folders_pt1_FOr11_FONSr20_FOTRaTj_id_3_3cd855'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/a_Full Item Export Report.xdo'))

WebUI.doubleClick(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/a_Full Item Export Report.xdo'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/img_Last Run Date_pt1_FOr11_FONSr20_FOTRaTj_627015'))

WebUI.switchToWindowIndex(1)

WebUI.delay(60)

WebUI.takeFullPageScreenshot()

