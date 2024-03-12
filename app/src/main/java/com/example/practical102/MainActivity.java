package com.example.practical102;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.InputType;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    String []course = {"Computer","Civil","Electrical","DMLT","Mechanical","Electrical&Computer"};
    DatePickerDialog picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView autocom = findViewById(R.id.autoCompleteTxt);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_dropdown_item_1line,course);
        autocom.setThreshold(2);
        autocom.setAdapter(adapter);
        EditText edt = findViewById(R.id.edtDOB);
        edt.setInputType(InputType.TYPE_NULL);
        edt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int day = cal.get(Calendar.DAY_OF_MONTH);
                int month = cal.get(Calendar.MONTH);
                int year = cal.get(Calendar.YEAR);
                picker = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        edt.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },year,month,day);
                picker.show();
            }
        });


    }
    public void Display(View v)
    {
        AutoCompleteTextView autocom = findViewById(R.id.autoCompleteTxt);
        EditText edt1,edt2,edt3,edt4,edtDOB;
        edt1 = (EditText)findViewById(R.id.edt1);
        edtDOB= (EditText)findViewById(R.id.edtDOB);
        edt2 = (EditText)findViewById(R.id.edt2);
        edt3 = (EditText)findViewById(R.id.edt3);
        edt4 = (EditText)findViewById(R.id.edt4);
        Toast.makeText(getApplicationContext(),"Submitted Successful \n name = "+edt1.getText().toString()+
        "Class "+edt2.getText().toString()+"\nRoll no."+edt3.getText().toString()+"\nEmail"+edt4.getText().toString()+"Selected DOB"
                +edtDOB.getText().toString()+autocom.getText().toString(),Toast.LENGTH_SHORT).show();
    }


}