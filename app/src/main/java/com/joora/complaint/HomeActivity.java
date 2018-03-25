package com.joora.complaint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class HomeActivity extends AppCompatActivity {

    private TextView mainName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView complaintImage = (ImageView) findViewById(R.id.mainComplaintImage);

        complaintImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, complaint.class));
            }
        });

        ImageView feedbackImage = (ImageView) findViewById(R.id.mainFeedbackImage);

        feedbackImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, Feedback.class));
            }
        });

        ImageView aboutImage = (ImageView) findViewById(R.id.mainAboutImage);

        aboutImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, AboutActivity.class));
            }
        });

        ImageView historyImage = (ImageView) findViewById(R.id.mainHistoryImage);

        historyImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, History.class));
            }
        });



    }
}