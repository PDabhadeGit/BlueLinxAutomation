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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://otmgtm-dev1-summit1.otmgtm.us-ashburn-1.ocs.oraclecloud.com/GC3/glog.webserver.home.HomeServlet?ojr=maincontent')

WebUI.setText(findTestObject('Page_Cloud Sign In/input_User Name_idcs-signin-basic-signin-fo_93898c'), 'Gaurav.prasad@bluelinxco.com')

WebUI.setEncryptedText(findTestObject('Page_Cloud Sign In/input_Password_idcs-signin-basic-signin-for_2f0e89'), 'TCRrBFWPcdYfr+QHQbxu/A==')

WebUI.click(findTestObject('Page_Cloud Sign In/span_Sign In'))

WebUI.click(findTestObject('Object Repository/OTM pages/Page_Transportation and Global Trade Manage_3d15c4/div_Shipment Management'))

WebUI.click(findTestObject('Object Repository/OTM pages/Page_Transportation and Global Trade Manage_3d15c4/span_Buy Shipment'))

WebUI.setText(findTestObject('Object Repository/OTM pages/Page_Buy Shipment Finder/input_Bulk Plan ID_shipmentbulk_planxid'), 
    '20250904-0059')

WebUI.selectOptionByValue(findTestObject('Object Repository/OTM pages/Page_Buy Shipment Finder/select_Begins WithEnds WithIs NullNot NullO_756104'), 
    'contains', true)

WebUI.click(findTestObject('Object Repository/OTM pages/Page_Buy Shipment Finder/button_Search'))

//WebUI.getText(findTestObject('Object Repository/OTM pages/Page_Buy Shipment Result/span_0'))
// Get the text from the target web element
String resultText = WebUI.getText(findTestObject('Object Repository/OTM pages/Page_Buy Shipment Result/span_0'))

// Print the value (optional, for debugging)
println("Text value: $resultText")

// Check if the value is exactly "0"
if (resultText.trim() == '0') {
    println('PASS')
} else {
    println('FAIL')
}

