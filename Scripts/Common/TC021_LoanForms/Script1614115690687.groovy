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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Common/TC001_LoginAsMember'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/menu_My Account'))

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/a_LoanForms'))

WebUI.waitForPageLoad(3)

WebUI.verifyElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/verify_LoanForms'), 0)

