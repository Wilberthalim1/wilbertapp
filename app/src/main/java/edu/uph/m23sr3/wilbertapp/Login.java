package edu.uph.m23sr3.wilbertapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnContinue = findViewById(R.id.login_btn);
        EditText edtNama = findViewById(R.id.edtLogin);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = edtNama.getText().toString();
                Intent intent = new Intent(Login.this, edu.uph.m23sr3.wilbertapp.Kalkulator.class);
                intent.putExtra("USER_NAME", userName);
                startActivity(intent);
                startActivity(intent);
            }

        });
    }
}