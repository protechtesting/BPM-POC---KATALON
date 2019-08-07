import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.50.120.22/nvkids/#/login')

WebUI.maximizeWindow()

WebUI.waitForAngularLoad(10)

WebUI.setText(findTestObject('Login Page/Input_Password'), 'Protech!23nv')

WebUI.setText(findTestObject('Login Page/Input_Username'), 'protechnv')

WebUI.click(findTestObject('Login Page/Button_Login'))

WebUI.waitForAngularLoad(10)

WebUI.doubleClick(findTestObject('BPM POC/GridRow'))

WebUI.sendKeys(findTestObject('BPM POC/Input_Description'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('BPM POC/Input_Description'), Keys.chord(Keys.DELETE))

WebUI.click(findTestObject('BPM POC/Button_Save'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('BPM POC/Status_message'), 'Failure. E0076 : Enter Required Fields')

WebUI.takeScreenshot()

WebUI.closeBrowser()

