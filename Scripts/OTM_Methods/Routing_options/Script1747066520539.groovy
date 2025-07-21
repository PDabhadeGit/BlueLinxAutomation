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

WebUI.callTestCase(findTestCase('OTM_Methods/Search Created Order'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('OTM_Methods/Select Order'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/button_Actions'))

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/img'))

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/img_1'))

WebUI.switchToWindowTitle('Order Releases Result')

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/a_Show Routing Options'))

WebUI.switchToWindowTitle('Routing Constraints')

WebUI.click(findTestObject('Object Repository/Page_Routing Constraints/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Routing Constraints/button_Show Options'))

WebUI.click(findTestObject('Object Repository/Page_Valid Itineraries/button_Show Options'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Show Routing Options/button_Refine Options'))

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

