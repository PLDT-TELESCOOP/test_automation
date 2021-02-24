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

WebUI.openBrowser(GlobalVariable.emailLink)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/set_Email'), 'nrochotorena@student.apc.edu.ph')

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_emailNext'))

WebUI.waitForElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/set_emailPassword'), 3)

WebUI.setEncryptedText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/set_emailPassword'), 'TQIPIlJLauj7eQMlbMPNug==')

WebUI.waitForElementPresent(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_emailSignIn'), 0)

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_emailSignIn'))

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/hyperlink_userDifferentAccount'))

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_clickEmail'))

WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/select_email'))

WebUI.waitForPageLoad(5)

WebUI.takeScreenshot('C:/Users/n3178/Desktop/Katalon Screenshots/General/Email.png')

