package com.example.yourcv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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

        final EditText name = findViewById(R.id.name);
        final EditText age = findViewById(R.id.age);
        final EditText job = findViewById(R.id.job);
        final EditText number = findViewById(R.id.number);
        final EditText email = findViewById(R.id.email);
        Button next = findViewById(R.id.button);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().isEmpty()||
                        age.getText().toString().isEmpty()||
                        job.getText().toString().isEmpty()||
                        number.getText().toString().isEmpty()||
                        email.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Missing Information", Toast.LENGTH_SHORT).show();

                }
                else {
                    Intent newpage = new Intent(MainActivity.this, MainActivity2.class);
                    newpage.putExtra("name", name.getText().toString());
                    newpage.putExtra("age", age.getText().toString());
                    newpage.putExtra("job", job.getText().toString());
                    newpage.putExtra("number", number.getText().toString());
                    newpage.putExtra("email", email.getText().toString());
                    startActivity(newpage);
            }
            }
        });

        //String phone = number.getText().toString();
        //Intent phoneIntent = new Intent(Intent.ACTION_DIAL, android.net.Uri.fromParts(
               // "tel", phone, null));
        //startActivity(phoneIntent);

       // Intent intent = new Intent(Intent.ACTION_SEND);//common intent
        //intent.setData(android.net.Uri.parse("mailto:")); // only email apps should handle this
        //.putExtra(Intent.EXTRA_EMAIL, new String[]{"email"});

    }
}