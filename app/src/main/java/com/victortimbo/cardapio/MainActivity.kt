package com.victortimbo.cardapio

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.victortimbo.cardapio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Escondendo a support bar caso algum celular tente mostra-la
        supportActionBar?.hide()

        // Escondendo a status bar com a cor do plano de fundo
        window.statusBarColor = Color.parseColor("#EA6B17")


        // Criando uma SplashScreen, que dura 1.5 segundos, para o app
        Handler(Looper.getMainLooper()).postDelayed({
            val navigateSecondScreen = Intent (this,SecondScreen::class.java)
            startActivity(navigateSecondScreen)
            finish()
        }, 1500)
    }
}