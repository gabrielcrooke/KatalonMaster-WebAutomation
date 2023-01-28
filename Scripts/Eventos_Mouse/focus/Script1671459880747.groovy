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

WebUI.waitForPageLoad(0)

WebUI.maximizeWindow()

WebUI.focus(findTestObject('Object Repository/focus/Page_ToolsQA/input_Name_firstName'))

WebUI.delay(tiempo)

WebUI.focus(findTestObject('Object Repository/focus/Page_ToolsQA/input_Name_lastName'))

WebUI.delay(tiempo)

WebUI.focus(findTestObject('Object Repository/focus/Page_ToolsQA/input_Email_userEmail'))

WebUI.delay(tiempo)

WebUI.focus(findTestObject('Object Repository/focus/Page_ToolsQA/input_(10 Digits)_userNumber'))

WebUI.delay(tiempo)

WebUI.focus(findTestObject('Object Repository/focus/Page_ToolsQA/input_Date of Birth_dateOfBirthInput'))

WebUI.delay(tiempo)

WebUI.focus(findTestObject('Object Repository/focus/Page_ToolsQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.closeBrowser()
