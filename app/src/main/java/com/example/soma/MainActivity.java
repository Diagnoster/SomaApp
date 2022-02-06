package com.example.soma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sum(View view) {
        EditText n1 = findViewById(R.id.editTextNumber1);
        EditText n2 = findViewById(R.id.editTextNumber2);
        TextView out = findViewById(R.id.textViewResult);

        if(n1.length() == 0 || n2.length() == 0) {
            Toast msg = Toast.makeText(this, "Insira um valor", Toast.LENGTH_SHORT);
            msg.show();
        }

        int num1 =  Integer.parseInt(n1.getText().toString());
        int num2 =  Integer.parseInt(n2.getText().toString());
        int result = num1 + num2;
        out.setText(String.valueOf(result));

    }
}