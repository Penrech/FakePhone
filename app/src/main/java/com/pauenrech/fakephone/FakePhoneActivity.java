package com.pauenrech.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class FakePhoneActivity extends AppCompatActivity {

    private TextView phoneText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);

        phoneText = findViewById(R.id.numberText);

    }

    public void BtnPress(View view) {
        if (phoneText.length() < 10) {
            Button numPress = findViewById(view.getId());
            phoneText.append(numPress.getText());
        } else {
            Toast.makeText(this, R.string.TooLongNumber, Toast.LENGTH_SHORT).show();
        }

    }


    public void delClick(View view) {
        phoneText.setText("");
    }

    public void callClick(View view) {
        String numberToCall = phoneText.getText().toString();
        String msg;
        if (numberToCall.isEmpty()) {
            msg = getString(R.string.NoNumberMsg);
        } else {
            msg = getString(R.string.CallingTo) + numberToCall;
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
