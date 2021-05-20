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

WebUI.navigateToUrl('http://localhost:8065/')

WebUI.setText(findTestObject('Object Repository/Chat_Mattermose_OR/Page_Mattermost/input_All team communication in one place, _dcc84b'), 
    'ngoctin040999@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Chat_Mattermose_OR/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'S8w1SJvl7D1hts9IdMV+NQ==')

WebUI.sendKeys(findTestObject('Object Repository/Chat_Mattermose_OR/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Chat_Mattermose_OR/Page_Town Square - TOKEN Mattermost/span_Test 77777'))

ArrayList<String> data = CustomKeywords.'chatMessagePackage.ChatMessageDataTest.findChatTestMessage'('D:\\graduating-project\\advanced-subject-in-technology-software\\katalon\\DataTest\\ChatMessageDataTest.csv');

for (def rowNum = 0; rowNum < data.size(); rowNum++) {
    WebUI.setText(findTestObject('Object Repository/Chat_Mattermose_OR/Page_Test 77777 - TOKEN Mattermost/textarea_1'), 
        data.get(rowNum))

    WebUI.sendKeys(findTestObject('Object Repository/Chat_Mattermose_OR/Page_Test 77777 - TOKEN Mattermost/textarea_1'), 
        Keys.chord(Keys.ENTER))
}

WebUI.closeBrowser()

