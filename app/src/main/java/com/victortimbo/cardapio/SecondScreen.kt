package com.victortimbo.cardapio


import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.victortimbo.cardapio.databinding.ActivitySecondScreenBinding


class SecondScreen : AppCompatActivity(), View.OnClickListener {

    // TODAS AS COMIDAS E BEBIDAS DO CARDÁPIO
    private var batataFrita = 22.00f
    private var paoDeAlho = 15.00f
    private var bolinhoDeArroz = 18.00f
    private var tilapilaFrita = 25.00f
    private var risoto = 35.00f
    private var lasanha = 45.00f
    private var frangoAoVinho = 50.00f
    private var fileMigno = 62.00f
    private var brownieSorvete = 15.00f
    private var pudim = 12.00f
    private var mousse = 10.00f
    private var pastelDeBelem = 18.00f
    private var agua = 5.00f
    private var suco = 7.00f
    private var saoGeraldo = 15.00f
    private var cerveja = 12.00f

    private var sum = 0f // SOMA DOS VALORES SELECIONADOS

    private var requests: ArrayList<String> = ArrayList() // LISTA DOS PEDIDOS SELECIONADOS
    private var valuesFoods: ArrayList<String> = ArrayList() // LISTA DE VALORES DAS COMIDAS

    private lateinit var binding: ActivitySecondScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Escondendo a support bar caso algum celular tente mostra-la
        supportActionBar?.hide()

        // Escondendo a status bar com a cor do plano de fundo
        window.statusBarColor = Color.parseColor("#EA6B17")


        // SOMATÓRIO DAS ENTRADAS
        binding.chkBoxPaoDeAlho.setOnClickListener {
            if (binding.chkBoxPaoDeAlho.isChecked) {
                this.sum += paoDeAlho

                // PASSANDO AS STRINGS PARA A LISTA DE PEDIDOS MARCADOS
                requests.add(getString(R.string.textPaoDeAlho))  // PÃO DE ALHO

                // PASSANDO OS VALORES PARA A LISTA DE PEDIDOS MARCADOS
                valuesFoods.add("%.2f".format(paoDeAlho))

            } else {
                this.sum -= paoDeAlho

                // REMOVENDO AS STRINGS DA LISTA DE PEDIDOS MARCADOS
                requests.remove(getString(R.string.textPaoDeAlho))

                // REMOVENDO OS VALORES PARA A LISTA DE PEDIDOS MARCADOS
                valuesFoods.remove("%.2f".format(paoDeAlho))
            }
            binding.textResult.text = "R$ ${"%.2f".format(sum)}"
        }

        binding.chkBoxBatataFrita.setOnClickListener {
            if (binding.chkBoxBatataFrita.isChecked) {
                this.sum += batataFrita
                requests.add(getString(R.string.textBatataFrita)) //BATATA FRITAS
                valuesFoods.add("%.2f".format(batataFrita))
            } else {
                this.sum -= batataFrita
                requests.remove(getString(R.string.textBatataFrita))
                valuesFoods.remove("%.2f".format(batataFrita))
            }
            binding.textResult.text = "R$ ${"%.2f".format(sum)}"
        }

        binding.chkBoxBolinhoDeArroz.setOnClickListener {
            if (binding.chkBoxBolinhoDeArroz.isChecked) {
                this.sum += bolinhoDeArroz
                requests.add(getString(R.string.textBolinhoDeArroz)) // BOLINHO DE ARROZ
                valuesFoods.add("%.2f".format(bolinhoDeArroz))
            } else {
                this.sum -= bolinhoDeArroz
                requests.remove(getString(R.string.textBolinhoDeArroz))
                valuesFoods.remove("%.2f".format(bolinhoDeArroz))
            }
            binding.textResult.text = "R$ ${"%.2f".format(sum)}"
        }

        binding.chkBoxTilapiaFrita.setOnClickListener {
            if (binding.chkBoxTilapiaFrita.isChecked) {
                this.sum += tilapilaFrita
                requests.add(getString(R.string.textTilaipaFrita)) // TILÁPIA FRITA
                valuesFoods.add("%.2f".format(tilapilaFrita))
            } else {
                this.sum -= tilapilaFrita
                requests.remove(getString(R.string.textTilaipaFrita))
                valuesFoods.remove("%.2f".format(tilapilaFrita))
            }
            binding.textResult.text = "R$ ${"%.2f".format(sum)}"
        }


        // SOMATÓRIO DOS PRATOS PRINCIPAIS
        binding.chkBoxRisoto.setOnClickListener {
            if (binding.chkBoxRisoto.isChecked) {
                this.sum += risoto
                requests.add(getString(R.string.textRisoto)) // RISOTO
                valuesFoods.add("%.2f".format(risoto))
            } else {
                this.sum -= risoto
                requests.remove(getString(R.string.textRisoto))
                valuesFoods.remove("%.2f".format(risoto))
            }
            binding.textResult.text = "R$ ${"%.2f".format(sum)}"
        }

        binding.chkBoxlasanha.setOnClickListener {
            if (binding.chkBoxlasanha.isChecked) {
                this.sum += lasanha
                requests.add(getString(R.string.textLasanha)) //LASANHA
                valuesFoods.add("%.2f".format(lasanha))
            } else {
                this.sum -= lasanha
                requests.remove(getString(R.string.textLasanha))
                valuesFoods.remove("%.2f".format(lasanha))
            }
            binding.textResult.text = "R$ ${"%.2f".format(sum)}"
        }

        binding.chkBoxFrangoAoVinho.setOnClickListener {
            if (binding.chkBoxFrangoAoVinho.isChecked) {
                this.sum += frangoAoVinho
                requests.add(getString(R.string.textFrangoAoVinho)) // FRANGO AO VINHO
                valuesFoods.add("%.2f".format(frangoAoVinho))
            } else {
                this.sum -= frangoAoVinho
                requests.remove(getString(R.string.textFrangoAoVinho))
                valuesFoods.remove("%.2f".format(frangoAoVinho))
            }
            binding.textResult.text = "R$ ${"%.2f".format(sum)}"
        }

        binding.chkBoxFileMignon.setOnClickListener {
            if (binding.chkBoxFileMignon.isChecked) {
                this.sum += fileMigno
                requests.add(getString(R.string.textFileMignon)) // FILÉ MIGNO
                valuesFoods.add("%.2f".format(fileMigno))
            } else {
                this.sum -= fileMigno
                requests.remove(getString(R.string.textFileMignon))
                valuesFoods.remove("%.2f".format(fileMigno))
            }
            binding.textResult.text = "R$ ${"%.2f".format(sum)}"
        }


        // SOMATÓRIO DAS SOBREMESAS
        binding.chkBoxBrownieSorvete.setOnClickListener {
            if (binding.chkBoxBrownieSorvete.isChecked) {
                this.sum += brownieSorvete
                requests.add(getString(R.string.textBrownieSorvete)) // BROWNIE COM SORVETE
                valuesFoods.add("%.2f".format(brownieSorvete))
            } else {
                this.sum -= brownieSorvete
                requests.remove(getString(R.string.textBrownieSorvete))
                valuesFoods.remove("%.2f".format(brownieSorvete))
            }
            binding.textResult.text = "R$ ${"%.2f".format(sum)}"
        }

        binding.chkBoxPudim.setOnClickListener {
            if (binding.chkBoxPudim.isChecked) {
                this.sum += pudim
                requests.add(getString(R.string.textPudim)) // PUDIM
                valuesFoods.add("%.2f".format(pudim))
            } else {
                this.sum -= pudim
                requests.remove(getString(R.string.textPudim))
                valuesFoods.remove("%.2f".format(pudim))
            }
            binding.textResult.text = "R$ ${"%.2f".format(sum)}"
        }

        binding.chkBoxMousse.setOnClickListener {
            if (binding.chkBoxMousse.isChecked) {
                this.sum += mousse
                requests.add(getString(R.string.textMousse)) //MOUSSE
                valuesFoods.add("%.2f".format(mousse))
            } else {
                this.sum -= mousse
                requests.remove(getString(R.string.textMousse))
                valuesFoods.remove("%.2f".format(mousse))
            }
            binding.textResult.text = "R$ ${"%.2f".format(sum)}"
        }

        binding.chkBoxPastelDeBelem.setOnClickListener {
            if (binding.chkBoxPastelDeBelem.isChecked) {
                this.sum += pastelDeBelem
                requests.add(getString(R.string.textPastelDeBelem)) // PASTEL DE BELÉM
                valuesFoods.add("%.2f".format(pastelDeBelem))
            } else {
                this.sum -= pastelDeBelem
                requests.remove(getString(R.string.textPastelDeBelem))
                valuesFoods.remove("%.2f".format(pastelDeBelem))
            }
            binding.textResult.text = "R$ ${"%.2f".format(sum)}"
        }


        // SOMATÓRIO DAS BEBIDAS
        binding.chkBoxAgua.setOnClickListener {
            if (binding.chkBoxAgua.isChecked) {
                this.sum += agua
                requests.add(getString(R.string.textAgua)) // ÁGUA
                valuesFoods.add("%.2f".format(agua))
            } else {
                this.sum -= agua
                requests.remove(getString(R.string.textAgua))
                valuesFoods.remove("%.2f".format(agua))
            }
            binding.textResult.text = "R$ ${"%.2f".format(sum)}"
        }

        binding.chkBoxSuco.setOnClickListener {
            if (binding.chkBoxSuco.isChecked) {
                this.sum += suco
                requests.add(getString(R.string.textSuco)) //SUCO
                valuesFoods.add("%.2f".format(suco))
            } else {
                this.sum -= suco
                requests.remove(getString(R.string.textSuco))
                valuesFoods.remove("%.2f".format(suco))
            }
            binding.textResult.text = "R$ ${"%.2f".format(sum)}"
        }

        binding.chkBoxSaoGeraldo.setOnClickListener {
            if (binding.chkBoxSaoGeraldo.isChecked) {
                this.sum += saoGeraldo
                requests.add(getString(R.string.textSaoGeraldo)) // SÃO GERALDO
                valuesFoods.add("%.2f".format(saoGeraldo))
            } else {
                this.sum -= saoGeraldo
                requests.remove(getString(R.string.textSaoGeraldo))
                valuesFoods.remove("%.2f".format(saoGeraldo))
            }
            binding.textResult.text = "R$ ${"%.2f".format(sum)}"
        }

        binding.chkBoxCerveja.setOnClickListener {
            if (binding.chkBoxCerveja.isChecked) {
                this.sum += cerveja
                requests.add(getString(R.string.textCerveja)) // CERVEJA
                valuesFoods.add("%.2f".format(cerveja))

            } else {
                this.sum -= cerveja
                requests.remove(getString(R.string.textCerveja))
                valuesFoods.remove("%.2f".format(cerveja))
            }
            binding.textResult.text = "R$ ${"%.2f".format(sum)}"
        }


        // REALIZANDO A AÇÃO DE CLIQUE DO BOTÃO PEDIR, PARA IR À TERCEIRA TELA
        binding.btnPay.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if (sum > 0) {
            val toThirdScreenScreen = Intent(this, ThirdScreen::class.java)

            // PASSANDO OS DADOS PARA A ULTIMA TELA
            toThirdScreenScreen.putExtra("value", sum) // PASSANDO O VALOR TOTAL

            toThirdScreenScreen.putExtra("dishes", requests) // PASSANDO A LISTA DE PEDIDOS

            toThirdScreenScreen.putExtra("valuesFoods", valuesFoods) // PASSANDO A LISTA COM O VALOR DE CADA COMIDA

            startActivity(toThirdScreenScreen)
        } else {
            Toast.makeText(this, R.string.textButtomError, Toast.LENGTH_SHORT).show()
        }
    }

}