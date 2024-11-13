package com.mustafaersu.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText aedit1,aedit2;
    TextView atxt1;
    float a1,a2,hes;

    public void temiz(View v)
    {
        aedit1=(EditText)findViewById(R.id.edit1) ;
        aedit2=(EditText)findViewById(R.id.edit2);
        atxt1=(TextView)findViewById(R.id.txt1);
        aedit1.setText("");
        aedit2.setText("");
        atxt1.setText("");
        atxt1.setVisibility(View.GONE);
    }

    public void esit(View v)
    {
        aedit1=(EditText)findViewById(R.id.edit1) ;
        aedit2=(EditText)findViewById(R.id.edit2);
        atxt1=(TextView)findViewById(R.id.txt1);

        a1=Float.parseFloat(aedit1.getText().toString());
        a2=Float.parseFloat(aedit2.getText().toString());

        RadioButton artop  =(RadioButton)findViewById(R.id.rtop);
        RadioButton arcik  =(RadioButton)findViewById(R.id.rcik);
        RadioButton arcarp =(RadioButton)findViewById(R.id.rcarp);
        RadioButton arbol  =(RadioButton)findViewById(R.id.rbol);

        if(artop.isChecked())  { hes=a1+a2; }
        if(arcik.isChecked())  { hes=a1-a2; }
        if(arcarp.isChecked()) { hes=a1*a2; }
        if(arbol.isChecked())  { hes=a1/a2; }

        atxt1.setText(String.valueOf(hes));
        atxt1.setVisibility(View.VISIBLE);
    }
}