package com.awad.ekrma.ekrmataskmngr2018;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.awad.ekrma.ekrmataskmngr2018.taskfragments.MyTasksFragments;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;

public class AddTAskActivity extends AppCompatActivity {
    private EditText etText,etTitle,etDueDate,etCreatedate;
    private SeekBar skImportant,skNecessary;
    private Button btnsave,btnDatePicker;
    private TextView tvImportant,tvNecessary;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        etTitle = findViewById(R.id.etTitle);
        etText = findViewById(R.id.etText);
        etDueDate = findViewById(R.id.etDueDate);
        etCreatedate = findViewById(R.id.etCreatedate);

        skImportant = findViewById(R.id.skImportant);
        skNecessary = findViewById(R.id.skNecessary);


        btnDatePicker = findViewById(R.id.btnDatePicker);
        btnsave = findViewById(R.id.btnsave);

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

        private void dataHandler()
        {
            boolean isOk=true;
            String title1 = etTitle.getText().toString();
            String text1= etText.getText().toString();
            String duedate1= etDueDate.getText().toString();
            String createdate1=etCreatedate.getText().toString();
            int important1 = skImportant.getProgress();
            int necessary = skNecessary.getProgress();

            if (title1.length()<4){
                etTitle.setError(" title Have to be at least 4 letters ");
                isOk= false;
            }
            if (text1.length()<4){
                etText.setError(" Text can not empty ");
                isOk= false;
            }
            if (duedate1.length()<4){
                etDueDate.setError(" have to be at least 4 chars");
                isOk= false;
            }
            if (isOk)
            {
                MyTask1 task1=new MyTask1();
                task1.setCreatedAT(new Date());
                task1.setDueDate(new Date(duedate1));
                task1.setText(text1);
                task1.setTitle(title1);
                task1.setImportant(important1);
                task1.setNecessary(necessary);


                FirebaseAuth auth= FirebaseAuth.getInstance();
                task1.setOwner(auth.getCurrentUser().getEmail());

                DatabaseReference reference= FirebaseDatabase.getInstance().getReference();


                String key=reference.child("MyTasks").push().getKey();
                task1.setKey(key);

                reference.child("MyTasks").child(key).setValue(task1).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(AddTAskActivity.this, "Add Successful", Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(AddTAskActivity.this,"add Failed",Toast.LENGTH_LONG).show();
                        }


                    }
                });

            }


            }
            


        }




