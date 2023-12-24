package assigmentTigaKW

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import internal.GlobalVariable
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement


public class category {

	@Keyword
	def selectCategory(String category) {
		def defaultVar = new customKW.common().defaultVar();
		String tcTitle = "Select Category"
		try {
			Mobile.delay(GlobalVariable.MaxLoading)

			AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()

			MobileElement listItemCategory = driver.findElementByXPath('//*[@class = \'androidx.recyclerview.widget.RecyclerView\' and @resource-id = \'com.solodroid.solomerce:id/recycler_view\']')

			List<MobileElement> dataItems = listItemCategory.findElementsByXPath("//android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout")
			int items_count = dataItems.size()

			//println("total list category ada $items_count")

			LOOP: for (int dataSelection = 0; dataSelection < items_count; dataSelection++) {

				MobileElement itemCategory = dataItems.get(dataSelection).findElementByXPath("//*[@class = 'android.widget.TextView' and @resource-id = 'com.solodroid.solomerce:id/category_name']")
				new customKW.common().cetak("ini isi defaultVar : ${itemCategory.getText()}");
				if (itemCategory.getText() == category) {
					new customKW.common().cetak("KLIK");
					itemCategory.click()
					LOOP: break
				}
			}

			Mobile.delay(GlobalVariable.MaxLoading)
			Mobile.takeScreenshot()

			defaultVar["messageList"] << ["message" : "TestCase : ${tcTitle}"]
			defaultVar["messageList"] << ["message" : "category : ${category}"]
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



		return defaultVar
	}


	@Keyword
	def createReport(def defaultVar) {

		new customKW.common().cetak("ini isi defaultVar : ${defaultVar}");
		new customKW.common().generateStepReport(defaultVar["isSuccess"], defaultVar["messageList"])
	}
}
