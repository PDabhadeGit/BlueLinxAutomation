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

WebUI.navigateToUrl('https://idcs-4eba051283d64aee8788a096341cd7f4.identity.oraclecloud.com/oauth2/v1/authorize?response_mode=form_post&response_type=id_token&scope=openid&IDCS_CG_ENC_VER=v2&state=M1CfutusSJDrvqv22EMy_ETokwYdgXbLTRqVHcRXSqc&nonce=8l-Pj_ok0yugpY5jj24porbcGYBPI-_Gd7v96LaXIJM&IDCS_IS_CLOUDGATE=true&X-HOST-IDENTIFIER-NAME=otmgtm-dev2-summit1.otmgtm.us-ashburn-1.ocs.oraclecloud.com&idcs_app_name=summit1_OTMGTM-dev2-36112_APPID&idcs_app_resource_url=https%3A%2F%2Fotmgtm-dev2-summit1.otmgtm.us-ashburn-1.ocs.oraclecloud.com%2FGC3%2Fglog.webserver.home.HomeServlet%3Fojr%3Dmaincontent&client_id=2fb6a71c50cc4da5841c7fb65a24a332_APPID&IDCS_CG_ENC=true&enc=Zyx5x0mcCSHHAgAAjQIAABAgjQIAAHMCAAAQAAmQOn4ZpadmMcRDksqZLjuMA6yoxCo6Ymxi49fegfj9FsCGMpqiz_WhsNPoa_n8kUjMrbzM-gkecRhDSw4md8BiYRKK803493l-M6O12IEmykzy5gOTwdO6EzObLk2T_AXwikNu1lJmk9Ob0XQiUtoSd7rpxWvUGEd59MFkWqDZadm-USN-CAKjWYSO16VjxAU6cuhu3tpjSZ2-C3lkCV8Zp5OCCbrDwjTkDY5u1vW4y4v9Tar1gHnHcAtH3RC5-Nf9nKo7Hyp-OEXET36qUzwiAjOSqcJoZAj56QGvzy9HvJyBe74tt5JyTFYHLOFZwuuhdcLd8wPsevulxJf4Aih-eIn1FukP9owGkZ2fZXnbUruuqpvfuriBcXK3ZlfO2ac2ggdrvRVMooKOYWtiB0W_hjDX6xwjE3krqtcMZ_eI2PZ-jQWg-4wVReDMUgnuWUT9t5mEGq78O1WtVg2ci0NMNJoyrp5cWccWEx3sq-27Ri5VnB6MvLyfF3Lk6GMFlbrS5SE_mdqNIh0uXS9zYcnGWPhwMKlcT9M2V5RURN06osfwpPymFG_Bm0XDxqh3mWhENGsAp9iJPdEXGr6jv_iUSNlx6QRY8sZkLSQ2YueaQvtnoM0O4PnEIe-LOXIe9F2X5g_-dwD6R8oxf3rj049v2hwmMxeN72pVQSjJ5YNwZFFxRNS89Y3d1Jg2-XvlLAZezV6KjFvLdQWn-0t0O5r5OYvKeX7MJntLoG09lqfiqA6vr5yr1M2QRHtNZn1FONueful9OdI301G3ntmWWdhEt89e_VsNghaiIn2dOHkmArNoUNUUhwPqudSaVuf8QKyu5_7T5gmDI7z1bLeEh7_q-QePTv-VRJUX5BJfvGuhVTcZLAh3vasB4q6gbaTn9HRo6mNCbVp1dOkKqCP0B05YpX4')

WebUI.setText(findTestObject('Object Repository/Page_Cloud Sign In/input_User Name_idcs-signin-basic-signin-fo_93898c'), 
    'Gaurav.Prasad@BlueLinxCo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Cloud Sign In/input_Password_idcs-signin-basic-signin-for_2f0e89'), 
    'TCRrBFWPcdYfr+QHQbxu/A==')

WebUI.click(findTestObject('Object Repository/Page_Cloud Sign In/span_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/div_Shipment Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Shipment Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Buy Shipments'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/input_BXC.1000330_Selected'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/button_Actions'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/span_Shipment Management'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/span_Events'))

WebUI.switchToWindowTitle('Buy Shipments Result')

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/a_View Shipment Tracking Events'))

WebUI.closeBrowser()

