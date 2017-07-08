package com.example.song_retrofit_ui.controller;

import android.content.Context;

import com.example.song_retrofit_ui.service.CommonResultCallBack;
import com.example.song_retrofit_ui.service.MenuService;
import com.example.song_retrofit_ui.vo.NcMenu;
import com.example.song_retrofit_ui.vo.NcMenu;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @version : 1.0
 * @Description :
 * @autho : dongyiming
 * @data : 2017/7/7 20:44
 */
public class MainController {

    private Context mContext;

    /**
     * 本地服务器路径
     */
    private String baseUrl = "http://192.168.1.101:8080/menu/";

    public MainController(Context mContext) {
        this.mContext = mContext;
    }

    public void clickButton1(final CommonResultCallBack commonResultCallBack) {

        MenuService menuService = getService();
        Call<List<NcMenu>> call = menuService.getAll();
        call.enqueue(new Callback<List<NcMenu>>() {
            @Override
            public void onResponse(Call<List<NcMenu>> call, Response<List<NcMenu>> response) {
                commonResultCallBack.onSuccess(call, response);
            }

            @Override
            public void onFailure(Call<List<NcMenu>> call, Throwable t) {
                commonResultCallBack.onFail(call, t);
            }
        });
    }

    public void clickButton2(final CommonResultCallBack commonResultCallBack) {

        MenuService menuService = getService();
        Call<List<NcMenu>> call = menuService.getMenuByPath("getMenuByName?name=17");
        call.enqueue(new Callback<List<NcMenu>>() {
            @Override
            public void onResponse(Call<List<NcMenu>> call, Response<List<NcMenu>> response) {
                commonResultCallBack.onSuccess(call, response);
            }

            @Override
            public void onFailure(Call<List<NcMenu>> call, Throwable t) {
                commonResultCallBack.onFail(call, t);
            }
        });
    }

    public void clickButton3(final CommonResultCallBack commonResultCallBack) {

        MenuService menuService = getService();
        Call<List<NcMenu>> call = menuService.getMenuByQuery("17");
        call.enqueue(new Callback<List<NcMenu>>() {
            @Override
            public void onResponse(Call<List<NcMenu>> call, Response<List<NcMenu>> response) {
                commonResultCallBack.onSuccess(call, response);
            }

            @Override
            public void onFailure(Call<List<NcMenu>> call, Throwable t) {
                commonResultCallBack.onFail(call, t);
            }
        });
    }

    public void clickButton4(final CommonResultCallBack commonResultCallBack) {

        MenuService menuService = getService();
        NcMenu ncMenu = new NcMenu();
        ncMenu.setMenuCode(27);
        ncMenu.setMenuName("春风再美不及你的美");
        ncMenu.setMenuDesc("春风再美不及你的美");
        ncMenu.setAuthorCode(27);
        ncMenu.setAuthorName("missof");
        ncMenu.setMenuType(2);
        Call call = menuService.addNcMenu(ncMenu);
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                commonResultCallBack.onSuccess(call, response);
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                commonResultCallBack.onFail(call, t);
            }
        });
    }

    public MenuService getService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        MenuService menuService = retrofit.create(MenuService.class);
        return menuService;
    }

}
