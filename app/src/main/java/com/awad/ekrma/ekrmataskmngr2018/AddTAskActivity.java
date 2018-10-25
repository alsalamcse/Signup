package com.awad.ekrma.ekrmataskmngr2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class AddTAskActivity extends AppCompatActivity {
    private EditText etText,etTitle,etDueDate;
    private SeekBar skImportant,skNecessary;
    private Button btnsave,btnDatePicker;
    private TextView tvImportant,tvNecessary;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        etTitle=findViewById(R.id.etTitle);
        etText=findViewById(R.id.etText);
        etDueDate=findViewById(R.id.etDueDate);
        skImportant=findViewById(R.id.skImportant);
        skNecessary=findViewById(R.id.skNecessary);
        btnDatePicker=findViewById(R.id.btnDatePicker);
        btnsave=findViewById(R.id.btnsave);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




    }
}
