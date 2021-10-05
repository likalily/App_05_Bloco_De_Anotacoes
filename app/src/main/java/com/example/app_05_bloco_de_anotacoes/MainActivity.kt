package com.example.app_05_bloco_de_anotacoes

import android.app.ProgressDialog.show
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private var preferencias: AnotacaoPreferencias? = null
    private var editAnotacao: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editAnotacao = findViewById<EditText>(R.id.txtBlocoAnotacao)
        val preferencias = AnotacaoPreferencias(applicationContext)
        val fab = findViewById<FloatingActionButton>(R.id.fab)

        fab.setOnClickListener {
        val textoRecuperado = editAnotacao.getText().toString()
        if (textoRecuperado == "") {
            Snackbar.make("Digite suas ideias aí!", Snackbar.LENGTH_LONG)
                .show()

        }/*
            val textoRecuperado = editAnotacao.getText().toString()
            if (textoRecuperado == "") {
                Snackbar.make("Sua anotação foi salva com sucesso!", Snackbar.LENGTH_LONG)
                    .show()

            } else {
                preferencias!!.salvarAnotacao(textoRecuperado)
                Snackbar.make(
                    "Sua anotação foi salva com sucesso!"
                            Snackbar . LENGTH_LONG
                )
                    .show() */


            }

            val anotacao = preferencias!!.recuperarAnotacao()
            if (anotacao != "") {
                editAnotacao.setText(anotacao)

            }

        }
    }

}