package com.otl.scatter.constants;


public final class ApplicationGlobal {

  // Not to be instantiated (with c'tor being private)
  private ApplicationGlobal()
  {
    // According to <http://www.javapractices.com/topic/TopicAction.do?Id=2>:
    // "this prevents even the native class from calling this c'tor as well"
    throw new AssertionError();
  }

  public static final String APPLICATION_NAME = "iot";
  public static final String APPLICATION_UI_TITLE = "IoT";
  public static final String APPLICATION_URI = "/" + APPLICATION_NAME;

  // [REST] API URLs
  public static final String API_LATLONGTOLOCATION_URI = "/location";

}
