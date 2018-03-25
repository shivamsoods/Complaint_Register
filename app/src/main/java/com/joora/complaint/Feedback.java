package com.joora.complaint;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by vineet on 24/3/18.
 */

public class Feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback_layout);
    }

    public void SubmitFeedback() {

        TextView suggestion = (TextView) findViewById(R.id.suggestionEditText);

        String suggestionMessage = suggestion.getText().toString();


        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.RadioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if (checkedId == R.id.radio_Excellent) {
                    Toast.makeText(Feedback.this, "Excellent \n Your message has been sent",
                            Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.radio_VeryGood) {
                    Toast.makeText(Feedback.this, "Very Good\n Your message has been sent",
                            Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.radio_Good) {
                    Toast.makeText(Feedback.this, "Good\n Your message has been sent",
                            Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.radio_Average) {
                    Toast.makeText(Feedback.this, "Average\n Your message has been sent",
                            Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.radio_BelowAverage) {
                    Toast.makeText(Feedback.this, "Below Average\n Your message has been sent",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Feedback.this, "Select Any Option", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}
