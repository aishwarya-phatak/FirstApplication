package com.bitcode.firstapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(this);
        linearLayoutCompat.setPadding(10,10,10,10);
        linearLayoutCompat.setOrientation(LinearLayoutCompat.VERTICAL);
        linearLayoutCompat.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);

//        LinearLayout mainContainer = new LinearLayout(this);
//        mainContainer.setOrientation(LinearLayout.VERTICAL);
//        mainContainer.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
//        mainContainer.setPadding(20,20,20,20);

        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        linearLayoutCompat.setLayoutParams(layoutParams);

//        mainContainer.setLayoutParams(layoutParams);

        ViewGroup.LayoutParams layoutParams1 = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        TextView usernameTextView = new TextView(this);
        usernameTextView.setPadding(10,10,10,10);
        usernameTextView.setHint("Enter Username");
        usernameTextView.setBackgroundColor(R.color.black);
        usernameTextView.setTextColor(R.color.white);
        usernameTextView.setLayoutParams(layoutParams1);

        linearLayoutCompat.addView(usernameTextView);
//        mainContainer.addView(usernameTextView);

        TextView passwordTextView = new TextView(this);
        passwordTextView.setHint("Enter Password");
        passwordTextView.setPadding(10,10,10,10);
        passwordTextView.setBackgroundColor(R.color.black);
        passwordTextView.setTextColor(R.color.white);
        passwordTextView.setLayoutParams(layoutParams1);
//        passwordTextView.setBackgroundColor(R.color.);

        linearLayoutCompat.addView(passwordTextView);
//        mainContainer.addView(passwordTextView);

        Button btnLogin = new Button(this);
        btnLogin.setText("Login");
        btnLogin.setPadding(10,10,10,10);
        btnLogin.setLayoutParams(layoutParams1);
        btnLogin.setTextSize(30.0F);

        linearLayoutCompat.addView(btnLogin);
//        mainContainer.addView(btnLogin);

//        setContentView(mainContainer);
        setContentView(linearLayoutCompat);
    }
}