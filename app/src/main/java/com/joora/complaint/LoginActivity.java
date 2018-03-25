package com.joora.complaint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by shivam on 24/3/18.
 */

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.login_layout);


    }
public void Login(View view){
//if conditions
    startActivity(new Intent(LoginActivity.this,HomeActivity.class));
}
    public void SignUp(View view){

        startActivity(new Intent(LoginActivity.this,SignupActivity.class));
    }
}