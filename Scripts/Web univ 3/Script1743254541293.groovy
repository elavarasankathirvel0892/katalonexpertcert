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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://webdriveruniversity.com/index.html')

WebUI.click(findTestObject('Object Repository/Page_WebDriverUniversity.com/h1_BUTTON CLICKS'))

WebUI.switchToWindowTitle('WebDriver | Button Clicks')

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/h1_Lets Get Clicking'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/h2_WebElement Click'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/h2_JavaScript Click'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/h2_Action Move  Click'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/li_Create a WebElement based on the button below'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/li_Use an XPATH locator to create your WebElement'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/li_Use the following method WebElement.click()'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/p_CLICK ME'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/li_Create a WebElement based on the button below_1'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/li_Use a CSS locator to create your WebElement'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/li_Use the following method JavaScript click'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/span_CLICK ME'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/button_Close_1'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/li_Create a WebElement based on the button below_1_2'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/li_Use a locator of your choice to create y_c2d226'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/li_Use the following method Action Move  Click'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/span_CLICK ME_1'))

WebUI.click(findTestObject('Object Repository/Page_WebDriver  Button Clicks/button_Close_1_2'))

WebUI.closeBrowser()

