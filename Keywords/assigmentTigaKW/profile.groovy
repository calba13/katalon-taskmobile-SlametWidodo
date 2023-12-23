package assigmentTigaKW

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil


public class profile {

	@Keyword
	def editProfile(String name, String email, String phoneNumber, String address) {
		def defaultVar = new customKW.common().defaultVar();
		String tcTitle = "Edit Profile"
		try {
			
			
			Mobile.tap(findTestObject('Object Repository/PROFILE/btn_EDIT_User'), 0)
			
			// INPUT NAME
			Mobile.tap(findTestObject('Object Repository/PROFILE/User Profile/Div_Name'), 0)			
			Mobile.setText(findTestObject('Object Repository/PROFILE/User Profile/EditText'), name, 0)			
			Mobile.tap(findTestObject('Object Repository/PROFILE/User Profile/btn_OK'), 0)
			
			// INPUT EMAIL
			Mobile.tap(findTestObject('PROFILE/User Profile/Div_Email'), 0)			
			Mobile.setText(findTestObject('Object Repository/PROFILE/User Profile/EditText'), email, 0)			
			Mobile.tap(findTestObject('Object Repository/PROFILE/User Profile/btn_OK'), 0)
			
			// INPUT PHONE NUMBER
			Mobile.tap(findTestObject('Object Repository/PROFILE/User Profile/Div_PhoneNumber'), 0)			
			Mobile.setText(findTestObject('Object Repository/PROFILE/User Profile/EditText'), phoneNumber, 0)			
			Mobile.tap(findTestObject('Object Repository/PROFILE/User Profile/btn_OK'), 0)
			
			// INPUT ADDRESS
			Mobile.tap(findTestObject('PROFILE/User Profile/Div_Address'), 0)			
			Mobile.setText(findTestObject('Object Repository/PROFILE/User Profile/EditText'), address, 0)			
			Mobile.tap(findTestObject('Object Repository/PROFILE/User Profile/btn_OK'), 0)
			
			Mobile.pressBack()
			
			defaultVar["messageList"] << ["message" : "TestCase : ${tcTitle}"]
			defaultVar["messageList"] << ["message" : "Name : ${Mobile.getText(findTestObject('Object Repository/PROFILE/lbl_Name'), 0)} |Expected[ ${name} ]"]
			defaultVar["messageList"] << ["message" : "Email : ${Mobile.getText(findTestObject('Object Repository/PROFILE/lbl_Email'), 0)} |Expected[ ${email} ]"]
			defaultVar["messageList"] << ["message" : "Phone Number : ${Mobile.getText(findTestObject('Object Repository/PROFILE/lbl_PhoneNumber'), 0)} |Expected[ ${phoneNumber} ]"]
			defaultVar["messageList"] << ["message" : "Address : ${Mobile.getText(findTestObject('Object Repository/PROFILE/lbl_Address'), 0)} |Expected[ ${address} ]"]
			defaultVar["messageList"] << ["message" : "QC STATUS : GOOD"]
			defaultVar["messageList"] << ["message" : ""]
			
		}
		catch (Exception e) {
			
			defaultVar["isSuccess"] = false;
			defaultVar["messageList"] << ["message" : "TestCase : ${tcTitle}"]
			defaultVar["messageList"] << ["message" : "Remark : Error Exception_ ${e}"]
			defaultVar["messageList"] << ["message" : "QC STATUS : NOT GOOD"]
			defaultVar["messageList"] << ["message" : ""]
		}
		
		new customKW.common().cetak("defaultVar : ${defaultVar}");
		new customKW.common().generateStepReport(defaultVar["isSuccess"], defaultVar["messageList"])
	}
}
