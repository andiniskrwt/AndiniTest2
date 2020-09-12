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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('KirimUang/btnKirimUang'))

WebUI.delay(2)

WebUI.verifyTextPresent('Kirim Uang', false)

WebUI.verifyTextPresent('Jam layanan Flip adalah Senin-Minggu, pukul 07:00-20:00 WIB.', false)

WebUI.click(findTestObject('KirimUang/btnOk'))

WebUI.delay(2)

WebUI.verifyTextPresent('Pilih rekening yang digunakan', false)

WebUI.verifyTextPresent('Pilih rekening tujuan', false)

WebUI.verifyTextPresent('Masukkan nomor rekening', false)

WebUI.verifyTextPresent('Minimal nominal Rp10.000', false)

WebUI.selectOptionByLabel(findTestObject('KirimUang/senderBank'), 'BCA', false)

WebUI.click(findTestObject('KirimUang/btnOk'))

WebUI.delay(2)

WebUI.verifyTextPresent('Pilih rekening tujuan', false)

WebUI.verifyTextPresent('Masukkan nomor rekening', false)

WebUI.verifyTextPresent('Minimal nominal Rp10.000', false)

WebUI.selectOptionByLabel(findTestObject('KirimUang/bankTujuan'), 'BTPN / Jenius / BTPN Wow!', false)

WebUI.click(findTestObject('KirimUang/btnOk'))

WebUI.verifyTextPresent('Masukkan nomor rekening', false)

WebUI.delay(2)

WebUI.verifyTextPresent('Minimal nominal Rp10.000', false)

WebUI.setText(findTestObject('KirimUang/inpNomorRekening'), 'qwerty232')

WebUI.click(findTestObject('KirimUang/btnOk'))

WebUI.delay(2)

WebUI.verifyTextPresent('Masukkan nomor rekening', false)

WebUI.verifyTextPresent('Minimal nominal Rp10.000', false)

WebUI.sendKeys(findTestObject('KirimUang/inpNomorRekening'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('KirimUang/inpNomorRekening'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('KirimUang/inpNomorRekening'), '1234567')

WebUI.click(findTestObject('KirimUang/cekNama'))

WebUI.delay(2)

WebUI.verifyTextPresent('Nomor rekening salah.', false)

WebUI.click(findTestObject('KirimUang/noreksalah'))

WebUI.acceptAlert()

WebUI.sendKeys(findTestObject('KirimUang/inpNomorRekening'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('KirimUang/inpNomorRekening'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('KirimUang/inpNomorRekening'), '90012047971')

WebUI.click(findTestObject('KirimUang/cekNama'))

WebUI.verifyTextPresent('ANDINI', false)

WebUI.setText(findTestObject('KirimUang/amount'), '123.456.789')

WebUI.click(findTestObject('KirimUang/btnOk'))

WebUI.delay(2)

WebUI.verifyTextPresent('Minimal nominal Rp10.000', false)

WebUI.sendKeys(findTestObject('KirimUang/amount'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('KirimUang/amount'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('KirimUang/amount'), '1')

WebUI.click(findTestObject('KirimUang/btnOk'))

WebUI.delay(2)

WebUI.verifyTextPresent('Minimal nominal Rp10.000', false)

WebUI.sendKeys(findTestObject('KirimUang/amount'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('KirimUang/amount'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('KirimUang/amount'), '9000')

WebUI.click(findTestObject('KirimUang/btnOk'))

WebUI.delay(2)

WebUI.verifyTextPresent('Minimal nominal Rp10.000', false)

WebUI.sendKeys(findTestObject('KirimUang/amount'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('KirimUang/amount'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('KirimUang/amount'), '11000')

WebUI.click(findTestObject('KirimUang/btnOk'))

WebUI.delay(3)

WebUI.verifyTextPresent('Review', false)

WebUI.verifyTextPresent('TOTAL TRANSFER', false)

WebUI.click(findTestObject('KirimUang/kodeUnik'))

WebUI.delay(2)

WebUI.verifyTextPresent('Kode unik mempermudah Flip melakukan verifikasi transaksi, sehingga transaksi kamu akan diproses lebih cepat.', 
    false)

WebUI.click(findTestObject('KirimUang/btnTutupKodeUnik'))

WebUI.click(findTestObject('KirimUang/btnLanjut'))

WebUI.delay(1)

WebUI.verifyTextPresent('Jumlah yang ditransfer harus sesuai dengan total transfer yang tertera, sampai 3 (tiga) angka terakhir.', 
    false)

WebUI.click(findTestObject('KirimUang/btnSiapSetuju'))

WebUI.delay(1)

WebUI.verifyTextPresent('Konfirmasi Transaksi', false)

WebUI.verifyTextPresent('Sudah transfer melalui ATM/Internet/mobile banking? Klik tombol di bawah untuk mengonfirmasi.', 
    false)

WebUI.click(findTestObject('KirimUang/btnSayasdhTransfer'))

WebUI.delay(5)

WebUI.verifyTextPresent('Sedang diproses', false)

