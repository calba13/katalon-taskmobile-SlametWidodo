import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling


//'STEP : Start Application Mobile'
//Mobile.callTestCase(findTestCase('TC-Common/TC-Open Application Mobile'), [:], FailureHandling.STOP_ON_FAILURE)

'STEP : Click Category'
Mobile.tap(findTestObject('Navigation/nav_Category'), 0)

'STEP : Select Category'
def defaultVar = CustomKeywords.'assigmentTigaKW.category.selectCategory'(category)

'STEP : Print Report'
CustomKeywords.'assigmentTigaKW.category.createReport'(defaultVar)