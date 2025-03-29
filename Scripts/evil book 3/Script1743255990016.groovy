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

WebUI.click(findTestObject('Object Repository/Page_EvilTester.com/a_Episode 022 - Practicing Testing with Jam_cd5380'))

WebUI.click(findTestObject('Object Repository/Page_Episode 022 - Practicing Testing with _5fa8da/h1_Episode 022 - Practicing Testing with Ja_2be640'))

WebUI.click(findTestObject('Object Repository/Page_Episode 022 - Practicing Testing with _5fa8da/p_What does practicing mean for Software Testing'))

WebUI.click(findTestObject('Object Repository/Page_Episode 022 - Practicing Testing with _5fa8da/a_Download and Listen to the show as a podcast'))

WebUI.switchToWindowTitle('Practicing Software Testing - Guest James Lyndsay - The Evil Tester Show - Podcast.co')

WebUI.click(findTestObject('Object Repository/Page_Practicing Software Testing - Guest Ja_cba171/h1_Practicing Software Testing - Guest Jame_78a20a'))

WebUI.click(findTestObject('Object Repository/Page_Practicing Software Testing - Guest Ja_cba171/p_Welcome to Episode 22 of The Evil Tester _b75f3d'))

WebUI.click(findTestObject('Object Repository/Page_Practicing Software Testing - Guest Ja_cba171/p_Discover how practice blends with rehears_fb27be'))

WebUI.click(findTestObject('Object Repository/Page_Practicing Software Testing - Guest Ja_cba171/p_Join us as we learn, laugh, and leap into_17ea6d'))

WebUI.closeBrowser()

