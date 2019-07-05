package com.wlkj.test;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * @author Administrator
 */
public abstract class BaseActivity extends AppCompatActivity {


    protected Context mContext;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        // 在 super.onCreate(savedInstanceState) 之前调用该方法

        super.onCreate(savedInstanceState);
        // 在界面未初始化之前调用的初始化窗口

        if (initArgs(getIntent().getExtras())) {
            // 得到界面Id并设置到Activity界面中
            int layId = getContentLayoutId();
            setContentView(layId);
            initSystemBar();
            initBefore();
            initView();
            initData();

        } else {
            finish();
        }
    }

    /**
     * 通用findViewById,减少重复的类型转换
     *
     * @param id
     * @return
     */
    @SuppressWarnings("unchecked")
    public final <E extends View> E getView(int id) {
        try {
            return (E) findViewById(id);
        } catch (ClassCastException ex) {
            throw ex;
        }
    }

    private void initSystemBar() {

        StatusBarUtil.setStatusBarColor(this, R.color.colorAccent);
    }


    /**
     * @datetime 2018/9/10 17:57
     * @author liuguodong
     * @parmes
     */

    /**
     * 初始化控件调用之前
     */
    protected void initBefore() {

    }


    /**
     * 初始化窗口 在界面为初始化之前调用
     */
//    protected void initWidows() {
//        //设置屏幕适配 360为设计图尺寸px/2
//        if (ScreenUtils.isPortrait()) {
//            ScreenUtils.adaptScreen4VerticalSlide(this, 375);
//        } else {
//            ScreenUtils.adaptScreen4HorizontalSlide(this, 360);
//        }
//
//    }

    /**
     * 初始化相关参数
     *
     * @param bundle 参数Bundle
     * @return 如果参数正确返回True，错误返回False
     */
    protected boolean initArgs(Bundle bundle) {
        return true;
    }

    /**
     * 得到当前界面的资源文件Id
     *
     * @return 资源文件Id
     */
    protected abstract int getContentLayoutId();

    /**
     * 初始化控件
     */
    protected void initView() {
        mContext = this;

    }

    /**
     * 初始化数据
     */
    protected abstract void initData();


    @Override
    public boolean onSupportNavigateUp() {
        // 当点击界面导航返回时，Finish当前界面
        finish();
        return super.onSupportNavigateUp();
    }


//    @Override
//    public void onBackPressed() {
//        // 得到当前Activity下的所有Fragment
//        @SuppressLint("RestrictedApi")
//        List<Fragment> fragments = getSupportFragmentManager().getFragments();
//        // 判断是否为空
//        if (fragments != null && fragments.size() > 0) {
//            for (Fragment fragment : fragments) {
//                // 判断是否为我们能够处理的Fragment类型
//                if (fragment instanceof Fragment) {
//                    // 判断是否拦截了返回按钮
////                    if (((Fragment) fragment).onBackPressed()) {
////                         如果有直接Return
////                        return;
////                    }
//                }
//            }
//        }

//        super.onBackPressed();
//        finish();
//    }

    /**
     * 设置占位布局
     *
     * @param placeHolderView 继承了占位布局规范的View
     */

    /**
     * @param msg 提示信息
     * @ author mac  @times 2018/7/22  下午4:03
     */

    /**
     * @ author mac  @times 2018/7/22  下午4:12
     * 默认提示数据是加载中
     */


    private void hasNetWork(boolean has) {
        broadcastChangeNetwork(has);
//        if (!has) {
//            showToastC("网络链接异常");
//        } else {
//            showToastC("网络链接恢复");
//        }
    }

    //在子类实现此方法 实时监听网络状态变化
    protected void broadcastChangeNetwork(boolean hasNetWork) {

    }


    @Override
    protected void onResume() {
        super.onResume();

    }


}