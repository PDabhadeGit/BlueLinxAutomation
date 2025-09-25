import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.WebElement.*


WebUI.callTestCase(findTestCase('OTM_Methods/Login_OTM'), [:], FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()

WebUI.click(findTestObject('Page_Transportation and Global Trade Management - Home/div_Fleet Management'))

WebUI.click(findTestObject('Page_Transportation and Global Trade Manage_3d15c4/span_Driver Manager'))

WebUI.setText(findTestObject('Object Repository/driver3/Page_DRIVER Finder/input_Default Home Location ID_driverhome_l_8fb156'),
	'ORG-TPA')

WebUI.click(findTestObject('Object Repository/driver objects/Page_DRIVER Finder/button_Involved Party Contact_search_button'))


TestObject dynamicObject = new TestObject()

dynamicObject.addProperty('xpath', ConditionType.EQUALS, '//a[contains(@onclick, "OpenTarget")]')

List<WebElement> elements = WebUI.findWebElements(dynamicObject, 70)


List<String> productNames = []

for (WebElement element : elements) {
	productNames.add(element.getAt('onclick'))
}

println(productNames)

WebUI.closeBrowser()
