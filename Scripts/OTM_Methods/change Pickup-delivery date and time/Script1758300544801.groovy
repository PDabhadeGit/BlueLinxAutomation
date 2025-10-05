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
import java.time.ZonedDateTime as ZonedDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter
import java.time.ZoneId as ZoneId

WebUI.click(findTestObject('Object Repository/New Folder (2)/Page_Order Releases Result/input_Domain Name_Selected'))

WebUI.click(findTestObject('Object Repository/New Folder (2)/Page_Order Releases Result/button_Close_enButton'))

WebUI.click(findTestObject('Object Repository/New Folder (2)/Page_Order Releases Result/span_Show Routing Options_actionTree.1_7.l'))

WebUI.click(findTestObject('Object Repository/New Folder (2)/Page_Order Releases Result/span_Sell_actionTree.1_7_2.l'))

WebUI.switchToWindowTitle('Order Releases Result')

WebUI.click(findTestObject('Object Repository/New Folder (2)/Page_Order Releases Result/a_Auto Apply Services_actionTree.1_7_2_6.k'))

WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Order Release Result/a_Actions_finderActionButtonImg'))

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

WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Shipment Planning/button_Ok'))

WebUI.delay(10)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

