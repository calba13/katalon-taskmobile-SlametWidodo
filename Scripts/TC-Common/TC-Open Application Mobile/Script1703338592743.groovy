import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

"STEP : Set configuration Local Mechine "
String userDirectory = System.getProperty('user.dir')

"STEP : Set configuration Path APK"
String filePath = userDirectory + '/APKPath/Solodroid_E-CommerceApp Demo_3.2.0.apk'

"STEP : Start Application Mobile"
Mobile.startApplication(filePath, true)