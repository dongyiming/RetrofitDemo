package com.example.song_retrofit_ui.service;

import com.example.song_retrofit_ui.vo.NcMenu;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

/**
 * @version : 1.0
 * @Description :
 * @autho : dongyiming
 * @data : 2017/7/7 20:53
 */
public interface CommonResultCallBack {

    public void onSuccess(Call<List<NcMenu>> call, Response<List<NcMenu>> response);

    public void onFail(Call<List<NcMenu>> call, Throwable t);
}
