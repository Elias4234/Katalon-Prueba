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

WebUI.navigateToUrl('https://training.openspan.com/')

WebUI.setText(findTestObject('Object Repository/Login/input_Please enter a user name of at least 4 characters_user_name'), 
    'itlax')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/input_Please enter a password of at least 4 characters_user_pass'), 
    '7JByEy67GQ3WOAPSXoh1rg==')

WebUI.click(findTestObject('Object Repository/Login/input_Please enter a password of at least 4 characters_login_button'))

WebUI.click(findTestObject('Object Repository/Page_Home  Pega Studio Training Web Application/a_Products'))

WebUI.click(findTestObject('Object Repository/Page_Products  Pega Studio Training Web Application/a_Beverages'))

WebUI.click(findTestObject('Object Repository/Page_Beverages  Pega Studio Training Web Application/a_Chartreuse verte'))

WebUI.click(findTestObject('Object Repository/Page_Product Detail  Pega Studio Training Web Application/input_Qty_Order'))

WebUI.click(findTestObject('Object Repository/Page_Order Products  Pega Studio Training Web Application/input_11.25_continue_shopping'))

WebUI.click(findTestObject('Object Repository/Page_Products  Pega Studio Training Web Application/a_Beverages'))

WebUI.click(findTestObject('Object Repository/Page_Beverages  Pega Studio Training Web Application/a_Guarana Fantastica'))

WebUI.click(findTestObject('Object Repository/Page_Product Detail  Pega Studio Training Web Application/input_Qty_Order'))

WebUI.click(findTestObject('Object Repository/Page_Order Products  Pega Studio Training Web Application/input_9.00_continue_shopping'))

WebUI.click(findTestObject('Object Repository/Page_Products  Pega Studio Training Web Application/a_Beverages'))

WebUI.click(findTestObject('Object Repository/Page_Beverages  Pega Studio Training Web Application/a_Lakkalikoori'))

WebUI.click(findTestObject('Object Repository/Page_Product Detail  Pega Studio Training Web Application/input_Qty_Order'))

WebUI.click(findTestObject('Object Repository/Page_Order Products  Pega Studio Training Web Application/input_18.00_edit_your_cart'))

WebUI.click(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/input_58.50_next'))

WebUI.setText(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/input_Billing Address_bfirst_name'), 
    'Jose')

WebUI.setText(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/input_Billing Address_blast_name'), 
    'Gomez')

WebUI.setText(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/input_Billing Address_bstreet_address'), 
    'Perez')

WebUI.setText(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/input_Billing Address_bcompany_name'), 
    'Dark')

WebUI.setText(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/input_Billing Address_bzip_code'), 
    '123432')

WebUI.setText(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/input_Billing Address_barea_code'), 
    '123562')

WebUI.setText(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/input_Billing Address_bprimary_phone'), 
    '834-3438')

WebUI.setText(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/input_Shipping Address_sfirst_name'), 
    'Mario')

WebUI.setText(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/input_Shipping Address_slast_name'), 
    'Guzman Ramirez')

WebUI.setText(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/input_Shipping Address_scompany_name'), 
    'Dawn')

WebUI.setText(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/input_Shipping Address_sstreet_address'), 
    'Sto. Dgo.,C/ K #55')

WebUI.setText(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/input_Shipping Address_szip_code'), 
    '123256')

WebUI.setText(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/input_Shipping Notifications_email_address'), 
    'qweweq@wewqw')

WebUI.click(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/input_Shipping Notifications_next'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/select_Card TypeVisaMastercard'), 
    'Visa', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/select_Expiration MonthJanuaryFebruaryMarchAprilMayJuneJulyAugustSeptemberOctoberNovemberDecember'), 
    'April', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/select_Expiration Year2014201520162017201820192020'), 
    '2020', true)

WebUI.setText(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/input_Step 3 Tell Us How You Will Pay_card_number'), 
    '52643254')

WebUI.setText(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/input_Step 3 Tell Us How You Will Pay_security_code'), 
    '2345')

WebUI.click(findTestObject('Object Repository/Page_Order  Pega Studio Training Web Application/input_Verify Credit Limit_submit'))

WebUI.takeElementScreenshot(findTestObject('Page_Order Products  Pega Studio Training Web Application/div_Order 526730Thank you for placing an order with ACME'))

WebUI.delay(31)

WebUI.closeBrowser()

