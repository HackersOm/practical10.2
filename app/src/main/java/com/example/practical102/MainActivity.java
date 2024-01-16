package com.example.practical102;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Display(View v)
    {
        EditText edt1,edt2,edt3,edt4;
        edt1 = (EditText)findViewById(R.id.edt1);
        edt2 = (EditText)findViewById(R.id.edt2);
        edt3 = (EditText)findViewById(R.id.edt3);
        edt4 = (EditText)findViewById(R.id.edt4);
        Toast.makeText(getApplicationContext(),"Submitted Successful \n name = "+edt1.getText().toString()+
        "Class "+edt2.getText().toString()+"\nRoll no."+edt3.getText().toString()+"\nEmail"+edt4.getText().toString(),Toast.LENGTH_SHORT).show();
    }
}