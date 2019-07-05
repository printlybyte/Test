package com.wlkj.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.wlkj.test.jni.JniTest;
import com.yixia.camera.util.Log;
import com.zhaoshuang.weixinrecorded.RecordedActivity;

public class MainActivity extends BaseActivity {


    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
//        Intent intent = new Intent(getBaseContext(), RecordedActivity.class);
//        startActivityForResult(intent, 0);
        Log.i("testre","11"+ JniTest.getString());

    }


    public void test_chick(View v) {
        Log.i("testre","11"   );
//        startActivity(new Intent(this, Main2Activity.class));


    }
}
