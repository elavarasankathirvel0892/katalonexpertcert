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

WebUI.click(findTestObject('Object Repository/Page_EvilTester.com/a_Tools'))

WebUI.click(findTestObject('Object Repository/Page_Tools - EvilTester.com/h1_Tools'))

WebUI.click(findTestObject('Object Repository/Page_Tools - EvilTester.com/p_Some testing tools and applications to su_65e1ed'))

WebUI.click(findTestObject('Object Repository/Page_Tools - EvilTester.com/p_Most of my tools are available on GitHub,_2febe0'))

WebUI.click(findTestObject('Object Repository/Page_Tools - EvilTester.com/em_I have some older tools, not maintained,_ec4baa'))

WebUI.click(findTestObject('Object Repository/Page_Tools - EvilTester.com/em_I have some older tools, not maintained,_ec4baa'))

WebUI.click(findTestObject('Object Repository/Page_Tools - EvilTester.com/em_Commercial tools that I wrote which are _38c400'))

WebUI.click(findTestObject('Object Repository/Page_Tools - EvilTester.com/p_Just for fun, you might want to try The E_aa9eed'))

WebUI.click(findTestObject('Object Repository/Page_Tools - EvilTester.com/h2_Notable items that I maintain are listed below'))

WebUI.click(findTestObject('Object Repository/Page_Tools - EvilTester.com/h2_API Challenges - an API testing practice app'))

WebUI.click(findTestObject('Object Repository/Page_API Challenges - an API testing practi_5ee1d8/p_The API Challenges is an application whic_0d9524'))

WebUI.click(findTestObject('Object Repository/Page_API Challenges - an API testing practi_5ee1d8/p_The API Challenges is a simple CRUD (Crea_6aa554'))

WebUI.click(findTestObject('Object Repository/Page_API Challenges - an API testing practi_5ee1d8/p_It also has a set of challenges that are _75e8c0'))

WebUI.click(findTestObject('Object Repository/Page_API Challenges - an API testing practi_5ee1d8/p_Everything runs in memory, or stores chal_40e6f2'))

WebUI.click(findTestObject('Object Repository/Page_API Challenges - an API testing practi_5ee1d8/a_Use The Heroku Hosted Version'))

WebUI.switchToWindowTitle('The API Challenges - API Tutorials and API Testing Practice Exercises')

WebUI.click(findTestObject('Object Repository/Page_The API Challenges - API Tutorials and_8ca13f/h1_The API Challenges'))

WebUI.click(findTestObject('Object Repository/Page_The API Challenges - API Tutorials and_8ca13f/h2_A learning environment to experiment, ex_f79695'))

WebUI.click(findTestObject('Object Repository/Page_The API Challenges - API Tutorials and_8ca13f/p_Welcome to The API Challenges, a site ded_ea2d91'))

WebUI.click(findTestObject('Object Repository/Page_The API Challenges - API Tutorials and_8ca13f/li_A simple functioning API for you to prac_8f4aca'))

WebUI.closeBrowser()

