package com.example.the_project_of_actual_combat.presenter;

/**
 * 作者-->蜕变~成蝶
 * 创建于-->2017/12/13
 * 作用--> Presenter的基类接口 所有Presenter都必须集成
 */

public interface IWorkPresenter<T> {

    /* 进行和View层的绑定  activity */
    void attach(T view);
    /* 和view层解绑 */
    void detach();




}
