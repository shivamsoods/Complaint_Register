package com.joora.complaint;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class complaint extends Activity implements AdapterView.OnItemSelectedListener {

    private DatabaseReference reference;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);

        reference = FirebaseDatabase.getInstance().getReference();
        firebaseAuth = FirebaseAuth.getInstance();

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
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
        ArrayAdapter dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

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

    public void SendCompalint(View view) {
        TextView complintmessage = (TextView) findViewById(R.id.complaintInputText);
        String message;
        message = complintmessage.getText().toString();

        TextView heading = (TextView) findViewById(R.id.subjectInputText);
        String subject;
        subject = heading.getText().toString();


        if (message.length() > 10 && subject.length() > 5) {
            Toast.makeText(complaint.this, "Message sent", Toast.LENGTH_SHORT).show();

            String key = reference.child("complaint").push().getKey();
            ComplaintData complaintData = new ComplaintData(message, subject, firebaseAuth.getCurrentUser().getUid());
            Map<String, Object> postValues = complaintData.toMap();

            Map<String, Object> childUpdates = new HashMap<>();
            childUpdates.put("/complaint/" + key, postValues);
            childUpdates.put("/user/" + firebaseAuth.getCurrentUser().getUid() + "/" + key, postValues);

            reference.updateChildren(childUpdates);
        } else {
            Toast.makeText(complaint.this, "ENTER PROPER DESCRIPTION", Toast.LENGTH_SHORT).show();
        }
    }


}

