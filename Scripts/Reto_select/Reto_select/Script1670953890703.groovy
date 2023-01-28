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

WebUI.navigateToUrl('https://testsheepnz.github.io/BasicCalculator.html')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Reto_select/Page_Basic Calculator/select_Prototype'), 0)

WebUI.selectOptionByValue(findTestObject('Reto_select/Page_Basic Calculator/select_Prototype'), '6', false)

WebUI.delay(Tiempo)

WebUI.setText(findTestObject('Reto_select/Page_Basic Calculator/input_First number_number1'), '10')

WebUI.delay(Tiempo)

WebUI.setText(findTestObject('Reto_select/Page_Basic Calculator/input_Second number_number2'), '2')

WebUI.delay(Tiempo)

WebUI.selectOptionByLabel(findTestObject('Reto_select/Page_Basic Calculator/select_Add'), 'Divide', false)

WebUI.delay(Tiempo)

WebUI.click(findTestObject('Reto_select/Page_Basic Calculator/input_Operation_calculateButton'))

WebUI.delay(10)

WebUI.check(findTestObject('Reto_select/Page_Basic Calculator/input_Integers only_intSelection'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(Tiempo)

WebUI.click(findTestObject('Reto_select/Page_Basic Calculator/input_Integers only_clearButton'))

WebUI.delay(Tiempo)

WebUI.closeBrowser()

