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

WebUI.callTestCase(findTestCase('Common/TC002_LoginAsCS'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/TC005_NavigateToCSDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_New'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/Select_poCSNewTab'))

poID = WebUI.getText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/getPO'))

WebUI.verifyElementChecked(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/Select_poCSNewTab'), 5)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_AssignToMeCS'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_AssignToMeYes'))

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_CSMyAssignment'))

WebUI.waitForElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/Select_CSPOMyAssignment'), 
    3)

WebUI.delay(3)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/Select_CSPOMyAssignment'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/h4_APPLICATION STATUS CS Processing'), 
    5)

WebUI.scrollToElement(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_ApproveOnBehalf1'), 5)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_ApproveOnBehalf1'))

WebUI.waitForElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Approve'), 0)

WebUI.enhancedClick(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Approve'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_ApproveOnBehalf2'))

WebUI.waitForElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Approve'), 0)

WebUI.enhancedClick(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Approve'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_ApproveOnBehalf3'))

WebUI.waitForElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Approve'), 0)

WebUI.enhancedClick(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Approve'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/h4_APPLICATION STATUS CS Processing'), 
    3)

WebUI.delay(2)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_EditCreditStanding'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_SaveCreditStanding'))

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_EditLoanApplicationDetails'))

WebUI.delay(2)

WebUI.focus(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_ETBMS PO'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_ETBMS PO'), 5)

WebUI.sendKeys(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_ETBMS PO'), '123')

WebUI.delay(2)

WebUI.focus(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_SaveLoanApplicationDetails'))

WebUI.enhancedClick(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_SaveLoanApplicationDetails'))

WebUI.waitForElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_moveToCollection'), 
    5)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_moveToCollection'))

WebUI.waitForElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_YesMoveToCol'), 0)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_YesMoveToCol'))

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_SearchFieldCS'), poID)

WebUI.takeScreenshot('C:/Users/n3178/Desktop/Katalon Screenshots/CS/CSTicketProcessing.png')

