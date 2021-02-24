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

WebUI.callTestCase(findTestCase('Common/TC004_LoginAsBOD'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/TC007_NavigateToBODDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/select_POBoD'))

WebUI.delay(2)

WebUI.takeScreenshot('C:/Users/n3178/Desktop/Katalon Screenshots/BOD/BoDTicketProcessingBeforeApproving.png')

WebUI.delay(1)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_BoDApprove'))

WebUI.waitForElementClickable(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_BoDYes'), 3)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_BoDYes'))

WebUI.delay(2)

WebUI.takeScreenshot('C:/Users/n3178/Desktop/Katalon Screenshots/BOD/BoDTicketProcessingAfterApproving.png')

WebUI.delay(2)

WebUI.closeBrowser()

