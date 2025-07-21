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

WebUI.navigateToUrl('https://idcs-4eba051283d64aee8788a096341cd7f4.identity.oraclecloud.com/oauth2/v1/authorize?response_mode=form_post&response_type=id_token&scope=openid&IDCS_CG_ENC_VER=v2&state=wsGfFXqq7fRqBlc0VQ56D7w3VB4F3iwLcr9V8h_f7g0&nonce=lv_nl-zKArsJ4oOYbNNvgLxa4F9Hc5Nrss35suzJUYw&IDCS_IS_CLOUDGATE=true&X-HOST-IDENTIFIER-NAME=otmgtm-dev2-summit1.otmgtm.us-ashburn-1.ocs.oraclecloud.com&idcs_app_name=summit1_OTMGTM-dev2-36112_APPID&idcs_app_resource_url=https%3A%2F%2Fotmgtm-dev2-summit1.otmgtm.us-ashburn-1.ocs.oraclecloud.com%2FGC3%2Fglog.webserver.home.HomeServlet%3Fojr%3Dmaincontent&client_id=2fb6a71c50cc4da5841c7fb65a24a332_APPID&IDCS_CG_ENC=true&enc=LaAcA8tiGSHHAgAAjQIAABAgjQIAAHMCAAAQAMr_KU0QwyzuSIz6LwrpN6kcsOH-wKHozyVeXy8bpUA3jnSrMn3MyloPMWSEN-JHM-ec6a3UZzxBwF3k_nbTMHVLa0aoqvRcEyftZfiCE8TtmFV35L1m-RZ5BFLRox2ILFVxGEJHUMZ6e3H9bjJHbABAoNvdbKuZtPo-E6UQ42Imim3iCkpeNIXwI7pUECwb7laN7tmdRZC7uXsn2ov9M1y0TlYjwVMX0exTLCFDqBf5ihc7qE_bVcWH0A33d7J0K7R9FRqadtxl4--aGLbrHkoNfQMJp1PG-DacGl15UBN5cTLdRvoUGIqqPDWkywYUT5wrdyp354An3PSr15_Xuu3ivJAhpK6Hbq4dXbFDpEAryYbYpZZ2k6OeBqdfZsQ9FCIqpKbbrnIJHMRbsSjriEEfWgTAZTyIwwrtarX1e_KcOQKwUFKgXPliUpnrsZ_QoyJWgeIJwB2l3821aIOahSBS3XhUjNdewmOguhVHnWItavJ_OM1KAJabOwHr2N5Ox2CY9Jt36vjiOgEerGNAC6kfwP2m2ulXi9rV0tkYxLrR6EVzXaI2T3jmUFyhDitNeRAB8arJif_JqtX_5gP2cr8Ior3mcWTo3tyjETws2ZslrzA3SjfJQyeS8cfn9zXpwe9owlTh4VCHhrrdMGq42AGOQBy_UeWugcKRL2OqKPFURom_4KsXmL2T1z5SHxDshbX6FdiFF7Z2OV3uvc1aMVeuplR851UJxWO7SjoHX6yycN5D6jmUjkh3HpQotgOKjnNyFoJ3VGSYGeSAsdIfICoqbQFsDbI4rUyf6-dFQyETuSfuZ2DMKplWfeYC0sqMP5rUmun8XXyroRmOlzVhN0LvgVComRiZ16GVCK896dSs-K-cXM_RWwcsEOc1KTgc4ZZZgMMrZhSX0fHYW5uievHexPs')

WebUI.click(findTestObject('Object Repository/Page_Cloud Sign In/input_User Name_idcs-signin-basic-signin-fo_93898c'))

WebUI.setText(findTestObject('Object Repository/Page_Cloud Sign In/input_User Name_idcs-signin-basic-signin-fo_93898c'), 
    'Gaurav.Prasad@BlueLinxCo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Cloud Sign In/input_Password_idcs-signin-basic-signin-for_2f0e89'), 
    'TCRrBFWPcdYfr+QHQbxu/A==')

WebUI.click(findTestObject('Object Repository/Page_Cloud Sign In/span_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/div_Shipment Management'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/ins_Open in New Window_oj-treeview-icon oj-_e16ff6'))

WebUI.click(findTestObject('Object Repository/Page_Transportation and Global Trade Manage_3d15c4/span_Buy Shipments'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/input_BXC.28018_Selected'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/button_Actions'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/img'))

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/span_Tender'))

WebUI.switchToWindowTitle('Buy Shipments Result')

WebUI.click(findTestObject('Object Repository/Page_Buy Shipments Result/a_Withdraw Tender'))

WebUI.click(findTestObject('Object Repository/Page_Get Retender Flag/input_Retender Shipment_retenderis_retender'))

WebUI.click(findTestObject('Object Repository/Page_Get Retender Flag/button_OK'))

WebUI.closeBrowser()

