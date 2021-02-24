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

selectedCompany = GlobalVariable.companyIndex

if (selectedCompany == 1 || selectedCompany == 2 || selectedCompany == 3) {

for (def rowNum = 1; rowNum <= findTestData('Data Files/ComakerInfo3').getRowNumbers(); rowNum++) {
    //WebUI.setText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_First Name_firstname'), FirstName)
    WebUI.setText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_First Name_firstname'), findTestData(
            'ComakerInfo3').getValue(1, rowNum))

    //WebUI.setText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_First Name_firstname'), FirstName)
    WebUI.setText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_Last Name_lastname'), findTestData(
            'ComakerInfo3').getValue(2, rowNum))

    //WebUI.setText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_E-Mail_email'), Email)
    WebUI.setText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_E-Mail_email'), findTestData(
            'ComakerInfo3').getValue(3, rowNum))

    Thread.sleep(2000)

    WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Add'))
	}
	
} else if (selectedCompany == 4 || selectedCompany == 5 || selectedCompany == 6) {
	
	for (def rowNum = 1; rowNum <= findTestData('Data Files/ComakerInfo7').getRowNumbers(); rowNum++) {
		
		//WebUI.setText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_First Name_firstname'), FirstName)
		WebUI.setText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_First Name_firstname'), findTestData(
				'Data Files/ComakerInfo7').getValue(1, rowNum))
	
		//WebUI.setText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_First Name_firstname'), FirstName)
		WebUI.setText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_Last Name_lastname'), findTestData(
				'Data Files/ComakerInfo7').getValue(2, rowNum))
	
		//WebUI.setText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_E-Mail_email'), Email)
		WebUI.setText(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/input_E-Mail_email'), findTestData(
				'Data Files/ComakerInfo7').getValue(3, rowNum))
	
		Thread.sleep(2000)
	
		WebUI.click(findTestObject('Page_TELESCOOP - PLDT Employees Multi-Purpo_3f52d5/button_Add'))
		}
}

