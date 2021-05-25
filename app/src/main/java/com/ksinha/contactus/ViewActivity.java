package com.ksinha.contactus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {
    private TextView tv_name, tv_email, tv_comment;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        tv_name = findViewById(R.id.tv_name);
        tv_email = findViewById(R.id.tv_email);
        tv_comment = findViewById(R.id.tv_comment);
        btnBack = findViewById(R.id.btn_back);

        Intent intent = getIntent();
        tv_name.setText(intent.getStringExtra("name"));
        tv_email.setText(intent.getStringExtra("email"));
        tv_comment.setText(intent.getStringExtra("comment"));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}