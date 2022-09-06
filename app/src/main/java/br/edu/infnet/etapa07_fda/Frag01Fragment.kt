package br.edu.infnet.etapa07_fda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import br.edu.infnet.etapa07_fda.databinding.FragmentFrag01Binding

class Frag01Fragment : Fragment() {

    val viewModel: SharedViewModel by activityViewModels()

    private var _binding: FragmentFrag01Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFrag01Binding.inflate(inflater, container, false)
        val view = binding.root
        setup()
        return view
    }

    private fun setup() {
        setupObservers()
    }
    private fun setupObservers() {
        viewModel.contadorFrag01.observe(viewLifecycleOwner){
            binding.contadorFrag01.text = "Contador Frag01: ${it}"
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}