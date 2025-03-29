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

WebUI.click(findTestObject('Object Repository/Page_EvilTester.com/a_Talks'))

WebUI.click(findTestObject('Object Repository/Page_Conference Presentations by Alan Richa_9f35ce/h1_Conference Talks'))

WebUI.click(findTestObject('Object Repository/Page_Conference Presentations by Alan Richa_9f35ce/h2_A List of Conference Talks, Keynotes and_fe9036'))

WebUI.click(findTestObject('Object Repository/Page_Conference Presentations by Alan Richa_9f35ce/p_I have presented at conferences world wid_6b613f'))

WebUI.click(findTestObject('Object Repository/Page_Conference Presentations by Alan Richa_9f35ce/p_Many of the talks are also available in m_6c43a7'))

WebUI.click(findTestObject('Object Repository/Page_Conference Presentations by Alan Richa_9f35ce/p_Most of my speaking engagements are invit_cd151a'))

WebUI.click(findTestObject('Object Repository/Page_Conference Presentations by Alan Richa_9f35ce/a_Learn More and Start Watching Testing Talks'))

WebUI.switchToWindowTitle('Page non trouvée – uNow')

WebUI.click(findTestObject('Object Repository/Page_Page non trouve  uNow/h1_La page est introuvable'))

WebUI.click(findTestObject('Object Repository/Page_Page non trouve  uNow/p_La page que vous recherchez nexiste pas, _b8a5e9'))

WebUI.click(findTestObject('Object Repository/Page_Page non trouve  uNow/button_Rechercher'))

WebUI.closeBrowser()

