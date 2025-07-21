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

WebUI.callTestCase(findTestCase('OTM_Methods/Search Created shipment'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('OTM_Methods/Select Shipment'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/button_Actions'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/span_Shipment Management'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/span_Events'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/a_Add Tracking Event'))

WebUI.switchToWindowIndex(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tracking Event - Identification/select_BuyerCarrierConsigneeCustomsDriverOr_026865'), 
    'CUSTOMS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tracking Event - Identification/select_ArrivedCargo-Related ProblemDelayedD_7511ed'), 
    'ARRIVED', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tracking Event - Identification/select_Arrived at Delivery LocationArrived _0c8211'), 
    'X1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tracking Event - Identification/select_Border DelayCargo Or Ship Item Relat_c75c85'), 
    'NO_ERROR', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tracking Event - Identification/select_Normal AppointmentNormal Status'), 
    'NA', true)

WebUI.click(findTestObject('Object Repository/Page_Tracking Event - Identification/a__ie_shipmentstatuseventdateglyph'))

WebUI.click(findTestObject('Object Repository/Page_Tracking Event - Identification/td_24'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tracking Event - Identification/select_1. ABC 455 - HOLBROOK NY, HOLBROOK, _37e48b'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Tracking Event - Identification/button_Finished'))

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

