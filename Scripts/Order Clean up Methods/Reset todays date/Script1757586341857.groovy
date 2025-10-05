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
import java.time.ZonedDateTime as ZonedDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter
import java.time.ZoneId as ZoneId

WebUI.callTestCase(findTestCase('OTM_Methods/Login_OTM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Transportation and Global Trade Manage_3d15c4/div_Order Management'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Transportation and Global Trade Manage_3d15c4/span_Order Release'))

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Order Release Finder/input_Order Release ID_order_releasexid'), 
    'SO_17560390')

WebUI.click(findTestObject('Object Repository/New Folder/Page_Order Release Finder/button_Search'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Order Release Result/input_Domain Name_Selected'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Order Release Result/button_Actions'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Order Release Result/a_Change Pickup and Delivery Dates'))

WebUI.switchToWindowIndex(1)

ZonedDateTime now = ZonedDateTime.now(ZoneId.systemDefault())

DateTimeFormatter formatter = DateTimeFormatter.ofPattern('yyyy-MM-dd HH:mm:ss')

String formattedDate = now.format(formatter)

String startOfDay = now.withHour(0).withMinute(0).withSecond(0).format(formatter)

WebUI.setText(findTestObject('Page_Change Pickup and Delivery Dates/input_Early Pickup Date_order_releaseearly_pickup_date'), 
    startOfDay)

String endOfDay = now.withHour(23).withMinute(59).withSecond(0).format(formatter)

WebUI.setText(findTestObject('Page_Change Pickup and Delivery Dates/input_Late Delivery Date_order_releaselate_delivery_date'), 
    endOfDay)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Change Pickup and Delivery Dates/button_Ok'))

WebUI.delay(10)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Order Release Result/button_Actions'))

WebUI.click(findTestObject('Object Repository/New Folder/Page_Order Release Result/a_Change Pickup and Delivery Dates'))

WebUI.switchToWindowIndex(1)

String EarlyPickupDuration = 1

String LateDeliveryDuration = 30

WebUI.setText(findTestObject('Page_Change Pickup and Delivery Dates/input_Early Pickup Duration_uom_order_releaseearly_pickup_duration_days'), 
    EarlyPickupDuration)

WebUI.setText(findTestObject('Page_Change Pickup and Delivery Dates/input_Late Delivery Duration_uom_order_releaselate_delivery_duration_days'), 
    LateDeliveryDuration)

WebUI.click(findTestObject('Object Repository/New Folder/Page_Change Pickup and Delivery Dates/button_Ok'))

WebUI.delay(10)

//WebUI.getText(findTestObject('Page_Change Order Release Times/td_2025-09-11 1917 AmericaNew_York'))

//WebUI.getText(findTestObject('Page_Change Order Release Times/td_2025-09-11 2317 AmericaNew_York'))

WebUI.closeWindowIndex(1)

WebUI.closeBrowser()

