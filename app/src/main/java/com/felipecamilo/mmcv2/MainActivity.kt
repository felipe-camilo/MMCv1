package com.felipecamilo.mmcv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Float

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnCalcular.setOnClickListener() {
                if (txtPeso.text.toString() != "" && txtAltura.text.toString() != "") {

                var peso = Float.parseFloat(txtPeso.text.toString())
                var altura = Float.parseFloat(txtAltura.text.toString())
                var resposta = ""

                var imc = peso / (altura * altura)
                if (imc < 18.5) resposta = "Magreza"
                else if (imc in 18.5..24.9) resposta = "Normal"
                else if (imc in 24.9..30.0) resposta = "Sobrepeso"
                else
                    resposta = "Obsidade"

                txtResultado.text = resposta
            }
        }
    }
}