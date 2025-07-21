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

//WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/svg_Good evening, Prajyot Dabhade_suiicon f_37fe22'))
WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Customer Data Management'))

WebUI.click(findTestObject('MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Hierarchies'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/input_Hierarchy Name__FOpt1_FOr10_FONSr20_F_054f3e'), 
    'test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/button_Search (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/a_Test Hierarchy88'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/a_Actions'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/td_Create New Version (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/button_Yes (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/button_Save and Close (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy/button_Done (1)'))

