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

WebUI.navigateToUrl('https://cdnc-group2.herokuapp.com/')

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b'), 'ngoctin040999@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'S8w1SJvl7D1hts9IdMV+NQ==')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Sign in'))

if (findTestObject('Object Repository/Page_Town Square - TOKEN_UPDATED Mattermost/span_') == null) {
	WebUI.closeBrowser()
}

WebUI.click(findTestObject('Object Repository/Page_Town Square - TOKEN_UPDATED Mattermost/span_'))

if (findTestObject('Object Repository/Page_Town Square - TOKEN_UPDATED Mattermost/div_Search and add members') == null) {
	WebUI.closeBrowser()
}

WebUI.click(findTestObject('Object Repository/Page_Town Square - TOKEN_UPDATED Mattermost/div_Search and add members'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - TOKEN_UPDATED Mattermost/input_Search and add members_react-select-2-input'), 
    'ngoctin02806')

WebUI.click(findTestObject('Object Repository/Page_Town Square - TOKEN_UPDATED Mattermost/div_ngoctin02806 (you)'))

WebUI.setText(findTestObject('Object Repository/Page_ngoctin02806 - TOKEN_UPDATED Mattermost/textarea_Write to ngoctin02806_post_textbox'), 
    'a')

WebUI.setText(findTestObject('Object Repository/Page_ngoctin02806 - TOKEN_UPDATED Mattermost/textarea_a'), 'al')

WebUI.setText(findTestObject('Object Repository/Page_ngoctin02806 - TOKEN_UPDATED Mattermost/textarea_al'), 'alo')

WebUI.setText(findTestObject('Object Repository/Page_ngoctin02806 - TOKEN_UPDATED Mattermost/textarea_alo'), 'alo ')

WebUI.setText(findTestObject('Object Repository/Page_ngoctin02806 - TOKEN_UPDATED Mattermost/textarea_alo_1'), 'alo a')

WebUI.setText(findTestObject('Object Repository/Page_ngoctin02806 - TOKEN_UPDATED Mattermost/textarea_alo a'), 'alo al')

WebUI.setText(findTestObject('Object Repository/Page_ngoctin02806 - TOKEN_UPDATED Mattermost/textarea_alo al'), 'alo alo')

WebUI.setText(findTestObject('Object Repository/Page_ngoctin02806 - TOKEN_UPDATED Mattermost/textarea_alo alo'), 'alo alo ')

WebUI.setText(findTestObject('Object Repository/Page_ngoctin02806 - TOKEN_UPDATED Mattermost/textarea_alo alo_1'), 'alo alo a')

WebUI.setText(findTestObject('Object Repository/Page_ngoctin02806 - TOKEN_UPDATED Mattermost/textarea_alo alo a'), 'alo alo al')

WebUI.setText(findTestObject('Object Repository/Page_ngoctin02806 - TOKEN_UPDATED Mattermost/textarea_alo alo al'), 'alo alo alo')

WebUI.closeBrowser()

