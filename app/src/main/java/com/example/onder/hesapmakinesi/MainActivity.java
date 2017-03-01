package com.example.onder.hesapmakinesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button topla,carp,cikar,bol,mod;
    EditText sayi1,sayi2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topla = (Button) findViewById(R.id.topla);
        cikar = (Button) findViewById(R.id.cikar);
        carp = (Button) findViewById(R.id.carp);
        bol = (Button) findViewById(R.id.bol);
        mod = (Button) findViewById(R.id.mod);
        tv = (TextView) findViewById(R.id.tv);
        sayi1 = (EditText) findViewById(R.id.sayi1);
        sayi2 = (EditText) findViewById(R.id.sayi2);



    }
    public void tikla(View view){
        String sayiYazi1,sayiYazi2;
        sayiYazi1 = sayi1.getText().toString().trim();
        sayiYazi2 = sayi2.getText().toString().trim();
        int sayiA,sayiB;
        sayiA = Integer.parseInt(sayiYazi1);
        sayiB = Integer.parseInt(sayiYazi2);
        int sonuc  = 0;


        switch (view.getId()){


            case R.id.topla:
                sonuc = sayiA + sayiB;
                tv.setText("Sonuc : "+ sonuc);

                break;
            case R.id.cikar:

                sonuc = sayiA - sayiB;
                tv.setText("Sonuc : "+ sonuc);
                break;
            case  R.id.carp:

                sonuc = sayiA * sayiB;
                tv.setText("Sonuc : "+ sonuc);

                break;

            case R.id.bol:

                sonuc = sayiA / sayiB;
                tv.setText("Sonuc : "+ sonuc);
                break;

            case R.id.mod:

                sonuc = sayiA % sayiB;
                tv.setText("Sonuc : "+ sonuc);
                break;


        }

    }
}
