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

WebUI.click(findTestObject('Object Repository/Page_EvilTester.com/a_Blog'))

WebUI.click(findTestObject('Object Repository/Page_Software Testing and Development Blog _04ff46/h1_Blog Posts'))

WebUI.click(findTestObject('Object Repository/Page_Software Testing and Development Blog _04ff46/p_Subscribe to the full blog feed using RSS'))

WebUI.click(findTestObject('Object Repository/Page_Software Testing and Development Blog _04ff46/p_Welcome to Episode 22 of The Evil Tester _b75f3d'))

WebUI.click(findTestObject('Object Repository/Page_Software Testing and Development Blog _04ff46/p_This episode explores how to navigate con_401d85'))

WebUI.click(findTestObject('Object Repository/Page_Software Testing and Development Blog _04ff46/a_Read More'))

WebUI.click(findTestObject('Object Repository/Page_Episode 022 - Practicing Testing with _5fa8da/h1_Episode 022 - Practicing Testing with Ja_2be640'))

WebUI.click(findTestObject('Object Repository/Page_Episode 022 - Practicing Testing with _5fa8da/p_What does practicing mean for Software Testing'))

WebUI.click(findTestObject('Object Repository/Page_Episode 022 - Practicing Testing with _5fa8da/span_Subscribe to the show'))

WebUI.click(findTestObject('Object Repository/Page_Episode 022 - Practicing Testing with _5fa8da/h2_Show Notes'))

WebUI.click(findTestObject('Object Repository/Page_Episode 022 - Practicing Testing with _5fa8da/p_Welcome to Episode 22 of The Evil Tester _b75f3d'))

WebUI.click(findTestObject('Object Repository/Page_Episode 022 - Practicing Testing with _5fa8da/p_This was released to Patreon supporters e_35085d'))

WebUI.click(findTestObject('Object Repository/Page_Episode 022 - Practicing Testing with _5fa8da/p_Discover how practice blends with rehears_fb27be'))

WebUI.click(findTestObject('Object Repository/Page_Episode 022 - Practicing Testing with _5fa8da/p_Join us as we learn, laugh, and leap into_bfda59'))

WebUI.click(findTestObject('Object Repository/Page_Episode 022 - Practicing Testing with _5fa8da/h2_Special Guest James Lyndsay'))

WebUI.click(findTestObject('Object Repository/Page_Episode 022 - Practicing Testing with _5fa8da/p_Find James  workroom-productions.com'))

WebUI.click(findTestObject('Object Repository/Page_Episode 022 - Practicing Testing with _5fa8da/p_Follow James on LinkedIn to learn about u_61fe53'))

WebUI.closeBrowser()

