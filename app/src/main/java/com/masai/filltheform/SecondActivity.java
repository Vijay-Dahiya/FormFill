package com.masai.filltheform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView EtOrgName;
    private TextView EtName;
    private TextView EtNumber;
    private TextView EtEmail;
    private TextView EtAddress;
    private TextView EtManu;
    private TextView EtTax;
    private TextView EtCompany;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
        Intent intent = getIntent();
        String Org= intent.getStringExtra("Org");
        String Name=intent.getStringExtra("Name");
        String Number=intent.getStringExtra("Number");
        String Email=intent.getStringExtra("Email");
        String Address=intent.getStringExtra("Address");
        String Manu=intent.getStringExtra("Manu");
        String Tax=intent.getStringExtra("Tax");

        String Company=intent.getStringExtra("Company");

        EtOrgName.setText(Org);
        EtName.setText(Name);
        EtNumber.setText(Number);
        EtEmail.setText(Email);
        EtAddress.setText(Address);
        EtManu.setText(Manu);
        EtTax.setText(Tax);
        EtCompany.setText(Company);





    }

    void initView(){
        EtOrgName =findViewById(R.id.textView1);
        EtName =findViewById(R.id.textView2);
        EtNumber =findViewById(R.id.textView3);
        EtEmail =findViewById(R.id.textView4);
        EtAddress =findViewById(R.id.textView5);
        EtManu =findViewById(R.id.textView6);
        EtTax =findViewById(R.id.textView7);
        EtCompany =findViewById(R.id.textView8);
    }
}