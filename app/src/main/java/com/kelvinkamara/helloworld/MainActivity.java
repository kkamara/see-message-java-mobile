package com.kelvinkamara.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view) {
        TextView txtFirstName = findViewById(R.id.txtViewFirstName);
        TextView txtLastName = findViewById(R.id.txtViewLastName);
        TextView txtEmail = findViewById(R.id.txtViewEmail);

        EditText editTxtFirstName = findViewById(R.id.editTxtFirstName);
        EditText editTxtLastName = findViewById(R.id.editTxtLastName);
        EditText editTxtEmail = findViewById(R.id.editTxtEmail);

        txtFirstName.setText(editTxtFirstName.getText().toString());
        txtLastName.setText(editTxtLastName.getText().toString());
        txtEmail.setText(editTxtEmail.getText().toString());
    }
}