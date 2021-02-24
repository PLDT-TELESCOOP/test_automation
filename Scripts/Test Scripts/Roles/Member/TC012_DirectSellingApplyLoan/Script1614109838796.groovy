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

WebUI.callTestCase(findTestCase('Common/TC009_NavigateToApplyLoanWizard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Apply Loan'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Confirm'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/radio_DirectSelling'))

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Next'))

WebUI.delay(1)

WebUI.setText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_itemDS'), 'iphone 11')

WebUI.sendKeys(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_priceDS'), '70000')

WebUI.selectOptionByIndex(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/select_PaymentTermDS'), GlobalVariable.paymentTermIndex)

WebUI.callTestCase(findTestCase('Common/SelectReferredByRandomDS'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/verify_Computation'), 0)

WebUI.takeScreenshot('C:/Users/n3178/Desktop/Katalon Screenshots/FinancialApplyLoan/SelectedItem.png')

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Next'))

WebUI.waitForPageLoad(2)

WebUI.verifyElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/verify_selectCompany'), 0)

WebUI.selectOptionByIndex(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/select_Company'), GlobalVariable.companyIndex)

WebUI.callTestCase(findTestCase('Common/TC010_EnterComakerInfo'), [('FirstName') : '', ('LastName') : '', ('Email') : ''], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.uploadFile(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_uploadFile'), 'C:\\Users\\n3178\\Desktop\\asd.png')

WebUI.verifyElementNotPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/verify_WrongFileType'), 
    1)

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/verify_IfuploadedFileExists'), 
    1)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Next'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_termsAndConditions'))

WebUI.takeScreenshot('C:/Users/n3178/Desktop/Katalon Screenshots/FinancialApplyLoan/Review.png')

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Submit'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/popUp_CreatedIssue'), 0)

WebUI.takeScreenshot('C:/Users/n3178/Desktop/Katalon Screenshots/FinancialApplyLoan/PO.png')

WebUI.enhancedClick(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Okay'))

WebUI.delay(1)

