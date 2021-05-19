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
import internal.GlobalVariable
import io.netty.util.concurrent.FailedFuture

import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cdnc-group2.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/ForgetPassword_Mattermost_OR/span_I forgot my password'))

WebUI.setText(findTestObject('Object Repository/ForgetPassword_Mattermost_OR/input_To reset your password, enter the email address you used to sign up_email'), "ngoctin040999@gmail.com")

WebUI.click(findTestObject('Object Repository/ForgetPassword_Mattermost_OR/button_Reset my password'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ForgetPassword_Mattermost_OR/label_Failed to send password reset email successfully'), 1000)

WebUI.closeBrowser()