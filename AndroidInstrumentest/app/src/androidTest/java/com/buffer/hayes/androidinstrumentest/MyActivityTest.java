package com.buffer.hayes.androidinstrumentest;

import android.content.Context;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.MediumTest;

/**
 */
public class MyActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	MainActivity activity;

	public MyActivityTest() {
		super(MainActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		activity = getActivity();
		Context context = this.getActivity();
	}

    @MediumTest
	public void testActivityInstance() {
		assertTrue(activity != null);
	}
}
