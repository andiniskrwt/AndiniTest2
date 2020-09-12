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

WebUI.callTestCase(findTestCase('LoginNormal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('CatatanTransaksi/catatanTransaksibtn'))

WebUI.verifyTextPresent('Catatan Transaksi', false)

WebUI.delay(1)

WebUI.setText(findTestObject('CatatanTransaksi/searchTransaksi'), '123456789')

WebUI.verifyTextPresent('Transaksi tidak ditemukan', false)

WebUI.sendKeys(findTestObject('CatatanTransaksi/searchTransaksi'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('CatatanTransaksi/searchTransaksi'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('CatatanTransaksi/searchTransaksi'), 'BCA')

WebUI.delay(2)

WebUI.verifyTextPresent('BCA', false)

WebUI.click(findTestObject('CatatanTransaksi/semuaLayananDropdown'))

WebUI.check(findTestObject('CatatanTransaksi/layananDropdownValue1'))

WebUI.delay(1)

WebUI.verifyTextPresent('Transaksi tidak ditemukan', false)

WebUI.click(findTestObject('CatatanTransaksi/semuaLayananDropdown'))

WebUI.check(findTestObject('CatatanTransaksi/layananDropdownValue2'))

WebUI.delay(1)

WebUI.verifyTextPresent('BTPN', false)

WebUI.click(findTestObject('CatatanTransaksi/perluKonfirmasi'))

WebUI.delay(1)

WebUI.click(findTestObject('CatatanTransaksi/dalamProses'))

WebUI.delay(1)

WebUI.click(findTestObject('CatatanTransaksi/selesai'))

WebUI.delay(1)

