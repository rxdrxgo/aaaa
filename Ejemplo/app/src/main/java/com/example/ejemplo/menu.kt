package com.example.ejemplo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class menu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val volverInicio: Button = findViewById(R.id.volver)
        volverInicio.setOnClickListener {
            val volver = Intent(this, MainActivity::class.java)
            startActivity(volver)
        }

        val irTemperatura: Button = findViewById(R.id.btnTemperatura)
        irTemperatura.setOnClickListener {
            val irTemp = Intent(this, temperatura::class.java)
            startActivity(irTemp)
        }

        val irHumedad: Button = findViewById(R.id.btnHumedad)
        irHumedad.setOnClickListener {
            val irHum = Intent(this, humedad::class.java)
            startActivity(irHum)
        }

        val irPresion: Button = findViewById(R.id.btnPresion)
        irPresion.setOnClickListener {
            val irPre = Intent(this, presion::class.java)
            startActivity(irPre)
        }

        val irViento: Button = findViewById(R.id.btnViento)
        irViento.setOnClickListener {
            val irVie = Intent(this, viento::class.java)
            startActivity(irVie)
        }
    }
}