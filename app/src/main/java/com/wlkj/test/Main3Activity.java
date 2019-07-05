package com.wlkj.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.wlkj.test.jni.JniTest;
import com.yixia.camera.util.Log;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.i("testre", "11" );
        Toast.makeText(this, ""+ JniTest.getString(), Toast.LENGTH_SHORT).show();
        Log.i("testre", "11" + JniTest.getString());
    }
}
