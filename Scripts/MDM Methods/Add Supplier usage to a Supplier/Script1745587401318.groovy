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

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/div_Usage Assignments'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/div_Usage Assignments_xmo'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/td_Add'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_ORGANIZATION__FOpt1_FOr10_FONSr20MAnt21r3_f515fe'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/li_External Payee'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/button_Save'))

WebUI.delay(10)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/button_Save and Close'))

