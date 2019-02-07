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
import java.util.regex.Pattern as Pattern
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.junit.Assert.*
import static org.apache.commons.lang3.StringUtils.join
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
WebUI.openBrowser('')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://feellio-cuisine-demo.mybigcommerce.com/shop-all/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('https://feellio-cuisine-demo.mybigcommerce.com/shop-all/')

def i = 1

def j = 2

for (def index : (1..4)) {
    WebUI.delay(3)

    if ((index % (i + 3)) == 0) {
        WebUI.scrollToPosition(0, 400 * j)

        j = (j + 1)

        i = (i + 3)
    }
    
    WebUI.delay(3)

    selenium.click(('//html/body/div[7]/div[1]/div/main/div[3]/form/ul/li[' + index) + ']/article/figure/figcaption/div[1]/a')

    WebUI.delay(3)

    if (WebUI.verifyElementVisible(findTestObject('Product Iteration Objects/addToCartObject'), FailureHandling.OPTIONAL)) {
        WebUI.delay(3)

        WebUI.click(findTestObject('Product Iteration Objects/addToCartObject'), FailureHandling.OPTIONAL)

        WebUI.delay(3)

        selenium.click('//section/a[2]')
    } else {
        selenium.click('//section/a[2]')
    }
}

WebUI.delay(3)

WebUI.navigateToUrl('https://feellio-cuisine-demo.mybigcommerce.com/cart.php')

WebUI.delay(5)

for (def index : (1..4)) {
    selenium.click('//tr[1]/td[5]/a')

    WebUI.delay(5)
}

WebUI.verifyElementPresent(findTestObject('emptyCart'), 0)

