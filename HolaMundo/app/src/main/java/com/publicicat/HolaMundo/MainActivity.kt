package com.publicicat.HolaMundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/*
* */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*Obtén el contenido de ese layout
        * de l'arxiu R agafa el layout de l'activity_main
        * Normalment, un arxiu java contindrà el viewmodel
        * però tb podem controlar, bases de daes, connexió a servidors
        * o altres. Tot ha d'estar ben referenciat perquè R
        * ofereixi un bon servei de recurs*/
        setContentView(R.layout.activity_main)
    }
}