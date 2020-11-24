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

String full_name = 'John Doe'
String email = 'johndoe@company.com'
String phone = '82134567890'
String company = 'Company'
String type_industry = 'Retail'
String job_position = 'manager'
String product = 'shipping management'
String number_user = '1-100'


WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.mile.app/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/form/button_Request Demo'))

WebUI.setText(findTestObject('form/input_full_name'), full_name)

WebUI.setText(findTestObject('form/input_email'), email)

WebUI.setText(findTestObject('form/input_phone'), phone)

WebUI.setText(findTestObject('form/input_company'), company)

WebUI.selectOptionByValue(findTestObject('form/select_type_industry'), type_industry, true)

WebUI.selectOptionByValue(findTestObject('form/select_job_position'), job_position, true)

WebUI.selectOptionByValue(findTestObject('form/select_product'), product, true)

WebUI.selectOptionByValue(findTestObject('form/select_number_of_user'), number_user, true)

WebUI.click(findTestObject('form/button_Request Demo_submit'))

WebUI.verifyTextPresent('Thank you for submitting', false)

WebUI.closeBrowser()

