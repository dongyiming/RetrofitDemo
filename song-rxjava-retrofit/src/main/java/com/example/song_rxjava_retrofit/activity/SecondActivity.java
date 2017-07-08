package com.example.song_rxjava_retrofit.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.song_rxjava_retrofit.R;
import com.example.song_rxjava_retrofit.controller.SecondController;

/**
 *  @Description :
 *  @autho : dongyiming
 *  @version : 1.0
 *  @data : 2017/7/8 18:01
 */
public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_1;
    private SecondController secondController;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        initWidget();
        initWidgetEvent();
        initCompant();

    }

    private void initCompant() {
        secondController = new SecondController(this);
    }

    private void initWidgetEvent() {
        btn_1.setOnClickListener(this);
    }

    private void initWidget() {

        btn_1 = (Button) findViewById(R.id.btn_1);
    }


    @Override
    public void onClick(View v) {

        if (v.getId() ==R.id.btn_1) {
            //secondController.getAll();
            secondController.getAllMenus();
        }
    }
}
