import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

/* My_NOTE:
 * Fungsi Mobile.verifyElementText(findTestObject, ExpectedText, FailureHandling) tidak akan berfungsi maksimaal jika digunakan di CustomKeyword (tidak men-stop Proses Jika Resultnya tidak sesuai)
 * 
 * 
 * */

"STEP : Verifikasi Profile - NAME"
Mobile.verifyElementText(findTestObject('Object Repository/PROFILE/lbl_Name'), name, FailureHandling.STOP_ON_FAILURE)

"STEP : Verifikasi Profile - EMAIL"
Mobile.verifyElementText(findTestObject('Object Repository/PROFILE/lbl_Email'), email, FailureHandling.STOP_ON_FAILURE)

"STEP : Verifikasi Profile - PHONE NUMBER"
Mobile.verifyElementText(findTestObject('Object Repository/PROFILE/lbl_PhoneNumber'), phoneNumber, FailureHandling.STOP_ON_FAILURE)

"STEP : Verifikasi Profile - ADDRESS"
Mobile.verifyElementText(findTestObject('Object Repository/PROFILE/lbl_Address'), address, FailureHandling.STOP_ON_FAILURE)





