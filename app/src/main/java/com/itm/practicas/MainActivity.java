package com.itm.practicas;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout textInput;
    private Helper Helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInput = findViewById(R.id.textInputLayout);
    }

    public void btn (View v){
        Helper = new Helper();
        String txtInput = textInput.getEditText().getText().toString();
        double value = Double.parseDouble(txtInput);

        double result = Helper.ConvertFahrenheitToCelsius(value);

        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(""+result);
    }

}
