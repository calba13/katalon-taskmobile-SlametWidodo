import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling

'STEP : Start Application Mobile'
Mobile.callTestCase(findTestCase('TC-Common/TC-Open Application Mobile'), [:], FailureHandling.STOP_ON_FAILURE)

'STEP : Click Profile'
Mobile.tap(findTestObject('Object Repository/Navigation/nav_Profile'), 0)

'STEP : Edit Profile'
CustomKeywords.'assigmentTigaKW.profile.editProfile'(name, email, phoneNumber, address)

'STEP : Verifikasi Profile'
Mobile.callTestCase(findTestCase('TC-PROFILE/TC-Verifikasi Profile'), [('name') : name, ('email') : email, ('phoneNumber') : phoneNumber
        , ('address') : address], FailureHandling.STOP_ON_FAILURE)

'STEP : Close Application Mobilee'
Mobile.callTestCase(findTestCase('TC-Common/TC-Close Application Mobile'), [:], FailureHandling.STOP_ON_FAILURE)



