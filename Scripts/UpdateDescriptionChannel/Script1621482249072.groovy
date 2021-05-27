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

WebUI.click(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/span_Edit Channel Header'))

WebUI.click(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/div_CloseEdit Header for Test 123Edit the t_4a8350'))

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Test Description'), 'T')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_T'), 'Te')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Te'), 'Tes')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Tes'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Test'), 'Test ')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Test_1'), 'Test D')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Test D'), 'Test De')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Test De'), 'Test Des')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Test Des'), 'Test Desc')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Test Desc'), 'Test Descu')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Test Descu'), 'Test Descur')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Test Descur'), 'Test Descu')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Test Descu'), 'Test Desc')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Test Desc'), 'Test Descr')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Test Descr'), 'Test Descri')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Test Descri'), 'Test Descrip')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Test Descrip'), 'Test Descript')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Test Descript'), 'Test Descripti')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Test Descripti'), 'Test Descriptio')

WebUI.setText(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/textarea_Test Descriptio'), 'Test Description')

WebUI.click(findTestObject('Object Repository/Page_Test 123 - Team Mattermost/button_Save'))

WebUI.closeBrowser()

