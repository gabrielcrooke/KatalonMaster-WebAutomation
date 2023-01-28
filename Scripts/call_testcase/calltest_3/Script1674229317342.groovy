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

WebUI.click(findTestObject('Object Repository/call_testcase/cal_testcase3/Page_Automation Testing Practice/button_Click Me'))

WebUI.click(findTestObject('Object Repository/call_testcase/cal_testcase3/Page_Automation Testing Practice/input_Date Picker_datepicker'))

WebUI.click(findTestObject('Object Repository/call_testcase/cal_testcase3/Page_Automation Testing Practice/a_20'))

WebUI.selectOptionByValue(findTestObject('Object Repository/call_testcase/cal_testcase3/Page_Automation Testing Practice/select_Slower      Slow      Medium      Fa_f36099'), 
    'Slow', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/call_testcase/cal_testcase3/Page_Automation Testing Practice/select_TXT file        PDF file        DOC _6c0f43'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/call_testcase/cal_testcase3/Page_Automation Testing Practice/select_1      2      3      4     5'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/call_testcase/cal_testcase3/Page_Automation Testing Practice/select_GoogleYahooIphoneBing'), 
    'Apple', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/call_testcase/cal_testcase3/Page_Automation Testing Practice/select_CatBaby CatBig Baby CatAvatar'), 
    'big baby cat', true)

WebUI.click(findTestObject('Object Repository/call_testcase/cal_testcase3/Page_Automation Testing Practice/span_Message  12345'))

