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

WebUI.callTestCase(findTestCase('OTM_Methods/Login_OTM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Bulk Creation/Page_Transportation and Global Trade Manage_3d15c4/div_Order Management'), 
    30)

WebUI.waitForElementVisible(findTestObject('Object Repository/Bulk Creation/Page_Transportation and Global Trade Manage_3d15c4/div_Order Management'), 
    30)

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

    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Order Release Result/input_Domain Name_Selected'))

    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Order Release Result/a_Actions_finderActionButtonImg'))

    WebUI.scrollToElement(findTestObject('Object Repository/Bulk Creation/Page_Order Release Result/a_Bulk Plan - Buy'), 
        50)

    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Order Release Result/a_Bulk Plan - Buy'))

    WebUI.switchToWindowIndex(1)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Bulk Creation/Page_Shipment Planning/select_AKR_V2AK_BUFATL_V2BEL_V1BEL_V2BEL_V3_395165'), 
        'BXC.NWK_V2', true)

    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Shipment Planning/button_Ok'))

    String BulkID = WebUI.getText(findTestObject('Page_Bulk Plan/div_20250910-0002'))

    Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Created', i - 1, 1, BulkID)

    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Bulk Plan/button_Refresh'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Bulk Plan/button_Refresh'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Bulk Plan/button_Refresh'))

    WebUI.delay(10)

    //WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Bulk Plan/div_COMPLETED'))
    WebUI.takeFullPageScreenshot()

    WebUI.closeWindowIndex(1)

    WebUI.switchToWindowIndex(0)

    WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/span_Transportation and Global Trade Management_fa fa-home tm-ugh-icon'))

    // WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Transportation and Global Trade Manage_3d15c4/div_Order Management'), FailureHandling.OPTIONAL)
    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Transportation and Global Trade Manage_3d15c4/span_Order Release'))

    WebUI.click(findTestObject('Object Repository/Bulk Creation/Page_Order Release Finder/input_Order Release ID_order_releasexid'))
}

WebUI.closeBrowser()

