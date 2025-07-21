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

WebUI.callTestCase(findTestCase('MDM Methods/Login MDM'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/svg_Good afternoon, Prajyot Dabhade_suiicon_bb84df'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Customer Data Management'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Organizations'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organization Organizations/a_Organization__FOpt1_FOr10_FONSr20_FOTsr10_d17e4e'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organization Organizations/a_Party Type Operator__FOpt1_FOr10_FONSr20__3e47c3'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organization Organizations/li_Supplier'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organization Organizations/button_Search'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organization Organizations/span_Test Supplier'))

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

