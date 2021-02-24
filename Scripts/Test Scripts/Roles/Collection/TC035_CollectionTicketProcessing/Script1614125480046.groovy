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

WebUI.callTestCase(findTestCase('Common/TC003_LoginAsCollection'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/TC006_NavigateToColDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_New'))

WebUI.verifyElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/verify_NewHeader'), 0)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/select_CollectionPONewTab'))

poID = WebUI.getText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/select_CollectionPONewTab'))

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_AssignToMeCollection'))

WebUI.waitForElementClickable(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_YesCollectionAssignToMe'), 
    0)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_YesCollectionAssignToMe'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_ColMyAssignment'))

WebUI.waitForPageLoad(2)

WebUI.verifyElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/h3_MyAssignedLoanApplications'), 
    0)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/select_ColPOMyAssignments'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_MoveToBoDGM'))

WebUI.verifyElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/select_Approvers'), 0)

WebUI.selectOptionByIndex(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/select_Approvers'), GlobalVariable.approversIndex)

WebUI.delay(2)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_YesApprovers'))

WebUI.delay(3)

WebUI.setText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_searchFieldCol'), poID)

WebUI.delay(1)

WebUI.takeScreenshot('C:/Users/n3178/Desktop/Katalon Screenshots/Collection/CollectionTicketProcessing.png')

