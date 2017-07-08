package com.example.song_rxjava_retrofit.cache;

import com.example.song_rxjava_retrofit.vo.CommonHttpResult;

import rx.functions.Func1;

/**
 * @version : 1.0
 * @Description : 数据转换
 * @autho : dongyiming
 * @data : 2017/7/8 22:43
 */
public class MyFunc1<T> implements Func1<CommonHttpResult<T>, T> {

    @Override
    public T call(CommonHttpResult<T> tCommonHttpResult) {

        if (tCommonHttpResult.getResultCode() == 200) {
            return tCommonHttpResult.getData();
        }
        throw new RuntimeException("http request is failed and the code =" + tCommonHttpResult.getResultCode());
    }
}
