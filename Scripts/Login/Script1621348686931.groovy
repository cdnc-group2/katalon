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

WebUI.setText(findTestObject('Login_Mattermost_OR/input_All team communication in one place, _dcc84b'), Username)

WebUI.setText(findTestObject('Login_Mattermost_OR/input_All team communication in one place, _a3edc6'), Password)

WebUI.click(findTestObject('Login_Mattermost_OR/span_Sign in'))

if (Username == 'ngoctin040999' || Username == 'test123@gmail.com' || Username == 'admin' || Username == 'admin@outlook.com') {
    WebUI.verifyTextPresent(findTestObject('Object Repository/Login_Mattermost_OR/label_Enter a valid email or username andor password'), 
        false)
} else {
	WebUI.verifyTextPresent(findTestObject('Object Repository/Login_Mattermost_OR/h1_fsdfsdf'), false)
}

WebUI.closeBrowser()
