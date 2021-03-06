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

WebUI.navigateToUrl('https://cdnc-group2.herokuapp.com')

WebUI.setText(findTestObject('Object Repository/Login_Mattermost_OR/input_All team communication in one place, _dcc84b'), 'ngoctin040999@gmail.com')

WebUI.setText(findTestObject('Object Repository/Login_Mattermost_OR/input_All team communication in one place, _a3edc6'), 'ngoctin1')

WebUI.click(findTestObject('Object Repository/Login_Mattermost_OR/span_Sign in'))

WebUI.click(findTestObject('CreateRoom_Mattermose_OR/span_'));

WebUI.verifyElementPresent(findTestObject('CreateRoom_Mattermose_OR/span_New Channel'), 0)

switch (Type) {
	case 'Public':
		WebUI.click(findTestObject('CreateRoom_Mattermose_OR/input_Type_channelType'))
		break;
	case 'Private':
		WebUI.click(findTestObject('CreateRoom_Mattermose_OR/input_- Anyone can join this channel_channelType'))
		break;
}

WebUI.setText(findTestObject('CreateRoom_Mattermose_OR/input_Name_newChannelName'), ChannelName)

WebUI.setText(findTestObject('CreateRoom_Mattermose_OR/textarea_(optional)_newChannelPurpose'), Purpose)

WebUI.setText(findTestObject('CreateRoom_Mattermose_OR/textarea_(optional)_newChannelHeader'), Description)

WebUI.click(findTestObject('CreateRoom_Mattermose_OR/button_Create Channel'))

if (WebUI.verifyElementPresent(findTestObject('CreateRoom_Mattermose_OR/p_A channel with that name already exists on the same team'), 0, FailureHandling.OPTIONAL)) {
	WebUI.closeBrowser()
} else {
	switch (Type) {
		case 'Public':
			WebUI.verifyElementPresent(findTestObject('CreateRoom_Mattermose_OR/a_test room'), 0, FailureHandling.OPTIONAL)
			break;
		case 'Private':
			WebUI.verifyElementPresent(findTestObject('CreateRoom_Mattermose_OR/a_test room 1'), 0, FailureHandling.OPTIONAL)
			break;
	}
	WebUI.closeBrowser()
}


