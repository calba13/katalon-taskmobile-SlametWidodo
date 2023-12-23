import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling

'STEP : Open Apps > Select Category'
Mobile.callTestCase(findTestCase('TC-CATEGORY/TC-Select Category'), [('category') : category], FailureHandling.STOP_ON_FAILURE)

'STEP : Verifikasi Header Title Category'
Mobile.verifyElementText(findTestObject('Object Repository/CATEGORY/lbl_Title Category Selected'), category, FailureHandling.STOP_ON_FAILURE)

'STEP : Back to List Product'
Mobile.tap(findTestObject('CATEGORY/Category_Detail/btn_back'), 0)

'STEP : Evidence'
Mobile.takeScreenshot()

