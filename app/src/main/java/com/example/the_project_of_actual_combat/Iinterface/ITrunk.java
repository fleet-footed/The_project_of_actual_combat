package com.example.the_project_of_actual_combat.Iinterface;

/**
 * 作者-->蜕变~成蝶
 * 创建于-->2017/12/13
 * 作用--> 里面使用内部类的方式存放 Model 和 View 层
 */

public class ITrunk {
    /** Model */
    public interface IWorkModel{
        /* 需要什么操作进添加对应的方法 */
    }


    /**************************************************/
    /** View */
    /* 首页关注的View */
    public interface HomeView{
        //获得首页推荐页面的数据
        void getRecommendData();
    }

}
