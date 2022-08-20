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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://poriyaalar.com/#home')

WebUI.click(findTestObject('Object Repository/Page_Poriyaalar/a_Contact'))

//WebUI.setText(findTestObject('Object Repository/Page_Poriyaalar/input_Get In Touch_name'), name)

//WebUI.setText(findTestObject('Object Repository/Page_Poriyaalar/input_Get In Touch_email'), email)

//WebUI.setText(findTestObject('Object Repository/Page_Poriyaalar/input_Get In Touch_number'), phonenumber)

//WebUI.setText(findTestObject('Object Repository/Page_Poriyaalar/textarea_Get In Touch_comment'), message)

//WebUI.click(findTestObject('Object Repository/Page_Poriyaalar/input_Get In Touch_submit-contact-form'))

for(def rowNum=1;rowNum<=findTestData("Data/DataCsv").getRowNumbers();rowNum++)
	{
	
	WebUI.setText(findTestObject('Object Repository/Page_Poriyaalar/input_Get In Touch_name'), findTestData("Data/DataCsv").getValue(1,rowNum))
	
	WebUI.setText(findTestObject('Object Repository/Page_Poriyaalar/input_Get In Touch_email'), findTestData("Data/DataCsv").getValue(2,rowNum))
	
	WebUI.setText(findTestObject('Object Repository/Page_Poriyaalar/input_Get In Touch_number'), findTestData("Data/DataCsv").getValue(3,rowNum))
	
	WebUI.setText(findTestObject('Object Repository/Page_Poriyaalar/textarea_Get In Touch_comment'), findTestData("Data/DataCsv").getValue(4,rowNum))
	
	WebUI.click(findTestObject('Object Repository/Page_Poriyaalar/input_Get In Touch_submit-contact-form'))
	
	Thread.sleep(3000)
	}
WebUI.closeBrowser()

