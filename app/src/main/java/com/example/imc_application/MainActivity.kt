package com.example.imc_application

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("Lifecicle", "Entrei no create - Estou criando a tela")
    }

    override fun onStart() {
        super.onStart()
        Log.w("Lifecicle", "Entrei no Start - Essa tela está visível para você")
    }

    override fun onResume() {
        super.onResume()
        Log.w("Lifecycle", "Entrei no Resume - Você pode interagir com essa tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("Lifecycle", "Entrei no Pause - A tela perdeu o foco, você não pode interagir agora")
    }

    override fun onStop() {
        super.onStop()
        Log.w("Lifecycle", "Entrei no Stop - Essa tela não está mais visivel, mas ainda existe")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("Lifecycle", "Entrei no Restart - A tela está retomando o foco")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("Lifecycle", "Entrei no Destroy - Essa tela chegou ao seu fim")
    }
}