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
import org.apache.commons.lang3.RandomStringUtils as RandomStringUtils

//WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/svg_Good evening, Prajyot Dabhade_suiicon f_37fe22'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Customer Data Management'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Organizations'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organization Organizations/img_Wrap__FOpt1_FOr10_FONSr20_FOTsr10pt1r10_974311'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_Usage__FOpt1_FOr10_FONSr20MAnt21AP1r10sel_e66418'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/li_External Legal Entity'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Name__FOpt1_FOr10_FONSr20MAnt21AP1r10_deb225'), 
    'Test Customer')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_Party Type__FOpt1_FOr10_FONSr20MAnt21AP1r_63777e'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/li_Customer'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Address Line 1__FOpt1_FOr10_FONSr20MA_80287c'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Name__FOpt1_FOr10_FONSr20MAnt21AP1r10_deb225'), 
    'Test Customer')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Name__FOpt1_FOr10_FONSr20MAnt21AP1r10_deb225'))

/*
 * Random rnd1 = new Random()
 * 
 * int randomNumber = 10 + rnd1.nextInt(90)
 * 
 * // Combine the prefix with the random number String result = 'Test Customer'
 * + randomNumber
 */
Random rnd1 = new Random()

// Generate a random 3-letter prefix
String alphabet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'

StringBuilder prefix = new StringBuilder()

for (int i = 0; i < 3; i++) {
    int index = rnd1.nextInt(alphabet.length())

    prefix.append(alphabet.charAt(index))
}

// Generate a two-digit random number (10–99)
int randomNumber = 10 + rnd1.nextInt(90)

// Combine the parts: prefix + 'Test Customer' + random number
String result = ('Test Customer ' + randomNumber) + prefix.toString()

println('Generated Result: ' + result)

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Name__FOpt1_FOr10_FONSr20MAnt21AP1r10_deb225'), 
    result)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_Save and Edit'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/label_Create new organization based on what_da46cf'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('MDM_Page_Objects/Page_Organizations - Cloud Applications/button_OK'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/button_Save and Close'))

