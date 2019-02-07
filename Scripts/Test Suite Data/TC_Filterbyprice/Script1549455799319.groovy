import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('https://feellio-cuisine-demo.mybigcommerce.com/shop-all/')

WebUI.delay(6)

WebUI.click(findTestObject('FilterPage_objects/FilterLinks', [('link') : '$0.00 - $51.00']))

WebUI.delay(6)

WebUI.callTestCase(findTestCase('Test Suite Data/TC_ProductLoop'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('FilterPage_objects/FilterLinks', [('link') : '$51.00 - $94.00']))

WebUI.delay(6)

WebUI.callTestCase(findTestCase('Test Suite Data/TC_ProductLoop'), [:], FailureHandling.STOP_ON_FAILURE)


WebUI.click(findTestObject('FilterPage_objects/FilterLinks', [('link') : '$94.00 - $138.00']))

WebUI.delay(6)

WebUI.callTestCase(findTestCase('Test Suite Data/TC_ProductLoop'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FilterPage_objects/FilterLinks', [('link') : '$138.00 - $181.00']))

WebUI.delay(6)

WebUI.click(findTestObject('FilterPage_objects/FilterLinks', [('link') : '$181.00 - $225.00']))

WebUI.delay(6)

WebUI.callTestCase(findTestCase('Test Suite Data/TC_ProductLoop'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Suite Data/TC_AddToCartDelete'), [:], FailureHandling.STOP_ON_FAILURE)
