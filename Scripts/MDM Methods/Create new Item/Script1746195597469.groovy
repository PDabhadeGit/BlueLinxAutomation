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

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information Management - Oracl_498cc2/a_Create Item'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_Item Class_pt1_FOr11_FONSr20MAt20itemClas_b68128'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/td_Bar Mesh'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/li_Steel'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_Steel_pt1_FOr11_FONSr20MAt20AppTe0selectM_1e3d29'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/button_OK'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/textarea_Long Description_pt1_FOr11_FONSr20_0f4b0a'), 
    'test')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_User Descriptor_pt1_FOr11_FONSr20MAt3_ceddce'), 
    'test')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Product Size_pt1_FOr11_FONSr20MAt30pt_91a4c9'), 
    '1')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/a_Finish_pt1_FOr11_FONSr20MAt30pt1ap1r10dyn_92b13d'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/td_Aluminum'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Grade_pt1_FOr11_FONSr20MAt30pt1ap1r10_a0ec97'), 
    't')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Product Type_pt1_FOr11_FONSr20MAt30pt_130a14'), 
    'test')

//WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Item Class__FOpt1_FOr10_FONSr20MAt20itemC_59683c'), 
  //  FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Primary Unit of Measure__FOpt1_FOr10_FONS_a4f085'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_BAG'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Specifications'), 80)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Specifications'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Universal'))

WebUI.click(findTestObject('MDM_Page_Objects/Page_Create Item - Oracle Fusion Cloud/a_Hazardous_pt1_FOr11_FONSr20MAt30pt1ap1sspecf1dynReg1CTXRNj_ItemBluelinxPrivateVOOTM__Attributes0hazardouslovIconId'))

WebUI.delay(3)

WebUI.click(findTestObject('MDM_Page_Objects/Page_Create Item - Oracle Fusion Cloud/td_NO'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_STCC ID__FOpt1_FOr10_FONSr20MAt30pt1ap1ss_b0d3e1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_24211'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_NMFC Class ID__FOpt1_FOr10_FONSr20MAt30pt_af3131'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_100.0'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Shipping Product (each) thickness_pt1_c26ce2'), 
    '10')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Shipping Product (each) thickness UOM_71bc27'), 
    'TBD')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Shipping Product (each) width_pt1_FOr_92a73b'), 
    '10')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Shipping Product (each) width UOM_pt1_ecdc0d'), 
    'TBD')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Shipping Product (each) length_pt1_FO_84f2ba'), 
    '10')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item - Product Information Mana_e915c5/input_Shipping Product (each) length UOM_pt_2d753d'), 
    'TBD')

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Actual Product (each) length__FOpt1_F_e3a123'), 
    '10')

/*
	 * WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create
	 * Item/a_Actual Product (each) length UOM__FOpt1_F_a3c135'))
	 * 
	 * WebUI.click(findTestObject('MDM_Page_Objects/Item/td_MM_xen'))
	 * 
	 * WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create
	 * Item/input_Actual Product (each) thickness__FOpt_6e55a4'), '10')
	 * 
	 * WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create
	 * Item/a_Actual Product (each) thickness UOM__FOpt_eb51ed'))
	 * 
	 * WebUI.click(findTestObject('MDM_Page_Objects/Item/td_MM_xen_1'))
	 * 
	 * WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create
	 * Item/input_Actual Product (each) width__FOpt1_FO_b0d68b'), '10')
	 * 
	 * WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create
	 * Item/a_Actual Product (each) width UOM__FOpt1_FO_9af130'))
	 * 
	 * WebUI.click(findTestObject('MDM_Page_Objects/Item/td_MM_xen_2'))
	 */
WebUI.scrollToElement(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Manufacturer Part Number__FOpt1_FOr10_abca26'), 
    100)

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Manufacturer Part Number__FOpt1_FOr10_abca26'), 
    '1112233')

WebUI.scrollToElement(findTestObject('MDM_Page_Objects/Page_Item/input_Certification_pt1_FOr11_FONSr20MAt30p_7477b3'), 80)

WebUI.setText(findTestObject('MDM_Page_Objects/Page_Item/input_Certification_pt1_FOr11_FONSr20MAt30p_7477b3'), '123678')

WebUI.scrollToElement(findTestObject('MDM_Page_Objects/Page_Item/input_UPC Barcode_pt1_FOr11_FONSr20MAt30pt1ap1sspecf1dynReg1CTXRNj_ItemBluelinxPrivateVOCommon0upcBarcodecontent'), 
    80)

WebUI.setText(findTestObject('MDM_Page_Objects/Page_Item/input_UPC Barcode_pt1_FOr11_FONSr20MAt30pt1ap1sspecf1dynReg1CTXRNj_ItemBluelinxPrivateVOCommon0upcBarcodecontent'), 
    '1478344')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Agility'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Agility Short Description__FOpt1_FOr1_179935'), 
    'TEST')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Major Code__FOpt1_FOr10_FONSr20MAt30pt1ap_b289f8'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Major Code Description__FOpt1_FOr10_F_cdc073'), 
    '1')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Mid Code__FOpt1_FOr10_FONSr20MAt30pt1ap1s_357fb4'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_1_1'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Mid Code Description__FOpt1_FOr10_FON_49888f'), 
    'TEST')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Minor Code__FOpt1_FOr10_FONSr20MAt30pt1ap_d4d619'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_AFL'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Minor Code Description__FOpt1_FOr10_F_e1ee4c'), 
    'TEST')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Stocked__FOpt1_FOr10_FONSr20MAt30pt1ap1ss_734a6a'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_NO'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Stocking to Costing Factor__FOpt1_FOr_e4f4e7'), 
    '10')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Specified'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Physical Attributes'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Unit__FOpt1_FOr10_FONSr20MAt30pt1ap1sspec_1e1e7c'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_BAG_1'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Unit__FOpt1_FOr10_FONSr20MAt30pt1ap1sspec_430135'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_BAG_1_2'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Unit Weight__FOpt1_FOr10_FONSr20MAt30_5ea469'), 
    '10')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Unit Volume__FOpt1_FOr10_FONSr20MAt30_09072b'), 
    '10')

WebUI.selectOptionByValue(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/select_NoYes'), '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/select_NoYes_1'), '0', true)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Manufacturing'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Service'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Inventory'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Structures'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/img_Export to Excel__FOpt1_FOr10_FONSr20MAt_3e37b0'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Name__FOpt1_FOr10_FONSr20MAt30pt1ap1sStru_cfd216'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_Primary'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_OK_1'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Attachments'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Associations'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/img_Export to Excel__FOpt1_FOr10_FONSr20MAt_38351e'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Organization__FOpt1_FOr10_FONSr20MAt30pt1_af0af4'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_ACH'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/label_Steel (BL00)'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Supply Item (BL00)__FOpt1_FOr10_FONSr20MA_608dc0'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_Done'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Relationships'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/img_Wrap__FOpt1_FOr10_FONSr20MAt30pt1ap1sRe_0193f5'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/img_To Item__FOpt1_FOr10_FONSr20MAt30pt1ap1_7e6509'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Item__FOpt1_FOr10_FONSr20MAt30pt1ap1s_62f6f4'), 
    'test')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_Search'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Item__FOpt1_FOr10_FONSr20MAt30pt1ap1s_62f6f4'), 
    '')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_Search'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Keyword__FOpt1_FOr10_FONSr20MAt30pt1a_5b59e0'), 
    'bxc')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_Search'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_139118'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_OK_1_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/select_AccessoriesCollateralComplimentaryCo_23211f'), 
    '0', true)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_OK'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Categories'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/img_Wrap__FOpt1_FOr10_FONSr20MAt30pt1ap1sCa_702a43'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/img_Category_xv0'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Catalog__FOpt1_FOr10_FONSr20MAt30pt1ap1sC_0bf4e2'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_Exterior'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/td_Outdoor Living'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/button_OK_1_2_3'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/span_Save'))

WebUI.click(findTestObject('MDM_Page_Objects/Page_Create Item PIM/button_Apply'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/a_Submit'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/span_Next'))

WebUI.setText(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/input_Name__FOpt1_FOr10_FONSr20MAt30pt1ap1S_b174b8'), 
    'TEST AUTOMATION')

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Create Item/span_Save and Edit'))

WebUI.click(findTestObject('Object Repository/MDM_Page_Objects/Page_Product Information/span_Submit'))

