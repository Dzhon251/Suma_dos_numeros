package com.example.sumanumeros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Cal_suma : AppCompatActivity() {
    lateinit var edtNumero1 : EditText
    lateinit var edtNumero2 : EditText
    lateinit var btnsumar : Button
    lateinit var txtResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal_suma)

        edtNumero1 = findViewById(R.id.n1)
        edtNumero2 = findViewById(R.id.n2)
        btnsumar = findViewById(R.id.sumar)
        txtResultado = findViewById(R.id.resultado)

        btnsumar.setOnClickListener(View.OnClickListener {
            val num1 = Integer.parseInt(edtNumero1.text.toString())
            val num2 = Integer.parseInt(edtNumero2.text.toString())

            txtResultado.setText("Resultado: " + sumar(num1, num2))
        })

    }

    fun sumar(n1: Int, n2: Int) : Int {
        return n1 + n2
    }
}