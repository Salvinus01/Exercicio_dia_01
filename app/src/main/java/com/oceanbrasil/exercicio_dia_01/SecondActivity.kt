package com.oceanbrasil.exercicio_dia_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.TextView


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btVoltar = findViewById<Button>(R.id.btVoltar)
        val tvMensagem = findViewById<TextView>(R.id.tvMensagem)

        btVoltar.setOnClickListener {
            val novaTela = Intent(this, MainActivity::class.java)
            startActivity(novaTela)
        }
    }
}