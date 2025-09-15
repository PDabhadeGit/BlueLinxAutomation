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

WebUI.callTestCase(findTestCase('OTM_Methods/Login_OTM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Bulk Creation/Page_Transportation and Global Trade Manage_3d15c4/div_Order Management'), 
    60)

WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Transportation and Global Trade Manage_3d15c4/div_Order Management'))

WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Transportation and Global Trade Manage_3d15c4/span_Order Release'))

WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Order Release Finder/input_Order Release ID_order_releasexid'))

def testData = TestDataFactory.findTestData('OTM Test Data/Demo Order IDs')

int totalRows = testData.getRowNumbers()

for (int i = 2; i <= totalRows; i++) {
    def cellValue = testData.getValue(1, i // Column 1 — adjust if needed
        )

    if ((cellValue == null) || cellValue.trim().isEmpty()) {
        println("Row $i is empty. Closing browser and exiting loop.")

        WebUI.closeBrowser()

        break
    }
    
    String OrderID = testData.getValue(1, i // note the row and colunn no.)
        )

    println('Running for Bulk Order ID: ' + OrderID)

    WebUI.setText(findTestObject('Object Repository/Bulk Creation/Page_Order Release Finder/input_Order Release ID_order_releasexid'), 
        OrderID)

    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Order Release Finder/button_Search'))

    String resultText1 = WebUI.getText(findTestObject('Page_Order Release Result/span_0'))

    // Print the value (optional, for debugging)
    println("Text value: $resultText1")

    if (resultText1.trim() == '0') {
        Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Created', i - 1, 5, resultText1)

        WebUI.delay(3)

        WebUI.click(findTestObject('New Folder (1)/Page_Buy Shipment Result/button_Refine Query'))

        continue
    }
    
    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Order Release Result/input_Domain Name_Selected'))

    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Order Release Result/a_Actions_finderActionButtonImg'))

    WebUI.click(findTestObject('Object Repository/New Folder/Page_Order Release Result/a_Change Pickup and Delivery Dates'))

    WebUI.switchToWindowIndex(1)

    /*
	 * WebUI.scrollToElement(findTestObject('Object Repository/Bulk
	 * Creation/Page_Order Release Result/a_Bulk Plan - Buy'), 50)
	 * 
	 * WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Order
	 * Release Result/a_Bulk Plan - Buy'))
	 * 
	 * WebUI.switchToWindowIndex(1)
	 * 
	 * WebUI.selectOptionByValue(findTestObject('Object Repository/Bulk
	 * Creation/Page_Shipment
	 * Planning/select_AKR_V2AK_BUFATL_V2BEL_V1BEL_V2BEL_V3_395165'), 'BXC.NWK_V2',
	 * true)
	 */
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

    String pickUpDate = WebUI.getText(findTestObject('Page_Change Order Release Times/td_2025-09-11 1917 AmericaNew_York'))

    Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Created', i - 1, 1, pickUpDate)

    String deliveryDate = WebUI.getText(findTestObject('Page_Change Order Release Times/td_2025-09-11 2317 AmericaNew_York'))

    Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Created', i - 1, 2, deliveryDate)

    WebUI.delay(10)

    WebUI.closeWindowIndex(1)

    WebUI.switchToWindowIndex(0)

    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Order Release Result/a_Actions_finderActionButtonImg'))

    WebUI.scrollToElement(findTestObject('Object Repository/Bulk Creation/Page_Order Release Result/a_Bulk Plan - Buy'), 
        50)

    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Order Release Result/a_Bulk Plan - Buy'))

    WebUI.switchToWindowIndex(1)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Bulk Creation/Page_Shipment Planning/select_AKR_V2AK_BUFATL_V2BEL_V1BEL_V2BEL_V3_395165'), 
        'BXC.NWK_V2', true)

    WebUI.click(findTestObject('Object Repository/New Folder/Page_Change Pickup and Delivery Dates/button_Ok'))

    String BulkID = WebUI.getText(findTestObject('Page_Bulk Plan/div_20250910-0002'))

    Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Created', i - 1, 3, BulkID)

    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Bulk Plan/button_Refresh'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Bulk Plan/button_Refresh'))

    WebUI.delay(15)

    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Bulk Plan/button_Refresh'))

    WebUI.delay(15)

    //WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Bulk Plan/div_COMPLETED'))
    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Page_Bulk Plan/a_1 (3)'))

    WebUI.switchToWindowIndex(2)

    WebUI.delay(3)

    WebUI.scrollToElement(findTestObject('Page_Buy Shipment Result/div_NWK'), 100)

    String branchCode = WebUI.getText(findTestObject('Page_Buy Shipment Result/div_NWK'))
	
	Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Created', i - 1, 4, branchCode)
	
	WebUI.closeWindowIndex(2)
	

    WebUI.closeWindowIndex(1)

    WebUI.switchToWindowIndex(0)

    WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/span_Transportation and Global Trade Management_fa fa-home tm-ugh-icon'))

    // WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Transportation and Global Trade Manage_3d15c4/div_Order Management'), FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Transportation and Global Trade Manage_3d15c4/span_Order Release'))

    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Order Release Finder/input_Order Release ID_order_releasexid'))
}

WebUI.closeBrowser()

