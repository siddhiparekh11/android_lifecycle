package com.example.siddhiparekh11.activitylifecycleassignment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

/**
 * Created by siddhiparekh11 on 3/5/17.
 */

public class DialogActivity extends Activity {

   @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       requestWindowFeature(Window.FEATURE_NO_TITLE);
       setContentView(R.layout.dialog_activity);
   }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {

        super.onPause();
    }

    @Override
    protected void onStop() {

        super.onStop();
    }

    @Override
    protected void onRestart() {

        super.onRestart();
    }
    @Override
    protected void onDestroy() {

        super.onDestroy();
    }
    public void finishDialogActivity(View v) {

        this.finish();
    }
}
