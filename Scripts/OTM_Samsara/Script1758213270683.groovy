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
import net.sf.cglib.beans.BulkBean as BulkBean
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.utils.Write_Status as Write_Status
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By

WebUI.openBrowser('')

WebUI.navigateToUrl('https://idcs-4eba051283d64aee8788a096341cd7f4.identity.oraclecloud.com/oauth2/v1/authorize?response_mode=form_post&response_type=id_token&scope=openid&IDCS_CG_ENC_VER=v2&state=G6S2OuTh0fzeb7ShdMDI2KmLBjmjt5XhWLdoLm9Crk8&nonce=ZGNqYFZAvwst24T_r7zCkiiEHY7LKuFgzRU-_Ifi0OE&IDCS_IS_CLOUDGATE=true&X-HOST-IDENTIFIER-NAME=otmgtm-dev2-summit1.otmgtm.us-ashburn-1.ocs.oraclecloud.com&idcs_app_name=summit1_OTMGTM-dev2-40894_APPID&idcs_app_resource_url=https%3A%2F%2Fotmgtm-dev2-summit1.otmgtm.us-ashburn-1.ocs.oraclecloud.com%2FGC3%2Fglog.webserver.home.HomeServlet%3Fojr%3Dcoreotm%253Bsrc%253D%25252FGC3%25252Fglog.webserver.finder.FinderServlet%25253FbcKey%25253Dnew%252526query_name%25253Dglog.server.query.item.ItemQuery%252526finder_set_gid%25253DITEM&client_id=3b8d08ac67da44448dfbb39177e20a95_APPID&IDCS_CG_ENC=true&enc=q-EQkygscGReAwAAJAMAABAgJAMAAAoDAAAQACdwy8KaE-7EKFAaqNULNP1Ms-cmaGPNNElileUK7fOWcQgkjSGnVIH1UvkLoZUeejwB-gJ-0_hOpjal1OEWEx626Utvp2UJOifrD3ril6XoD4MQcPIJUb4PxxFx1ym-W5Y-ntIs3LFZDjGaRY69kZtnQfJx3x71KwWyAjKGC6VR_tm_fPeYuQ-h6oDPVRDMKYdbdg_tOrXtC6Gjj16jIeMRhGG_Iu6TW9YlNXErK1E8n4cvqjtKVCi8QW9mNaeVUg_TWDXcMx9lYWSV_URQLfXpZrueEqEkQ_PDFjEAHYkYN_WbPha_zbd9Qef6YaQWJMdfZflQ55sJgR3FGEn-CP1kPWT_vChOPqCyFe3PzMNMlThRAQa_i6RSzJBhAyUf_Gtqe-djtVSJsxyKUEoZO1vAgm9AmE0spa2IUv8_paEGqgf2rOqvjgD_nmUnyuRu_WSeW9ZMejtB_4JQtOKeXbOi9mwoCK7Fbj4ZiLfdM-wU4cNIzqhHonSy-4V6bTfw_f9EXUjrLAVsj55arpZx4Hwa1xC3z-TG2ifwxMzlJem6O4ipTpC55Pzazoe-Ch9J6kLZEoTifJbJ7YMR21TFGKgFIy5xIMjtyoWDzDDpq71b2IJ1YEcUGCq_vLozq6n4UePUhx8MF4_immd6sCOXLdZhteHd7yMkL4PFlZFrP0pYU1jtYxsfVM8TzwkxlSIHoht-R0E3XMpKqauUUVf1ihWqgdu_Yi4KoaOOQ3_zHv7cssPpiOv9PmnxyXsPwl5TVnjLDr8Qc19pSkjmPY-TjIZfXjWjZoFjCcrV5vHOP2YIg0dF5d6YV2UzvbVqu9n89I8ECK6EURP1nB7ejls3bZ-b6TKK7IAovgHM6x-YYHyersBHvlqDihF8ZExbE9Pv-9C7Ky6BJZ1iJWdqVvIWRKjAzTCgD3sy1L4CWo1xEJzMKkc0WS2jCyeIcW-iGo-s7bDcu4oHy-XY5xhAWrYO43og7I96_A8M2lCmgraj1Ekm2fH2onOqHsSTtv9hNmJzdP1lVtfVWxrYoTsNrx1ncdhIOB7A3hNSxUoykI0C7nf76EqvLBzKIyVpcvJL_j6-T74WhQyeQggiNG-5LZv66AnUGme8uxYsJHs0')

WebUI.setText(findTestObject('Object Repository/Samsara/Page_Cloud Sign In/input_User Name_idcs-signin-basic-signin-fo_93898c'), 
    'Gaurav.prasad@bluelinxco.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Samsara/Page_Cloud Sign In/input_Password_idcs-signin-basic-signin-for_2f0e89'), 
    'TCRrBFWPcdYfr+QHQbxu/A==')

WebUI.click(findTestObject('Object Repository/Samsara/Page_Cloud Sign In/span_Sign In'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Items Finder/span_Transportation and Global Trade Manage_f1b5a4'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Transportation and Global Trade Manage_3d15c4/div_Order Management'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Transportation and Global Trade Manage_3d15c4/span_Order Release'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Samsara/Page_Order Release Finder/select_AOBRANCH_CODEBUYER_NUMBERCANCEL_DATE_e95d8c'), 
    'BXC.BRANCH_CODE', true)

WebUI.setText(findTestObject('Object Repository/Samsara/Page_Order Release Finder/input_Order Release Reference Number_order__b32d15'), 
    'TPA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Samsara/Page_Order Release Finder/select_Begins WithEnds WithIs NullNot NullO_756104'), 
    'contains', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Samsara/Page_Order Release Finder/select_WhiteGreenYellowRedBlueOrange'), 
    'W', true)

WebUI.click(findTestObject('Object Repository/Samsara/Page_Order Release Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Order Release Result/input_Domain Name_Selected'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Order Release Result/input_BXC.SO_17558076_20250812_07-01-2025_T_45b749'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Order Release Result/input_BXC.SO_17564908_20250812_07-01-2025_T_1ca58a'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Order Release Result/button_Actions'))

WebUI.switchToWindowTitle('Order Release Result')

WebUI.click(findTestObject('Object Repository/Samsara/Page_Order Release Result/a_Change Pickup and Delivery Dates'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Change Pickup and Delivery Dates/a_Early Pickup Date_order_releaseearly_pick_ebde03'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Samsara/Page_Change Pickup and Delivery Dates/select_000102030405060708091011121314151617_d567da'), 
    '00', true)

WebUI.click(findTestObject('Object Repository/Samsara/Page_Change Pickup and Delivery Dates/td_18'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Change Pickup and Delivery Dates/a_Late Delivery Date_order_releaselate_deli_4af803'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Samsara/Page_Change Pickup and Delivery Dates/select_000102030405060708091011121314151617_d567da_1'), 
    '23', true)

WebUI.click(findTestObject('Object Repository/Samsara/Page_Change Pickup and Delivery Dates/td_18_1'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Change Pickup and Delivery Dates/table_Ok'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Change Pickup and Delivery Dates/button_Ok'))

WebUI.switchToWindowTitle('Order Release Result')

WebUI.click(findTestObject('Object Repository/Samsara/Page_Order Release Result/a_Actions_finderActionButtonImg'))

WebUI.switchToWindowTitle('Order Release Result')

WebUI.click(findTestObject('Object Repository/Samsara/Page_Order Release Result/a_Bulk Plan - Buy'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Samsara/Page_Shipment Planning/select_AK_BUFATL_V2BEL_V1BEL_V2BEL_V3_CLUST_f76e19'), 
    'BXC.TPA_V2', true)

WebUI.click(findTestObject('Object Repository/Samsara/Page_Shipment Planning/button_Ok'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Bulk Plan/button_Refresh'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Bulk Plan/button_Refresh'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Bulk Plan/button_Refresh'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Bulk Plan/button_Refresh'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Bulk Plan/button_Refresh'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Bulk Plan/button_Refresh'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Bulk Plan/div_20250918-0003'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Bulk Plan/div_20250918-0003'))

WebUI.doubleClick(findTestObject('Object Repository/Samsara/Page_Bulk Plan/div_20250918-0003'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Bulk Plan/td_Bulk Plan ID20250918-0003'))

WebUI.switchToWindowTitle('Order Release Result')

WebUI.click(findTestObject('Object Repository/Samsara/Page_Order Release Result/span_Transportation and Global Trade Manage_f1b5a4'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Transportation and Global Trade Manage_3d15c4/div_Shipment Management'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Transportation and Global Trade Manage_3d15c4/span_Buy Shipment'))

WebUI.setText(findTestObject('Object Repository/Samsara/Page_Buy Shipment Finder/input_Bulk Plan ID_shipmentbulk_planxid'), 
    '20250918-0003')

WebUI.selectOptionByValue(findTestObject('Object Repository/Samsara/Page_Buy Shipment Finder/select_Begins WithEnds WithIs NullNot NullO_756104'), 
    'contains', true)

WebUI.click(findTestObject('Object Repository/Samsara/Page_Buy Shipment Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Buy Shipment Result/input_Domain Name_Selected'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Buy Shipment Result/button_Actions'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Buy Shipment Result/span_Fleet Management'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Buy Shipment Result/span_Assign'))

WebUI.switchToWindowTitle('Buy Shipment Result')

WebUI.click(findTestObject('Object Repository/Samsara/Page_Buy Shipment Result/a_Driver'))

WebUI.click(findTestObject('Object Repository/Samsara/Page_Assign Driver to Shipment - Override Criteria/a_Driver ID_driver_xid_find'))

WebUI.switchToWindowTitle('DRIVER Finder')

WebUI.selectOptionByValue(findTestObject('Object Repository/Samsara/Page_DRIVER Finder/select_ALL_ACTIVE_DRIVERSBUF_DRIVERSCHR_DRI_147f2b'), 
    'TPA_DRIVERS', true)

WebUI.click(findTestObject('Object Repository/Samsara/Page_DRIVER Finder/button_Execute Query'))

WebUI.closeBrowser()

