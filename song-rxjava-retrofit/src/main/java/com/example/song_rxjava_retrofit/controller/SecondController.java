package com.example.song_rxjava_retrofit.controller;

import android.content.Context;
import android.util.Log;

import com.example.song_rxjava_retrofit.cache.RetrofitBuilder;
import com.example.song_rxjava_retrofit.service.RxService;
import com.example.song_rxjava_retrofit.vo.NcMenu;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.HttpException;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * @version : 1.0
 * @Description :
 * @autho : dongyiming
 * @data : 2017/7/8 18:03
 */
public class SecondController {

    private Context mContext;

    /**
     * 本地服务器路径
     */
    private String baseUrl = "http://192.168.1.101:8080/menu/";

    public SecondController(Context mContext) {
        this.mContext = mContext;
    }

    /**
     * 基本用法
     */
    public void getAll() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        RxService menuService = retrofit.create(RxService.class);
        menuService.getAllMenu()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<NcMenu>>() {
                    @Override
                    public void onCompleted() {
                        Log.e("dongyiming", "onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("dongyiming", e.toString());
                    }

                    @Override
                    public void onNext(List<NcMenu> ncMenus) {

                        for (NcMenu ncMenu : ncMenus) {

                            Log.e("dongyiming", "name = " + ncMenu.getMenuName());
                        }
                    }
                });
    }

    /**
     * 封装后的用法
     */
    public void getAllMenus() {

        //subscriber也可以封装成一个统一的结果处理集
        Subscriber<List<NcMenu>> subscriber = new Subscriber<List<NcMenu>>() {
            @Override
            public void onCompleted() {
                Log.e("dongyiming", "onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                Log.e("dongyiming", e.toString());
            }

            @Override
            public void onNext(List<NcMenu> ncMenus) {
                for (NcMenu ncMenu : ncMenus) {

                    Log.e("dongyiming", "name = " + ncMenu.getMenuName());
                }
            }
        };

        RetrofitBuilder.getInstance().getAll(subscriber);
    }
}
