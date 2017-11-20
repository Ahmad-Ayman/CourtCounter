package com.freelancing.ahmed.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button lgnBtn=(Button) findViewById(R.id.loginbtn);
        username=(EditText) findViewById(R.id.name);
        lgnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,score.class);
                i.putExtra("name",username.getText().toString());
                startActivity(i);
                finish();
            }
        });


    }
}
