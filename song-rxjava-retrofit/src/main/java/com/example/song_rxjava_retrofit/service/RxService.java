package com.example.song_rxjava_retrofit.service;

import com.example.song_rxjava_retrofit.vo.CommonHttpResult;
import com.example.song_rxjava_retrofit.vo.NcMenu;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * @version : 1.0
 * @Description : 前提：服务器返回类型一致
 * @autho : dongyiming
 * @data : 2017/7/8 18:05
 */
public interface RxService {


    @GET("getAll")
    public Observable<CommonHttpResult<List<NcMenu>>> getAll();

    @GET("getAll")
    public Observable<List<NcMenu>> getAllMenu();
}
