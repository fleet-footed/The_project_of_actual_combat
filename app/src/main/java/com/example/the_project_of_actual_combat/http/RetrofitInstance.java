package com.example.the_project_of_actual_combat.http;

import com.example.the_project_of_actual_combat.Iinterface.KuckInterface;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 作者-->蜕变~成蝶
 * 创建于-->2017/12/13
 * 作用--> 获取Retrofit对象
 */

public class RetrofitInstance {
    private Retrofit retrofit = null;
    private OkHttpClient okHttpClient = null;
    private KuckInterface kuckInterface = null;

    public RetrofitInstance() {
        initOKHttp();
        initRetrofit();
        kuckInterface=retrofit.create(KuckInterface.class);
    }

    //获取RetrofitInstance对象
    public static KuckInterface getClockInterface(){
        return getInstance().kuckInterface;
    }

    //获取RetrofitInstance单例
    public static RetrofitInstance getInstance(){
        return SingletonObject.GET_OBJECT;
    }

    private static class SingletonObject{
        private static final RetrofitInstance GET_OBJECT=new RetrofitInstance();
    }

    //初始化retrofit
    private void initRetrofit(){
        retrofit=new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(KuckInterface.HTTP)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    //初始化OK
    private void initOKHttp() {
        okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor())
                .writeTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build();
    }
}
