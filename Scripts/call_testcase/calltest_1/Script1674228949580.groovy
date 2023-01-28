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

WebUI.navigateToUrl('https://testautomationpractice.blogspot.com/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Object Repository/call_testcase/Page_Automation Testing Practice/input_First Name_RESULT_TextField-1'), 
    'Gabriel')

WebUI.setText(findTestObject('Object Repository/call_testcase/Page_Automation Testing Practice/input_Last Name_RESULT_TextField-2'), 
    'Crooke')

WebUI.setText(findTestObject('Object Repository/call_testcase/Page_Automation Testing Practice/input_Phone_RESULT_TextField-3'), 
    '8098451845')

WebUI.setText(findTestObject('Object Repository/call_testcase/Page_Automation Testing Practice/input_Country_RESULT_TextField-4'), 
    'Republica Dominicana')

WebUI.setText(findTestObject('Object Repository/call_testcase/Page_Automation Testing Practice/input_City_RESULT_TextField-5'), 
    'Santo Domingo')

WebUI.setText(findTestObject('Object Repository/call_testcase/Page_Automation Testing Practice/input_Email Address_RESULT_TextField-6'), 
    'gcro@gmail.com')

