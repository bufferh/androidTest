
AdroidTestRunner方法进行单元测试：

## 1. 在androidTest 文件夹中编写测试用例， 注意androidTest的文件层级结构

## 2. 在gradler的defaultCOnfig中添加
 
 testInstrumentationRunner "android.test.InstrumentationTestRunner"


## 3. 执行命令 gradle assembleAndroidTest, 命令完成后，会在app/build/outputs/apk 下生成androidTest 的apk, 通过adb install将该apk安装到手机上（要求该手机同时装有carman的apk，并且版本要一致）

## 4. 执行adb shell pm list instrumentation 命令，显示如下

 ```
instrumentation:cn.safetrip.edog/android.test.InstrumentationTestRunner (target=cn.safetrip.edog)
instrumentation:com.buffer.hayes.androidinstrumentest.test/android.test.InstrumentationTestRunner (target=com.buffer.hayes.androidinstrumentest)
instrumentation:com.didapinche.booking/android.test.InstrumentationTestRunner (target=com.didapinche.booking)
 ```
 
 可以看到， 最后一个是我们的单元测试模块， 执行这个instrumentation
 
 
## 5. 执行单元测试instrumentation

执行adb shell am instrument -w com.buffer.hayes.androidinstrumentest.test/android.test.InstrumentationTestRunner

执行完成后， 即可显示测试结果。

单元测试的写法， 参考androidTest 里的demo.