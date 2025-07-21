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

WebUI.navigateToUrl('https://idcs-4eba051283d64aee8788a096341cd7f4.identity.oraclecloud.com/oauth2/v1/authorize?response_mode=form_post&response_type=id_token&scope=openid&IDCS_CG_ENC_VER=v2&state=ILZ57UAG941ulqCphGuC4CeKIYPvWTnWY51jQ08PhYU&nonce=DTTq8fzlji77HApcte8BiODbd0dQeVUOINWViMugG94&IDCS_IS_CLOUDGATE=true&X-HOST-IDENTIFIER-NAME=otmgtm-dev2-summit1.otmgtm.us-ashburn-1.ocs.oraclecloud.com&idcs_app_name=summit1_OTMGTM-dev2-36112_APPID&idcs_app_resource_url=https%3A%2F%2Fotmgtm-dev2-summit1.otmgtm.us-ashburn-1.ocs.oraclecloud.com%2FGC3%2Fglog.webserver.home.HomeServlet%3Fojr%3Dmaincontent&client_id=2fb6a71c50cc4da5841c7fb65a24a332_APPID&IDCS_CG_ENC=true&enc=inJ17dz1oCHHAgAAjQIAABAgjQIAAHMCAAAQAI1gSTPeRIAxDgPrO4ezWAhB7brtu0P1cart4fY1Smjkqt7mcIB6G5H5ZGLTlBCcE_qR6F7b-rycHfe-cD6NARDxWg-MdyHxku1vgLHhByTKu9n-XtWZlWlWDmPK0ZAfbiDlY7RG3y2ZauWKd3UbNa9XukxT4Pun8BpkxFZu2r0rauan7HfiXtkhWamKxCqj6TbnNgIu9tOQTDbX3lC6_IPqOKM2om4Qa2lEMtHRiv_inVLNPw2jabqyxptHcKErv0Z0HdMQfq_9WwpynvLve6UADWDjPdKslZeX4M3ldYp74g3CWFqQXhBVdIzhnFHDxqNU_mNuAtx3Vv8vZ9MJHQvIwOR8Qm1Q78yR3ce6XOwupd6OIzRbo0ZZuWQmPjia7ky9xRvpbPIWyLcSFb8NJfgDbf-oBDhk-Cx_selME8HlNg-cjAzsYksBnDOllrFmZTlQ25-TBssDcwVNtukZS-JQqMAC2AVjPGgeICPP4gZk1OqBNIt2Rh3m2J_Uz8h5_Ymjegg-NZ0OCdfPrMO3pIWa38u40VEW7KBnLiEPGyZnxyyaYorBp1y2FTznXiV20Gw1llMlf2BaCEsF2bqtAtyNme3x9OtpVwu1nUnqtU94nR4ZgdUq5LnypagBqKl03-Kl3AxasPFdZzEepY4LZNIiWLBpITlXFPL3c-zJZIKnGCFuLHIp1hLNBEJ_OTL88yuIR2SVbvhEDkzQpi8kjHeecWbqpnQbR51W6P7-k2KUjPe9bGNDgHxU1jf_83_x-FiCXljo2MXbFPH7Ms4SWmsj54_HIhmYMphBcI15kD5ga2hDqGOAOgM5Fl7y94CjQKHr6J_R5-D0VNnMFhdVYNp2HJ0ON4-PkG33OaRaXy8_EJYXaor4OBaX6SZkyVks00iOa4DdrvYm_BXRz1yN6ecg56k')

WebUI.setText(findTestObject('Object Repository/Page_Cloud Sign In/input_User Name_idcs-signin-basic-signin-fo_93898c'), 
    'Prajyot.Dabhade@BlueLinxCo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Cloud Sign In/input_Password_idcs-signin-basic-signin-for_2f0e89'), 
    '5hR7QmHaNRiODTCz3O3fP172+5d7ddYj')

WebUI.click(findTestObject('Object Repository/Page_Cloud Sign In/div_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/div_Shipment Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Shipment Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Buy Shipments'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/input_BXC.8000_Selected'))

WebUI.closeBrowser()

