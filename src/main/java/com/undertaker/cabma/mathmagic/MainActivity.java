package com.undertaker.cabma.mathmagic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.undertaker.cabma.mathmagic.gameMain.GameMainActivity;
import com.undertaker.cabma.mathmagic.quadratics.QuadSolve;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonQuad(View view)
    {
        startActivity(new Intent(getApplicationContext(), QuadMainActivity.class));
    }

    public void buttonGame(View view)
    {
        startActivity(new Intent(getApplicationContext(), GameMainActivity.class));
    }

}
