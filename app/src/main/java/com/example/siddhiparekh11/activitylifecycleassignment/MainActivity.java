package com.example.siddhiparekh11.activitylifecycleassignment;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.icu.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("MainActivity", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 0;
    }

    @Override
    protected void onStart() {
        Log.d("MainActivity", "onStart ");
        super.onStart();
    }

    @Override
    protected void onResume() {
       super.onResume();
      counter++; // counter is incremented when activity A has focus

        TextView t= (TextView)findViewById(R.id.thread_count);
        t.setText(String.format("%04d",counter));
    }

    @Override
    protected void onPause() {
       Log.d("MainActivity", "onPause");
     counter++; // counter is incremented although activity A has lost focused and other activity has got focus
       super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("MainActivity", "onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
       Log.d("MainActivity", "onRestart");
       super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d("MainActivity", "onDestroy ");
        super.onDestroy();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        Log.d("MainActivity", "onWindowFocusChanged " + hasFocus);
        super.onWindowFocusChanged(hasFocus);
    }

    public void startDialog(View v) {
        Intent intent = new Intent(MainActivity.this, DialogActivity.class);
        startActivity(intent);
    }

    public void startActivityB(View v) {
        Intent intent=new Intent(MainActivity.this,ActivityB.class);
        startActivity(intent);
    }

    public void finishActivityA(View v) {

        this.finish();
    }

}

