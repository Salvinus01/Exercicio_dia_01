package com.oceanbrasil.exercicio_dia_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNome = findViewById<EditText>(R.id.etNome)
        val etSobreNome = findViewById<EditText>(R.id.etSobreNome)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val btLimpar = findViewById<Button>(R.id.btLimpar)
        val btNovaTela = findViewById<Button>(R.id.btNovaTela)

        btEnviar.setOnClickListener {
            tvResultado.text = String.format("Bem Vindo %1s %2s", etNome.text.toString(), etSobreNome.text.toString())
        }

        btLimpar.setOnClickListener {
            etNome.setText("")
            etSobreNome.setText("")
            tvResultado.text = ""
            etNome.requestFocus()
        }

        btNovaTela.setOnClickListener {
            val novaTela = Intent(this,SecondActivity::class.java)
            startActivity(novaTela)
        }

    }
}