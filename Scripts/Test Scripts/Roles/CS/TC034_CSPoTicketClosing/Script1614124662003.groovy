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

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/Select_poCSNewTab'))

poID = WebUI.getText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/getPO'))

WebUI.verifyElementChecked(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/Select_poCSNewTab'), 5)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_AssignToMeCS'))

WebUI.waitForElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_AssignToMeYes'), 5)

WebUI.enhancedClick(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_AssignToMeYes'))

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_CSMyAssignment'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/Select_CSPOMyAssignment'))

WebUI.waitForPageLoad(3)

WebUI.verifyElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/h4_APPLICATION STATUS For PO Closing'), 
    5)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_ClosePO'))

WebUI.waitForElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_ClosePOYes'), 5)

WebUI.enhancedClick(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_ClosePOYes'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_SearchFieldCS'), 
    poID)

WebUI.takeScreenshot('C:/Users/n3178/Desktop/Katalon Screenshots/CS/CSTicketClosing.png')

WebUI.delay(3)

WebUI.closeBrowser()

