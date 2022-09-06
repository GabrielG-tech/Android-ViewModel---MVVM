package br.edu.infnet.etapa07_fda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import br.edu.infnet.etapa07_fda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val viewModel: SharedViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setup()

    }

    private fun setup() {
        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.btnSomaFrag1.setOnClickListener {
            val valorAtual = viewModel.contadorFrag01.value ?: 0
            viewModel.setContadorFrag01(valorAtual+1)
        }
        binding.btnSomaFrag2.setOnClickListener {
            val valorAtual = viewModel.contadorFrag02.value ?: 0
            viewModel.setContadorFrag02(valorAtual+1)
        }
    }
}