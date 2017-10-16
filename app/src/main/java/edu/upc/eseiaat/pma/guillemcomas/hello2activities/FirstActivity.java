package edu.upc.eseiaat.pma.guillemcomas.hello2activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class FirstActivity extends AppCompatActivity {
    private EditText sName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        sName = (EditText) findViewById(R.id.editName);
    }
    public void sayHello(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String intro_name= sName.getText().toString();
        intent.putExtra(SecondActivity.KeyName,intro_name);
        startActivity(intent);
    }
}
