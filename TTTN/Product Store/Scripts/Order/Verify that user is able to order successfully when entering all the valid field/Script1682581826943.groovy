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

WebUI.callTestCase(findTestCase('Order/User enter the required fields and left optional field blank, did not click the placeholder button'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Order/txt_Note'), 'Cảm ơn shop')

WebUI.click(findTestObject('Order/optional/chk_hoadon'))

WebUI.setText(findTestObject('Order/optional/txt_CongTyName'), 'TNHH 1 thành viên')

WebUI.setText(findTestObject('Order/optional/txt_MaSoThue'), 'MS12747')

WebUI.setText(findTestObject('Order/optional/txt_mail'), 'nguyenphuong@gmail.com')

WebUI.setText(findTestObject('Order/optional/txt_DiaChi'), 'Đà Nẵng')

WebUI.click(findTestObject('Order/btn_PlaceOrder'))

WebUI.verifyTextPresent('Order received', false)

