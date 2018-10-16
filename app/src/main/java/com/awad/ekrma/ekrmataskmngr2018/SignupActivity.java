package com.awad.ekrma.ekrmataskmngr2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignupActivity extends AppCompatActivity {
    FirebaseAuth auth;// to establish sign in sign up
    FirebaseUser user;//user

    private EditText firstname;
    private EditText lastname;
    private EditText email2;
    private EditText phone;
    private EditText password2;
    private Button save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        auth=FirebaseAuth.getInstance();
        user= auth.getCurrentUser();//

        firstname = (EditText) findViewById(R.id.firstname);
        lastname = (EditText) findViewById(R.id.lastname);
        email2 = (EditText) findViewById(R.id.email2);
        phone = (EditText) findViewById(R.id.phone);
        password2 = (EditText) findViewById(R.id.password2);
        save = (Button) findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
