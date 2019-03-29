package com.example.checkpointjg;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
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

        final EditText editText = findViewById(R.id.firstName);
        final EditText editText1 = findViewById(R.id.lastName);
        final EditText editText2 = findViewById(R.id.age);

        final Button button = findViewById(R.id.send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String firstName = editText.getText().toString();
                String lastName = editText1.getText().toString();
                String age = editText2.getText().toString();
                if (firstName.equals("") || lastName.equals("") || age.equals("")) {
                    Toast.makeText(MainActivity.this, "Please fill in all fields", Toast.LENGTH_LONG).show();
                }else {

                    Intent intent = new Intent(MainActivity.this, StudentActivity.class);
                    startActivity(intent);
                    intent.putExtra("EXTRA_AGE", age);
                    intent.putExtra("EXTRA_FIRSTNAME", firstName);
                    intent.putExtra("EXTRA_LASTNAME", lastName);
                    startActivity(intent);






                }
            }
        });

    }
}


