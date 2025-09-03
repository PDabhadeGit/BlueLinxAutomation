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

WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/div_Fleet Management'))

WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/span_Dispatch Board'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Transportation and Global Trade Manage_3d15c4/span_Power Unit Manager_oj-treeview-item-text'))

WebUI.click(findTestObject('Page_Fleet management/Shipment_adder'))

WebUI.switchToFrame(findTestObject('Page_Transportation Workbench/input_Bulk Plan ID_shipmentbulk_planxid'), 0)

WebUI.click(findTestObject('Page_Transportation Workbench/button_Source Pier Location ID_search_button'))

WebUI.click(findTestObject('Page_Transportation Workbench/button_Source Pier Location ID_search_button'))

WebUI.click(findTestObject('Page_Transportation Workbench/input_Domain Name_Selected'))

WebUI.click(findTestObject('Page_Transportation Workbench/input_Domain Name_Selected'))

WebUI.click(findTestObject('Page_Transportation Workbench/span_Close__oj872text'))

WebUI.click(findTestObject('Page_Transportation Workbench/input_BXC.1006656_ui-id-1061cb'))

WebUI.click(findTestObject('Page_Transportation Workbench/input_Domain Name_oj-selectorbox'))

WebUI.click(findTestObject('Page_Transportation Workbench/a_Saved Search_oj-searchselect-arrow oj-sea_cedf43'))

WebUI.doubleClick(findTestObject('Page_Transportation Workbench/td_Totals_RootPane_1_1_region_0_moduleRegio_95ebf1'))

WebUI.click(findTestObject('Page_Transportation Workbench/input_Domain Name_oj-selectorbox'))

WebUI.click(findTestObject('Page_Transportation Workbench/span_Unplanned Order Releases_ui-id-482'))

WebUI.click(findTestObject('Page_Transportation Workbench/span_Unplanned Order Releases_ui-id-482'))

WebUI.click(findTestObject('Page_Transportation Workbench/span_Actions_oj-button-icon oj-end oj-compo_91923f'))

WebUI.click(findTestObject('Page_Transportation Workbench/a_Fleet Unassign_ui-id-1353'))

WebUI.click(findTestObject('Page_Transportation Workbench/span_Unplanned Order Releases_ui-id-482'))

WebUI.click(findTestObject('Page_Transportation Workbench/a_Accept Tender_ui-id-1373'))

WebUI.switchToWindowTitle('Get Retender Flag')

WebUI.click(findTestObject('Page_Get Retender Flag/button_Send Report_ok'))

WebUI.switchToWindowTitle('Transportation Workbench')

WebUI.click(findTestObject('Page_Transportation Workbench/span_Unplanned Order Releases_ui-id-482'))

WebUI.click(findTestObject('Page_Transportation Workbench/div_View Tracking Events_oj-table-scroller'))

WebUI.click(findTestObject('Page_Transportation Workbench/input_View Related Remarks_oj-selectorbox'))

WebUI.click(findTestObject('Page_Transportation Workbench/div_Restore_oj-button-label'))

WebUI.click(findTestObject('Page_Transportation Workbench/span_Actions_oj-button-icon oj-end oj-compo_91923f_1'))

WebUI.click(findTestObject('Page_Transportation Workbench/span_Actions_oj-button-icon oj-end oj-compo_91923f_1'))

WebUI.click(findTestObject('Page_Transportation Workbench/span'))

WebUI.closeBrowser()

