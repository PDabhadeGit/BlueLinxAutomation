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

WebUI.navigateToUrl('https://idcs-4eba051283d64aee8788a096341cd7f4.identity.oraclecloud.com/oauth2/v1/authorize?response_mode=form_post&response_type=id_token&scope=openid&IDCS_CG_ENC_VER=v2&state=dnaw4FgxGdahlUo4uH6p2Sf8Ke9Lpm8nzYtWIKSpX_A&nonce=g-wyVO40M_1TWAiCLC7c6Da-7-JDH6GnGWL20HWHO28&IDCS_IS_CLOUDGATE=true&X-HOST-IDENTIFIER-NAME=otmgtm-test-summit1.otmgtm.us-ashburn-1.ocs.oraclecloud.com&idcs_app_name=summit1_OTMGTM-test-40876_APPID&idcs_app_resource_url=https%3A%2F%2Fotmgtm-test-summit1.otmgtm.us-ashburn-1.ocs.oraclecloud.com%2FGC3%2Fglog.webserver.home.HomeServlet%3Fojr%3Dmaincontent&client_id=631184a4b96645f99653b4b3c0316688_APPID&IDCS_CG_ENC=true&enc=_l25CvQ-b7DHAgAAjQIAABAgjQIAAHMCAAAQACpDHCYTL5dl7V74aTH3rAROBCB3z7Mt8IEBxbjEBHwdHocv9kPDY7TH8kHlJ34T0qdL1bg69yQaZGu7esq07Zj238ZsfMf_5T4ocL02vd9XJTzrfwSQlqbA1l3oaXX75f7EfZH_86qKPPYAkjDNsBt-owmAmE0WRvCogCPON-_nIdFL4UmaUVnHAzjjgw6adQ4hZcmoxBtS9Or15d6-XQTr_GVV6Nn5MQuUk5aHUv88O5vLeLWKiv3FY4wd8mcMu3LJ1LaK0Y68MVi3n1m_D_IWumpH9hsu_C3whFHiUrCUJ6umD5F9-KfIQ12Y9dEjvek-CME9h9LEzFJ5uqX-c_a2IV9WvnKlE9u1WKdGR3phb7iK9Q-ao8C9CpPfu8eMj4EZdIFG0pYK_Ny6LOCUk5V7WydQ6fomQpX_oA3dXPvy99158fixADp278M4DOSW6BMnFk24qCJKHR5gPKFqQ1D55mQGa-O_mmZc1z4frerdF_OHaVYpl2E8wz4csAzqnVkiXwsZdzTTAWh6d9818r_cHvYRDHaldIvc4_9PrRrVFxlbPrSaK0gn2LAqqbaCvqr08HLCJxqgGU84-Y8NxgeyztnhUOO1w8YIThJLhnRSCWpZUq3cLtkDdOBl5LjBKiE5iQP-BbJkiYhY4P5SIKNMH3nqlvmWG9OW6h1escx-LJD7HjfqkqyKW0p9yDq2lcNqi-m7pwVcHFC_o1vZX-36HkRiOSpnLNpLCiJH6hQPtov4SjQ-jiyGt27JvAHqloXdJvglmjU7W3qpsXMM0kmlTJP3Fq6IA_IScQp01Mf5De079wralvgKYPNpaZjO4cJbuMbHvNxyHDx2cJ5_RO5Cjd1WwErvigduQyuOvY5txV6sSMEK2EiZtsk-_rtdmExhp0YN2WilEuGFHd1jZ0WCDEI')

WebUI.click(findTestObject('Object Repository/Page_Cloud Sign In/input_User Name_idcs-signin-basic-signin-fo_93898c'))

WebUI.setText(findTestObject('Object Repository/Page_Cloud Sign In/input_User Name_idcs-signin-basic-signin-fo_93898c'), 
    'Gaurav.Prasad@BlueLinxCo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Cloud Sign In/input_Password_idcs-signin-basic-signin-for_2f0e89'), 
    'TCRrBFWPcdYfr+QHQbxu/A==')

WebUI.click(findTestObject('Object Repository/Page_Cloud Sign In/span_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/div_Shipment Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Shipment Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Buy Shipments'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/input_BXC.1000051_Selected'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/button_Actions'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/span_Shipment Management'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/span_Map'))

WebUI.switchToWindowTitle('Buy Shipments Result')

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/a_Map Shipments'))

WebUI.closeBrowser()

