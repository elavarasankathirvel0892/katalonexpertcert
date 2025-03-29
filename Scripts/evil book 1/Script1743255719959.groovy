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

WebUI.click(findTestObject('Object Repository/Page_EvilTester.com/h2_Recent Blog Posts'))

WebUI.click(findTestObject('Object Repository/Page_EvilTester.com/h2_Patreon Membership - Exclusive Online Tr_e4669b'))

WebUI.click(findTestObject('Object Repository/Page_EvilTester.com/p_I use Patreon as a community membership s_6b0a6c'))

WebUI.click(findTestObject('Object Repository/Page_EvilTester.com/li_Exclusive online training courses (10)'))

WebUI.click(findTestObject('Object Repository/Page_EvilTester.com/li_Exclusive e-books'))

WebUI.click(findTestObject('Object Repository/Page_EvilTester.com/li_Exclusive tutorial videos'))

WebUI.click(findTestObject('Object Repository/Page_EvilTester.com/li_Access to our YouTube content ad-free'))

WebUI.click(findTestObject('Object Repository/Page_EvilTester.com/li_And more'))

WebUI.click(findTestObject('Object Repository/Page_EvilTester.com/a_Learn about our Exclusive Patreon Content'))

WebUI.click(findTestObject('Object Repository/Page_Evil Tester Mentors on Patreon - EvilT_3754ae/p_Join our Patreon community for exclusive content'))

WebUI.click(findTestObject('Object Repository/Page_Evil Tester Mentors on Patreon - EvilT_3754ae/h2_Alan Richardson is creating Better Softw_774077'))

WebUI.click(findTestObject('Object Repository/Page_Evil Tester Mentors on Patreon - EvilT_3754ae/h3_Gain Access to Exclusive videos, article_e460d5'))

WebUI.click(findTestObject('Object Repository/Page_Evil Tester Mentors on Patreon - EvilT_3754ae/em_31 May 2022 Update'))

WebUI.click(findTestObject('Object Repository/Page_Evil Tester Mentors on Patreon - EvilT_3754ae/p_It wasnt content that was designed to kee_ed2d99'))

WebUI.click(findTestObject('Object Repository/Page_Evil Tester Mentors on Patreon - EvilT_3754ae/p_The mentoring content on Patreon is desig_b36993'))

WebUI.click(findTestObject('Object Repository/Page_Evil Tester Mentors on Patreon - EvilT_3754ae/p_Im hoping that Patreon will attract peopl_3f1522'))

WebUI.click(findTestObject('Object Repository/Page_Evil Tester Mentors on Patreon - EvilT_3754ae/p_So mentoring because'))

WebUI.click(findTestObject('Object Repository/Page_Evil Tester Mentors on Patreon - EvilT_3754ae/li_I will share my experience of learning a_c1659c'))

WebUI.click(findTestObject('Object Repository/Page_Evil Tester Mentors on Patreon - EvilT_3754ae/li_I will share my experience of programmin_2b9049'))

WebUI.click(findTestObject('Object Repository/Page_Evil Tester Mentors on Patreon - EvilT_3754ae/li_You can share your experiences and learn_4e05cf'))

WebUI.closeBrowser()

