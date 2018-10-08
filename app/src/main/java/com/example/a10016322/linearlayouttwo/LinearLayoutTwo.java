package com.example.a10016322.linearlayouttwo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class LinearLayoutTwo extends AppCompatActivity {

    LinearLayout back;
    Button buttonCyan;
    Button buttonGray;
    Button buttonMagenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        back = (LinearLayout)findViewById(R.id.Layout_id);
        buttonCyan = (Button)(findViewById(R.id.button_cyan));
        buttonGray = (Button)(findViewById(R.id.button_gray));
        buttonMagenta = (Button)(findViewById(R.id.button_magenta));
    }

    public void onClickLayout(View view)
    {
        if(R.id.button_cyan == view.getId())
            back.setBackgroundColor(Color.CYAN);
        if(R.id.button_gray == view.getId())
            back.setBackgroundColor(Color.GRAY);
        if(R.id.button_magenta == view.getId())
            back.setBackgroundColor(Color.MAGENTA);
    }
}
