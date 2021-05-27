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

WebUI.callTestCase(findTestCase('PreCondition/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PinMsgInDMs/Page_Town Square - 123 Mattermost/span_test1'))

TestObject pMsg = findTestObject('Object Repository/PinMsgInDMs/Page_test1 - 123 Mattermost/div_ngoctin02806107 PM15ba58ab6023994f93ab3a4e701cf8b8.jpg')
TestObject iconMore = findTestObject('Object Repository/PinMsgInDMs/Page_test1 - 123 Mattermost/button_ngoctin02806_CENTER_button_4xttwiq7ktb45ctc1z5yoqj5ko')
TestObject btnPin = findTestObject('Object Repository/PinMsgInDMs/Page_test1 - 123 Mattermost/button_Pin to Channel')

if(pMsg != null && iconMore != null && btnPin != null) { // msg already deleted or already pin
	WebUI.mouseOver(pMsg)
	WebUI.click(iconMore)
	WebUI.click(btnPin)
}



