package com.example.the_project_of_actual_combat.presenter;

import com.example.the_project_of_actual_combat.Iinterface.ITrunk;

/**
 * 作者-->蜕变~成蝶
 * 创建于-->2017/12/13
 * 作用--> 首页的Presenter
 * Presenter要与哪一个view进行交互泛型就传入那个
 */

public class HomePresenter implements IWorkPresenter<ITrunk.HomeView> {

    /* 进行和View层的绑定  activity */
    @Override
    public void attach(ITrunk.HomeView view) {

    }
    /* 和view层解绑 */
    @Override
    public void detach() {

    }
}
