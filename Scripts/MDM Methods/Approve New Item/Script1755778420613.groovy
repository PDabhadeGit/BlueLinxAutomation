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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.nio.file.Files as Files
import java.nio.file.Paths as Paths

//WebUI.click(findTestObject('Object Repository/Page_Oracle Fusion Cloud Applications/svg_UAT Environment_pt1_UISatr0cil1icon'))
WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/svg_Notifications (188 unread)'))

WebUI.click(findTestObject('Object Repository/Page_Oracle Fusion Cloud Applications/a_New Item Request NIR100346 Requires Approval'))

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Page_New Item Request NIR100346 Requires Approval/span_1001436'), 100)

String itemID = WebUI.getText(findTestObject('Object Repository/Page_New Item Request NIR100346 Requires Approval/span_1001436'))

//KeywordUtil.logInfo('New Created item with ID: ' + itemID)
KeywordUtil.logInfo("********** NEW ITEM ID: $itemID **********")

// Save itemID to a fixed path
Files.write(Paths.get('C:/BlueLinx_Automation_Master/itemID.txt'), itemID.getBytes())

WebUI.takeFullPageScreenshot()

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.delay(6)

//WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/svg_Notifications (188 unread)'))

WebUI.click(findTestObject('Page_Oracle Fusion Cloud Applications/button_Approve'))

WebUI.delay(3)

WebUI.closeBrowser()

