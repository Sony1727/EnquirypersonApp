package com.example.enquiryperson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteActivity extends AppCompatActivity {
    DatabaseHelper dbhelper;
    EditText ed1;
    AppCompatButton b1,b2;
    String getPerson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        ed1=(EditText) findViewById(R.id.person);
        b1=(AppCompatButton) findViewById(R.id.delete);
        b2=(AppCompatButton) findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPerson=ed1.getText().toString();
                dbhelper.deleteData(getPerson);
                Toast.makeText(getApplicationContext(),"Successfully deleted ", Toast.LENGTH_SHORT).show();
                   Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                   startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}