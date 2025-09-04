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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://idcs-4eba051283d64aee8788a096341cd7f4.identity.oraclecloud.com/oauth2/v1/authorize?response_mode=form_post&response_type=id_token&scope=openid&IDCS_CG_ENC_VER=v2&state=afkwN7XT0hP31oU-QAqjL-MHNp79I9LGYIC0f7NJfcg&nonce=Rn6iBYXpddvZQgFcjWXUDRYv9kbvbEcxPSoxdnA9KH0&IDCS_IS_CLOUDGATE=true&X-HOST-IDENTIFIER-NAME=otmgtm-dev1-summit1.otmgtm.us-ashburn-1.ocs.oraclecloud.com&idcs_app_name=summit1_OTMGTM-dev1-40911_APPID&idcs_app_resource_url=https%3A%2F%2Fotmgtm-dev1-summit1.otmgtm.us-ashburn-1.ocs.oraclecloud.com%2FGC3%2Fglog.webserver.home.HomeServlet%3Fojr%3Dmaincontent&client_id=bf13abd30f4d48a6879d9711bef0a385_APPID&IDCS_CG_ENC=true&enc=eI5eBQZFHT_HAgAAjQIAABAgjQIAAHMCAAAQAIp_RC0Uqms9_P7_L2QGiXoYdhDt7s0hS-RZ4x5V2aWFXE7Syxm36G6vyvvDroS25OV83QbF0iB3XnOtXZJeBXWAahMI727AjD0MXuh4oSywml3m6QI0JAnLAJSu0KmvoDBMY6McN6O2yHX4sDGmEfSiUcqwleDqKCtOS8aTqeidBFpyhbDe5dCzwEeITTaHsJgSqWY4vH5Rlgo7C2w3qTq2Lr5PSvBobpXzRNY4KqvbB9wy58wWqeBYKIOaa9Wmb0Nfbt8gMbGZF-me3AVHZY-Y6pCK9vx2I6tOVFq1uYGfBJjrc9LTcxKj3t1qcH6facw1V7SfncWYGSQk5FrADP7_y154QrMOCkLeaPrGwtK9t13ocAaD9pjEsYexU6MwBiYy77jw90xjf4n3Ykabmwcx6ouUsF2CtbZZtzm2ssC0Zzae7Wi7hl96aW18l38BZrJ-wYux4CghezIqeMbBoU2dAUIrMWYgFlQhQNS6oE-om4pBJsVADxoL-x-6oPWet071DuveQhZLAX4_zznR2QMuOoxyljCYGWInNtOifswuFRC4qFaQDtMAL6mTcZaqUyrCdGQAfiecvpPckwzxv-mwj_GtNpiqs1OHlsqPI14e6TPGKPk1ZTy4xrsnjYxQ0AEiaaX0tVjOzkYOJsO9V8f9JIB4Lz0hLkRvuVb3hW0FegsvS-aIoA9iRfy8_9XI1RfceWP6uxOShumCUsX7DsR8sRjvs75PL-YFjoeANg-gqRM36rmmrib4GjQ5zHjN0i8Gaa47l4-sRBLC9ErVowAFP9e3uSWN6Mu0UsqSPwr3fia8Mcsoc7ZgVHFM9esfgBPU221hUu3sfWCepXg2tZa1Yk5TwnSHxq5PZbo1Sp_Zmxyiz6WzlA56WlgLi4uCp_6sN6s8O_qgKq9gymx844QsTFs')

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_Cloud Sign In/input_User Name_idcs-signin-basic-signin-fo_93898c'), 
    'Gaurav.prasad@bluelinxco.com')

WebUI.setEncryptedText(findTestObject('Object Repository/New Folder (1)/Page_Cloud Sign In/input_Password_idcs-signin-basic-signin-for_2f0e89'), 
    'TCRrBFWPcdYfr+QHQbxu/A==')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Cloud Sign In/span_Sign In'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Transportation and Global Trade Manage_3d15c4/div_Shipment Management'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Transportation and Global Trade Manage_3d15c4/span_Buy Shipment'))

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/input_Bulk Plan ID_shipmentbulk_planxid'), 
    '20250903-0008')

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/select_Begins WithEnds WithIs NullNot NullO_756104'), 
    'contains', true)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/button_Refine Query'))

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/input_Bulk Plan ID_shipmentbulk_planxid'), 
    '20250903-0010')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/button_Refine Query'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/span_Transportation and Global Trade Manage_f1b5a4'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Transportation and Global Trade Manage_3d15c4/div_Order Management'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Transportation and Global Trade Manage_3d15c4/span_Order Release'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_Order Release Finder/select_AOBRANCH_CODEBUYER_NUMBERCANCEL_DATE_e95d8c'), 
    'BXC.BRANCH_CODE', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_Order Release Finder/select_Begins WithEnds WithIs NullNot NullO_756104'), 
    'contains', true)

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_Order Release Finder/input_Order Release Reference Number_order__b32d15'), 
    'NWK')

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_Order Release Finder/select_WhiteGreenYellowRedBlueOrange'), 
    'W', true)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Order Release Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Order Release Result/input_Domain Name_Selected'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Order Release Result/input_BXC.SO_17552398_Selected'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Order Release Result/button_Actions'))

WebUI.switchToWindowTitle('Order Release Result')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Order Release Result/a_Change Pickup and Delivery Dates'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Change Pickup and Delivery Dates/input_Early Pickup Date_order_releaseearly__cee31a'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Change Pickup and Delivery Dates/a_Early Pickup Date_order_releaseearly_pick_ebde03'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_Change Pickup and Delivery Dates/select_000102030405060708091011121314151617_d567da'), 
    '00', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_Change Pickup and Delivery Dates/select_000102030405060708091011121314151617_3a1c8f'), 
    '00', true)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Change Pickup and Delivery Dates/td_4'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Change Pickup and Delivery Dates/a_Late Delivery Date_order_releaselate_deli_4af803'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_Change Pickup and Delivery Dates/select_000102030405060708091011121314151617_d567da_1'), 
    '23', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_Change Pickup and Delivery Dates/select_000102030405060708091011121314151617_3a1c8f_1'), 
    '59', true)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Change Pickup and Delivery Dates/button_Ok'))

WebUI.switchToWindowTitle('Order Release Result')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Order Release Result/button_Actions'))

WebUI.switchToWindowTitle('Order Release Result')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Order Release Result/a_Bulk Plan - Buy'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_Shipment Planning/select_AK_BUFATL_V2BEL_V1BEL_V2BEL_V3_CLUST_f76e19'), 
    'BXC.NWK_V2', true)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Shipment Planning/button_Ok'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Bulk Plan/button_Refresh'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Bulk Plan/button_Refresh'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Bulk Plan/div_20250904-0006'))

WebUI.switchToWindowTitle('Order Release Result')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Order Release Result/input_BXC.SO_17552398_Selected'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Order Release Result/button_Actions'))

WebUI.switchToWindowTitle('Order Release Result')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Order Release Result/a_Change Pickup and Delivery Dates'))

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_Change Pickup and Delivery Dates/input_Early Pickup Date_order_releaseearly_pickup_date'), 
    '2025-09-04 00:00:00')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Change Pickup and Delivery Dates/a_Late Delivery Date_order_releaselate_deli_4af803 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_Change Pickup and Delivery Dates/select_000102030405060708091011121314151617_d567da (1)'), 
    '23', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_Change Pickup and Delivery Dates/select_000102030405060708091011121314151617_3a1c8f (1)'), 
    '43', true)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Change Pickup and Delivery Dates/td_4 (1)'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Change Pickup and Delivery Dates/button_Ok (1)'))

WebUI.switchToWindowTitle('Order Release Result')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Order Release Result/button_Actions'))

WebUI.switchToWindowTitle('Order Release Result')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Order Release Result/a_Bulk Plan - Buy'))

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_Shipment Planning/select_AK_BUFATL_V2BEL_V1BEL_V2BEL_V3_CLUSTER_4X_N-S-E-WBEL_V3_CLUSTER_PLUSBEL_V3_CLUSTER_PLUS-E-WBEL_V3_CLUSTER_PLUS-N-SBEL_V3_CLUSTER_PLUS_MULTISTOP_MIPBUF_V1BUF_V2CHR_V1CHR_V2CLT_V1CLT_V2CLT_V3_PLAN SHIPMENTS WITH CAR'), 
    'BXC.NWK_V2', true)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Shipment Planning/button_Ok (1)'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Bulk Plan/button_Refresh (1)'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Bulk Plan/button_Refresh (1)'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Bulk Plan/td_Bulk Plan ID20250904-0007'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Bulk Plan/div_20250904-0007'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Bulk Plan/div_'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Bulk Plan/div_20250904-0007'))

WebUI.switchToWindowTitle('Order Release Result')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Order Release Result/span_Transportation and Global Trade Manage_f1b5a4'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Transportation and Global Trade Manage_3d15c4/div_Shipment Management'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Transportation and Global Trade Manage_3d15c4/span_Buy Shipment'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/input_Bulk Plan ID_shipmentbulk_planxid'))

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/input_Bulk Plan ID_shipmentbulk_planxid'), 
    '20250904-0007')

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/select_Begins WithEnds WithIs NullNot NullO_756104'), 
    'contains', true)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/input_Domain Name_Selected'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/button_Actions'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/span_Fleet Management'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/span_Assign'))

WebUI.switchToWindowTitle('Buy Shipment Result')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/a_Driver'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Assign Driver to Shipment - Override Criteria/a_Driver ID_driver_xid_find'))

WebUI.switchToWindowTitle('DRIVER Finder')

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_DRIVER Finder/input_Work Region ID_driverwork_region_xid'), 
    'NWK')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_DRIVER Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_DRIVER Result/button_Refine Query'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_DRIVER Finder/a_Work Region ID_driverwork_region_xid_find'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_DRIVER Finder/div_Adjusted Hire Date                  new_d49937'))

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_DRIVER Finder/input_Work Region ID_driverwork_region_xid'), 
    '')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_DRIVER Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_DRIVER Result/div_Work Region ID'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_DRIVER Result/div_Default Home Location ID'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_DRIVER Result/a_All'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Assign Driver to Shipment - Override Criteria/a_Driver ID_driver_xid_find'))

WebUI.switchToWindowTitle('DRIVER Finder')

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_DRIVER Finder/select_ALL_ACTIVE_DRIVERSBUF_DRIVERSCHR_DRI_147f2b'), 
    'NWK_DRIVERS', true)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_DRIVER Finder/button_Execute Query'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_DRIVER Result/input_BXC.WARREN_BLACK_20061115_Selected'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_DRIVER Result/input_BXC.SLAVI_IVANOV_20059565_Selected'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_DRIVER Result/button_Finish'))

WebUI.switchToWindowTitle('Assign Driver to Shipment - Override Criteria')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Assign Driver to Shipment - Override Criteria/button_Ok'))

WebUI.switchToWindowTitle('Buy Shipment Result')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/input_Actions_rgRerunQueryImg'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/input_Actions_rgRerunQueryImg'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/input_Actions_rgRerunQueryImg'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/input_Actions_rgRerunQueryImg'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/td'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/input_Actions_rgRerunQueryImg'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/button_Actions'))

WebUI.switchToWindowTitle('Buy Shipment Result')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/a_Secure Resources by Planner'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Online BookingTendering - Identification/button_Accept'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Online BookingTendering/button_Finished'))

WebUI.switchToWindowTitle('Buy Shipment Result')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/td_1'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/input_Actions_rgRerunQueryImg'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/button_Refine Query_1'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/span_Transportation and Global Trade Manage_f1b5a4'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Transportation and Global Trade Manage_3d15c4/oj-module_Open in New Window               _d668c7'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Transportation and Global Trade Manage_3d15c4/span_Buy Shipment'))

WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/input_Bulk Plan ID_shipmentbulk_planxid'), 
    '20250904-0007')

WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/select_Begins WithEnds WithIs NullNot NullO_756104'), 
    'contains', true)

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/input_Domain Name_Selected'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/button_Actions'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/span_Fleet Management (1)'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/span_Fleet Unassign'))

WebUI.switchToWindowTitle('Buy Shipment Result')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/a_Driver (1)'))

WebUI.switchToWindowTitle('Buy Shipment Result')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/button_Actions'))

WebUI.switchToWindowTitle('Buy Shipment Result')

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/a_Withdraw Tender'))

WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Get Retender Flag/button_Ok'))

WebUI.closeBrowser()