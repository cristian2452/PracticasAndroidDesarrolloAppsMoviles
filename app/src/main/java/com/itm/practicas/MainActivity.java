package com.itm.practicas;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Helper helper;
    private TextInputLayout textInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInput = findViewById(R.id.textInputLayout);
    }


    public void butonSort (View v){
        helper = new Helper();
        String txtInput = textInput.getEditText().getText().toString();

        int[] unsortedArray = helper.parseLineToIntArray(txtInput);
        int[] resultInt = helper.BubbleSort(unsortedArray);
        String result = helper.arayToString(resultInt);

        TextView textview = (TextView)findViewById(R.id.textView);
        textview.setText(""+result);
    }


}