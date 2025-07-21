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

WebUI.callTestCase(findTestCase('OTM_Methods/Login_OTM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('OTM_Methods/Search Created Order'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('OTM_Methods/Select Order'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/button_Actions'))

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/span_Operational Planning'))

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/span_Create Buy Shipment'))

WebUI.click(findTestObject('Object Repository/Page_Order Releases Result/a_Bulk Plan - Buy'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/Page_Shipment Planning/button_OK'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Bulk Plan/button_Refresh'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Bulk Plan/button_Refresh'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Bulk Plan/button_Refresh'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Bulk Plan/a_1'))

WebUI.switchToWindowIndex(2)

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/a_BXC.51000'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Identification/a_Remarks (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Buy Shipment - Remarks/select_ACTUALS_RECEIVEDADD_INFOSAXLE_GROUPB_93247e (1)'), 
    'BXC.DELIVERY_INSTRUCTIONS_EXTERNAL', true)

WebUI.setText(findTestObject('Object Repository/Page_Buy Shipment - Remarks/textarea__shipment_remarktext (1)'), 'test')

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Remarks/button_Save (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Buy Shipment - Remarks/select_ACTUALS_RECEIVEDADD_INFOSAXLE_GROUPB_93247e (1)'), 
    'BXC.PLANNER_INSTRUCTIONS', true)

WebUI.setText(findTestObject('Object Repository/Page_Buy Shipment - Remarks/textarea__shipment_remarktext (1)'), 'tesrt')

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Remarks/button_Save (1)'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipment - Remarks/button_Finished (2)'))

