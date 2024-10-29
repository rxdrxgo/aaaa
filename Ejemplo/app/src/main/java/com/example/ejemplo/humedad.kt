package com.example.ejemplo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class humedad : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_humedad)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val volverInicio: Button = findViewById(R.id.volver)
        volverInicio.setOnClickListener {
            val volver = Intent(this, menu::class.java)
            startActivity(volver)
        }

        val eliminar: Button = findViewById(R.id.btnEliminar)
        eliminar.setOnClickListener {
            val dato = findViewById<EditText>(R.id.num)
            dato.editableText.clear()

        }
    }
}