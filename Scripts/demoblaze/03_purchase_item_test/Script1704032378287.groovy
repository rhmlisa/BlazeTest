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

WebUI.navigateToUrl('https://demoblaze.com/index.html')

WebUI.click(findTestObject('Object Repository/purchase/purchase_page/click_login'))

WebUI.setText(findTestObject('Object Repository/purchase/purchase_page/input_loginusername'), 'demoblazetest01')

WebUI.setEncryptedText(findTestObject('Object Repository/purchase/purchase_page/input_loginpassword'), 'uQ/dsyhMYmTnlMNf0A4qyQ==')

WebUI.click(findTestObject('Object Repository/purchase/purchase_page/btn_login'))

WebUI.click(findTestObject('Object Repository/purchase/purchase_page/click_item'))

WebUI.click(findTestObject('Object Repository/purchase/purchase_page/click_addtocart'))

WebUI.click(findTestObject('Object Repository/purchase/purchase_page/click_cart'))

WebUI.click(findTestObject('Object Repository/purchase/purchase_page/btn_place_order'))

WebUI.setText(findTestObject('Object Repository/purchase/purchase_page/inputname'), 'lisa')

WebUI.setText(findTestObject('Object Repository/purchase/purchase_page/inputcountry'), 'indonesia')

WebUI.setText(findTestObject('Object Repository/purchase/purchase_page/inputcity'), 'jakarta')

WebUI.setText(findTestObject('Object Repository/purchase/purchase_page/inputcard'), '12345')

WebUI.setText(findTestObject('Object Repository/purchase/purchase_page/inputmonth'), 'desember')

WebUI.setText(findTestObject('Object Repository/purchase/purchase_page/inputyear'), '2023')

WebUI.click(findTestObject('Object Repository/purchase/purchase_page/btn_purchase'))

WebUI.verifyElementPresent(findTestObject('Object Repository/purchase/purchase_page/title_success_purchase'), 0)

WebUI.click(findTestObject('Object Repository/purchase/purchase_page/btn_ok'))

