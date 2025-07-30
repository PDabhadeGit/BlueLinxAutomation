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
WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Customer Data Management (5)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Hierarchies (1)'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy - Hierarchies - Oracle Fusio_9c46e6/input_Hierarchy Name__FOpt1_FOr10_FONSr20_F_054f3e'), 
    'test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy - Hierarchies - Oracle Fusio_9c46e6/button_Search'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy - Hierarchies - Oracle Fusio_9c46e6/a_Test Hierarchy'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy - Hierarchies - Oracle Fusio_9c46e6/div_Hierarchy Test Hierarchy_xmo'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy - Hierarchies - Oracle Fusio_9c46e6/td_Create New Version'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy - Hierarchies - Oracle Fusio_9c46e6/button_Yes'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy - Hierarchies - Oracle Fusio_9c46e6/button_Save and Close'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy - Hierarchies - Oracle Fusio_9c46e6/button_OK'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Hierarchy - Hierarchies - Oracle Fusio_9c46e6/button_Done'))

