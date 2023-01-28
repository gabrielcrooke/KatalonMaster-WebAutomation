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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Reto_selectores/input_name'), 'Tanjiro')

WebUI.setText(findTestObject('Reto_selectores/input_lastname'), 'Kamado')

WebUI.setText(findTestObject('Reto_selectores/input_mail'), 'tkamado@outlook.com')

WebUI.click(findTestObject('Reto_selectores/radio_female'))

WebUI.setText(findTestObject('Reto_selectores/input_mobile'), '8287876201')

WebUI.click(findTestObject('Reto_selectores/check_hobbie'))

WebUI.setText(findTestObject('Reto_selectores/texta_address'), 'Direccion 1')

WebUI.scrollToElement(findTestObject('Reto_selectores/button_subm'), 0)

WebUI.click(findTestObject('Reto_selectores/button_subm'))

WebUI.closeBrowser()

