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

WebUI.callTestCase(findTestCase('Common/NavigateToApplyLoanWizard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.check(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/radio_DirectSelling'))

WebUI.verifyElementChecked(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/radio_DirectSelling'), 0)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Next'))

WebUI.verifyElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/verify_step2'), 0)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/checkbox_SelectItem1'))

WebUI.selectOptionByIndex(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/select_PaymentTerms'), paymentTermIndex)

WebUI.scrollToElement(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Next'), 2)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Next'))

WebUI.scrollToElement(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/header_Step1'), 2)

WebUI.verifyElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/verify_step3'), 0)

WebUI.selectOptionByLabel(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/select_Company'), company, 
    false)

WebUI.callTestCase(findTestCase('Common/EnterComakerInfo'), [('FirstName') : '', ('LastName') : '', ('Email') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.uploadFile(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_uploadFile'), 'C:\\Users\\n3178\\Desktop\\asd.png')

WebUI.verifyElementNotPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/verify_WrongFileType'), 
    1)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/verify_IfuploadedFileExists'), 
    1)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Next'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_termsAndConditions'))

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Submit'))

WebUI.delay(1)

