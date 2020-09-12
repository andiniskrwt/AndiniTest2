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

WebUI.openBrowser(GlobalVariable.login)

WebUI.maximizeWindow()

WebUI.verifyTextPresent('Silakan masuk dengan email dan password akun Flip atau Big Flip yang biasa digunakan', false)

WebUI.click(findTestObject('Login/btmLogin'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.verifyTextPresent('Email atau Password salah.', false)

WebUI.setText(findTestObject('Login/inpEmail'), '  ')

WebUI.click(findTestObject('Login/btmLogin'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyTextPresent('Email atau Password salah.', false)

WebUI.clearText(findTestObject('Login/inpEmail'))

WebUI.setText(findTestObject('Login/inpEmail'), '  ')

WebUI.click(findTestObject('Login/btmLogin'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyTextPresent('Email atau Password salah.', false)

WebUI.clearText(findTestObject('Login/inpEmail'))

WebUI.setText(findTestObject('Login/inpEmail'), 'qwert1234\'[')

WebUI.setText(findTestObject('Login/inpPassword'), '1')

WebUI.click(findTestObject('Login/btmLogin'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyTextPresent('Email atau Password salah.', false)

WebUI.sendKeys(findTestObject('Login/inpEmail'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Login/inpEmail'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Login/inpEmail'), 'andinisekarwati9909@gmail.com')

WebUI.click(findTestObject('Login/btmLogin'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.verifyTextPresent('Email atau Password salah.', false)

WebUI.sendKeys(findTestObject('Login/inpPassword'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Login/inpPassword'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Login/inpPassword'), '12345678')

WebUI.click(findTestObject('Login/btmLogin'))

WebUI.delay(1)

WebUI.verifyTextPresent('Halo', false)

