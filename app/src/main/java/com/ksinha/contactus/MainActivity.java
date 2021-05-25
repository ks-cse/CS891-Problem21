package com.ksinha.contactus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txt_name, txt_email, txt_comment;
    private Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_name = findViewById(R.id.ed_name);
        txt_email = findViewById(R.id.ed_email);
        txt_comment = findViewById(R.id.ed_comment);
        btn_send = findViewById(R.id.btn_send);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nm, em, cm;
                nm = String.valueOf(txt_name.getText());
                em = String.valueOf(txt_email.getText());
                cm = String.valueOf(txt_comment.getText());

                // Explicit Intent
                Intent intent = new Intent(MainActivity.this, ViewActivity.class);
                intent.putExtra("name", nm);
                intent.putExtra("email", em);
                intent.putExtra("comment", cm);
                startActivity(intent);
            }
        });
    }
}