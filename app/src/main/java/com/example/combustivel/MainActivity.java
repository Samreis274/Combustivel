package com.example.combustivel;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("ResourceType")
    public void Calcular(View View)
    {
        EditText valueA = findViewById(R.id.editTextTextPersonName);

        TextView resA = findViewById(R.id.textView2);
        TextView resG = findViewById(R.id.textView3);
        TextView end = findViewById(R.id.textView4);

        double a = Integer.parseInt(valueA.getText().toString());
        double g = Integer.parseInt(valueA.getText().toString());

        double va = 3.93;
        double vg = 4.25;

        double fa = a/va;
        double fg = g/vg;
        String resulta = String.format("%.2f", fa);
        String resultg = String.format("%.2f", fg);
        resA.setText("Quantidade de Alcool:  " + resulta +"L");
        resG.setText("Quantidade de Gasolina: " + resultg + "L");
        if(fa<fg)
        {
            end.setText("Gasolina rende mais");
        }else if (fa==fg){
            end.setText("Ambos tem o mesmo rendimento");
        }else{
            end.setText("Alcool rende mais");
        }


    }
}
