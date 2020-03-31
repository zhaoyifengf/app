package com.example.a53202.day2;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ac2 extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    Fragment f01,f02,f03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac2);
        f01 = new f1();
        f02 = new f2();
        f03 = new f3();
        Button button2 = (Button) findViewById(R.id.button1);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("content","主Activity传递的数据");
                f01.setArguments(bundle);
                getFragmentManager().beginTransaction()
                        .replace(R.id.container,f01).commit();
            }
        });


        Button button3= (Button) findViewById(R.id.button2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.container,f02).commit();
            }
        });


        Button button4 = (Button) findViewById(R.id.button3);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.container,f03).commit();
            }
        });
    }
}
