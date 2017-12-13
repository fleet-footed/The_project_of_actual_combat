package com.example.the_project_of_actual_combat.view;

import android.os.Bundle;

import com.example.the_project_of_actual_combat.BaseActivity;
import com.example.the_project_of_actual_combat.Iinterface.ITrunk;
import com.example.the_project_of_actual_combat.R;
import com.example.the_project_of_actual_combat.presenter.HomePresenter;

public class MainActivity extends BaseActivity<HomePresenter> implements ITrunk.HomeView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    /* 初始化 */
    @Override
    public void initView() {

    }
    /* 绑定presenter */
    @Override
    public void bindingP() {

    }

    //回传回来的接口
    @Override
    public void getRecommendData() {

    }
}
