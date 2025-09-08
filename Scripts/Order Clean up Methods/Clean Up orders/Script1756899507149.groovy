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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://otmgtm-dev1-summit1.otmgtm.us-ashburn-1.ocs.oraclecloud.com/GC3/glog.webserver.home.HomeServlet?ojr=maincontent')

WebUI.setText(findTestObject('Page_Cloud Sign In/input_User Name_idcs-signin-basic-signin-fo_93898c'), 'Gaurav.prasad@bluelinxco.com')

WebUI.setEncryptedText(findTestObject('Page_Cloud Sign In/input_Password_idcs-signin-basic-signin-for_2f0e89'), 'TCRrBFWPcdYfr+QHQbxu/A==')

WebUI.click(findTestObject('Page_Cloud Sign In/span_Sign In'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Transportation and Global Trade Manage_3d15c4/div_Shipment Management_1'))

WebUI.click(findTestObject('New Folder (1)/Page_Transportation and Global Trade Manage_3d15c4/span_Buy Shipment'))

def testData = TestDataFactory.findTestData('OTM Test Data/Demo Bulk IDs (1)')

int totalRows = testData.getRowNumbers()

for (int i = 2; i <= totalRows; i++) {
    def cellValue = testData.getValue(1, i // Column 1 — adjust if needed
        )

    if ((cellValue == null) || cellValue.trim().isEmpty()) {
        println("Row $i is empty. Closing browser and exiting loop.")

        WebUI.closeBrowser()

        break
    }
    
    String bulkOrderID = testData.getValue(1, i // note the row and colunn no.
        )

    println('Running for Bulk Order ID: ' + bulkOrderID)

    // Navigate to Bulk Plan page and enter the Bulk Order ID
    WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/input_Bulk Plan ID_shipmentbulk_planxid'), 
        bulkOrderID)

    WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/select_Begins WithEnds WithIs NullNot NullO_756104'), 
        'contains', true)

    WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/button_Search'))

    WebUI.delay(3 // wait for the results
        )

    String resultText1 = WebUI.getText(findTestObject('Object Repository/OTM pages/Page_Buy Shipment Result/span_0'))

    // Print the value (optional, for debugging)
    println("Text value: $resultText1")

    if (resultText1.trim() == '0') {
        Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 6, 'Not Found')

        WebUI.delay(3)

        WebUI.click(findTestObject('New Folder (1)/Page_Buy Shipment Result/button_Refine Query'))

        continue
    }
    
    // === Check if Bulk Plan is Withdrawn ===
    String statusText = WebUI.getText(findTestObject('New Folder (1)/Page_Buy Shipment Result/div_SECURE RESOURCES_ACCEPTED'))

    if (statusText.equalsIgnoreCase('SECURE RESOURCES_WITHDRAWN')) {
        println("Bulk Plan $bulkOrderID is already withdrawn. Skipping...")

        //WebUI.closeBrowser()
        WebUI.delay(3 // wait for the results
            )

        Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 2, statusText)
		
		Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 4, 'N/A')

        //WebUI.click(findTestObject('Page_Buy Shipment Result/button_Refine Query'))
        WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/span_Transportation and Global Trade Management_fa fa-home tm-ugh-icon'))

        WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/div_Fleet Management'))

        WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/span_Dispatch Board'))

        WebUI.delay(20)

        WebUI.click(findTestObject('Page_Fleet management/Shipment_adder'))

        WebUI.delay(3)

        WebUI.switchToFrame(findTestObject('Shipment_finder'), 1)

        WebUI.setText(findTestObject('Page_Fleet management/Bulk plan id'), bulkOrderID)

        WebUI.click(findTestObject('Page_Fleet management/Search_button'))

        WebUI.delay(3)

        WebUI.click(findTestObject('Page_Fleet management/checkbox1'))

        WebUI.switchToDefaultContent()

        WebUI.delay(4)

        WebUI.click(findTestObject('Page_Fleet management/Finish_button'))

        WebUI.click(findTestObject('Page_Fleet management/checkbox2'))

        WebUI.click(findTestObject('Page_Fleet management/Shipment order_release'))

        WebUI.delay(5)

        WebUI.click(findTestObject('Page_Fleet management/checkbox3'))

        WebUI.delay(3 // wait for the results
            )

        WebUI.click(findTestObject('Page_Fleet management/Actions1'))

        WebUI.click(findTestObject('Page_Fleet management/Order_Management_Link'))

        WebUI.click(findTestObject('Page_Fleet management/Unassign order release'))

        WebUI.click(findTestObject('Page_Fleet management/Unassign_Order_Buy'))

        WebUI.delay(3)
		
		String unassign_order = WebUI.getText(findTestObject('Page_Order Unassigned and Order Movements Deleted/h1_Order Unassigned and Order Movements Deleted'))
		
		if (unassign_order.trim() == 'Order Unassigned and Order Movements Deleted') {
			Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 5, 'Unassign Pass')
		} else {
			Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 5, 'Unassign Fail')
		}

        WebUI.takeFullPageScreenshot()

        WebUI.delay(3)

        //Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 2, 'Processed with Order Unassign')
        WebUI.closeWindowIndex(1)

        WebUI.switchToWindowIndex(0)

        WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/span_Transportation and Global Trade Management_fa fa-home tm-ugh-icon'))

        WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Transportation and Global Trade Manage_3d15c4/div_Shipment Management'))

        WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Transportation and Global Trade Manage_3d15c4/span_Buy Shipment'))

        WebUI.delay(3)

        WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/input_Bulk Plan ID_shipmentbulk_planxid'), 
            bulkOrderID)

        WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/select_Begins WithEnds WithIs NullNot NullO_756104'), 
            'contains', true)

        WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/button_Search'))

        WebUI.delay(3)

        String resultText = WebUI.getText(findTestObject('Object Repository/OTM pages/Page_Buy Shipment Result/span_0'))

        // Print the value (optional, for debugging)
        println("Text value: $resultText")

        // Check if the value is exactly "0"
        if (resultText.trim() == '0') {
            Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 6, 'Unassign Pass')
        } else {
            Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 6, 'Unassign Fail')
        }
        
        WebUI.click(findTestObject('New Folder (1)/Page_Buy Shipment Result/button_Refine Query'))

        continue
    }
    
    WebUI.delay(3)

    Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 2, statusText)

    // === If not withdrawn, continue normal process ===
    // Your test continues here...
    WebUI.delay(3)

    String driver = WebUI.getText(findTestObject('Page_Buy Shipment Result/a_COLLAZO_GIL_20060548'))

    if ((driver != null) && !(driver.trim().isEmpty())) {
        WebUI.click(findTestObject('New Folder (1)/Page_Buy Shipment Result/input_Domain Name_Selected'))

        WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/button_Actions'))

        WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/span_Fleet Management'))

        WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/span_Fleet Unassign'))

        WebUI.delay(3)

        WebUI.scrollToElement(findTestObject('New Folder (1)/Page_Buy Shipment Result/a_Driver'), 200)

        WebUI.click(findTestObject('New Folder (1)/Page_Buy Shipment Result/a_Driver'))

        WebUI.switchToWindowIndex(1)

        WebUI.delay(3)

        String unassigndriver = WebUI.getText(findTestObject('Page_Success/h1_Success'))

        if (unassigndriver.trim() == 'Success') {
            Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 3, 'Unassign Pass')
        } else {
            Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 3, 'Unassign Fail')
        }
        
        WebUI.takeFullPageScreenshot()

        WebUI.closeWindowIndex(1)

        WebUI.switchToWindowIndex(0)
    } else {
        String message = 'N/A'

        Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 3, message)
    }
    
 
    WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/button_Actions'))

    //WebUI.switchToWindowTitle('Buy Shipment Result')
    WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Result/a_Withdraw Tender'))

    WebUI.switchToWindowIndex(1)

    WebUI.delay(3 // wait for the results
        )

    WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Get Retender Flag/button_Ok' //WebUI.closeBrowser()
            ))

    WebUI.delay(3 // wait for the results
        )

    String Withdrawstatus = WebUI.getText(findTestObject('Page_Withdraw Tender/h1_Withdraw Tender'))

    if (Withdrawstatus.trim() == 'Withdraw Tender') {
        Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 4, 'Unassign Pass')
    } else {
        Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 4, 'Unassign Fail')
    }
    
    WebUI.closeWindowIndex(1)

    WebUI.delay(3)

    WebUI.switchToWindowIndex(0)

    WebUI.click(findTestObject('New Folder (1)/Page_Buy Shipment Result/button_Refine Query'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/span_Transportation and Global Trade Management_fa fa-home tm-ugh-icon'))

    WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/div_Fleet Management'))

    WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/span_Dispatch Board'))

    WebUI.delay(20)

    WebUI.click(findTestObject('Page_Fleet management/Shipment_adder'))

    WebUI.switchToFrame(findTestObject('Shipment_finder'), 1)

    WebUI.setText(findTestObject('Page_Fleet management/Bulk plan id'), bulkOrderID)

    WebUI.click(findTestObject('Page_Fleet management/Search_button'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_Fleet management/checkbox1'))

    WebUI.switchToDefaultContent()

    WebUI.delay(4)

    WebUI.click(findTestObject('Page_Fleet management/Finish_button'))

    WebUI.click(findTestObject('Page_Fleet management/checkbox2'))

    WebUI.click(findTestObject('Page_Fleet management/Shipment order_release'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Page_Fleet management/checkbox3'))

    WebUI.delay(3 // wait for the results
        )

    WebUI.click(findTestObject('Page_Fleet management/Actions1'))

    WebUI.click(findTestObject('Page_Fleet management/Order_Management_Link'))

    WebUI.click(findTestObject('Page_Fleet management/Unassign order release'))

    WebUI.click(findTestObject('Page_Fleet management/Unassign_Order_Buy'))

    WebUI.delay(3)

    String unassign_order = WebUI.getText(findTestObject('Page_Order Unassigned and Order Movements Deleted/h1_Order Unassigned and Order Movements Deleted'))
	
	if (unassign_order.trim() == 'Order Unassigned and Order Movements Deleted') {
		Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 5, 'Unassign Pass')
	} else {
		Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 5, 'Unassign Fail')
	}

    //Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 2, 'Processed')
    WebUI.takeFullPageScreenshot()

    WebUI.delay(5)

    WebUI.closeWindowIndex(1)

    WebUI.switchToWindowIndex(0)

    WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/span_Transportation and Global Trade Management_fa fa-home tm-ugh-icon'))

    WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Transportation and Global Trade Manage_3d15c4/div_Shipment Management'))

    WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Transportation and Global Trade Manage_3d15c4/span_Buy Shipment'))

    WebUI.delay(3)

    WebUI.setText(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/input_Bulk Plan ID_shipmentbulk_planxid'), 
        bulkOrderID)

    WebUI.selectOptionByValue(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/select_Begins WithEnds WithIs NullNot NullO_756104'), 
        'contains', true)

    WebUI.click(findTestObject('Object Repository/New Folder (1)/Page_Buy Shipment Finder/button_Search'))

    WebUI.delay(3)

    String resultText2 = WebUI.getText(findTestObject('Object Repository/OTM pages/Page_Buy Shipment Result/span_0'))

    // Print the value (optional, for debugging)
    println("Text value: $resultText2")

    // Check if the value is exactly "0"
    if (resultText2.trim() == '0') {
        Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 6, 'Unassign Pass')
    } else {
        Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Sheet1', i - 1, 6, 'Unassign Fail')
    }
    
    WebUI.click(findTestObject('New Folder (1)/Page_Buy Shipment Result/button_Refine Query'))
}

WebUI.closeBrowser()

