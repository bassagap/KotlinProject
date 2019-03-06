package com.example.kotlincourse

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivity_btAplicar.setOnClickListener{
                r -> mainActivity_tvResultado.text = mainActivity_etEntrada.text}
    }
}