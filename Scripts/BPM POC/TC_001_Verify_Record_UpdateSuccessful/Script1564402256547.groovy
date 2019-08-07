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
import randomText.Stringgen as Stringgen
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

not_run: Runtime.runtime.exec('C:/DC/KILL BROWSER.bat')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.50.120.22/nvkids/#/login')

//WebUI.maximizeWindow()

//WebUI.waitForAngularLoad(10)

WebUI.setText(findTestObject('Login Page/Input_Username'), 'protechnv')

WebUI.setText(findTestObject('Login Page/Input_Password'), 'Protech!23nv')

WebUI.click(findTestObject('Login Page/Button_Login'))

WebUI.waitForAngularLoad(10)

WebUI.doubleClick(findTestObject('BPM POC/GridRow'))

WebUI.delay(5)

def ra = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(10)

WebUI.setText(findTestObject('BPM POC/Input_Description'), 'Test - message' + ra)

WebUI.click(findTestObject('BPM POC/Button_Save'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('BPM POC/Status_message'), 'Success. Record Saved Successfully')

WebUI.takeScreenshot()

WebUI.closeBrowser()

