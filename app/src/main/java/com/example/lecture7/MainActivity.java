package com.example.lecture7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View view){
        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText("Some other string");
    }

    public void button2OnClick(View view){
        TextView textView = (TextView) findViewById(R.id.text_view);
        EditText editText = (EditText) findViewById(R.id.edit_text);
        String text = editText.getText().toString();
        textView.setText(text);
    }

    public void toggleButtonClick(View view){
        TextView textView = (TextView) findViewById(R.id.text_view);
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggle_button);
        boolean on = toggleButton.isChecked();
        if (on) {
            textView.setText("Toggle Button is On");
        }
        else{
            textView.setText("Toggle Button is Off");
        }
    }

    public void switchClick(View view){
        TextView textView = (TextView) findViewById(R.id.text_view);
        Switch switchView = (Switch) findViewById(R.id.switch_view);
        boolean on = switchView.isChecked();
        if (on) {
            textView.setText("Switch is On");
        }
        else{
            textView.setText("Switch is Off");
        }
    }
}