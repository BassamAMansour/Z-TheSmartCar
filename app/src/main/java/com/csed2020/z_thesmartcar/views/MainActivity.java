package com.csed2020.z_thesmartcar.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.csed2020.z_thesmartcar.R;

public class MainActivity extends AppCompatActivity implements ManualDrivingView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();
    }

    private void initializeViews() {
        initializeStartManualDrivingButton();
        initializeSelfDrivingButton();
        initializeConnectionFAB();
        initializeConnectionStatusImageView();
    }

    private void initializeConnectionStatusImageView() {

    }

    private void initializeConnectionFAB() {

    }

    private void initializeSelfDrivingButton() {
        final Button startSelfDrivingButton = (Button) findViewById(R.id.selfDriveButton);
        startSelfDrivingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: A connectivity check before launching
                launchSelfDrivingActivity();
            }
        });
    }

    private void initializeStartManualDrivingButton() {
        final Button startManualDrivingButton = (Button) findViewById(R.id.manualDriveButton);
        startManualDrivingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: A connectivity check before launching
                launchManualDrivingActivity();
            }
        });
    }

    private void launchManualDrivingActivity() {
        Intent manualDrivingActivityIntent = new Intent(MainActivity.this, ManualDrivingActivity.class);
        startActivity(manualDrivingActivityIntent);
    }

    private void launchSelfDrivingActivity() {
        Intent selfDrivingActivityIntent = new Intent(MainActivity.this, SelfDrivingActivity.class);
        startActivity(selfDrivingActivityIntent);
    }
}
