package com.wlkj.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends BaseActivity {



    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_main2;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        super.initView();
//        StatusBarUtil.transparencyBar(Main2Activity.this);
        StatusBarUtil.statusBarLightMode(Main2Activity.this);
        StatusBarUtil.setStatusBarColor(this, R.color.colorAccent);

    }
}
