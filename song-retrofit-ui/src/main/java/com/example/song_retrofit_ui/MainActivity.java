package com.example.song_retrofit_ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.song_retrofit_ui.controller.MainController;
import com.example.song_retrofit_ui.service.CommonResultCallBack;
import com.example.song_retrofit_ui.vo.NcMenu;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;


/**
 * @version : 1.0
 * @Description :
 * @autho : dongyiming
 * @data : 2017/7/7 18:36
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private TextView text;
    private MainController mainController;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button_1);
        btn2 = (Button) findViewById(R.id.button_2);
        btn3 = (Button) findViewById(R.id.button_3);
        btn4 = (Button) findViewById(R.id.button_4);
        btn5 = (Button) findViewById(R.id.button_5);
        btn6 = (Button) findViewById(R.id.button_6);
        btn7 = (Button) findViewById(R.id.button_7);
        text = (TextView) findViewById(R.id.text);
        initWidgetEvent();
        initCompant();
    }

    private void initCompant() {

        mainController = new MainController(this);
    }

    private void initWidgetEvent() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int viewId = view.getId();
        if (viewId == R.id.button_1) {

            mainController.clickButton1(new CommonResultCallBack() {
                @Override
                public void onSuccess(Call<List<NcMenu>> call, Response<List<NcMenu>> response) {

                    for (NcMenu meunInfo: response.body()) {

                        Log.e("dongyiming","name = " + meunInfo.getMenuName());
                    }
                    Log.e("dongyiming","code = " + response.code());
                    Log.e("dongyiming","message = " + response.message());
                    Log.e("dongyiming","header = " + response.headers());
                }

                @Override
                public void onFail(Call<List<NcMenu>> call, Throwable t) {
                    Throwable cause = t.getCause();
                    Log.e("dongyiming","code = " +  cause.getStackTrace());
                }
            });
        } else if (viewId == R.id.button_2) {

            mainController.clickButton2(new CommonResultCallBack() {
                @Override
                public void onSuccess(Call<List<NcMenu>> call, Response<List<NcMenu>> response) {

                }

                @Override
                public void onFail(Call<List<NcMenu>> call, Throwable t) {

                }
            });
        } else if (viewId == R.id.button_3) {

            mainController.clickButton3(new CommonResultCallBack() {
                @Override
                public void onSuccess(Call<List<NcMenu>> call, Response<List<NcMenu>> response) {

                }

                @Override
                public void onFail(Call<List<NcMenu>> call, Throwable t) {

                }
            });
        } else if (viewId == R.id.button_4) {

            mainController.clickButton4(new CommonResultCallBack() {
                @Override
                public void onSuccess(Call<List<NcMenu>> call, Response<List<NcMenu>> response) {

                }

                @Override
                public void onFail(Call<List<NcMenu>> call, Throwable t) {

                }
            });
        } else if (viewId == R.id.button_5) {

        } else if (viewId == R.id.button_6) {

        } else if (viewId == R.id.button_7) {

        }


    }
}
