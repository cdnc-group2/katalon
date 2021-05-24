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

WebUI.setText(findTestObject('Login page/input_Email'), 'ngoctin040999@gmail.com')

WebUI.setText(findTestObject('Login page/input_Password'), 'ngoctin1')

WebUI.click(findTestObject('Login page/button_Sign in'))

WebUI.delay(2)

WebUI.click(findTestObject('UpdatePassword/button_Option'))

WebUI.click(findTestObject('UpdatePassword/button_Account Settings'))

WebUI.click(findTestObject('UpdatePassword/button_Security'))

WebUI.click(findTestObject('UpdatePassword/button_Edit'))

WebUI.setText(findTestObject('UpdatePassword/input_Current Password_currentPassword'), 'ngoctin1')

WebUI.setText(findTestObject('UpdatePassword/input_New Password_newPassword'), 'ngoctin2')

WebUI.setText(findTestObject('UpdatePassword/input_Retype New Password_confirmPassword'), 'ngoctin2')

WebUI.click(findTestObject('UpdatePassword/button_Save'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('UpdatePassword/h4_Password'), 'Password')

WebUI.closeBrowser()

