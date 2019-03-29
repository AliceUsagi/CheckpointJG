package com.example.checkpointjg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        TextView tvAge1 = findViewById(R.id.textStudent);
        Intent intent = getIntent();
        String printAge = intent.getStringExtra("EXTRA_AGE");
        String printFirstname = intent.getStringExtra("EXTRA_FIRSTNAME");
        String printLastName = intent.getStringExtra("EXTRA_LASTNAME");

        tvAge1.setText(printAge);

        Toast.makeText(this, "Congratulation " + printFirstname + printLastName, Toast.LENGTH_SHORT).show();
    }
}
