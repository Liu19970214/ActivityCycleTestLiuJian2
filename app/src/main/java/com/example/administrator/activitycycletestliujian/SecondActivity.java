package com.example.administrator.activitycycletestliujian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class SecondActivity extends AppCompatActivity {

    private Button btn2;
    private static final String Tag = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.v(Tag,"onCreate");
        btn2 = (Button)
                findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new
                        Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.v(Tag,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(Tag,"onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(Tag,"onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(Tag,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(Tag,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(Tag,"onDestory");
    }

}
