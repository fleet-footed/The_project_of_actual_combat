package com.example.the_project_of_actual_combat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.the_project_of_actual_combat.presenter.IWorkPresenter;
import com.orhanobut.logger.Logger;

/**
 * 作者-->蜕变~成蝶
 * 创建于-->2017/12/13
 * 作用-->
 */

public abstract class BaseActivity<T extends IWorkPresenter> extends AppCompatActivity {
    T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindingP();
        initView();
    }

    /* 提供一个方法用来绑定presenter */
    public abstract void bindingP();

    /* 初始化 */
    public abstract void initView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(presenter != null){
            presenter.detach();
            Logger.i("解除绑定");
        }
    }
}
