package com.masai.filltheform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private EditText EtOrgName;
    private EditText EtName;
    private EditText EtNumber;
    private EditText EtEmail;
    private EditText EtAddress;
    private EditText EtManu;
    private EditText EtTax;
    private EditText EtCompany;
    private ImageView Save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name=EtName.getText().toString();
                String Number=EtNumber.getText().toString();
                String Email=EtEmail.getText().toString();
                String Address=EtAddress.getText().toString();
                String Manu=EtManu.getText().toString();
                String Tax=EtTax.getText().toString();
                String Company=EtCompany.getText().toString();
                String Org=EtOrgName.getText().toString();

                Intent intent=new Intent(MainActivity.this,SecondActivity.class);

                intent.putExtra("Org",Org);
                intent.putExtra("Name",Name);
                intent.putExtra("Number",Number);
                intent.putExtra("Email",Email);
                intent.putExtra("Address",Address);
                intent.putExtra("Manu",Manu);
                intent.putExtra("Tax",Tax);
                intent.putExtra("Company",Company);
                startActivity(intent);
            }
        });



    }

    void initView(){

        Save =findViewById(R.id.saved);
        EtOrgName =findViewById(R.id.orgName);
        EtName =findViewById(R.id.Name);
        EtNumber =findViewById(R.id.Number);
        EtEmail =findViewById(R.id.Email);
        EtAddress =findViewById(R.id.Address);
        EtManu =findViewById(R.id.Manu);
        EtTax =findViewById(R.id.Tax);
        EtCompany =findViewById(R.id.Company);
    }

}