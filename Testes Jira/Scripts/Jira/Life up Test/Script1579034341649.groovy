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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://id.atlassian.com/login')

WebUI.setText(findTestObject('Object Repository/Jira Login/Page_Log in to continue - Log in with Atlas_6762ee/input_Log in to your account_username'), 
    GlobalVariable.username)

WebUI.click(findTestObject('Object Repository/Jira Login/Page_Log in to continue - Log in with Atlas_6762ee/span_Continue'))

WebUI.delay(1)

WebUI.setText(findTestObject('Jira Login/Page_Log in to continue - Log in with Atlas_6762ee/input_victorkoepkeoklgroupnet_password'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Jira Login/Page_Log in to continue - Log in with Atlas_6762ee/span_Log in'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Jira Login/Page_Atlassian  Start page/div_Your products_sc-ifAKCX fswNNq'), 0)

WebUI.click(findTestObject('Object Repository/Jira Login/Page_Atlassian  Start page/div_Your products_sc-ifAKCX fswNNq'))

WebUI.verifyElementPresent(findTestObject('Jira Login/Page_Projects - Jira/div_Recents'), 0)

WebUI.click(findTestObject('Jira Login/Page_Projects - Jira/div_Projects'))

WebUI.verifyElementPresent(findTestObject('Jira Login/Page_Projects - Jira/div_Life Up'), 0)

