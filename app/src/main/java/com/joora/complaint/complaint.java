package com.joora.complaint;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.List;

public class complaint extends Activity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);


        Spinner spinner=(Spinner) findViewById(R.id.spinner);
        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List categories = new ArrayList<String>();
        categories.add("Electricity");
        categories.add("Mess");
        categories.add("Room");
        categories.add("Toilets");
        categories.add("Drinking Water");
        categories.add("Any other");

        // Creating adapter for spinner
        ArrayAdapter dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView parent, View view, int position, long id) {
        // On selecting a spinner item
        String itemSelcted = parent.getItemAtPosition(position).toString();
    }


    @Override
    public void onNothingSelected(AdapterView adapterView) {
        Toast.makeText(this, "Select something", Toast.LENGTH_LONG).show();
    }

    public void SendCompalint(View view){
        TextView complintmessage=(TextView) findViewById(R.id.complaintInputText);
        String message;
        message=complintmessage.getText().toString();

        TextView heading=(TextView) findViewById(R.id.subjectInputText);
        String subject;
        subject=heading.getText().toString();



        if(message.length()>10 && subject.length()>5){
            Toast.makeText(complaint.this,"Message sent",Toast.LENGTH_SHORT).show();



        }
        else
        {
            Toast.makeText(complaint.this,"ENTER PROPER DESCRIPTION",Toast.LENGTH_SHORT).show();
        }
    }

}

