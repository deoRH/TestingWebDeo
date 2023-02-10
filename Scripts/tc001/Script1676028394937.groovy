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

WebUI.navigateToUrl('https://www.google.com/')

WebUI.setText(findTestObject('Object Repository/Page_Google/input_Login_q'), 'twitter')

WebUI.click(findTestObject('Object Repository/Page_Google/input_Hapus_btnK'))

WebUI.click(findTestObject('Object Repository/Page_twitter - Penelusuran Google/h3_Masuk ke Twitter'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Masuk ke Twitter  Twitter/h1_Masuk ke Twitter'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Masuk ke Twitter  Twitter/h1_Masuk ke Twitter'), 'Masuk ke Twitter')

WebUI.setText(findTestObject('Object Repository/Page_Masuk ke Twitter  Twitter/input_Nomor telepon, email, atau nama pengg_2adb8f'), 
    'ddd111222')

WebUI.click(findTestObject('Object Repository/Page_Masuk ke Twitter  Twitter/span_Berikutnya'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk ke Twitter  Twitter/input_Kata sandi_password'), '2c75IeO/6go=')

WebUI.click(findTestObject('Object Repository/Page_Masuk ke Twitter  Twitter/div_Masuk'))

WebUI.closeBrowser()

