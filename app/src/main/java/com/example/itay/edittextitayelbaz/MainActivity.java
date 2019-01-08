package com.example.itay.edittextitayelbaz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    String st;
    TextView TV;
    EditText ET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.btn);
        TV=(TextView) findViewById(R.id.TV);
        ET=(EditText) findViewById(R.id.ET);
    }


    public void btn(View view) {
        st=ET.getText().toString();
        TV.setText(st);
        TV.setEms(20);
        TV.setBackgroundColor(Color.RED);
        TV.setTextColor(Color.BLUE);
    }
}
