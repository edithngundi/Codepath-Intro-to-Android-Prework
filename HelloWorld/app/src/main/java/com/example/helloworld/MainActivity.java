package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //User can tap the button to change the text color of the label
        //At the button check for user interaction
        findViewById(R.id.changeTextColorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //change the text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.mustard_yellow));
            }
        });

        //User can tap the button to change the color of the background view
        //At the button check for user interaction
        findViewById(R.id.changeBackgroundColorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //change the background color
                ( findViewById(R.id.parent)).setBackgroundColor(getResources().getColor(R.color.crimson_red));
            }
        });

        //User can tap the button to change the text string- Android is Awesome!
        //At the button check for user interaction
        findViewById(R.id.changeTextStringButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //change the text string
                ((TextView)findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        //User can tap on the background view to reset all views to default settings
        //1. Reset initial text- "So proud of you Edith!"
        //2. Reset the initial background color
        //3. Reset the initial text color


    }
}