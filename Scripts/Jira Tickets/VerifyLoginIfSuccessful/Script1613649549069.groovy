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

WebUI.openBrowser(GlobalVariable.defURL)

WebUI.maximizeWindow()

for (def rowNum = 4; rowNum <= findTestData('Data Files/LoginCredentials').getRowNumbers(); rowNum++) {
    WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/a_Login'))

    WebUI.setText(findTestObject('Object Repository/Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_Username_myusername'), 
        findTestData('LoginCredentials').getValue(1, rowNum))

    WebUI.setText(findTestObject('Object Repository/Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_Password_mypassword'), 
        findTestData('LoginCredentials').getValue(2, rowNum))

    WebUI.click(findTestObject('Object Repository/Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_Password_login'))

    WebUI.verifyElementVisible(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/menu_Logout'))

    WebUI.waitForPageLoad(2)

    WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/menu_olaDashboard'))

    WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/menu_GeneralDashboard'))

    WebUI.setText(findTestObject('Object Repository/Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_loginUsernameDashboard'), 
        findTestData('LoginCredentials').getValue(1, rowNum))

    WebUI.setText(findTestObject('Object Repository/Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_passwordDasbboard'), 
        findTestData('LoginCredentials').getValue(2, rowNum))

    WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_LoginDashboard'))

    WebUI.waitForPageLoad(2)

    account = WebUI.getText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/get_DashboardHeader'))

    WebUI.takeScreenshot(('C:/Users/n3178/Desktop/Katalon Screenshots/Logins/' + account) + '.png')

    Thread.sleep(2000)
}

