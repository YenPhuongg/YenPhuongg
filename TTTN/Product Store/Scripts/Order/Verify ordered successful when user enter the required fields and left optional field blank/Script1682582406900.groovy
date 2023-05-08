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

WebUI.callTestCase(findTestCase('Order/Verify that the Thanh Toán page is displayed when user click on Checkout button'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Order/txt_Name'), 'Nguyễn Hoàng Mai')

WebUI.setText(findTestObject('Order/txt_Phone'), '0473628746')

WebUI.setText(findTestObject('Order/txt_Email'), 'nguyenphuong@gmail.com')

WebUI.click(findTestObject('Order/ddl_ThanhPho'))

WebUI.sendKeys(findTestObject('Order/txt_TP'), Keys.chord('Đà Nẵng', Keys.ENTER))

WebUI.click(findTestObject('Order/ddl_QuanHuyen'))

WebUI.sendKeys(findTestObject('Order/txt_QuanHuyen'), Keys.chord('Quận Cẩm Lệ', Keys.ENTER))

WebUI.click(findTestObject('Order/ddl_ThiTran'))

WebUI.setText(findTestObject('Order/txt_DiaChi'), '14 Hoa Lư')

WebUI.click(findTestObject('Order/btn_PlaceOrder'))

WebUI.verifyTextPresent('Order received', false)

