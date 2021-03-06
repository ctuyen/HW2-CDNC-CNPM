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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8065/')

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5'), 'sysadmin')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), '2SwE/drL9BoSDSAWnt1s8EiQe9rbSfQc')

WebUI.click(findTestObject('Page_Mattermost/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_ Town Square remane - eligendi Mattermost/textarea_Write to Town Square remane_post_textbox'), 
    'abc mess')

WebUI.sendKeys(findTestObject('Page_ Town Square remane - eligendi Mattermost/textarea_Write to Town Square remane_post_textbox'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_ Town Square remane - eligendi Mattermost/button_sysadmin_CENTER_button_h4hx9qqehjr9x_30cde2'))

WebUI.click(findTestObject('Page_ Town Square remane - eligendi Mattermost/span_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_ Town Square remane - eligendi Mattermost/textarea_abc mess edite'), 
    'abc mess edited')

WebUI.click(findTestObject('Page_ Town Square remane - eligendi Mattermost/span_Save'))

WebUI.closeBrowser()

