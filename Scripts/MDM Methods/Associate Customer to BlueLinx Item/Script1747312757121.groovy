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

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/a_Relationships (3)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/a_Trading Partner Items (2)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/img_Wrap_pt1_FOr11_FONSr20MAt30pt1ap1sTPX1T_c0f5bc (2)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/a_Customer Name_pt1_FOr11_FONSr20MAt30pt1ap_5db720'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/td_A-ONE LUMBER CO LLC'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/a_Customer Item_pt1_FOr11_FONSr20MAt30pt1ap_f09694'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/td_Test partner'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/span_OK (1)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/span_Save (4)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/a_Save_pt1_FOr11_FONSr20MAt30pt1ap1csavebtnpopEl'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/td_Save and Close'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Manage Items - Product Information Man_10c66f/button_Done (2)'), FailureHandling.OPTIONAL)

