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

WebUI.navigateToUrl('https://www.eviltester.com/')

WebUI.click(findTestObject('Object Repository/Page_EvilTester.com/a_Podcast'))

WebUI.click(findTestObject('Object Repository/Page_The Evil Tester Show Podcast Episode L_4aec2f/h1_The Evil Tester Show'))

WebUI.click(findTestObject('Object Repository/Page_The Evil Tester Show Podcast Episode L_4aec2f/em_TLDR The world needs another Software Te_6d2301'))

WebUI.click(findTestObject('Object Repository/Page_The Evil Tester Show Podcast Episode L_4aec2f/h2_Welcome to The Evil Tester Show. A Podca_278535'))

WebUI.click(findTestObject('Object Repository/Page_The Evil Tester Show Podcast Episode L_4aec2f/a_On YouTube'))

WebUI.switchToWindowTitle('The Evil Tester Show - YouTube')

WebUI.click(findTestObject('Object Repository/Page_The Evil Tester Show - YouTube/yt-formatted-string_Home'))

WebUI.click(findTestObject('Object Repository/Page_YouTube/yt-formatted-string_Shorts'))

WebUI.click(findTestObject('Object Repository/Page_YouTube/yt-formatted-string_You'))

WebUI.click(findTestObject('Object Repository/Page_Library - YouTube/yt-formatted-string_History'))

WebUI.click(findTestObject('Object Repository/Page_YouTube/yt-formatted-string_Trending'))

WebUI.click(findTestObject('Object Repository/Page_YouTube/yt-formatted-string_Shopping'))

WebUI.click(findTestObject('Object Repository/Page_YouTube/yt-formatted-string_Shopping'))

WebUI.closeBrowser()

