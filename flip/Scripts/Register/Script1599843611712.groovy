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

WebUI.openBrowser(GlobalVariable.Web)

WebUI.click(findTestObject('Daftarbtn'))

WebUI.delay(2)

WebUI.verifyTextPresent('Selamat Datang!', false)

WebUI.verifyTextPresent('Lengkapi data berikut dan akun flipmu akan terbuat', false)

WebUI.click(findTestObject('Register/btnDaftar'))

WebUI.verifyTextPresent('Nama harus diisi', false)

WebUI.verifyTextPresent('Email harus diisi', false)

WebUI.verifyTextPresent('Password harus diisi', false)

WebUI.verifyTextPresent('Nomor handphone harus diisi', false)

WebUI.setText(findTestObject('Register/inpName'), ' ')

WebUI.click(findTestObject('Register/btnDaftar'))

WebUI.verifyTextPresent('Format nama tidak benar', false)

WebUI.verifyTextPresent('Email harus diisi', false)

WebUI.verifyTextPresent('Password harus diisi', false)

WebUI.verifyTextPresent('Nomor handphone harus diisi', false)

WebUI.setText(findTestObject('Register/inpName'), 'qwerty0-\'[')

WebUI.click(findTestObject('Register/btnDaftar'))

WebUI.verifyTextPresent('Email harus diisi', false)

WebUI.verifyTextPresent('Password harus diisi', false)

WebUI.verifyTextPresent('Nomor handphone harus diisi', false)

WebUI.setText(findTestObject('Register/inpEmail'), ' ')

WebUI.click(findTestObject('Register/btnDaftar'))

WebUI.verifyTextPresent('Email harus diisi', false)

WebUI.verifyTextPresent('Password harus diisi', false)

WebUI.verifyTextPresent('Nomor handphone harus diisi', false)

WebUI.clearText(findTestObject('Register/inpEmail'))

WebUI.setText(findTestObject('Register/inpEmail'), '  qw@.c12')

WebUI.verifyTextPresent('Format email tidak benar', false)

WebUI.sendKeys(findTestObject('Register/inpEmail'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Register/inpEmail'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Register/inpEmail'), 'andinisekarwati9909@gmail.com')

WebUI.click(findTestObject('Register/btnDaftar'))

WebUI.verifyTextPresent('Password harus diisi', false)

WebUI.verifyTextPresent('Nomor handphone harus diisi', false)

WebUI.setText(findTestObject('Register/inpPassword'), '     ')

WebUI.click(findTestObject('Register/btnDaftar'))

WebUI.verifyTextPresent('Nomor handphone harus diisi', false)

WebUI.click(findTestObject('Register/phoneNumberCode'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register/listNegara'), '12345678')

WebUI.click(findTestObject('Register/btntutupNegara'))

WebUI.setText(findTestObject('Register/inpPhoneNumber'), '23456789')

WebUI.click(findTestObject('Register/btnDaftar'))

WebUI.delay(1)

WebUI.verifyTextPresent('only letters (a-z), numbers (0-9), spaces ( ), periods (.), commas (,), apostrophes (\'), and dashes (-) are allowed', 
    false)

WebUI.clearText(findTestObject('Register/inpPassword'))

WebUI.setText(findTestObject('Register/inpPassword'), '12345678')

WebUI.click(findTestObject('Register/btnLihat'))

WebUI.click(findTestObject('Register/btnDaftar'))

WebUI.verifyTextPresent('only letters (a-z), numbers (0-9), spaces ( ), periods (.), commas (,), apostrophes (\'), and dashes (-) are allowed', 
    false)

WebUI.sendKeys(findTestObject('Register/inpName'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Register/inpName'), Keys.chord(Keys.BACK_SPACE))

WebUI.delay(0)

WebUI.setText(findTestObject('Register/inpName'), 'qwerty')

WebUI.click(findTestObject('Register/btnDaftar'))

WebUI.verifyTextPresent('Email sudah terdaftar. Silakan masuk dengan email tersebut.', false)

WebUI.verifyTextPresent('Nomor handphone sudah terdaftar. Silakan masuk dengan akun yang menggunakan nomor tersebut.', false)

WebUI.sendKeys(findTestObject('Register/inpEmail'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Register/inpEmail'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Register/inpEmail'), 'andini123@mailinator.com')

WebUI.sendKeys(findTestObject('Register/inpPhoneNumber'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Register/inpPhoneNumber'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Register/inpPhoneNumber'), '087786530775')

WebUI.click(findTestObject('Register/btnDaftar'))

WebUI.delay(10)

WebUI.verifyTextPresent('Kode verifikasi akan kami kirim ke nomor berikut', false)

