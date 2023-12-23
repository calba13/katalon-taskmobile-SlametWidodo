import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

"STEP : Set Konfigurasi Path APK"
String userDirectory = System.getProperty('user.dir')
String filePath = userDirectory + '/APKPath/Solodroid_E-CommerceApp Demo_3.2.0.apk'

"STEP : Start Application Mobile"
Mobile.startApplication(filePath, true)