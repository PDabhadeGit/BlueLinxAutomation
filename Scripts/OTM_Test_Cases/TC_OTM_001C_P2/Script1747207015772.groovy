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

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/div_Shipment Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Itinerary Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Itinerary Manager'))

WebUI.setText(findTestObject('Object Repository/Page_Itinerary Finder/input_Itinerary ID_itineraryxid'), 'BXC_ATL')

WebUI.click(findTestObject('Object Repository/Page_Itinerary Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Itinerary Result/a_BXC.BXC_ATL'))

WebUI.click(findTestObject('Object Repository/Page_Itinerary - Parameters/div_Source Geo HierarchyCITYCITYCOUNTRYCOUN_61cbeb'))

WebUI.click(findTestObject('Object Repository/Page_Itinerary - Parameters/button_Lane Definitions'))

WebUI.click(findTestObject('Object Repository/Page_Itinerary - Lane Definitions/button_List Legs'))

WebUI.click(findTestObject('Object Repository/Page_Itinerary - List Legs/div_Leg ID'))

WebUI.closeBrowser()

