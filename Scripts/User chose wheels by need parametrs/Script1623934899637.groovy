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

WebUI.openBrowser('https://www.google.com/')

def driver = DriverFactory.getWebDriver()

String baseUrl = 'https://www.google.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('https://auto.ru/')

selenium.click('xpath=//div[@id=\'app\']/div/div/header/div[2]/nav/ul/li[4]/a')

selenium.click('xpath=//div[@id=\'app\']/div/div/div/div/div[2]/div[4]/div[3]/div/div/div/div/div/div/div[2]/button/span')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Все модели автомобилей: поколение и кузов: O - Я\'])[1]/following::div[31]')

selenium.click('xpath=//div[@id=\'app\']/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div[2]/button')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Все модели автомобилей: поколение и кузов: O - Я\'])[1]/following::div[14]')

selenium.click('xpath=//div[@id=\'app\']/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div/div/div[3]/div[2]/div[2]/button')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Все модели автомобилей: поколение и кузов: O - Я\'])[1]/following::div[21]')

WebUI.click(findTestObject('Wheels/Page_24540 R17  ,    ,/a_Yokohama Advan Fleva V701 24540 R17'))

