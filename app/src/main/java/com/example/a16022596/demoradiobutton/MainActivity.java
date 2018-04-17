package com.example.a16022596.demoradiobutton;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOk;
    RadioGroup rg;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = (Button)findViewById(R.id.button1);
        rg = (RadioGroup) findViewById(R.id.radioGroup1);


        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedButtonId = rg.getCheckedRadioButtonId();
                rb = (RadioButton)findViewById(selectedButtonId);
                Toast.makeText(getBaseContext(),rb.getText(),Toast.LENGTH_LONG).show();



            }
        });
    }
}
