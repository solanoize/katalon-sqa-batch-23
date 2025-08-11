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

'Pre condition'
WebUI.callTestCase(findTestCase('TC-PRETEST'), [:], FailureHandling.STOP_ON_FAILURE)

'Delay 2 detik'
WebUI.delay(2)

'Verifikasi elemen card harus muncul'
WebUI.verifyElementPresent(findTestObject('Inventory Page/Card Products'), 0)

'Hitung element card'
counts = WebUI.findWebElements(findTestObject('Inventory Page/Card Products'), 0).size()

'Verifikasi produk harus ada 6'
assert counts == 6

WebUI.takeScreenshot('ss')

'Delay 2 detik'
WebUI.delay(2)

'Tutup Browser'
WebUI.closeBrowser()

