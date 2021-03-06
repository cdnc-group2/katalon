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

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b (1)'), 
    'ngoctin0409999@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6 (1)'), 
    'S8w1SJvl7D1hts9IdMV+NQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6 (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b (1)'), 
    'ngoctin040999@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/div_MattermostAll team communication in one_93cd78'))

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Sign in (1)'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - TOKEN_UPDATED Mattermost/span_Town Square_channelHeaderDropdownIcon'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - TOKEN_UPDATED Mattermost/button_View Info'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - TOKEN_UPDATED Mattermost/span_Post messages here that you want every_f1827f'))

WebUI.closeBrowser()

