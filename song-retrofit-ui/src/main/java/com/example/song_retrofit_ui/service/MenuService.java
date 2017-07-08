package com.example.song_retrofit_ui.service;

import com.example.song_retrofit_ui.vo.NcMenu;
import com.example.song_retrofit_ui.vo.NcMenu;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @version : 1.0
 * @Description : service接口
 * @autho : dongyiming
 * @data : 2017/7/7 18:41
 */
public interface MenuService {


    //服务器是由本地路由器发布，IP为192.168.1.101

    /**
     * 请求所有歌单数据
     * <p>
     * 无参数请求
     *
     * @return
     */
    @GET("getAll")
    public Call<List<NcMenu>> getAll();

    /**
     * 通过歌单名模糊搜索 @path动态访问
     *
     * @param name  name = "getAll"
     * @return
     */
    @GET("{getMenuByName}")
    public Call<List<NcMenu>> getMenuByPath(@Path("getMenuByName") String name);

    /**
     * 查询参数的设置 /getMenuByName?name=dongyiming
     *
     * @param name
     * @return
     */
    @GET("getMenuByName")
    public Call<List<NcMenu>> getMenuByQuery(@Query("name") String name);


    /**
     * POST请求传入JSON字符串@Body
     */
    @POST("addMenu")
    public Call addNcMenu(@Body NcMenu ncMenu);

    /**
     * 表单的键值对上传格式
     *
     * @param ncMenu
     * @param type
     */
    @POST("addMenuByType")
    @FormUrlEncoded
    public void addNcMenu(@Field("NcMenu") NcMenu ncMenu, @Field("type") int type);

//    @Multipart
//    @POST("uploadFile")
//    public void uploadFile(@Part MultipartBody.part part);
}
