package com.victortimbo.cardapio

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.victortimbo.cardapio.databinding.ActivityThirdScreenBinding

class ThirdScreen : AppCompatActivity(), View.OnClickListener {

    private lateinit var backSecondScreen:Intent

    private lateinit var binding: ActivityThirdScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Escondendo a support bar caso algum celular tente mostra-la
        supportActionBar?.hide()

        // Escondendo a status bar com a cor do plano de fundo
        window.statusBarColor = Color.parseColor("#EA6B17")


        // VOLTANDO PARA A SEGUNDA TELA
        binding.icBack.setOnClickListener {
            backSecondScreen = Intent(this,SecondScreen::class.java)
            startActivity(backSecondScreen)
        }


        // RECEBENDO OS DADOS DA TELA DE CARDÁPIO
        val data_Order = intent.extras
        var valueTotal = data_Order?.getFloat("value")
        var detailsDishes = data_Order?.getStringArrayList("dishes")
        var valueDishes = data_Order?.getStringArrayList("valuesFoods")


        // PASSANDO PARA OS TextViews OS VALORES/STRINGS DA SOMA TOTAL E DA LISTA DE PEDIDOS, RESPECTIVAMENTE
        binding.textValor.text = "Valor total: R$ ${"%.2f".format(valueTotal)}"
        binding.textDetails.text = detailsDishes?.joinToString("\n")!!
        binding.textDetailsValues.text = "R$ ${valueDishes?.joinToString("\nR$ ")!!}"



        // REALIZANDO A AÇÃO DE CLIQUE DO BOTÃO REALIZAR PEDIDO
        binding.btnPayFinally.setOnClickListener(this)

    }

    override fun onClick(view: View) {

        // NOTIFICAÇÃO DE PEDIDO REALIZADO
        Toast.makeText(this,R.string.textButtomFinally, Toast.LENGTH_LONG).show()

        backSecondScreen = Intent(this,SecondScreen::class.java)
        startActivity(backSecondScreen)
    }
}