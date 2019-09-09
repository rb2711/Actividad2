package com.example.actividad2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private RadioButton rbEuro,rbDolar;
private EditText etEuro,etDolar;
private Button btnConvertir;
private TextView resultado,moneda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEuro = findViewById(R.id.etEuros);
        etDolar = findViewById(R.id.etDolares);
        etEuro.setVisibility(View.INVISIBLE);
        etDolar.setVisibility(View.INVISIBLE);

        rbEuro = findViewById(R.id.rbEuros);
        rbDolar = findViewById(R.id.rbDolares);

        btnConvertir=findViewById(R.id.btnConvertir);

        resultado=findViewById(R.id.tvResultado);
        moneda=findViewById(R.id.tvMoneda);

        rbEuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("");
                etEuro.setText("");
                etEuro.setVisibility(View.VISIBLE);
                etDolar.setVisibility(View.INVISIBLE);
                moneda.setText("Dolar");
            }
        });

        rbDolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("");
                etDolar.setText("");
                etDolar.setVisibility(View.VISIBLE);
                etEuro.setVisibility(View.INVISIBLE);
                moneda.setText("Euro");
            }
        });

            btnConvertir.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                double r;

                  if(rbEuro.isChecked()){
                      r=Double.parseDouble(etEuro.getText().toString());
                      r=r*1.1;
                      resultado.setText(Double.toString(r));
                  }
                  else
                      if (rbDolar.isChecked()){
                          r=Double.parseDouble(etEuro.getText().toString());
                          r=r*0.91;
                          resultado.setText(Double.toString(r));
                  }

             }
             });


    }

    }

