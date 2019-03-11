package com.itm.practicas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Toast de onCreate", Toast.LENGTH_LONG).show();
    }

    @Override protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Toast de onStart", Toast.LENGTH_SHORT).show();
    }

    @Override protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Toast de onResume", Toast.LENGTH_SHORT).show();
    }

    @Override protected void onPause() {
        Toast.makeText(this, "Toast de onPause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override protected void onStop() {
        Toast.makeText(this, "Toast de onStop", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Toast de onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override protected void onDestroy() {
        Toast.makeText(this, "Toast de onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

}
