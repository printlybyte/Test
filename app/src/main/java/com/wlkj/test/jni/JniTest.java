package com.wlkj.test.jni;

/**
 * ============================================
 * 描  述：
 * 包  名：com.wlkj.test.jni
 * 类  名：JniTest
 * 创建人：lgd
 * 创建时间：2019/7/2 9:11
 * ============================================
 **/
public class JniTest {
   static  {
       System.loadLibrary("native_test");
   }
    public  static native  String getString();
}
