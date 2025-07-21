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

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Product Management'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Oracle Fusion Cloud Applications/a_Product Information Management'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/img_PrintMe__FOpt1_FOr10_FONSr20_FOTsdiItem_3ddbb3'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/a_Create Item'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Item Class__FOpt1_FOr10_FONSr20MAt20itemC_59683c'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_Bar Mesh'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/li_Steel'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Supply Item__FOpt1_FOr10_FONSr20MAt20AppT_191b00'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_OK'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/textarea_Long Description__FOpt1_FOr10_FONS_41b69b'), 
    'TEST AUTOMATION')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Product Size__FOpt1_FOr10_FONSr20MAt3_7a7f9d'), 
    '1')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Finish__FOpt1_FOr10_FONSr20MAt30pt1ap1r10_4384c8'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_Aluminum'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Grade__FOpt1_FOr10_FONSr20MAt30pt1ap1_c08b08'), 
    'T')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Product Type__FOpt1_FOr10_FONSr20MAt3_1dc583'), 
    'T')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_User Descriptor__FOpt1_FOr10_FONSr20M_8ca69e'), 
    'TEST')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Primary Unit of Measure__FOpt1_FOr10_FONS_a4f085'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_BAG'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Specifications'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Universal'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_STCC ID__FOpt1_FOr10_FONSr20MAt30pt1ap1ss_b0d3e1'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_24211'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_NMFC Class ID__FOpt1_FOr10_FONSr20MAt30pt_af3131'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_100.0'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Actual Product (each) length__FOpt1_F_e3a123'), 
    '10')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Actual Product (each) length UOM__FOpt1_F_a3c135'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_IN'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Actual Product (each) thickness__FOpt_6e55a4'), 
    '10')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Actual Product (each) thickness UOM__FOpt_eb51ed'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/span_IN'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Actual Product (each) width__FOpt1_FO_b0d68b'), 
    '10')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Actual Product (each) width UOM__FOpt1_FO_9af130'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_IN_1'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Manufacturer Part Number__FOpt1_FOr10_abca26'), 
    '1112233')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Agility'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Agility Short Description__FOpt1_FOr1_179935'), 
    'TEST')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Major Code__FOpt1_FOr10_FONSr20MAt30pt1ap_b289f8'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_1'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Major Code Description__FOpt1_FOr10_F_cdc073'), 
    'TEST')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Mid Code__FOpt1_FOr10_FONSr20MAt30pt1ap1s_357fb4'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_1_1'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Mid Code Description__FOpt1_FOr10_FON_49888f'), 
    'TEST')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Minor Code__FOpt1_FOr10_FONSr20MAt30pt1ap_d4d619'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_AFL'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Minor Code Description__FOpt1_FOr10_F_e1ee4c'), 
    'TEST')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Stocked__FOpt1_FOr10_FONSr20MAt30pt1ap1ss_734a6a'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_NO'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Stocking to Costing Factor__FOpt1_FOr_e4f4e7'), 
    '10')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Specified'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Physical Attributes'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Unit__FOpt1_FOr10_FONSr20MAt30pt1ap1sspec_1e1e7c'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_BAG_1'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Unit__FOpt1_FOr10_FONSr20MAt30pt1ap1sspec_430135'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_BAG_1_2'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Unit Weight__FOpt1_FOr10_FONSr20MAt30_5ea469'), 
    '10')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Unit Volume__FOpt1_FOr10_FONSr20MAt30_09072b'), 
    '10')

WebUI.selectOptionByValue(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/select_NoYes'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/select_NoYes_1'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Manufacturing'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Service'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Inventory'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Structures'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/img_Export to Excel__FOpt1_FOr10_FONSr20MAt_3e37b0'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Name__FOpt1_FOr10_FONSr20MAt30pt1ap1sStru_cfd216'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_Primary'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_OK_1'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Attachments'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Associations'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/img_Export to Excel__FOpt1_FOr10_FONSr20MAt_38351e'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Organization__FOpt1_FOr10_FONSr20MAt30pt1_af0af4'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_ACH'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/label_Steel (BL00)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Supply Item (BL00)__FOpt1_FOr10_FONSr20MA_608dc0'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_Done'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Relationships'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/img_Wrap__FOpt1_FOr10_FONSr20MAt30pt1ap1sRe_0193f5'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/img_To Item__FOpt1_FOr10_FONSr20MAt30pt1ap1_7e6509'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Item__FOpt1_FOr10_FONSr20MAt30pt1ap1s_62f6f4'), 
    'test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_Search'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Item__FOpt1_FOr10_FONSr20MAt30pt1ap1s_62f6f4'), 
    '')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_Search'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Keyword__FOpt1_FOr10_FONSr20MAt30pt1a_5b59e0'), 
    'bxc')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_Search'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_139118'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_OK_1_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/select_AccessoriesCollateralComplimentaryCo_23211f'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_OK'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Categories'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/img_Wrap__FOpt1_FOr10_FONSr20MAt30pt1ap1sCa_702a43'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/img_Category_xv0'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Catalog__FOpt1_FOr10_FONSr20MAt30pt1ap1sC_0bf4e2'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_Exterior'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_Outdoor Living'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_OK_1_2_3'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/span_Save'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Submit'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/span_Next'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Name__FOpt1_FOr10_FONSr20MAt30pt1ap1S_b174b8'), 
    'TEST AUTOMATION')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/span_Save and Edit'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/span_Submit'))

