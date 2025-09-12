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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By

WebUI.callTestCase(findTestCase('OTM_Methods/Login_OTM'), [:], FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()

// Wait for an element to be visible (max 15 seconds)
WebUI.waitForElementVisible(findTestObject('Page_Transportation and Global Trade Manage_3d15c4/div_Shipment Management_1'), 
    60)

WebUI.click(findTestObject('Page_Transportation and Global Trade Manage_3d15c4/div_Shipment Management_1'))

WebUI.click(findTestObject('New Folder (1)/Page_Transportation and Global Trade Manage_3d15c4/span_Buy Shipment'))

def testData = TestDataFactory.findTestData('OTM Test Data/Demo Bulk IDs (1)')

int totalRows = testData.getRowNumbers()

for (int i = 2; i <= totalRows; i++) {
    //def bulkOrderID = testData.getValue(1, i)
    def cellValue = testData.getValue(1, i // Column 1 — adjust if needed
        )

    if ((cellValue == null) || cellValue.trim().isEmpty()) {
        println("Row $i is empty. Closing browser and exiting loop.")

        WebUI.closeBrowser()

        break
    }
    
    def statusValue = testData.getValue(7, i // Column 7 — Status column
        )

    if ((statusValue != null) && statusValue.trim().equalsIgnoreCase('Unassign Failed')) {
        String bulkOrderID = testData.getValue(1, i)

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
            Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 6, 'Not Found')

            Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 3, 'N/A')

            Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 4, 'N/A')

            Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 5, 'N/A')

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

            Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 2, statusText)

            Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 4, 'N/A')

            WebUI.delay(3)

            //WebElement scrollableElement =
            WebUI.scrollToElement(findTestObject('Page_Buy Shipment Result/a_COLLAZO_GIL_20060548'), 100)

            //JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()
            //js.executeScript("arguments[0].scrollLeft += 500;", scrollableElement)
            String driver1 = WebUI.getText(findTestObject('Page_Buy Shipment Result/a_COLLAZO_GIL_20060548'))

            if ((driver1 != null) && !(driver1.trim().isEmpty())) {
				
				WebUI.delay(3)
				
                WebUI.click(findTestObject('New Folder (1)/Page_Buy Shipment Result/input_Domain Name_Selected - Copy'))

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
                    Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 3, 
                        'Unassign Pass')
                } else {
                    Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 3, 
                        'Unassign Fail')
                }
                
                WebUI.takeFullPageScreenshot()

                WebUI.closeWindowIndex(1)

                WebUI.switchToWindowIndex(0)
            } else {
                Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 3, 'N/A')
            }
            
            //WebUI.click(findTestObject('Page_Buy Shipment Result/button_Refine Query'))
            WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/span_Transportation and Global Trade Management_fa fa-home tm-ugh-icon'))

            WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/div_Fleet Management'))

            WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/span_Dispatch Board'))

            WebUI.delay(60)

            //WebUI.waitForElementVisible(findTestObject('Page_Fleet management/Shipment_adder'),40)
            WebUI.click(findTestObject('Page_Fleet management/Shipment_adder'))

            WebUI.delay(10)

            WebUI.switchToFrame(findTestObject('Shipment_finder'), 1)

            WebUI.delay(10)

            WebUI.setText(findTestObject('Page_Fleet management/Bulk plan id'), bulkOrderID)

            WebUI.click(findTestObject('Page_Fleet management/Search_button'))

            WebUI.delay(5)

            WebUI.click(findTestObject('Page_Fleet management/checkbox1'))

            WebUI.switchToDefaultContent()

            WebUI.delay(4)

            WebUI.click(findTestObject('Page_Fleet management/Finish_button'))

            WebUI.click(findTestObject('Page_Fleet management/checkbox2'))

            WebUI.click(findTestObject('Page_Fleet management/Shipment order_release'))

            WebUI.delay(60)

            WebUI.click(findTestObject('Page_Fleet management/checkbox3'))

            WebUI.delay(10)

            WebElement table = driver.findElement(By.xpath('//*[@id="RootPane_2_1"]/wb-layout//*[@id="RootPane_2_1_region_3_moduleRegion"]/div[1]'))

            List<WebElement> rows = table.findElements(By.xpath('.//tbody/tr'))

            println('Total rows: ' + rows.size())

            List<String> fifthColumnValues = []

            for (int k = 0; k < rows.size(); k++) {
                WebElement row = rows.get(k)

                List<WebElement> cols = row.findElements(By.tagName('td'))

                if (cols.size() >= 5) {
                    String cellText = (cols[4]).getText().trim()

                    //println("Row $(k + 1), Column 5: $cellText")
                    fifthColumnValues.add(cellText)

                    Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Created', k, 0, cellText //  println("Row $(k + 1) has less than 5 columns")
                        )
                } else {
                }
            }
            
            String combinedText = fifthColumnValues.join(', ')

            println("Combined 5th column values: $combinedText")

            Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 1, combinedText)

            WebUI.delay(10)

            WebUI.click(findTestObject('Page_Fleet management/Actions1'))

            WebUI.click(findTestObject('Page_Fleet management/Order_Management_Link'))

            WebUI.click(findTestObject('Page_Fleet management/Unassign order release'))

            WebUI.click(findTestObject('Page_Fleet management/Unassign_Order_Buy'))

            WebUI.delay(3)

            WebUI.switchToWindowIndex(1)

            WebUI.delay(3)

            String unassign_order = WebUI.getText(findTestObject('Page_Order Unassigned and Order Movements Deleted/h1_Order Unassigned and Order Movements Deleted'))

            if (unassign_order.trim() == 'Order Unassigned and Order Movements Deleted') {
                Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 5, 'Unassign Pass')
            } else {
                Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 5, 'Unassign Fail')
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
                Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 7, 'Unassign Successful')
            } else {
                Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 7, 'Unassign Failed')
            }
            
            WebUI.click(findTestObject('New Folder (1)/Page_Buy Shipment Result/button_Refine Query'))

            continue
        }
        
        WebUI.delay(3)

        Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 2, statusText)

        // === If not withdrawn, continue normal process ===
        // Your test continues here...
        WebUI.delay(5)

        //WebElement scrollableElement =
        WebUI.scrollToElement(findTestObject('Page_Buy Shipment Result/a_COLLAZO_GIL_20060548'), 130)

        WebUI.delay(5)

        //JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()
        //js.executeScript("arguments[0].scrollLeft += 500;", scrollableElement)
        String driver1 = WebUI.getText(findTestObject('Page_Buy Shipment Result/a_COLLAZO_GIL_20060548'))

        if ((driver1 != null) && !(driver1.trim().isEmpty())) {
			
			WebUI.delay(3)
			
            WebUI.click(findTestObject('New Folder (1)/Page_Buy Shipment Result/input_Domain Name_Selected - Copy'))

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
                Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 3, 'Unassign Pass')
            } else {
                Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 3, 'Unassign Fail')
            }
            
            WebUI.takeFullPageScreenshot()

            WebUI.closeWindowIndex(1)

            WebUI.switchToWindowIndex(0)
        } else {
            String message = 'N/A'

            Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 3, message)
        }
		
		WebUI.delay(3)
        
        WebUI.click(findTestObject('New Folder (1)/Page_Buy Shipment Result/input_Domain Name_Selected - Copy'))

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
            Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 4, 'Unassign Pass')
        } else {
            Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 4, 'Unassign Fail')
        }
        
        WebUI.closeWindowIndex(1)

        WebUI.delay(3)

        WebUI.switchToWindowIndex(0)

        WebUI.click(findTestObject('New Folder (1)/Page_Buy Shipment Result/button_Refine Query'))

        WebUI.delay(3)

        WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/span_Transportation and Global Trade Management_fa fa-home tm-ugh-icon'))

        WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/div_Fleet Management'))

        WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/span_Dispatch Board'))

        WebUI.delay(60)

        //WebUI.waitForElementVisible(findTestObject('Page_Fleet management/Shipment_adder'),40)
        WebUI.click(findTestObject('Page_Fleet management/Shipment_adder'))

        WebUI.delay(10)

        WebUI.switchToFrame(findTestObject('Shipment_finder'), 1)

        WebUI.delay(5)

        WebUI.setText(findTestObject('Page_Fleet management/Bulk plan id'), bulkOrderID)

        WebUI.click(findTestObject('Page_Fleet management/Search_button'))

        WebUI.delay(5)

        WebUI.click(findTestObject('Page_Fleet management/checkbox1'))

        WebUI.switchToDefaultContent()

        WebUI.delay(4)

        WebUI.click(findTestObject('Page_Fleet management/Finish_button'))

        WebUI.click(findTestObject('Page_Fleet management/checkbox2'))

        WebUI.click(findTestObject('Page_Fleet management/Shipment order_release'))

        WebUI.delay(60)

        WebUI.click(findTestObject('Page_Fleet management/checkbox3'))

        WebUI.delay(7)

        WebElement table = driver.findElement(By.xpath('//*[@id="RootPane_2_1"]/wb-layout//*[@id="RootPane_2_1_region_3_moduleRegion"]/div[1]'))

        List<WebElement> rows = table.findElements(By.xpath('.//tbody/tr'))

        println('Total rows: ' + rows.size())

        List<String> fifthColumnValues = []

        for (int k = 0; k < rows.size(); k++) {
            WebElement row = rows.get(k)

            List<WebElement> cols = row.findElements(By.tagName('td'))

            if (cols.size() >= 5) {
                String cellText = (cols[4]).getText().trim()

                //println("Row $(k + 1), Column 5: $cellText")
                fifthColumnValues.add(cellText //println("Row $(k + 1) has less than 5 columns")
                    )

                Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Created', k, 0, cellText)
            } else {
            }
        }
        
        String combinedText = fifthColumnValues.join(', ')

        println("Combined 5th column values: $combinedText")

        Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 1, combinedText)

        WebUI.delay(10)

        WebUI.click(findTestObject('Page_Fleet management/Actions1'))

        WebUI.click(findTestObject('Page_Fleet management/Order_Management_Link'))

        WebUI.click(findTestObject('Page_Fleet management/Unassign order release'))

        WebUI.click(findTestObject('Page_Fleet management/Unassign_Order_Buy'))

        WebUI.delay(3)

        WebUI.switchToWindowIndex(1)

        String unassign_order = WebUI.getText(findTestObject('Page_Order Unassigned and Order Movements Deleted/h1_Order Unassigned and Order Movements Deleted'))

        if (unassign_order.trim() == 'Order Unassigned and Order Movements Deleted') {
            Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 5, 'Unassign Pass')
        } else {
            Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 5, 'Unassign Fail')
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
            Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 7, 'Unassign Successful')
        } else {
            Write_Status.writeToCell('Data Files/OTM Test Data/Demo Bulk IDs.xlsx', 'Bulk IDs Reset', i - 1, 7, 'Unassign Failed')
        }
        
        WebUI.click(findTestObject('New Folder (1)/Page_Buy Shipment Result/button_Refine Query'))
    }
}

WebUI.closeBrowser()

