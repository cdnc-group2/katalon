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

WebUI.sendKeys(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Town Square - Team Mattermost/span_Test 123'))

WebUI.click(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/span_Test 123_channelHeaderDropdownIcon'))

WebUI.click(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/span_Edit Channel Purpose'))

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_dasdasdasasd'), '')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Test 123_form-control no-resize'), 
    'd')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_d'), 'da')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_da'), 'das')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_das'), 'dasd')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_dasd'), 'dasda')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_dasda'), 'dasdas')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_dasdas'), 'dasdasd')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_dasdasd'), 'dasdasda')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_dasdasda'), 'dasdasdas')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_dasdasdas'), 'dasdasdasd')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_dasdasdasd'), 'dasdasdasda')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_dasdasdasda'), 'dasdasdasdas')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_dasdasdasdas'), 'dasdasdasdasd')

WebUI.click(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/button_Save'))

WebUI.closeBrowser()

