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
import java.util.Random

//WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/svg_Good morning, Prajyot Dabhade_suiicon f_d11d94'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Customer Data Management'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Hierarchies'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/img_Wrap_pt1_FOr11_FONSr20_FOTsr10pt1r10AP4_7a9f1d'))

Random rnd1 = new Random()

int randomNumber = 10 + rnd1.nextInt(90)  // Corrected: use rnd1 consistently

String result ='Test Hierarchy' + randomNumber

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/input_Hierarchy Name_pt1_FOr11_FONSr20_FOTs_e20858'), 
    result)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/button_Next'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/img_Reorder Columns_pt1_FOr11_FONSr20_FOTsr_9d73ea'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/button_Search'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/input_Name_pt1_FOr11_FONSr20_FOTsr10pt1r12A_6942a8'), 
    'Test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/button_Search_1'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/span_Test Customer3'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/button_Save'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/button_OK'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/button_OK_1'))

