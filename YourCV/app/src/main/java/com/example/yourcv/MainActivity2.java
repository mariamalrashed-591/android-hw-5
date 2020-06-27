package com.example.yourcv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView name = findViewById(R.id.name2);
        final TextView age = findViewById(R.id.age2);
        final TextView job = findViewById(R.id.job2);
        final TextView number = findViewById(R.id.number2);
        final TextView email = findViewById(R.id.email2);
        Button back = findViewById(R.id.back);

        Bundle x = getIntent().getExtras();

        name.setText(x.getString("name"));
        age.setText(x.getString("age"));
        job.setText(x.getString("job"));
        number.setText(x.getString("number"));
        email.setText(x.getString("email"));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newpage = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(newpage);
            }
        });

    }
}