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

WebUI.navigateToUrl('https://cdnc-group2.herokuapp.com/login')

WebUI.setText(findTestObject('UpdateChannel/input_All team communication in one place, _dcc84b'), 'ngoctin040999@gmail.com')

WebUI.setEncryptedText(findTestObject('UpdateChannel/input_All team communication in one place, _a3edc6'), 'S8w1SJvl7D1hts9IdMV+NQ==')

WebUI.sendKeys(findTestObject('UpdateChannel/input_All team communication in one place, _a3edc6'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('UpdateChannel/span_Test 77777'))

WebUI.click(findTestObject('UpdateChannel/span_Test 77777_channelHeaderDropdownIcon'))

WebUI.click(findTestObject('UpdateChannel/span_Edit Channel Purpose (1)'))

WebUI.setText(findTestObject('UpdateChannel/textarea_Test 77777_form-control no-resize'), 'dasdasdasasd')

WebUI.click(findTestObject('UpdateChannel/span_Save'))

WebUI.closeBrowser()

