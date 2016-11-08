package com.undertaker.cabma.mathmagic.gameMain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.undertaker.cabma.mathmagic.MainActivity;
import com.undertaker.cabma.mathmagic.QuadMainActivity;
import com.undertaker.cabma.mathmagic.R;

public class GameMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_game_main);
    }
    public void buttonBack(View view)
    {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
