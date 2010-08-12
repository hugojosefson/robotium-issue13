package com.overlord;

import android.test.ActivityInstrumentationTestCase2;
import com.jayway.android.robotium.solo.Solo;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.overlord.OverlordActivityTest \
 * com.overlord.tests/android.test.InstrumentationTestRunner
 */
public class OverlordActivityTest extends ActivityInstrumentationTestCase2<OverlordActivity> {


  private Solo solo;

  public OverlordActivityTest() {
    super("com.overlord", OverlordActivity.class);
  }


  public void setUp() throws Exception {
    solo = new Solo(getInstrumentation(), getActivity());
  }

  public void testSoloIsNotNull() {
    assertTrue(solo != null);
  }

  public void testHelloWorldTextIsFound() {
    assertTrue(solo.searchText("Hello World"));
  }


}
