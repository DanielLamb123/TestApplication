package com.example.user.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName,editTextAge;
    private TextView textViewMessage;
    private Button buttonDisplay,buttonReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView shows the UI
        //R=resource class
        setContentView(R.layout.activity_main);
        //Linking Ui to program
        editTextName=(EditText)findViewById(R.id.editTextName);
        editTextAge=(EditText)findViewById(R.id.editTextAge);
        textViewMessage=(TextView) findViewById(R.id.textViewMessage);
    }

    //A button is an instance of View class
    //method that handle View must have a View parameter
    public void displayMessage(View view){
        String name=editTextName.getText().toString();
        int age=Integer.parseInt(editTextAge.getText().toString());
        age++;
        textViewMessage.setText("Hi" +name+ ",you will be" +age+ "years old in 2018");
    }
}
