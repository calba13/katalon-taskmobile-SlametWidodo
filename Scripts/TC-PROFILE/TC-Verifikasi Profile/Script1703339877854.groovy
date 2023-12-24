import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/* My_NOTE:
 * Fungsi Mobile.verifyElementText(findTestObject, ExpectedText, FailureHandling) tidak akan berfungsi maksimaal jika digunakan di CustomKeyword (tidak men-stop Proses Jika Resultnya tidak sesuai)
 * 
 * 
 * */

'STEP : Open Apps > Edit Profile'
WebUI.callTestCase(findTestCase('TC-PROFILE/TC-Edit Profile'), [('name') : name, ('email') : email
        , ('phoneNumber') : phoneNumber, ('address') : address], FailureHandling.STOP_ON_FAILURE)

'STEP : Verifikasi Profile - NAME'
Mobile.verifyElementText(findTestObject('Object Repository/PROFILE/lbl_Name'), name, FailureHandling.STOP_ON_FAILURE)

'STEP : Verifikasi Profile - EMAIL'
Mobile.verifyElementText(findTestObject('Object Repository/PROFILE/lbl_Email'), email, FailureHandling.STOP_ON_FAILURE)

'STEP : Verifikasi Profile - PHONE NUMBER'
Mobile.verifyElementText(findTestObject('Object Repository/PROFILE/lbl_PhoneNumber'), phoneNumber, FailureHandling.STOP_ON_FAILURE)

'STEP : Verifikasi Profile - ADDRESS'
Mobile.verifyElementText(findTestObject('Object Repository/PROFILE/lbl_Address'), address, FailureHandling.STOP_ON_FAILURE)

'STEP : Evidence'
Mobile.takeScreenshot()

