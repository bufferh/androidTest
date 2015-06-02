package com.buffer.hayes.androidinstrumentest;

import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.TestSuite;


/**
 *
 * A test suite containing all tests for ApiDemos.
 *
 * To run all suites found in this apk:
 * $ adb shell am instrument -w \
 *   com.example.android.apis.tests/android.test.InstrumentationTestRunner
 *
 * To run just this suite from the command line:
 * $ adb shell am instrument -w \
 *   -e class com.example.android.apis.AllTests \
 *   com.example.android.apis.tests/android.test.InstrumentationTestRunner
 *
 * To run an individual test case, e.g. {}:
 * $ adb shell am instrument -w \
 *   -e class com.example.android.apis.os.MorseCodeConverterTest \
 *   com.example.android.apis.tests/android.test.InstrumentationTestRunner
 *
 * To run an individual test, e.g. {}:
 * $ adb shell am instrument -w \
 *   -e class com.example.android.apis.os.MorseCodeConverterTest#testCharacterS \
 *   com.example.android.apis.tests/android.test.InstrumentationTestRunner
 */

public class MyTestSuite extends TestSuite {

    public static TestSuite suite() {
        return new TestSuiteBuilder(MyTestSuite.class)
                .includeAllPackagesUnderHere()
                .build();
    }
}
