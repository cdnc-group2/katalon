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

WebUI.openBrowser('https://cdnc-group2.herokuapp.com/')

WebUI.setText(findTestObject('Login/input_Email'), 'ngoctin040999@gmail.com')

WebUI.setText(findTestObject('Login/input_Password'), 'ngoctin1')

WebUI.click(findTestObject('Login/button_Sign in'))

WebUI.delay(2)

WebUI.click(findTestObject('UpdatePassword/button_Option'))

WebUI.click(findTestObject('Invite member/button_Invite PeopleAdd or invite people to the team'))

WebUI.delay(1)

WebUI.setText(findTestObject('Invite member/input_Add or Invite People_react-select-2-input'), 'test1')

WebUI.delay(1)

WebUI.click(findTestObject('Invite member/div_test1'))

WebUI.click(findTestObject('Invite member/button_Invite Members'))

WebUI.verifyElementVisible(findTestObject('Invite member/div_This member has been added to the team'))

WebUI.click(findTestObject('Invite member/button_Done'))

WebUI.delay(2)

WebUI.closeBrowser()

