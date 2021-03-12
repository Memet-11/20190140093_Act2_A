package com.example.aplikasikelasd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btSignIn;
    EditText edEmail, edPassword;
    String nama, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSignIn=findViewById(R.id.btSignin);

        edEmail=findViewById(R.id.edEmail);

        edPassword=findViewById(R.id.edPassword);

        btSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama=edEmail.getText().toString();

                password=edPassword.getText().toString();


                Toast toast= Toast.makeText(getApplicationContext(),"email anda : "+nama+"dan password anda : "+password+"",Toast.LENGTH_LONG);
                toast.show();



            }
        });
    }
}