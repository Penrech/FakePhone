package com.pauenrech.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class FakePhoneActivity extends AppCompatActivity {

    private Button btn1;
    private TextView phoneText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);

        phoneText = findViewById(R.id.numberText);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phoneText.append(btn1.getText());
            }
        });

    }


    public void delClick(View view) {
        phoneText.setText("");
    }

    public void callClick(View view) {
        String numberToCall =  phoneText.getText().toString();
        String msg;
        if (numberToCall.isEmpty()){
            msg = "No has introduit cap digit";
        } else {
            msg = "Trucant al " + numberToCall;
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
