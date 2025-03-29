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

WebUI.click(findTestObject('Object Repository/Page_WebDriverUniversity.com/h1_ACCORDION  TEXT AFFECTS (APPEAR  DISAPPEAR)'))

WebUI.switchToWindowTitle('Accordion Items')

WebUI.click(findTestObject('Object Repository/Page_Accordion Items/h1_Click on One of the Accordian Items Below'))

WebUI.click(findTestObject('Object Repository/Page_Accordion Items/button_Manual Testing'))

WebUI.click(findTestObject('Object Repository/Page_Accordion Items/p_Manual testing has for some time been the_4677dc'))

WebUI.click(findTestObject('Object Repository/Page_Accordion Items/button_Cucumber BDD'))

WebUI.click(findTestObject('Object Repository/Page_Accordion Items/p_Cucumber (BDD) simplifies the requirement_136ce2'))

WebUI.click(findTestObject('Object Repository/Page_Accordion Items/button_Automation Testing'))

WebUI.click(findTestObject('Object Repository/Page_Accordion Items/p_Automation testing has been steadily grow_ff84bb'))

WebUI.click(findTestObject('Object Repository/Page_Accordion Items/button_Keep Clicking - Text will Appear Aft_6174d3'))

WebUI.click(findTestObject('Object Repository/Page_Accordion Items/button_Keep Clicking - Text will Appear Aft_6174d3'))

WebUI.click(findTestObject('Object Repository/Page_Accordion Items/p_LOADING COMPLETE'))

WebUI.closeBrowser()

