package com.example.siddhiparekh11.activitylifecycleassignment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
/**
 * Created by siddhiparekh11 on 3/5/17.
 */

public class ActivityB extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
    }

    @Override
    protected void onPause(){

        super.onPause();
    }

    @Override
    protected void onStop() {

        super.onStop();
    }

    @Override
    protected void onRestart(){

        super.onRestart();
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }

    public void finishActivityB(View v) {

        this.finish();
    }
}
