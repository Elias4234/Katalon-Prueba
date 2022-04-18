import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\hp\\AppData\\Local\\Temp\\Katalon\\20220417_205804\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://training.openspan.com/\')\n\nWebUI.setText(findTestObject(\'Object Repository/Login/input_Please enter a user name of at least 4 characters_user_name\'), \n    \'itlax\')\n\nWebUI.setEncryptedText(findTestObject(\'Object Repository/Login/input_Please enter a password of at least 4 characters_user_pass\'), \n    \'7JByEy67GQ3WOAPSXoh1rg==\')\n\nWebUI.click(findTestObject(\'Object Repository/Login/input_Please enter a password of at least 4 characters_login_button\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Home  Pega Studio Training Web Application/a_Products\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Products  Pega Studio Training Web Application/a_Beverages\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Beverages  Pega Studio Training Web Application/a_Chartreuse verte\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Product Detail  Pega Studio Training Web Application/input_Qty_Order\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Order Products  Pega Studio Training Web Application/input_11.25_continue_shopping\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Products  Pega Studio Training Web Application/a_Beverages\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Beverages  Pega Studio Training Web Application/a_Guarana Fantastica\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Product Detail  Pega Studio Training Web Application/input_Qty_Order\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Order Products  Pega Studio Training Web Application/input_9.00_continue_shopping\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Products  Pega Studio Training Web Application/a_Beverages\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Beverages  Pega Studio Training Web Application/a_Lakkalikoori\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Product Detail  Pega Studio Training Web Application/input_Qty_Order\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Order Products  Pega Studio Training Web Application/input_18.00_edit_your_cart\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/input_58.50_next\'))\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/input_Billing Address_bfirst_name\'), \n    \'Jose\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/input_Billing Address_blast_name\'), \n    \'Gomez\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/input_Billing Address_bstreet_address\'), \n    \'Perez\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/input_Billing Address_bcompany_name\'), \n    \'Dark\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/input_Billing Address_bzip_code\'), \n    \'123432\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/input_Billing Address_barea_code\'), \n    \'123562\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/input_Billing Address_bprimary_phone\'), \n    \'834-3438\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/input_Shipping Address_sfirst_name\'), \n    \'Mario\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/input_Shipping Address_slast_name\'), \n    \'Guzman Ramirez\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/input_Shipping Address_scompany_name\'), \n    \'Dawn\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/input_Shipping Address_sstreet_address\'), \n    \'Sto. Dgo.,C/ K #55\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/input_Shipping Address_szip_code\'), \n    \'123256\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/input_Shipping Notifications_email_address\'), \n    \'qweweq@wewqw\')\n\nWebUI.click(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/input_Shipping Notifications_next\'))\n\nWebUI.selectOptionByValue(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/select_Card TypeVisaMastercard\'), \n    \'Visa\', true)\n\nWebUI.selectOptionByValue(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/select_Expiration MonthJanuaryFebruaryMarchAprilMayJuneJulyAugustSeptemberOctoberNovemberDecember\'), \n    \'April\', true)\n\nWebUI.selectOptionByValue(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/select_Expiration Year2014201520162017201820192020\'), \n    \'2020\', true)\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/input_Step 3 Tell Us How You Will Pay_card_number\'), \n    \'52643254\')\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/input_Step 3 Tell Us How You Will Pay_security_code\'), \n    \'2345\')\n\nWebUI.click(findTestObject(\'Object Repository/Page_Order  Pega Studio Training Web Application/input_Verify Credit Limit_submit\'))\n\nWebUI.takeElementScreenshot(findTestObject(null))\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

