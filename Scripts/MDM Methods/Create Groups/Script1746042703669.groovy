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

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/svg_Good evening, Prajyot Dabhade_suiicon f_37fe22'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Customer Data Management'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Groups'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Group - Groups/img_Wrap_pt1_FOr11_FONSr20_FOTsr10pt1r10AP1_2979d7'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Groups - Oracle Fusion Cloud Applications/input_Name_pt1_FOr11_FONSr20MAnt21AP1r10it1'), 
    'test Group')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Groups - Oracle Fusion Cloud Applications/a_Usage_pt1_FOr11_FONSr20MAnt21AP1r10soc4drop'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Groups - Oracle Fusion Cloud Applications/li_Party of Interest'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Groups - Oracle Fusion Cloud Applications/a_Type_pt1_FOr11_FONSr20MAnt21AP1r10soc1drop'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Groups - Oracle Fusion Cloud Applications/li_Generic'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Groups - Oracle Fusion Cloud Applications/span_Save and Edit'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Groups - Oracle Fusion Cloud Applications/button_Save and Close'))

