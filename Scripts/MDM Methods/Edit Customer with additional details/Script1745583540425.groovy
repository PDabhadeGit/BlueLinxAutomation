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

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_DQ Identifier__FOpt1_FOr10_FONSr20MAnt21r_81982c'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/img_Wrap__FOpt1_FOr10_FONSr20MAnt21r10AP3r1_552638'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_Additional Name__FOpt1_FOr10_FONSr20MAnt2_b5b342'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Additional Name Type__FOpt1_FOr10_FON_2574bd'), 
    'Test test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_Detached Table__FOpt1_FOr10_FONSr20MAnt21_9709ff'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/img_Reorder Columns__FOpt1_FOr10_FONSr20MAn_79d08e'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_Test Customer__FOpt1_FOr10_FONSr20MAnt21r_5d24c4'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/li_Customer Service Number'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_Issuing Authority Name__FOpt1_FOr10_FONSr_637a42'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/li_American Samoa'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_Issue Date__FOpt1_FOr10_FONSr20MAnt21r10A_2aba1e'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/td_25'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/a_Expiration Date__FOpt1_FOr10_FONSr20MAnt2_da933f'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/td_26'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Identifier Type__FOpt1_FOr10_FONSr20M_123db7'), 
    'test')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/input_Expiration Date__FOpt1_FOr10_FONSr20M_3fff8a'), 
    'test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Organizations/button_Save and Close'))

