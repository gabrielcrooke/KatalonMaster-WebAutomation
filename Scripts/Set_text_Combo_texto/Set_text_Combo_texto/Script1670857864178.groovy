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

WebUI.click(findTestObject('Object Repository/set_text_combo_texto/Page_ToolsQA/input_Name_firstName'))

WebUI.setText(findTestObject('Object Repository/set_text_combo_texto/Page_ToolsQA/input_Name_firstName'), 'Jose')

WebUI.sendKeys(findTestObject('set_text_combo_texto/Page_ToolsQA/input_Name_firstName'), ' Reyes')

WebUI.clearText(findTestObject('set_text_combo_texto/Page_ToolsQA/input_Name_firstName'))

WebUI.setText(findTestObject('set_text_combo_texto/Page_ToolsQA/input_Name_firstName'), 'Alfonso Lora')

WebUI.delay(Tiempo)

WebUI.check(findTestObject('set_text_combo_texto/Page_ToolsQA/label_Male'))

WebUI.scrollToElement(findTestObject('set_text_combo_texto/Page_ToolsQA/hobbies_check'), 0)

WebUI.check(findTestObject('set_text_combo_texto/Page_ToolsQA/hobbies_check'))

WebUI.delay(Tiempo)

WebUI.closeBrowser()

