package com.example.song_rxjava_retrofit.vo;

/**
 *  @Description :
 *  @autho : dongyiming
 *  @version : 1.0
 *  @data : 2017/7/8 22:45
 */
public class CommonHttpResult<T> {

    private int resultCode;
    private String resultMessage;
    private T data;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CommonHttpResult{" +
                "data=" + data +
                ", resultMessage='" + resultMessage + '\'' +
                ", resultCode=" + resultCode +
                '}';
    }
}
