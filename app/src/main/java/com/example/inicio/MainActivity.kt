package com.example.inicio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Vamos a quitar barra superior llamada actionbar
        supportActionBar?.hide()

        //invocamo al voton  por medio del id
        ingresar.setOnClickListener(){

            //generamos la navegación
            var i= Intent(this,LoginActivity::class.java)
            startActivity(i)
        }
    }
}
