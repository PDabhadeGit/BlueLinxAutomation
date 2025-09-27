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

WebUI.navigateToUrl('https://idcs-4eba051283d64aee8788a096341cd7f4.identity.oraclecloud.com/oauth2/v1/authorize?response_mode=form_post&response_type=id_token&scope=openid&IDCS_CG_ENC_VER=v2&state=70qyi6O5aLo1_3lmoqisvp3Zw7z5r76XUMHu50_gJz4&nonce=IoT7p2r-QxFGDbzgyfx7iyMXbdre_OEPCRTw77MHJYo&IDCS_IS_CLOUDGATE=true&X-HOST-IDENTIFIER-NAME=otmgtm-dev1-summit1.otmgtm.us-ashburn-1.ocs.oraclecloud.com&idcs_app_name=summit1_OTMGTM-dev1-40911_APPID&idcs_app_resource_url=https%3A%2F%2Fotmgtm-dev1-summit1.otmgtm.us-ashburn-1.ocs.oraclecloud.com%2FGC3%2Fglog.webserver.home.HomeServlet%3Fojr%3Dmaincontent&client_id=bf13abd30f4d48a6879d9711bef0a385_APPID&IDCS_CG_ENC=true&enc=E2WQpgLM8fjHAgAAjQIAABAgjQIAAHMCAAAQAMEocyBjZ1ce-bpCF9S6GLciny4BR4wNwSH0zx4K1KECZnbu9lCn5vRZJdRuZGEDQgwLkZFNmOIHmT0V7jv9UBtRcLgvRrvC_XByTWyiSvckder1mA_uRPE5Yz8RK_SkGEQx3g7FiPnMYelnHZxkwHOiR0bDrX8k-xFA67de56bLANswZYy8hOIX4jDXNHdwlppbaoJ-OqnpzJKkNRV51jY_g5KUZLe4DsW9Wofn3JSbcaiCaWnbI8uupPCsOiVuqo1b7dDBWk0kFRFz7u5cU6pX5jjAAFH51lPBDPU0DnA9_IwTJnRcZ_D7pfTdxfTwrHPyPkRzj-L62h5cNJ31REgTnL6XIqg2brGZfhxaqEoA9lgvUIvh8cbnbqHdxrgXUu1Zp5a06fS6m0g1cJWETagfeFWzMAwXBQBwdiow9BGFCb6FT0XE5tFJuDlcG_tSUvDqkzbL_bCX2bZ8ihO-7AwsUFdxJi2Wel7c1S-9DF_R17KdLOHcqVi02yC-v3SrXkrWtrNU0o5k5nDR1PePZPRIodnNphE8JJaxCdrXDrKYQlPKLvRVU7LVseNerKNrGTCtvjku42xKJkE58bFanCugWQRsvcL_lXcW0YMm4DGJo864LaFOIEqAvDQUUetgYudD7AbVghIiMpoNmYJ07u-_PUapmxB5lnBBJQxfxegALyDj1liEWFFuTy96tm6hMRMiDepacv3FafHMtGrH_9DdmSQGlgOFDhGgPpUJJvS9Wu_1lqnjyu4HynCPrOW9Gz24DbbShbCnd8N9lQakn7ZenPc5_lYshHzEVqCyhJNr77cbK-SmRWFbgx9LMKKeXuIoPvK5-0cCZ-rNcDIAEjP-gAAQn1pJf_lt5ygTNr6l-Pw-mOkRvv0Xr_iIOwX9TsRdgtNlSSvqis2ItpF_KS7b2cw')

WebUI.setText(findTestObject('Object Repository/driver3/Page_Cloud Sign In/input_User Name_idcs-signin-basic-signin-fo_93898c'), 
    'gaurav.prasad@bluelinxco.com')

WebUI.setEncryptedText(findTestObject('Object Repository/driver3/Page_Cloud Sign In/input_Password_idcs-signin-basic-signin-for_2f0e89'), 
    'TCRrBFWPcdYfr+QHQbxu/A==')

WebUI.click(findTestObject('Object Repository/driver3/Page_Cloud Sign In/span_Forgot Password_ui-id-4'))

WebUI.click(findTestObject('Object Repository/driver3/Page_Transportation and Global Trade Manage_3d15c4/div_Open in New Window_label8'))

WebUI.click(findTestObject('Object Repository/driver3/Page_Transportation and Global Trade Manage_3d15c4/span_Open in New Window_oj-treeview-item-text'))

WebUI.setText(findTestObject('Object Repository/driver3/Page_DRIVER Finder/input_Default Home Location ID_driverhome_l_8fb156'), 
    'ORG-TPA')

WebUI.click(findTestObject('Object Repository/driver3/Page_DRIVER Finder/tr_Cancel_acSelItem'))

WebUI.click(findTestObject('Object Repository/driver3/Page_DRIVER Finder/button_Involved Party Contact_search_button'))

WebUI.closeBrowser()

