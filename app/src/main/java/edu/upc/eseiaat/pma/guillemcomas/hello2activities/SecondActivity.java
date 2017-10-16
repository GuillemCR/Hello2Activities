package edu.upc.eseiaat.pma.guillemcomas.hello2activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static String KeyName= "KeyName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String name = getIntent().getExtras().getString(KeyName);
        String message= String.format(getString(R.string.response),name);
        TextView textView= (TextView) findViewById(R.id.textResponse);
        textView.setText(message);
    }
}
